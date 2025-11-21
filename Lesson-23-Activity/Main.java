class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  
  void print(Object o){System.out.println(o);}
  void printt(Object o){System.out.print(o);}

  void init(){
    double[] prices={19.99,49.99,15.49,23.99,10.00};
    double totalPriceWithTax=total(prices);
    System.out.println("Total price including tax:"+totalPriceWithTax);

    int[] numbers={3,7,12,5,9,21};
    int search1=5;
    int search2=10;
    System.out.println(search1+" in array?"+isin(numbers,search1));
    System.out.println(search2+" in array?"+isin(numbers,search2));

    int[]picks={4,9,15,21,28,33};
    int[]drawn={2,9,19,21,25,33};
    int matches=checkLotto(picks,drawn);
    System.out.println("You matched"+matches+"lotto numbers!");
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

  boolean isin(int[] arr,int num){
    for(int value:arr){
      if(value==num){
        return true;
      }
    }
    return false;
  }

  int checkLotto(int[] picks,int[] drawn){
    int count=0;
    for(int num:picks){
      if(isin(drawn,num)){
        count++;
      }
    }
    return count;
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