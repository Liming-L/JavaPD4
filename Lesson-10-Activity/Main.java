
class Main {

	public static void main(String[] args) {
    	(new Main()).init();
	}

	void init(){
		System.out.println("Student is Graduating");
   		System.out.println("Student is NOT Graduating");
  }

  double gpa(double gpaValue){
	if(gpaValue>=90){
		return gpaValue*1.1;
	}
	else{
		return gpaValue;
	}
  Boolean isGraduating(int gradelevel, int credits){
	if(gradelevel=12 && credits>=44){
		return True;
	}
	else{
		return False;
	}
	}
  }
 
  String bmi(double weight, double height){
	double bmi=(weight/(height*height))*703;
	if(bmi<=18.4){
		return "Underweight";
	}
	else if(bmi>=18.5&&bmi<=24.9){
		return "Normal";
	}
	else if(bmi>=25.0&&bmi<=39.9){
		return "Overweight";
	}
	else{
		return "Obese";
	}
  }

  double shippingCost(double weight){
	if(weight<=10){
		return 0;
	}
	else if(weight>10&&weight<=15){
		return 5;
	}
	else if(weight>15&&weight<=25){
		return 10;
	}
	else (weight>25){
		return 10.00+0.2*weight;
	}
  }
}