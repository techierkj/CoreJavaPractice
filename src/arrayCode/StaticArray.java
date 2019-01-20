package arrayCode;

public class StaticArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		 Array initialization
		//method 1
		int arrInt[]=new int[3];
		String arrString[]=new String[3];
		double arrDouble[]=new double[3];
		char arrChar[]=new char[3];
		//method 2
		int arrInt2[]={1,2,3,4};
		
		//

//		Array Length
		System.out.println("Array Length:-"+arrInt.length);
		
//		Data Insert
		arrChar[1]='A';
		arrDouble[2]=12.3234;
		arrString[2]="Ravi";
		//arrInt[3]=12;			java.lang.ArrayIndexOutOfBoundsException
		arrInt[0]=1;
		arrInt[1]=2;
		arrInt[2]=3;
		
		for(int i=0;i<arrInt.length;i++){
			System.out.println(arrInt[i]);
		}
		
	}

}
