package collections;

import java.util.HashSet;
import java.util.Set;

public class HashsetDemo1 {

	public static void main(String[] args) {
		 Set<String> hs=new HashSet<String>();
		 System.out.println("Size of hasset  "+hs.size());
		 hs.add("Kiwi");
		 hs.add("Apple");
		 hs.add("Banana");
		 hs.add("Grapes");
		 hs.add("Lemon");
		 hs.add("mango");
		 System.out.println("Size of hasset  "+hs.size());
		 
		 System.out.println(hs);
		 
	}

}
