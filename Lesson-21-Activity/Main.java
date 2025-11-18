import java.util.Random;
import java.util.Scanner;

class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  
  void print(Object o){System.out.println(o);}
  void printt(Object o){System.out.print(o);}

  void init(){
    System.out.println("Days needed: " + daysToReachFiveDollars());
  }

  void main(String[] args) {
    System.out.println(GCF(20, 12));
    System.out.println(GCF(81, 27));
  }

  void main(string[]args){
    addTwoNumbers();
  }


  int daysToReachFiveDollars(){
    double amount=0.01;
    int days=1;

    while(amount<5.0){
      amount*=2;
      days++;
    }
    return days;
  }

  String addTwoNumbers(){
    Random rand = new Random();
    Scanner input = new Scanner(System.in);

     int a = rand.nextInt(100) + 1;
     int b = rand.nextInt(100) + 1;

     int correct = a + b;
     int userAnswer;

     System.out.println("What is " + a + " + " + b + "?");

    while (true) {
      System.out.print("Your answer: ");
      userAnswer = input.nextInt();

      if (userAnswer == correct) {
          System.out.println("Correct!");
          break;   // exit loop
      } else {
          System.out.println("Incorrect, try again.");
      }
    }

  }  

  int GCF(int a,int b){
    a=Math.abs(a);
    b=Math.abs(b);

    while(b!=0){
      int temp=b;
      b=a%b;
      a=temp;
    }
    return a;
  }



  




  
  int randInt(int lower, int upper){
    int range = upper - lower;
    return (int)(Math.random()*range+lower);
  }

}