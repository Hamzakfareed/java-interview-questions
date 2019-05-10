package interviewquestions;

import java.util.Scanner;

//How to swap two elements in java
public class Swap {
	
	public static void main(String[] args) {
		
		//First lets take input from user for two values a and b
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number 1 : ");
		int a = scanner.nextInt();
		System.out.println("Enter Number 2 :");
		int b = scanner.nextInt();
		
		//Before swaping 
		System.out.println("A :"+ a + ", B :"+b);
		//now create a temp variable to store value of "a" on it
		int temp = a;
		//store the value of b  to a 
		a = b;
		//store the temp value to b
		
		b = temp;
		
		//print the values after swapping
		System.out.println("A :"+ a + ", B :"+b);
		
		
	}

}
