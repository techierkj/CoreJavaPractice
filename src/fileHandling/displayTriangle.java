package fileHandling;
import java.util.Scanner;

//30. Program 30 - Display Triangle as follow: (using for loops)     
//1    
//2 3    
//4 5 6    
//7 8 9 10 ... N */
public class displayTriangle {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		int count =0;

		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= i; j++) {
				if (count != num) {
					count++;
					System.out.print(count + "   ");
				}
			}
			System.out.println();
		}
	}
}
