package question3;
  public class Main {

	public static void main(String[] args) {

		
		Scanner s= new Scanner(System.in);
		System.out.println("Enter number of passengers:");
		int n=s.nextInt();
		
		System.out.println("Enter number of kms:");
		int km=s.nextInt();
		
		Car car= new Car();
		car.setNumberOfKms(km);
		car.setNumberOfPassenger(n);
		
		OLA ola= new OLA();
		//ola.bookCar(n, km);
		Car c=ola.bookCar(n, km);
		ola.calculateBill(c);
		//int ans= ola.calculateBill(c);
		//System.out.println("The total fare amount is "+ ans);
	}

}
