package interviewquestions;

//Find the largest and smallest number in array
public class LargestAndSmallestValueInArray {
	
	public static void main(String[] args) {
		//first lest make the array of an integers
		int[] list = new int[] {65,32,22,55,3,44,66,2,3,66,200};
		//now lets make two variable name largest and smallest . set the largset value to the smallest integer value and smallest variable to largest value
		
		int largest = Integer.MIN_VALUE;
		int smallest = Integer.MAX_VALUE;
		
		for(int i : list) {
			if(i > largest ) {
				largest = i;
			}else if(i < smallest) {
				smallest = i;
			}
		}
		//output must be 200 and 2
		System.out.println("Largest :"+largest +", Smallest :"+smallest);
		
		
	}

}
