package lab5;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first name:");
		String firstName=sc.nextLine();
		System.out.println("Enter last name:");
		String lastName=sc.nextLine();
		sc.close();
		
		try {
			if(firstName.isBlank() || lastName.isBlank()) {
				
				
				Ex2NameValidateException ae=new Ex2NameValidateException("Invalid name");
				throw ae;
				
			}
			
			else {
				System.out.println("Correct name");
			}
		}
		
		catch(Ex2NameValidateException e) {
			System.out.println(e);
		}
		
	}

}
