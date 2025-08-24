package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashsetDemo2 {

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
			System.out.println("**********************");

		 //for each loop
		 for(String temp:hs)
		 {
			 System.out.println(temp);
		 }
		 
			System.out.println("**********************");

		 //iterator
		 Iterator<String> it=hs.iterator();
			
			while(it.hasNext())
			{
				System.out.println(it.next());
			}
	}

}
