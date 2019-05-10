package interviewquestions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

//check if the an array list contains duplicates or not 
public class DuplicatesValuesInList {
	
	public static void main(String[] args) {
		//first make an array of string
		
		String[] fruits = new String[] {"Apple","Mangoes","Oranges","Stawberry"};
		
		
		//convert fruits array to List 
		List fruitsList = Arrays.asList(fruits);
		
		System.out.println(fruitsList.size());
		//Now create HashSet of String and pass fruits in its constructor 
		//HashSet don't accpet duplicate values , if an item on list is duplicate then the hashset will store it only one time
		
		HashSet<String> fruitsSet = new HashSet<String>(fruitsList);
		
		System.out.println(fruitsSet.size());
		
		//If the size of both list and set is not equals , 
		//its mean there is duplicate becuase the set reject duplicate values and store it only one time
		if(fruitsSet.size()!=fruitsList.size()) {
			System.out.println("Fruits List contains duplicate values");
		}else {
			System.out.println("Fruits List doesnt contains duplicate values ");
		}
	}

}
