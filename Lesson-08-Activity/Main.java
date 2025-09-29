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
  double x1=5;
  double x2=8;
  double y1=5;
  double y2=2;
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

   double distance(double x1, double x2, double y1, double y2){
    double result=(Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2)));
    return result;


  }
 

}