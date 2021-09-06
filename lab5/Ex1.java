package lab5;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter age:");
		int age=sc.nextInt();
		sc.close();
		
		try {
			if(age<15) {
				
				AgeLimitException ae=new AgeLimitException("Not Eligible...");
				throw ae;
			}
			
			else {
				System.out.println("Eligible");
			}
			
			
		}
		
		catch(AgeLimitException e) {
				System.out.println(e);
			
		}
		

	}

}
