package objectandClass;

public class Person {
	
	public String name;
	
	public int age;
	
	public long  ph;
	
	
	public void greet()
	{
	
		System.out.println("Hi  "+ name+"  Good evening..How are you today");
	
	}
	
	public static Person getPerson() 
	{
		return new Person();
		
		
	}
	

}
