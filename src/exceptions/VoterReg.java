package exceptions;

import java.util.Scanner;

public class VoterReg {

	public static void main(String[] args) {
		System.out.println("Wellcome to voting website..");
		 Scanner input  =new Scanner(System.in);


		System.out.println("Enter your  name ...");
		 String str=input.next();

		System.out.println("Enter your age:");
		
		 
		 
		 int age=input.nextInt();
		if(age>=18)
		{
			System.out.println("Please procced with Registration");
		}
		else
		{
			
			//System.out.println("Your not eligible");
			try {
			throw new InvalidAgeException();
			}
			catch (InvalidAgeException e) {
				System.err.println(e.getMessage());
			}
		}
		 
		System.out.println("End of program:"); 
	}

}
