import java.util.Scanner;
import java.util.Math;
// Program to find whether the sum of the cubes of a 3 digit number is equal to the number itself.

public class Question10 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number,printt,x;
		int total = 0;
		System.out.println("please enter a number : ");
		number = input.nextInt();
		x = number;
		while(number > 9) {
			printt = number % 10;
			total += Math.pow(printt, 3);
			number /= 10;
		}//end of while
		total += Math.pow(number, 3);
		if(total == x)
			System.out.println("equal");
		else
			System.out.println("not equal");
	}

}

