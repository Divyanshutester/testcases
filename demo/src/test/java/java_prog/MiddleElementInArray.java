package java_prog;

public class MiddleElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers= {5,6,8,2,9,7,4,1,3};
		int length= numbers.length;
		//Even numbers of elements.Find the avg of the two middle ones
		if (length%2==0) {
			int middleIndex1 = length/2-1;
			int middleIndex2 = length/2;
			@SuppressWarnings("unused")
			double middleElement=(numbers[middleIndex1]+numbers[middleIndex2]/2.0);
			System.out.println("The middle elements are:"+numbers[middleIndex1]+"and"+numbers[middleIndex2]);
		}
		//odd numbers of elements take the elements at the center Index
			else 
		{
				int middleIndex=length/2;
			System.out.println("the middle element is:"+numbers[middleIndex]);
			}
		}

	}

