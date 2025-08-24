package arrays_Methods;

public class ArrayDemo {

	public static void main(String[] args) {
		int[] b = new int[10];
		
		for(int i=0;i<b.length;i++)
		{
			System.out.println(b[i]);
		}
		b[1]=20;
		b[3]=40;
		for(int i =0;i<b.length;i++)
		{
			System.out.println(b[i]);
		}
		
	}

}
