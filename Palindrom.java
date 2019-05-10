package interviewquestions;

import java.util.Scanner;

//Palindrom
public class Palindrom {

	public static void main(String[] args) {
		//A String is a palindrom when its reverse also gives the same meaning as orignal string 
		// Bob  reverse is bob which a palindrom becuse which its  still gives same meaning
		//Ahmad reverse is damha is not a palindrom becuase its give different meaning now
		
		//take input from user 
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter type a word to check if its palindrom or not");
		String word = scanner.nextLine();
		
		System.out.println("Original :"+word);
		
		String reverse = "";
		
		//lets start taking character from reverse order one by one from the original string
		
		for(int i = word.length()-1;i >=0;i--) {
			//now append each character to reverse string
			reverse += word.charAt(i);
		}
		
		System.out.println("Reverse:"+reverse);
		
		//now lets check if word is   palindrom or not
		
		
		//i used equalsIgnorecase because in this case we don't care about wether the character is capital or not
		if(word.equalsIgnoreCase(reverse)) {
			System.out.println("The given word is palindrom");
		}else {
			System.out.println("The given word is not palindrom");
		}
	}
}








