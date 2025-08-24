package polymorphism.constructors;

public class ClockTest {

	public static void main(String[] args) {
		//user1
		Clock obj = new Clock();
		obj.getClock();
		//user2
		Clock obj2 = new Clock(3);
		obj2.getClock();
		//user3
		Clock obj3 = new Clock(2,9);
		obj3.getClock();
		//user4
		Clock obj4 = new Clock(7,18,46);
		obj4.getClock();
		
		
		}

}
