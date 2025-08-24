package encapsulation;

public class Bank {
	 private double balance=10000.0;
	 
	 public double getBalance(int pin)
	 {
		 //validation
		 
		 if(pin==9865)
		 {
			 
			 System.out.print("Total Amount =");
			 return balance;
		 }
		 else
		 {
			 System.out.println("invalid pin entered");
			 return 0.0;
		 }
	 }
	
	public void setBalance(double deposit)
	{
		balance=balance+deposit;
	}

}
