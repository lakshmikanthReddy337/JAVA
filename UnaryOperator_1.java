package operators;

public class UnaryOperator_1 {

	public static void main(String[] args) {
			int x=10;
			int y=11;
			
			//Increment, then use	
			System.out.println("pre Increment:"+ ++x);//x+1=x
			
			//++x → pre-increment: first increase x by 1, then use it.
			//So, x becomes 11, and the value of ++x is 11.
			
			
			//Use, then increment	
			System.out.println("post increment :"+ x++);//x=x+1
			
			//x++ → post-increment
			//Use the value first, then increase it.
			
			//Decrement then Use.
			System.out.println("Pre Decrement:"+--y);//y-1=y
			
			
			//use then Decrement.
			System.out.println("post Decrement:"+y--);
	}

}
