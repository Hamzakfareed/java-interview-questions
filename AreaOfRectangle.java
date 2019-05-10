package interviewquestions;

import java.util.Scanner;

//Find the area of rectangle.

public class AreaOfRectangle {

	//short keys for auto completion is : ctrl + space key
	public static void main(String[] args) {
		//Area of rectangle = length * width;
		
		//int length = 50;
		//int width = 100;
		
		//Lets take input from user for length and width;
		//for taking input from user we need to use Scanner class 
		
		Scanner scanner = new Scanner(System.in);		//ctrL + shift + 0  is used for importing packages
		
		System.out.println("Please enter the length of rectangle");
		int length = scanner.nextInt();
		System.out.println("Plase enter the width of rectangle");
		int width = scanner.nextInt();
		
		
		
		int areaOfRectangle = length  * width;
		System.out.println("Area of Rectangle :"+areaOfRectangle);
	}
}
