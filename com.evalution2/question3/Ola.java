package question3;

class OLA{
	
	public Car bookCar(int numberOfPassenger, int numberOfKMs) {
		
		if(numberOfPassenger<=3) {
			return new HatchBack();
		}
		
		return new Sedan();
	}
	
	public void calculateBill(Car car) {
		
		
		HatchBack h= (HatchBack)car;
		Car ccCar= (Car)h;
		System.out.println(ccCar.getNumberOfKms()+"dfdfff");
		
		System.out.println(h.farePerKm);
//		
//		int total=h.getNumberOfKms()* h.farePerKm;
//		System.out.println(total);
		//return total;
		//Total fare=numberOfKms*farePerKm
	}
}
