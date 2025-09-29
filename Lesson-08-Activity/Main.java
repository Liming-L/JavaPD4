class Main {

	public static void main(String[] args) {
    	(new Main()).init();
	}

  void init(){
	print("Hello");
	double cel=FtoC(73.6);
  }

  void print(String msg){
	System.out.println(msg);
  }

  void FtoC(double F){
    double c= 98.6;
    FtoC=(f-32)*(5/9.0);
	return c;
  }
  
 
}