class Main {

  public static void main(String[] args) {
    (new Main()).init();
    System.out.println(collegeCredit("ABC12E"));
    System.out.println(getCounselor("B12"));
    System.out.println(imageType("photo.jpg"));

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

  String getCounselor(String officialClass){
    char firstChar=Character.toUpperCase(officialClass.charAt(0));
    char middleChar=Character.toUpperCase(officialClass.charAt(officialClass.length()/2));

    char key=firstChar;

    if(getCounselorByChar(firstChar).equals("Unknown")){
      key=middleChar;
    }
    return getCounselorByChar(key);
  }
  String getCounselorByChar(char ch){
    switch(ch){
      case'B':return"Berrouet";
      case'C':return"Chu";
      case'D':return"Dinn";
      case'E':return"Eyzengart";
      case'F':return"Flores";
      case'G':return"Gibson";
      case'L':return"Shim Lee";
      case'M':return"Meltzer";
      case'P':return"Paccione";
      case'S':return"Fiore";
      case'T':return"Tsai";
      case'Z':return"Zayes";
    }

  }

String imageType(String fileName){
  String extention=fileName.substring(fileName.lastIndexOf('.')+1).toUp

  switch(extention){
    case"JPG":
    case"JPEG":
      return"Joint Photographic Experts Group";
    case"PNG":
      return"Portable Network Graphics";
    case"GIF":
      return"Graphics Interchange Format";
    case "PDF":
      return"Portable Document Format";
  }
}

}