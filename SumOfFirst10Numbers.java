package interviewquestions;


//find sum of all first 10 numbers
public class SumOfFirst10Numbers {

	
	public static void main(String[] args) {
		
		//create a variable for storing total
		int total = 0;
		
		//now loop from 1 to 10
		for(int i =1;i<=10;i++) {
			//add the value of i to total
			total += i; // this can also be written as total = total +1 
		}
		
		System.out.println(total);
	}
}
