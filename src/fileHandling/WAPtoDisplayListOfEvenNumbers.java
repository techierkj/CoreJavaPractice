package fileHandling;

import java.util.Scanner;

public class WAPtoDisplayListOfEvenNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Scanner input= new Scanner(System.in);
		Scanner numberOfEntry= new Scanner(System.in);
		int entry=numberOfEntry.nextInt();
		System.out.println("Number of inputs required"+entry);
		int arr[]=new int[entry];
		for(int i=0; i<entry;i++) {
			System.out.println("Enter "+(i)+ " number:-");
			arr[i]=input.nextInt();
			//System.out.println("Entered number:-"+arr[i]);
			if(arr[i]%2==0) {
				System.out.print(arr[i]+ " ");
				
			}
		}
		
		//System.out.println();
	}

}
