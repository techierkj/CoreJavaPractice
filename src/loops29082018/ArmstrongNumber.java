package loops29082018;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//armstrong, ex= 153 =1*1*1+5*5*5+3*3*3
		
		System.out.println("Enter number to validate:-");
		Scanner sc= new Scanner(System.in);
		int num=sc.nextInt();
		int sum=0;
		int digit=num;
		
		while(digit>0){
			int rem=digit%10;
			sum=sum+rem*rem*rem;
			digit=digit/10;
			
		}
		System.out.println("sum is:-"+sum);
		if(num==sum){
			System.out.println("Number is an Armstrong number");
		}
		else{
			System.out.println("Non armstrong num");
		}
		

	}

}
