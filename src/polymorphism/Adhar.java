package polymorphism;

public class Adhar {
	
	// Method with no parameters - generate random Aadhar
   public  void generateAadhar() {
        System.out.println((int)(Math.random() * 10000) + " " +
                           (int)(Math.random() * 10000) + " " +
                           (int)(Math.random() * 10000));
    }

    // Overloaded method - generate Aadhar using name input
     public void generateAadhar(String name) {
        System.out.println("Aadhar for " + name + ": " +
                           (int)(Math.random() * 10000) + " " +
                           (int)(Math.random() * 10000) + " " +
                           (int)(Math.random() * 10000));
    }

    // Overloaded method - generate Aadhar using name and age
   public  void generateAadhar(String name, int age) {
        System.out.println("Aadhar for " + name + " (Age: " + age + "): " +
                           (int)(Math.random() * 10000) + " " +
                           (int)(Math.random() * 10000) + " " +
                           (int)(Math.random() * 10000));
    }


}
