package lab5;

import java.util.Scanner;

public class lab5Ex3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter salary:");
		double salary=sc.nextDouble();
		sc.close();
		
		try {
			
			if(salary<3000) {
				Ex3EmployeeException ae=new Ex3EmployeeException("Salary should be greater than Rs.3000");
				throw ae;
			}
			else {
				System.out.println("Accepted");
			}
		}
		
		catch(Ex3EmployeeException e) {
			System.out.println(e);
			
		}
		
		
		
		

	}

}
