
package question2ev;
import java.util.Scanner;

public class Demo{
	
	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		System.out.println("Enter number of student:");
		int n=s.nextInt();
		
		Student[] arr= new Student[n];
		int sum=0;
		for(int i=0; i<n;i++) {
			s.nextLine();
			System.out.println("Enter Address:");
			String add=s.nextLine();
			
			System.out.println("Enter roll:");
			int roll1=s.nextInt();
			System.out.println("Enter marks:");
			int marks1=s.nextInt();
			s.nextLine();
			System.out.println("Enter name:");
			String name1=s.next();
			
			Student ar= new Student();
			ar.setAddress(add);
			ar.setMarks(marks1);
			ar.setName(name1);
			ar.setRoll(roll1);
			arr[i]=ar;
			System.out.println("Name--"+ar.getName());
			System.out.println("roll number--"+ar.getRoll());
			System.out.println("marks--"+ar.getMarks());
			System.out.println("address--"+ar.getAddress());
			sum+=ar.getMarks();
			
		}
		
		int average= sum/n;
		System.out.println("average---"+average);
		
	}
}
