package interviewquestions;

import java.util.ArrayList;
import java.util.Collections;

//How to swap elements in ArrayList
public class SwapElementsinArrayList {
	
	public static void main(String[] args) {
		//First make an ArrayList
		ArrayList<String> studentsName = new ArrayList<String>();
		studentsName.add("Ahmad");
		studentsName.add("Ali");
		studentsName.add("Wajid");
		studentsName.add("Ebrahim");
		studentsName.add("Bilal");
		
		//Now lets swap ebrahim and ahmad
		
		//the first arguement is list in which you want to swap elements , in this case its studentsName with us
		//the second arguement is the index of first value that you wanna swap
		//the third arguement is the index of second value that you wanna swap
		
		//Collections.swap(studentsName , index of Ahmad , index of Ebrahim
		Collections.swap(studentsName, 0, 3);
		
		//lets swap bilal with ali
		Collections.swap(studentsName, 1, studentsName.size()-1);
		
		
		for(String name : studentsName) {
			System.out.println(name);
		}
	}

}
