package stringsCode;

public class swapWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Ravi Kumar Jha";
		String arr[]=str.split(" ");
		String swap = "";
		for(int i=arr.length-1;i>=0;i--) {
			swap=swap+arr[i]+" ";
		}
		System.out.println(swap);
	}

}
