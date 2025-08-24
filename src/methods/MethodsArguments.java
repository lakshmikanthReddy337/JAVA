package methods;

import java.util.Scanner;

public class MethodsArguments {

	//1) No return-type and no arguments

	public void natSum1()
	
	{
		System.out.println("Enter a natural Numbers");
		Scanner input = new Scanner(System.in);
		int n=input.nextInt();
		System.out.println("Sumof:  "+n+"  Natural numbers::"+n*(n+1)/2);
		input.close();
		
		
	}
//	2) No return-type and arguments
	
	public void natSum2(int n) {
		
	System.out.println("Sumof:  "+n+"  Natural numbers::"+n*(n+1)/2);

		
	}
	//3) return-type and no arguments
	public int natSum3() {
		
		System.out.println("Enter a natural Numbers");
		Scanner input2 = new Scanner(System.in);
		int n=input2.nextInt();
		int result=(n*(n+1)/2);
		
		return result;
		
		
		
	}
//4) return-type and arguments
	
	public int natSum4(int n) {
		
		int result2=(n*(n+1)/2);
		
		return result2;
		
		
	}
	

	
}
