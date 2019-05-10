package interviewquestions;

//calculate the largest number between three numbers
public class LargestNumber {

	
	public static void main(String[] args) {
		int a = 10;
		int b = 32;
		int c = 45;
		
		//if the value of a is greater than b and c , its mean a is greater
		if(a > b && a > c) {
			System.out.println("A is greater");
			
			//check if the value of b is greater than a and c 
		}else if(b > a && b > c) {
			System.out.println("B is greater");
			
			//check if the value of c is greater than a and b 
		}else if(c > a && c > b) {
			System.out.println("C is greater");
		}
	}
	
	
}
