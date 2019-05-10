package interviewquestions;

import java.util.Scanner;

//Check if the input number is even or odd
public class EvenOrOdd {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter a number:");
		int number = scanner.nextInt();
		
		//check if the number mod 2 gives reminder = 0 or 1 , if its 0 which mean its even otherwise its odd number
		
		if(number %2==0) {
			System.out.println("Even");
		}else if(number %2==1) {
			System.out.println("Odd");
		}
	}
}
