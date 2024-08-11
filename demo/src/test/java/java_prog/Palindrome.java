package java_prog;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String text = "racecar";
		text = text.toLowerCase();	//case-sensitive check
		int length = text.length();
		boolean is Palindrome = true;
		for (i=1; i<length/2; i++) {
			if(text.charAt(i)!=text.charAt(length-1-i)) {
				is palindrome=false;
				break;
			}
			System.out.println(text+("is Palindrome ?"is a Palindrome":"is not a Palindrome""));
			}
		}
		
}