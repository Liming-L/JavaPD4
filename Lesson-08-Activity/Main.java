class Main {

	public static void main(String[] args) {
    	(new Main()).init();
	}

  void init(){
	print("Hello");
	double c=FtoC(73.6);
  double ans=sphereVolume(4);
  double radius=8;
  double h=7;
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

  double coneVolume(double h, double radius){
    double res=(Math.PI)*(Math.pow(radius,2)*(h/3.0));
    return res;
  }

 

}