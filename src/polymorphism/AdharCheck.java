package polymorphism;

public class AdharCheck {

	public static void main(String[] args) {
		Adhar obj = new Adhar();

        obj.generateAadhar();                      // Random Aadhar
        obj.generateAadhar("Lakshmikanth");        // Aadhar with name
        obj.generateAadhar("Ravi", 30);            // Aadhar with name and age

	}

}
