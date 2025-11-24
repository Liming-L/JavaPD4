import java.util.Random;

class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){
    System.out.println(toUpper("Hello World!")); // HELLO WORLD!
    System.out.println(genPswd());   
  }

  String toUpper(String str) {
    StringBuilder result = new StringBuilder();
    for(int i=0;i<str.length();i++){
      char ch=str.charAt(i);

      if(ch>='a'&&ch<='z'){
        ch=(char)(ch-32);
      }
      result.append(ch);
    }
    return result.toString();
  }

  String genpswd(){
    String chars="ABCDEFGHIJKLMNOPQRSTUVWXYZ" + "abcdefghijklmnopqrstuvwxyz" + "0123456789";

    Random rand=new Random();
    StringBuilder password=new StringBuilder();
    for(int i=0li<8;i++){
      int index=rand.nextInt(chars.length());
      password.append(chars.charAt(index));
    }
    return password.toString();
  }
   
  int randInt(int lower, int upper){
    int range = upper - lower;
    return (int)(Math.random()*range+lower);
  }

 
}