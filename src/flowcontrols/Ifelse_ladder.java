package flowcontrols;

import java.util.Scanner;

public class Ifelse_ladder {
	
	public static void main(String[] args) {
		System.out.println("Enter the Vlaue:");
		Scanner input =new Scanner(System.in);
		
		 double val=input.nextDouble();
		 
		 if(val>0 && val<10000 )
		 {
			 val=val+(val*0.1);
			 
		 }
		 else if(val>10000 && val<20000)
		 {
			 val=val+(val*0.2);
			 
		 }
		 else if(val>20000 && val>30000)
		 {
			 val=val+(val*0.3);
			 
			 
		 }
		 else 
		 {
			 val=val+(val*0.4);
			 
		 }
		 System.out.println("Total value with valuable percentage:"+val);
	}

}
