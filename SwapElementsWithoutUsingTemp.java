package interviewquestions;

import java.util.Scanner;

//Swap two elements without using temp variable
public class SwapElementsWithoutUsingTemp {
	
	public static void main(String[] args) {
		//first take input from user for number1 and number2
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter number1:");
		int number1 = scanner.nextInt();
		
		System.out.println("Please enter number2:");
		int number2 = scanner.nextInt();
		
		//before swapping
		System.out.println("Number1 :"+number1 +", Number2 :"+number2);
		
		//200 = 10 * 20
		number1 = number1 * number2;
		//number2(10) = 200 /20
		number2 = number1/number2;
		
		//number1(20) = 200/10
		number1 = number1/number2;
		
		//after swapping
		System.out.println("Number1 :"+number1 +", Number2 :"+number2);
	}

}
