package arrays_Methods;

import objectandClass.Person;

public class Array_Demo4 {

	public static void main(String[] args) {
		Person[] p = new Person[4];
		
		for(int i=0;i<p.length;i++)
		{
			System.out.println(p[i]);
		}
		
		System.out.println("************");
		
		p[0]=new Person();
		p[1]=new Person();
		p[2]=new Person();
		p[3]=new Person();
		
		
		for(int i=0;i<p.length;i++)
		{
			System.out.println(p[i].name);
			System.out.println(p[i].age);
			System.out.println(p[i].ph);
		}
		System.out.println("************");
		
		p[0].name="Kanth";
		p[0].age=22;
		p[0].ph=9808998089L;
		for(int i=0;i<p.length;i++)
		{
			System.out.println(p[i].name);
			System.out.println(p[i].age);
			System.out.println(p[i].ph);
		}
		

		
	}

}
