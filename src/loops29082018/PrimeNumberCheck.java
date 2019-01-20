//Write a java program to check prime number.

package loops29082018;

import java.util.Scanner;

public class PrimeNumberCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Prime numbers= 2,3,5,7,11 etc (Num divisible by 1 or itself
		System.out.println("Input any number:-");
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		boolean b = false;
		for (int i = 2; i < a / 2; i++) {
			if (a % i == 0) {
				b = true;
			}
		}
		if (b == false) {
			System.out.println("It's a prime number");
		} else {
			System.out.println("Non prime number");
		}

	}

}
