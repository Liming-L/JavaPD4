class Main {
  public static void main(String[] args)throws Exception {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init()throws Exception{

    CreateList list = new CreateList("CR101.csv");
    Student[] students = list.getStudentArray();

    // add your code below here
    int passing = 0;
    int failing = 0;
    for(int x=0; x<students.length; x++){
    Student student = students[x];
    if(student.gpa >= 65){
      passing++;
      }
      else{
      failing++;
      }
    }
    print("Passing: " + passing);
    print("Failing: " + failing);

    double percentFailing = (double)failing / students.length * 100;
    print("Percent failing: " + percentFailing);

    int failCastro = 0;
    for(int x=0; x<students.length; x++){
    Student student = students[x];
    if(student.gpa < 65 && student.findTeacher("Castro R")){
      failCastro++;
      }
    }
    print("Failing with Castro R: " + failCastro);

    int failNoMusic = 0;
    for(int x=0; x<students.length; x++){
    Student student = students[x];
    if(student.gpa < 65 && !student.findCourseStartingWith("UL")){
      failNoMusic++;
      }
    }
    print("Failing with no music: " + failNoMusic);

    for(int x=0; x<students.length; x++){
    Student student = students[x];
    if(student.gpa < 65 && student.findCourseStartingWith("UL")){
      print("Failing students taking music (IDs):" + student.id);
      }
    }

    int highGPA = 0;
    for(int x=0; x<students.length; x++){
    Student student = students[x];
    if((student.gradeLevel == 9 || student.gradeLevel == 10) 
    && student.gpa > 90){
      highGPA++;
      }
    }
    print("Freshmen + Sophomores with GPA > 90: " + highGPA);

    int bothTeachers = 0;
    for(int x=0; x<students.length; x++){
    Student student = students[x];
    if(student.findTeacher("Banu") && student.findTeacher("Porchetta")){
      bothTeachers++;
      }
    }
    print("Students with Banu and Porchetta: " + bothTeachers);

    int fr = 0, so = 0, jr = 0, sr = 0;
    for(int x=0; x<students.length; x++){
    Student student = students[x];
    if(student.gradeLevel == 9) fr++;
    else if(student.gradeLevel == 10) so++;
    else if(student.gradeLevel == 11) jr++;
    else if(student.gradeLevel == 12) sr++;
    }
    print("Freshmen: " + fr);
    print("Sophomores: " + so);
    print("Juniors: " + jr);
    print("Seniors: " + sr);

    int p9 = 0, p10 = 0, p11 = 0, p12 = 0;
    for(int x=0; x<students.length; x++){
    Student student = students[x];
    if(student.findTeacher("Porchetta")){
    if(student.gradeLevel == 9) p9++;
    else if(student.gradeLevel == 10) p10++;
    else if(student.gradeLevel == 11) p11++;
    else if(student.gradeLevel == 12) p12++;
    }
    }
    print("Porchetta Freshmen: " + p9);
    print("Porchetta Sophomores: " + p10);
    print("Porchetta Juniors: " + p11);
    print("Porchetta Seniors: " + p12);




    }







  
  int randInt(int lower, int upper){
    int range = upper - lower;
    return (int)(Math.random()*range+lower);
  }

}