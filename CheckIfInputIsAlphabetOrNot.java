package interviewquestions;

import java.util.Scanner;

//Check if the input is alphabet or not
public class CheckIfInputIsAlphabetOrNot {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//take input from user now
		
		System.out.println("Enter a character to check if its alphabet or not ");
		char c = scanner.next().trim().charAt(0);
		
		//This condition check it the input if its between a and z or A and Z , which mean its an alphabet 
		// otherwise its not an alphabet
		if((c >='a' && c <='z')|| (c>='A' && c<='Z')) {
			System.out.println("The given input character is alphabet");
		}else {
			System.out.println("Not Alphabet");
		}
	}

}
