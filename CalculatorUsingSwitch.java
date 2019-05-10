package interviewquestions;

import java.util.Scanner;

//Math Calculator using switch statement
public class CalculatorUsingSwitch {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//take input from user for number1 and number2 which need to be calculated
		
		System.out.println("Please enter number1:");
		int number1 = scanner.nextInt();
		System.out.println("Please enter number2:");
		int number2 = scanner.nextInt();
		
		
		//take input for + or - or / or * for calcualtion
		System.out.println("Please enter Addition (+) , Subsctraction(-), Division (/), Multiplication(*)");
		char c =  scanner.next().trim().charAt(0);
		switch(c) {
		case '+':
			System.out.println(number1 + number2);
			break;
		case '-':
			System.out.println(number1 - number2);
			break;
		case '/':
			System.out.println(number1/number2);
			break;
		case '*':
			System.out.println(number1 *  number2);
			break;
		default:
			System.out.println("Couldn't identify  input: "+c);
		}
	}

}
