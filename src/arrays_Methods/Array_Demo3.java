package arrays_Methods;

public class Array_Demo3 {

	public static void main(String[] args) {
		String[] s= new String[5];
		
		for(int i=0;i<s.length;i++)
		{
			System.out.println(s[i]);
			
		}
		
		System.out.println("-----------");
		s[1]="FLM";
		s[2]="Java";
		s[3]="Arrays";
		for(int i=0;i<s.length;i++)
		{
			System.out.println(s[i]);
			
		}
		
	}

}
