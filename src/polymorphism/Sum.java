package polymorphism;

public class Sum {

	public void add(int x,int y)
	{
		System.out.println("Sum of 2 values  ="+(x+y));
	}
	
	public void add(double x,double y)
	
	{
		System.out.println("Sum of 2 double values  ="+(x+y));

	}
	public void add(double x,double y,double z)
	{
		System.out.println("Sum of 3 double values ="+(x+y+z));
	
	}
	public void add(long x,long y,long z)
	{
		System.out.println("Sum of 3 long values ="+(x+y+z));

	}

}
/*POLY - many
morphs - forms 

The method add(int, int) in the type Sum is not applicable for the arguments (double, double)


The method add(int, int) in the type Sum is not applicable for the arguments (long, long)

The method add(int, int) in the type Sum is not applicable for the arguments (int, int, int)*/