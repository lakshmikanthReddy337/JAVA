package javaDemo1;

import java.util.Scanner;

public class DemoCheck {

	public static void main(String[] args) {
		
	        Scanner sc = new Scanner(System.in); // using Scanner
	        System.out.print("Enter something: ");
	        String input = sc.nextLine();
	        System.out.println("You entered: " + input);
	        sc.close();
	    }
	}