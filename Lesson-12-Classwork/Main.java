class Main {

  public static void main(String[] args) {
    (new Main()).init();
    System.out.println(collegeCredit("ABC12E"));

  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){
   

    
  }

  boolean collegeCredit(String courseCode){
    char sixLetter=courseCode.charAt(5);
    if(sixLetter=='E'||sixLetter=='M'){
      return true;
    }
    else{
      return false;
    }

  }

 
}