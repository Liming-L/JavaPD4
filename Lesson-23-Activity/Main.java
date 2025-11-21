class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  
  void print(Object o){System.out.println(o);}
  void printt(Object o){System.out.print(o);}

  void init(){


  }

  double total(double[] prices){
    double taxRate=0.08525;
    double totalPrice=0;

    for(double price:prices){
      totalPrice+=price;
    }

    totalPrice+=totalPrice*taxRate;
    return totalPrice;
  }

  void main(String[]args){
    double[] prices={19.99,49.99,15.49,23.99,10.00};
    dobuel totalPriceWithTax=total(prices);
    System.out.printf("Total price including tax:",totalPriceWithTax);
  }



  // Use these functions below for the activity

  String convertToEmoji(String code){
    return String.valueOf(Character.toChars(
                               Integer.parseInt(code, 16)));
  }

  
  int randInt(int lower, int upper){
    int range = upper - lower;
    return (int)(Math.random()*range+lower);
  }

  boolean isPrime(int n){
    int divisor = 2;
    while(n%divisor !=0){
      divisor+=1;
    }
    if(divisor==n)
      return true;
    else
      return false;
  }
}