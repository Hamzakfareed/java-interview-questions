package interviewquestions;

import java.util.Scanner;

//How to count vowels in string
public class VowelsInString {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter a sentence ");
		String sentence = scanner.nextLine();
		
		System.out.println(sentence);
		//Now lets count number of voewls in sentences using switch statement
		
		int count = 0;
		
		for(int i =0; i < sentence.length();i++) {
			switch(sentence.charAt(i)) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				count++;
			}
		}
		
		System.out.println("Count :"+count);
		
	}

}
