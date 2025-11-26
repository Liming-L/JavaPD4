class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){

    // Challenge1: Read in the file Original.txt and store it in a variable
    String text = Input.readFile("Original.txt");
    
    String encoded = encode(text);
    print("Encoded: " + encoded);

    print("Decoded: " + decode(encoded));

    
  }

   // Challenge2: 
  //  Write the function encode that takes in a string
  //  and create a new string that using a caesar cipher 
  // by shifting all ascii values by 3.  Don't worry about
  // wrapping arount the alphabet.

  // Challenge3: 
  //  Write the function decode that takes in a string
  //  and reverses what the function in chanllenge 2
  //  so that you get the original message.

  String encode(String s){
    String bld = "";
    for(int i=0; i<s.length(); i++){
      char ch = s.charAt(i);
      int ascii = (int)ch;
      ch = (char)(ascii+3);
      bld += ch;
    }
    return bld;
  }

  String decode(String s){
    String bld = "";
    for(int i=0; i<s.length(); i++){
      char ch = s.charAt(i);
      int ascii = (int)ch;
      ch = (char)(ascii-3);
      bld += ch;
    }
    return bld;
  }

  int randInt(int lower, int upper){
    int range = upper - lower;
    return (int)(Math.random()*range+lower);
  }

}