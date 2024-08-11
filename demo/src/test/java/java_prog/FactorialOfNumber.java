package java_prog;

public class FactorialOfNumber {
	public static int calculateFactorial(int num) {
		if(num==0 || num==1)
		{
			return 1;
		}
		else {
			int factorial = 1;
			for (int i = 2; i<=num; i++) {
				factorial *= i;
			}
			return factorial;
		}
	}
		public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num =5;
		int result = calculateFactorial(num);
		
		System.out.println("The Factorial of " +num+ " is " +result);
	}

}
