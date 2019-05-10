package interviewquestions;

//print reverse of string
public class ReverseOfString {
	
	public static void main(String[] args) {
		String name = "Hamza";
		
		
		//loop from last character to the first character in String 
		for(int i =name.length()-1;i>=0;i--) {
			System.out.print(name.charAt(i));
		}
	}

}
