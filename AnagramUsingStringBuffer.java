package interviewquestions;

import java.util.Scanner;

//Check if two string are anagram or not using StringBuffer class
//Two String are anagram if both have same characters but in different or same order
public class AnagramUsingStringBuffer {
	
	public static void main(String[] args) {
		//first take input from user for two strings
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter first word");
		String word1 = scanner.nextLine();
		
		System.out.println("Enter second word");
		String word2 = scanner.nextLine();
		
		//Now convert the word1 into character array
		
		char[] ch = word1.toCharArray();
		
		//pass the word2 into StringBuilder class constructor
		
		StringBuilder builder = new StringBuilder(word2);
		
		//loop from beginner to last item in ch array
		for(int i =0; i < ch.length;i++) {
			//fetch each item index
			char c = ch[i];
			int index = builder.indexOf(String.valueOf(c));
			
			//if the character is find in word2 then the index value will be greater than -1
			
			if(index !=-1) {
				builder.deleteCharAt(index);
			}else {
				System.out.println("Element not found so the strings are not anagram");
				return ;
			}
			
		}
		
		//if the length of builder is 0 its mean its anagram with us because we deleted each character one by one, when its found.
		if(builder.length() ==0){ 
			System.out.println("Anagram");
		}else {
			System.out.println("Not Anagram");
		}
	
		
		
		
	}

}







