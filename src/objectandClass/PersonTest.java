package objectandClass;

public class PersonTest {

	public static void main(String[] args) {
		
		Person p1 = new Person();
		
		
		System.out.println(p1.name);
		System.out.println(p1.age);
		System.out.println(p1.ph);
		
		p1.greet();
		
		p1.name="Raju";
		p1.age=18;
		p1.ph=90992829809L;
		
		
		System.out.println(p1.name);
		System.out.println(p1.age);
		System.out.println(p1.ph);
		p1.greet();

		Person p2 = new Person();
		p2.name="Rani";
		p2.age=18;
		p2.ph=9989898912L;
		
		System.out.println(p2.name);
		System.out.println(p2.age);
		System.out.println(p2.ph);
		p1.greet();

		
	}

}
