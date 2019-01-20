package arrayCode;
public class MissingTwoNumInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, 2, 4, 6, 7 };
		int arrSum = 0;
		int numSum = 0;
		int arrProd = 1;
		int numProd = 1;
		for (int i = 0; i < arr.length; i++) {
			arrSum = arrSum + arr[i];
			arrProd = arrProd * arr[i];
		}
		System.out.println("Array Sum:-" + arrSum);
		// sum for first nth number
		for (int j = 1; j <= 7; j++) {
			numSum += j;
			numProd = numProd * j;
		}
		int missingnumsum = numSum - arrSum;
		int missingnumprod = numProd / arrProd;
		System.out.println("Missing numbers sum:" + missingnumsum);
		System.out.println("Missing numbers prod:" + missingnumprod);
		// (a-b)^2=(a+b)^2-4ab . Let x= (a-b)^2
		double x = Math.sqrt(missingnumsum * missingnumsum - 4 * missingnumprod);
		// It will so NaN output, when square root become imaginary. Also when we use ^
		System.out.println(x);
		int firstMisingNum = (int) ((x + missingnumsum) / 2);
		int secondMissingNum = missingnumsum - firstMisingNum;
		System.out.println("Mssing numbers are: " + firstMisingNum + " and " + secondMissingNum);

	}
}