package interviewquestions;

import java.util.Arrays;
import java.util.Scanner;

//Write a program to check if the two strings are anagram or not 
public class Anagram {

	public static void main(String[] args) {
		//A two strings are anagram if both string contains same characters and length
		//eg : bob and bob , roll and lorl 
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter first word:");
		String word1 = scanner.nextLine();
		System.out.println("Enter second word");
		String word2 = scanner.nextLine();
		
	//now lets sort both strings and check if the equals or not , if equals mean they are anagram else not
		
		//Arrys.sort method takes Array , so we convert both words into char array and used its in method
		char[] word1CharArray = word1.toCharArray();
		char[] word2CharArray = word2.toCharArray();
		Arrays.sort(word1CharArray);
		Arrays.sort(word2CharArray);
		
		
		//print both words 
		for(char c : word1CharArray) {
			System.out.print(c);
		}
		System.out.println();
		for(char c : word2CharArray) {
			System.out.print(c);
		}
		
		//check if both arrays are equals or not 
		
		boolean equals = Arrays.equals(word1CharArray, word2CharArray);
		
		System.out.println("The given strings are Anagram :"+equals);
		
	}
}
