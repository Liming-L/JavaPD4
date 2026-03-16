
import java.io.IOException;
import java.sql.*;
//For compiling on the shell on repl: Same on mac
//java -cp sqlite-jdbc-3.23.1.jar: Main.java

//Use for windows
//javac -cp sqlite-jdbc-3.23.1.jar: Main.java
class Main {

 public static void main(String[] args)throws IOException{
    (new Main()).init();
  }

  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init() {
      Database db = new Database("jdbc:sqlite:students.db");
      String check1 = db.runSQL("SELECT * FROM cr101 WHERE StudentID='STUDENT1001' AND Period=3;","table-auto");
      print(check1);
      String update1 = db.runSQL("UPDATE cr101 SET Room='122' WHERE StudentID='STUDENT1001' AND Period=3;","table-auto");
      print(update1);

      String check2 = db.runSQL("SELECT * FROM cr101 WHERE StudentID='STUDENT1200' AND Course='ZQCTEDA';","table-auto");
      print(check2);
      String delete2 = db.runSQL("DELETE FROM cr101 WHERE StudentID='STUDENT1200' AND Course='ZQCTEDA';","table-auto");
      print(delete2);

      String check3 = db.runSQL("SELECT * FROM cr101 WHERE Teacher1='DOYLE' AND Period IN (4,5);","table-auto");
      print(check3);
      String update3 = db.runSQL("UPDATE cr101 SET Room='213' WHERE Teacher1='DOYLE' AND Period IN (4,5);","table-auto");
      print(update3);

      String check4 = db.runSQL("SELECT * FROM cr101 WHERE Course='MQF44QGF' AND Section=1 AND Teacher1='ARCHETTI';","table-auto");
      print(check4);
      String update4 = db.runSQL("UPDATE cr101 SET Teacher1='ROFFLER' WHERE Course='MQF44QGF' AND Section=1 AND Teacher1='ARCHETTI';","table-auto");
      print(update4);

      String check5 = db.runSQL("SELECT * FROM cr101 WHERE StudentID='STUDENT999';","table-auto");
      print(check5);
      String update5 = db.runSQL("UPDATE cr101 SET Grade=11, OffClass='junior' WHERE StudentID='STUDENT999';","table-auto");
      print(update5);

      String check6 = db.runSQL("SELECT * FROM cr101 WHERE StudentID='STUDENT1231';","table-auto");
      print(check6);
      String insert6 = db.runSQL("INSERT INTO cr101 (StudentID, OffClass, Grade, Course, Section, Teacher1, Teacher2, Period, Room) VALUES ('STUDENT1231', 'V20', 10, 'MKUFTC6', 1, 'CASTRO R', '', 9, '322'); ","table-auto");
      print(insert6);
      }    
}