package arrays_Methods;

public class TwoDimentional_Array2 {

	public static void main(String[] args) {
		
		String[][] data = new String[4][3];
		
		for(int i =0;i<data.length;i++)
		{
			for(int j=0;j<data[i].length;j++)
			{
				System.out.print(data[i][j] +"\t");
			}
			
			System.out.println();
		}
		System.out.println("**************");
		
		
		data[0][0]="kanth337";
		data[0][1]="Kanth@337";
		data[0][2]="adactinhotelapp.com-SearchHotel";		
		
		data[1][0]="kanth007";
		data[1][1]="Kanth@337";
		data[1][2]="Invalid-Username";	
		
		data[2][0]="kanth337";
		data[2][1]="Kanth7";
		data[2][2]="invalid-password";	
		
		data[3][0]="kant0037";
		data[3][1]="Kanth";
		data[3][2]="Invalid-Credential:";
		
		for(int i =0;i<data.length;i++)
		{
			for(int j=0;j<data[i].length;j++)
			{
				System.out.print(data[i][j] +"\t");
			}
			
			System.out.println();
		}
	}

}
