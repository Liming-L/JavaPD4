class Main {

	public static void main(String[] args) {
    	(new Main()).init();
	}

  void init(){
	print("Hello");
	double c=FtoC(73.6);
  double ans=sphereVolume(4);
  }

  void print(String msg){
	  System.out.println(msg);
  }

  double FtoC(double F){
    double c=(F-32)*(5/9.0);
	  return c;
  }
  
  double sphereVolume(double r){
    double ans=(4/3.0)*Math.PI*(Math.pow(r,3));
    return ans;
  }


 
}