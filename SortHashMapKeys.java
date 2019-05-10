package interviewquestions;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

//How to sort HashMap keys
public class SortHashMapKeys {
	
	public static void main(String[] args) {
		//First create a HashMap
		HashMap<String,String> fruits = new HashMap<String,String>();
		fruits.put("apple", "apple");
		fruits.put("mangoes","mangoes");
		fruits.put("orange", "orange");
		fruits.put("bananas", "bananas");
		
		System.out.println("Before sorting :");
		//fetech all entries from hashamp
		for(Map.Entry<String, String> entry : fruits.entrySet()) {
			System.out.println(entry.getKey());
		}
		
		//Now create a Treemap<String,String> and pass fruits list into its constructor
		//Tree map store values in sorted in order so when we pass list of fruit to its constructor ,
		// its automatically sort its keys 
		TreeMap<String,String> sortedFruitsList = new TreeMap<String,String>(fruits);
		
		
		System.out.println("================================================");
		System.out.println("After sorting :");
		
		for(Map.Entry<String, String> fruit: sortedFruitsList.entrySet()) {
			System.out.println(fruit.getKey());
		}
		
	}

	
	
	
	
	
	
	
}
