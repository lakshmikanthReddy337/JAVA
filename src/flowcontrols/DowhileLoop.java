package flowcontrols;

import java.util.Scanner;

public class DowhileLoop {

	public static void main(String[] args) {
			boolean status=false;
			
			
			do {
				System.out.println("Please enter Character:");
				Scanner  sc=new Scanner(System.in);
				 char ch=sc.next().charAt(0);
				
				if(ch!='x' && ch!='X')
				{
					System.out.println("you have entered "+ch+" character");
				}
				else
				{
					System.out.println("Entered x ..Game Over ..");
					break;
				}
				
				
			}while (status);
					System.out.println("End of program");
					
				
				
			
	}

}
