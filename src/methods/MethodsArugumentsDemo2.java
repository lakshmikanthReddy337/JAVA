package methods;

import java.util.Scanner;

public class MethodsArugumentsDemo2 {
	//1) No return-type and no arguments

	public static void natSum1() {
		
		System.out.println("Enter the Natural Number ");
		
		Scanner input = new Scanner(System.in);
		int n =input.nextInt();
		int result = (n*(n+1)/2);
		System.out.println("Sum oF "+n+"The natural Number of"+result);
		input.close();
		
		
	}
	//2) No return-type and arguments
	public static void natSum2(int n) {
		int result2 = (n*(n+1)/2);

		System.out.println("Sum oF  "+n+"  The natural Number of  :"+result2);

		
	}

	//3) return-type and no arguments
	public static int natSum3() {
		
		System.out.println("Enter the Natural Number ");

		Scanner input2 = new Scanner(System.in);
		int n =input2.nextInt();
		int result2 = (n*(n+1)/2);
		
		return result2;
		
	}
	//4) return-type and arguments
	 public static int natSum4(int n) {
		 int re=(n*(n+1)/2);
		 
		return re;
		 
		 
	 }
}
