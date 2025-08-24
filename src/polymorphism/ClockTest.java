package polymorphism;

public class ClockTest {

	public static void main(String[] args) {
		Clock obj= new Clock();
		
		//setClock with single parameter;
		obj.setClock(2);
		obj.getClock();
		//setClock with double parameter;

		obj.setClock(2,18);
		obj.getClock();
		//setClock with three parameter;

		obj.setClock(4,18,56);
		obj.getClock();
		
		}

}
