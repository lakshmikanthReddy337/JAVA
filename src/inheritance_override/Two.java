package inheritance_override;

public class Two extends one {
	
	int a;
	public void putA(int a)
	{
		this.a=a;
		
	}
	
	public void getTwo()
	{
		System.out.println("value of a is child_Class "+this.a);
		
		System.out.println("This value from One (Parent class)"+super.a);
	}
}
