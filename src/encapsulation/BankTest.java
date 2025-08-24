package encapsulation;

public class BankTest {

	public static void main(String[] args) {
		Bank obj=new Bank();
		//System.out.println(obj.balance);
		
		//System.out.println(obj.getBalance(9865));
		obj.setBalance(9000);
		System.out.println(obj.getBalance(9865));
	}

}
