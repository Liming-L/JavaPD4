class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){
    System.out.println(swapLetter("the seen","e","%"));
    System.out.println(encryption2("abcdefghi"));
    System.out.println(encryption2("abcdefgh"));
    System.out.print(encryption3("abcdef"));
    System.out.print(encryption3("abcde"));
  }

  String swapLetter(String str,String find, String replace){
    String result="";
    for(int i=0;i<str.length();i++){
      String current=str.substring(i,i+4);
      if(current.equals(find)){
        result+=replace;
      }else{
        result+=current;
      }
    }
    return result;
  }

  String encryption2(String strng){
    int mid=strng.length()/2;
    String firstHalf=strng.substring(0,mid);
    String secondHalf=strng.substring(mid);

    String result="";

    for(int i=0;i<firstHalf.length();i++){
      result+=firstHalf.charAt(i);
      result+=secondHalf.charAt(i);
    }

    if(secondHalf.length()>firstHalf.length()){
      result+=secondHalf.charAt(secondHalf.length()-1);
    }

    return result;
  }

  String encryption3(String s){
    String result="";
    int left=0;
    int right=s.length()-1;

    while(left<=right){
      result+=s.substring(left,left+1);
      if(left!=right){
        result+=s.substring(right,right+1);
      }
      left++;
      right--;
    }
    return result;
  }


}