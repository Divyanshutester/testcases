package java_prog;

public class OccuranceOfChar_String {
	public static int Countoccurance(String text, char ch) {
		int Count = 0;
		for (char c:text.toCharArray()) {
			if (c=ch)
			{
				Count++;
			}
		}
		return Count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String text="Hello World";
		char ch=0;
		int occuranceCount=Countoccurance(text.ch);
		System.out.println("The character" +ch+ "appears" +occuranceCount+ "times in the String");
	}

}
