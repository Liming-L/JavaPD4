import java.util.Random;

class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  
  void print(Object o){System.out.println(o);}
  void printt(Object o){System.out.print(o);}

  void init(){
    System.out.println(rollDice());
    System.out.println(rollDice());
    System.out.println(lotto());
  }

  void main(String[] args){
    System.out.println(additionTutor());
  }

  void main(String[]args){
    diceDistribution(100);
    diceDistribution(1000);
    diceDistribution(100000);
    diceDistribution(1000000);
  }

  String rollDice(){
    Random rand=new Random();
    int die1=rand.nextInt(6)+1;
    int die2=rand.nextInt(6)+1;
    return die1+""+die2;
  }

  String lotto(){
    Random rand=new Random();
    StringBuilder result=new StringBuilder();

    for(int i=0;i<5;i++){
      int num=rand.nextInt(48)+1;
      resilt.append(num);

      if(i<4){
        result.append("");
      }
    }
    return result.toString();
  }
  

  String diceDistribution(int N){
    Random rand=new Random();
    int[] counts=new int[6];

    for(int i=0;i<N;i++){
      int roll=rand.nextInt(6)+1;
      counts[roll-1]++;
    }

    System.out.println("Results for N="+N);
    for(int i=0;i<6;i++){
      System.out.println((i+1)+":"+counts[i]);
    }
    System.out.println();
  }

  String additionTutor(){
    Random rand=new Random();
    Scanner input=new Scanner(System.in);

    int a=rand.nextInt(100)+1;
    int b=rand.nextInt(100)+1;

    System.out.println("what is"+a+"+"+b+"?");

    int answer=input.nextInt();
    int correctAnswer=a+b;

    if(answer==correctAnswer){
      return"Correct!";
    }else{
      return"Incorrect";
    }
  }

  



}