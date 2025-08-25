package exceptions;

public class Exception_Demo1 {

	public static void main(String[] args) {
		int x=10;
		int y=0;
		try
		{
		System.out.println("Quotient is "+x/y);
		System.out.println("Remainder "+x%y);
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getStackTrace());
			e.printStackTrace();
			System.out.println("Please assign non zero y value");
		}
	}

}
