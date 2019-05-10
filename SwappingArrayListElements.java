package interviewquestions;

import java.util.ArrayList;
import java.util.Collections;

//Swap Elements of array list
public class SwappingArrayListElements {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Apple");
		list.add("Pineapple");
		list.add("Mangoes");
		list.add("Orange");
		list.add("Mangoes");
		list.add("Bananas");
		
		// list items before reverse
		
		for(int i =0; i < list.size();i++) {
			System.out.println(list.get(i));
		}
		//Reverse the elements in list
		
		Collections.reverse(list);
		//list items after reverse
		
		System.out.println("======================================================");
		for(int j = 0; j < list.size();j++) {
			System.out.println(list.get(j));
		}
	}
}








