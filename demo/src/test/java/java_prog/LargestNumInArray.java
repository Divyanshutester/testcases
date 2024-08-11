package java_prog;

public class LargestNumInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num= {14,31,97,78,15,17,19,21,23};
		int largest = num[0];
		for (int num1:num) {
			if(num1>largest) {
				largest=num1;
			}
		}
		System.out.println("The largest number in the array is:"+largest);

	}

}
