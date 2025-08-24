package javaDemo1;

public class ScannerDemo {

	public static void main(String[] args) {
		
		int n =10,first =0,second=1;
		System.out.println("Fabinossi Series :");
		
		for(int i =0;i<n;i++) {
			int next =first+second;
			System.out.println(first);
			first=second;
			second=next;

			
		}

	}

}
