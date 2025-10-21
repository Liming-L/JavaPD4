class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){
   
  }
  String creditCardType(String card){
    if(card.substring(0,1).equals("4")){
      return "Visa";
    }
    else if(card.substring(0,2).equals("34")||card.substring(0,2).equals("37")){
      return "American express";
    }
    else if(card.substring(0,2).equals("36")){
      return "Diner Club";
    }
    else if(card.substring(0,2).equals("51")||card.substring(0,2).equals("55")){
      return "Mastercard";
    }
    else if(card.substring(0,4).equals("6011")||card.substring(0,2).equals("65")){
      return "Discovery";
    }
    else{
      return "Unknown";
    }
  }
  String pigLatin(String word){
    String firstLetter=word.substring(0,1);
    String restOfWord=word.substring(1);
    String pigLatinWord=restOfWord+firstLetter+"ay";
    return pigLatinWord;
  }

  String nycLocate(String zip){
    if(zip.substring(0,3).equals("100")||zip.substring(0,3).equals("101")||zip.substring(0,3).equals("102")){
      return "Manhattan";
    }
    else if(zip.substring(0,3).equals("103")){
      return "Staten Island";
    }
    else if(zip.substring(0,3).equals("104")){
      return "Bronx";
    }
    else if(zip.substring(0,3).equals("112")){
      return "Brooklyn";
    }
    else if(zip.substring(0,3).equals("113")||zip.substring(0,3).equals("114")||zip.substring(0,3).equals("111")){
      return "Queens";
    }
    else{
      return "Unknown";
    }
  }

  String getMonth(String date){
    if(date.substring(0,2).equals("01")){
      return "January";
    }
    else if(date.substring(0,2).equals("02")){
      return "February";
    }
    else if(date.substring(0,2).equals("03")){
      return "March";
    }
    else if(date.substring(0,2).equals("04")){
      return "April";
    }
    else if(date.substring(0,2).equals("05")){
      return "May";
    }
    else if(date.substring(0,2).equals("06")){
      return "June";
    }
    else if(date.substring(0,2).equals("07")){
      return "July";
    }
    else if(date.substring(0,2).equals("08")){
      return "August";
    }
    else if(date.substring(0,2).equals("09")){
      return "September";
    }
    else if(date.substring(0,2).equals("10")){
      return "October";
    }
    else if(date.substring(0,2).equals("11")){
      return "November";
    }
    else if(date.substring(0,2).equals("12")){
      return "December";
    }
    else{
      return "Unknown";
    }
  }

  boolean validatePswd(String password){
    if(password.length()>5&&password.length()<8){
      return true;
    }
    else{
      return false;
    }
  }


}