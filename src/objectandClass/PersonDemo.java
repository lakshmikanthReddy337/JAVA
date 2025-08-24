package objectandClass;

public class PersonDemo {

	public static void main(String[] args) {
		Person obj1=Person.getPerson();
		
		System.out.println(obj1.name);
		System.out.println(obj1.age);
		System.out.println(obj1.ph);
        		
		obj1. name="rahul";
		obj1.age=22;
		obj1.ph=9839830937L;
		
		
		System.out.println(obj1.name);
		System.out.println(obj1.age);
		System.out.println(obj1.ph);
        		


		}

}
