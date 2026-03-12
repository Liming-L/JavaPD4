
import java.io.IOException;
import java.sql.*;
//For compiling on the shell on repl: Same on mac
//javac -cp sqlite-jdbc-3.23.1.jar: Main.java

//Use for windows
//java -cp sqlite-jdbc-3.23.1.jar: Main
class Main {

 public static void main(String[] args)throws IOException{
    (new Main()).init();
  }

  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init() {
    Database db = new Database("jdbc:sqlite:students.db");
    String sql = "SELECT * FROM cr101 WHERE teacher1 = 'BANU'";
    String result = db.runSQL(sql, "table-auto");

    sql = "SELECT * FROM cr101 WHERE teacher1 = 'PORCHETTA' AND period = 10";
    result = db.runSQL(sql, "table-auto");
    print(result);

    sql = "SELECT studentId FROM cr101";
    result = db.runSQL(sql, "table-auto");
    print(result);

    sql = "SELECT studentId, course, period FROM cr101 WHERE grade = 11 AND room IN (322, 105, 106, 323)";
    result = db.runSQL(sql, "table-auto");
    print(result);

    sql = "SELECT * FROM cr101 WHERE course LIKE 'M%X'";
    result = db.runSQL(sql, "table-auto");
    print(result);
  }
}