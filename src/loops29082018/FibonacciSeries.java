package loops29082018;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Fibonacci- 0,1,1,2,3,5,8,13 (Summing last two entry)
		
		System.out.println("Enter the numbers required in Fibonacci Series:-");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int x=0,y=1,z;
		System.out.print(x+" "+y);
		for(int a = 2;a<=num-2;++a){
			z=x+y;
			System.out.print(" "+z);
			x=y;
			y=z;
		}
	}

}
