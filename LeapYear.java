package interviewquestions;

import java.util.Scanner;

//check if the year is a leap year or not 
public class LeapYear {

	
	public static void main(String[] args) {
		//A year is leap when it is been mod by 4 and its reminder is 0
		
		//2004 %4 ---> 0   Leap year
		//2005 %4 ---->1 Not Leap year
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Pleae enter a year to check if its leap year or not ");
		//take input from user and store its value in year variable
		int year  = scanner.nextInt();
		
		//now the check the condition if the year mod 4 gives reminder 1 or 0
		if(year %4 ==0) {
			System.out.println("Leap year");
		}else {
			System.out.println("Not Leap year");
		}
	}
}
