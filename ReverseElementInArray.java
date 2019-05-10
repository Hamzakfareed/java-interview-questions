package interviewquestions;

//Reverse the elements in array
public class ReverseElementInArray {

	public static void main(String[] args) {
		String[] fruits = new String[] {"Apple","Bananas","Mangoes","Orange","Pineapple"};
		for(int i = 0;i < fruits.length;i++) {
			String temp = fruits[i];
			String fruit = fruits[fruits.length-i-1];
			fruits[i] = fruit;
			fruits[fruits.length-i-1] = temp;
			
			System.out.println(temp +":"+ fruit);
			
		
		}
		
		for(int j = 0;j < fruits.length;j++) {
			System.out.println(fruits[j]);
		}
	}
}
