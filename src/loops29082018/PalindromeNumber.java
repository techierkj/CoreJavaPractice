package loops29082018;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// palindrome = 12321 REVERSE both equals=>12321
		System.out.println("Enter the no:--> ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sum = 0;
		int temp = num;
		while (num > 0) {
			temp = num % 10;
			sum = sum * 10 + temp;
			num = num / 10;
		}

		if (num == sum) {
			System.out.println("Number is Palindrome");
		}

	}

}
