import java.io.IOException;
import java.sql.*;
//For compiling on the shell on repl: Same on mac
//javac -cp sqlite-jdbc-3.23.1.jar: Main.java

//Use for windows
//javac -cp sqlite-jdbc-3.23.1.jar; ServerExample.java
class Main {

 public static void main(String[] args)throws IOException{
    (new Main()).init();
  }

  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init() {
  Database db = new Database("jdbc:sqlite:chinook.db" );	

  String p1 = db.runSQL("SELECT t.Name AS TrackName, a.Title AS AlbumName FROM tracks t JOIN albums a ON t.AlbumId = a.AlbumId LIMIT 30;", "table-auto");
  print(p1);

  String p2 = db.runSQL("SELECT c.FirstName, c.LastName, i.InvoiceId, i.InvoiceDate FROM invoices i JOIN customers c ON i.CustomerId = c.CustomerId WHERE strftime('%Y-%m', i.InvoiceDate) = '2012-04';", "table-auto");
  print(p2);

  String p3 = db.runSQL("SELECT i.CustomerId, i.InvoiceId, t.Name AS TrackName, il.UnitPrice, il.Quantity FROM invoices i JOIN invoice_items il ON i.InvoiceId = il.InvoiceId JOIN tracks t ON il.TrackId = t.TrackId ORDER BY i.InvoiceId LIMIT 20;", "table-auto");
  print(p3);

  String p4 = db.runSQL("SELECT DISTINCT c.FirstName, c.LastName FROM invoices i JOIN customers c ON i.CustomerId = c.CustomerId WHERE i.BillingCountry IN ('USA', 'Germany', 'Poland');", "table-auto");
  print(p4);

  String p5 = db.runSQL("SELECT t.Name FROM tracks t JOIN genres g ON t.GenreId = g.GenreId WHERE g.Name = 'Latin' LIMIT 20;","table-auto");
  print(p5);

  String p6 = db.runSQL("SELECT DISTINCT a.Title FROM albums a JOIN tracks t ON a.AlbumId = t.AlbumId JOIN genres g ON t.GenreId = g.GenreId WHERE g.Name = 'Jazz';", "table-auto");
  print(p6);

  String p7 = db.runSQL("SELECT DISTINCT ar.Name FROM artists ar JOIN albums a ON ar.ArtistId = a.ArtistId JOIN tracks t ON a.AlbumId = t.AlbumId JOIN genres g ON t.GenreId = g.GenreId WHERE g.Name = 'Pop';","table-auto");
  print(p7);
  }    
}