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
  }

  String nycLocate(){
    if(word.substring()){

    }
  }




}