class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){
    
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
   
  int randInt(int lower, int upper){
    int range = upper - lower;
    return (int)(Math.random()*range+lower);
  }

 
}