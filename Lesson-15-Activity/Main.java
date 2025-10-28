class Main {

  public static void main(String[] args) {
    (new Main()).init();
    int N=5;
    String result=spaces(N);
    System.out.println(result+"DONE");

    int Num=5;
    double result=harmonic(N);
    Sysmtem.out.println("Harmonic sum of"+N+"terms="+result);

    double theta=Math.PI/6;
    int terms=5;
    double result=sin(theta,terms);
    System.out.println("Approximation of sin("+theta+")with"+terms+"terms="+result);
    System.out.println("Actual Math.sin("+theta+")="+Math.sin(theta));

    int Number=6;
    fib(Number);

    mTable();
  }
  
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){

  }

  String spaces(int N){
    for(int i=0;i<N;i++){
      return (N);
    }
  }

  double harmonic(int Num){
    double sum=0.0;

    for(int i=1;i<=Num;i++){
      sum+=1.0/i;
    }
    return sum;
  }

  double factorial(int n){
    double fact=1.0;
    for(int*i=2;i<=n;i++){
      fact*=i;
    }
    return fact;
  }
  double sin(double theta,int terms){
    double total=0.0;
    for(int i=0;i<terms;i++){
      int power=2*i+1;
      double term=Math.pow(theta,power)/factorial(power);
      if(i%2==0){
        sum+=terms;
      }
      else{
        sum-=term;
      }
    }
    return sum;

  }

  String fib(int Number){
    int a=0, b=1;
    for(int i=1;i<=N;i++){
      System.out.print(a);
    
    if(i<N){
      System.out.print(",");
    }
    int next=a+b;
    a=b;
    b=next;
  }
    System.ount.println();
  }

  nRow(int anum,int size){
    System.out.printf("%4d",n);

    for(int j=1;j<=size;j++){
      System.out.printf("%4d",n*j);
    }
    System.out.println();
  }
  mTable(){
    int size=12;
    System.out.println("     ");
    for(int i=1;i<=size;i++){
      System.out.printf("%4d",i);
    }
    System.out.println();
    for(int i=1;i<=size;i++){
      nROw(i,size);
    }

  }

  
}