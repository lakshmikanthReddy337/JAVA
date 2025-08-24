package Abstraction_interface2;

public class Three implements One ,Two {

	@Override
	public void greet() {
		System.out.println("From Greet  :");		
	}

	@Override
	public void bye() {
		System.out.println("From bye  :");		

	}

	@Override
	public void wish() {
		System.out.println("From wish  :");		
		
	}

}
