package exceptions;

import java.util.Scanner;

public class Exception_Banking {

	public static void main(String[] args) {
			System.out.println("Please enter the  amount:");
			Scanner input = new Scanner(System.in);
			int balance=input.nextInt();
			
			if(balance<=200)
			{
				System.out.println(" Withdrawing Money from your account..");
			}
			
			else
			{
				
				//System.out.println("Your not eligible");
				try {
				throw new InsufficientBalanceException();
				}
				catch (InsufficientBalanceException e) {
					System.err.println(e.getMessage());
				}
			}
	}

}
