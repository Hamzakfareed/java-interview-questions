package interviewquestions;

import java.util.Arrays;

//find the Second largest number in Array
public class FindSecondLargestNumberInArray {
	
	public static void main(String[] args) {
		
		//create an array of integers
		int[] numbers = new int[] {55,33,44,22,33,44,1,5,60};
		
		//Sort the array using Arrays.sort method
		
		Arrays.sort(numbers);
		
		//now fetch the second last element from array
		System.out.println(numbers[numbers.length-2]);
		
		//for fetching the first greatest number in  array
		System.out.println(numbers[numbers.length-1]);
	}

}
