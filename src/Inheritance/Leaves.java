package Inheritance;

public class Leaves extends Marks {
	
	
	int cl,sl;
	public void setLeave(int cl,int sl)
	{
		this.cl=cl;
		this.sl=sl;
	}
	
	public void getLeave()
	{
		System.out.println("Total Number of Leaves :"+(cl+sl));
	}
	
	

}
