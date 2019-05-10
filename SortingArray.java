package interviewquestions;

import java.util.Arrays;
import java.util.Collections;

//Sort Array elements in ascending and descending order
public class SortingArray {
	
	public static void main(String[] args) {
		String[] list = new String[] {"Lisa","Angela","Kathrine","Cruise","Ninis"};
		
		Arrays.sort(list);
		
		for(String l : list) {
			System.out.println(l);
		}
		
		//now lets print in descending order
		
		Arrays.sort(list,Collections.reverseOrder());
		
		System.out.println("=======================================");
		for(String item : list) {
			System.out.println(item);
		}
	}

}
