package exceptions;

public class InsufficientBalanceException extends RuntimeException {
	public InsufficientBalanceException() {
		
	
	 super("Please enter your amount limit within your bankbalance.."); 
}
}