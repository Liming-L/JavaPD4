class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){
    Dog toto = new Dog("Terrier", 3, "Toto"); 
    Dog snoopy = new Dog("Beagle", 5, "Snoopy"); 
    Dog poophy = new Dog("Poodle", 2, "Poophy");

    toto.bark(); 
    snoopy.bark(); 
    poophy.bark();
  }




  
  int randInt(int lower, int upper){
    int range = upper - lower;
    return (int)(Math.random()*range+lower);
  }

}