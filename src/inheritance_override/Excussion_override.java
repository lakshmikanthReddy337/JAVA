package inheritance_override;

public class Excussion_override {

	public static void main(String[] args) {

		//case 1  ==> no method overriding happened
		
		Parent_override obj= new Parent_override();
		obj.m1(11);
		obj.greet("Kanth_Reddy");
		System.out.println(obj.x);
		
				
		//case 2 ==> method overriding happened
			Override_1 obj2=new Override_1();
			obj2.m1();
			//obj2.greet("Kanth_Reddy");
			System.out.println(obj2.x);
				
		//case 3  (Invalid : Type mismatch: cannot convert from Parent_override to Override_1)
				//Override_1 obj3 = new Parent_override();
				
		//case 4 *** ==> method overriding happened
				Override_1 obj4 = new Override_1();
				obj4.m1();
				obj4.greet("Kanth_Reddy");
				System.out.println(obj4.x);
				
	}

}
