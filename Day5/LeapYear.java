package Day5;

import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
		int year;
		System.out.println("Enter an year : ");
		Scanner sc = new Scanner(System.in);
		year = sc.nextInt();
		
		if ((year % 4 == 0) && (year > 999)) {
			System.out.println(year+" is a Leap year");
		}else if((year % 4 != 0) && (year > 999)) {
			System.out.println(year+" is not a Leap year");
		}
		else
		{
			System.out.println("Nathing");
		}
	}
}
