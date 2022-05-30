package question3;

class HatchBack extends Car{
	
	final int farePerKm =15;
	int a;
	HatchBack(){
		this.a=super.getNumberOfKms();
	}
}
