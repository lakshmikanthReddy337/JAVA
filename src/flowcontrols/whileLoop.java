package flowcontrols;


	
	import java.util.Scanner;
	public class whileLoop {


		public static void main(String[] args) {
			
			boolean status =false;
			
			do
			{
				System.out.println("Enter some character ..");
				Scanner input=new Scanner(System.in);
				//there is no direct method in Scanner class to scan char value
				//one trick is use next() to scan a String and choose the first character which at 0 index
				char ch=input.next().charAt(0);
				
				if(ch!='x'&& ch!='X')
				{
					System.out.println("you have entered "+ch+" character");
				}
				else
				{
					System.out.println("Entered x ..Game Over ..");
					break;
				}
				
			}while(status);
			
			System.out.println("End of program...");

		}

	}