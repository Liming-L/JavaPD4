class Main {

	public static void main(String[] args) {
    	(new Main()).init();
	}

  void init(){
	print("Hello");
	System.out.println("enter Fahrenheit");
    double f= Input.readDouble();
    double c=0;
    c=(32*f-32)*(5/9);
    System.out.println(c);
  }

  void print(String msg){
	System.out.println(msg);
  }

  void print(String FtoC){
	System.out.println(FtoC);

  }
  
 
}