class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  
  void print(Object o){System.out.println(o);}
  void printt(Object o){System.out.print(o);}

  void init(){
    Car Vehicle = new Car("Toyota","Black","Sienna",2025,39485); 
    Car Vehicle2 = new Car("Toyota","White","Camry",2025,29800); 

    Vehicle.honk(); 
    Vehicle2.honk();

  }


  

  
  int randInt(int lower, int upper){
    int range = upper - lower;
    return (int)(Math.random()*range+lower);
  }


}