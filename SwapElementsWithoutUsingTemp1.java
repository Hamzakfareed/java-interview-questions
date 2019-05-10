package interviewquestions;

import java.util.Scanner;

//Swap two elements without using temp variable - Without using / and * , temp
public class SwapElementsWithoutUsingTemp1 {
	
	public static void main(String[] args) {
		
	Scanner scanner = new Scanner(System.in);
	
	//create two variables for number1 and number2
	int number1;
	int number2;
	//take input from user for number1 and number2
	
	System.out.println("Enter number1 :");
	number1 = scanner.nextInt();
	System.out.println("Enter number2 :");
	number2 = scanner.nextInt();
	
	System.out.println("Number1 :"+number1 +", Number2 :"+number2);
	
	//number1(40) = 10 +30
	number1 = number1 + number2;
	//number2(10) = 40 - 30
	number2 = number1 - number2;
	//number1(30) = 40-10
	number1 = number1 - number2;
	
	
	System.out.println("Number1 :"+number1 +", Number2 :"+number2);

	
	}
}
