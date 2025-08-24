package flowcontrols;

import java.util.Scanner;

public class SwitchCaseExample {

	public static void main(String[] args) {
		
		System.out.println("Please enter date of birth:");
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter date ");
		int day=sc.nextInt();
		System.out.println("Enter month ");
		int mon=sc.nextInt();
		System.out.println("Enter Year ");
		int year=sc.nextInt();
		
		
		System.out.format("%02d-%02d-%04d",day,mon,year);
		
		String mon1=null;
		
		
		switch (mon) {
		case 1:  mon1 = "Jan"; break;
        case 2:  mon1 = "Feb"; break;
        case 3:  mon1 = "Mar"; break;
        case 4:  mon1 = "Apr"; break;
        case 5:  mon1 = "May"; break;
        case 6:  mon1 = "Jun"; break;
        case 7:  mon1 = "Jul"; break;
        case 8:  mon1 = "Aug"; break;
        case 9:  mon1 = "Sep"; break;
        case 10: mon1 = "Oct"; break;
        case 11: mon1 = "Nov"; break;
        case 12: mon1 = "Dec"; break;

		default:
			System.out.println("enter valid month..");
		}
		System.out.println();
		System.out.format("%02d-%s-%04d", day, mon1, year);
        sc.close();

	}

}
