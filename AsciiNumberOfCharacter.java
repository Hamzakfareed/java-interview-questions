package interviewquestions;

import java.util.Scanner;

//print ascii number of character
public class AsciiNumberOfCharacter {
	
	public static void main(String[] args) {
		
		//take input from user  and store its value in character variable
		Scanner scanner = new Scanner(System.in);
		
		//storing character into integer automatically store only its ascii value 
		int character = scanner.next().trim().charAt(0);
		
		System.out.println(character);
		
		
	}

}
