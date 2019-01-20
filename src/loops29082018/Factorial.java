package loops29082018;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Factorial
		
		System.out.println("Enter the number of which factorial to be done:--> ");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int fact=1;
		for(int i=num;i>0;i--){
			fact=fact*i;
		}
		
		System.out.println("Factorial is:- "+fact);

	}

}
