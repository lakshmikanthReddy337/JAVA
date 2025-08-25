package exceptions;

public class MultiExceptionDemo1 {

	public static void main(String[] args) {
		int [] number= {10,20,30};
		String str ="FLM";
		try {
		int result=number[1]/10;
		System.out.println(str.length());
		System.out.println(result);
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
			System.out.println("Please enter index with less then length of array or equal");
		}
		catch (ArithmeticException e) {
			System.out.println(e.getMessage());
			System.out.println("Please Divede with non-zero:");
		}
		catch (Exception e) {
		System.out.println(e.getMessage());
		System.out.println("generic Exceptions:");
		}
		
		System.out.println("End Of program");
	}

}
