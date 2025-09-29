class Main {

	public static void main(String[] args) {
    	(new Main()).init();
	}

  void init(){
	print("Hello");
    double f= 97;
    double FtoC=0;
    FtoC=(32*f-32)*(5/9);
  }

  void print(String msg){
	System.out.println(msg);
  }

  void print(double FtoC){
	System.out.println(FtoC);

  }
  
 
}