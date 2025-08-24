package javaDemo1;

import java.util.Scanner;

public class MethodsDemo1 {

	public void greet() {
		
		Scanner ohs = new Scanner(System.in);
		
		System.out.println("Enter name of your friend:");
		String a=ohs.next();
		System.out.println("Hi "+a);
		Scanner ooo=new Scanner(System.in);
		System.out.println("Enter age ");
		int aa=ooo.nextInt();
		System.out.println("Age  :"+aa );

		
		
		
	}
	
	
	public static void main(String[] args) {
		MethodsDemo1 ops=new MethodsDemo1();
		
		ops.greet();
		
		
	}

}
