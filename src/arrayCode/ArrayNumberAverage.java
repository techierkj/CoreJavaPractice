package arrayCode;

public class ArrayNumberAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float arr[] = { 1, 32, 43, 12, 43, 12, 43 };
		int len = arr.length;
		float sum = 0;
		for (int i = 0; i < len; i++) {
			sum = sum + arr[i];
		}
		float average = sum / len;
		System.out.println("Average:- " + average);
	}

}
