package encapsulation;

public class Numbers {
	
	int x,y;
	public void setXY(int x, int y)
	{
		/*what is the need of this keyword ?

	when we have local variables same as instance variables
	local variables will dominate so to avoid this we will use "this"
	this : is a keyword and operator
	which will replace current calling object reference 
		  */		
		this.x=x;
		this.y=y;
		
	}
	public void getXY()
	{
		System.out.println("X value is : "+x);
		System.out.println("Y value is :"+y);
	}

}
