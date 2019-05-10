package interviewquestions;

import java.util.HashSet;
import java.util.Scanner;

//Remove duplicates from string
public class RemoveDuplicates {

	public static void main(String args[]) {
		
		//create scanner object for taking input from user
		Scanner scanner = new Scanner(System.in);
		
		//prompt user for input
		System.out.println("Please enter some text");
		String line = scanner.nextLine();
		
		//Now lets create Hashset object 
		HashSet<Character> set = new HashSet<Character>(); 
		
		String nonDuplicateText="" ;
		
		//convert line to characters array
		char[] lineCharArray = line.toCharArray();
		
		for(int i = 0; i < lineCharArray.length;i++) {
			//check if hashset contain the current character in list, if its exists the we should skip it and if not the store it in set .
			if(!set.contains(lineCharArray[i])) {
				set.add(lineCharArray[i]);
				nonDuplicateText+=lineCharArray[i];
			}
		}
		System.out.println(nonDuplicateText);
	}
}
