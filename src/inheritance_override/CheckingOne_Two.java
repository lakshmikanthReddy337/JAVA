package inheritance_override;

public class CheckingOne_Two {

	public static void main(String[] args) {
/*Same method name and same signature (parameters) in both classes.

The child class method runs instead of parent class method.

*/
		Two obj=new Two();
		obj.setA(22);
		obj.putA(33);
		obj.getTwo();
		
		
		
	}

}
