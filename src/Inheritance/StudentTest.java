package Inheritance;

public class StudentTest {

	public static void main(String[] args) {
		//Display the Student details
		Student obj = new Student();
		obj.setDetails(44, "Rahul");
		obj.getDetails();
		//Total Marks of the three Subjects
		Marks s1=new Marks();
		s1.setMarks(80,90,100);
		s1.getMarks();
		//Leaves taken by Student:
		Leaves l1=new Leaves();
		l1.setLeave(5, 4);
		l1.getLeave();
		
	
	}

}
