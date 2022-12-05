//Java Program to Swap Two Numbers using Bitwise XOR Operation

import java.util.Scanner;

public class Question_16 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num1,num2;
		System.out.println("please enter first number : ");
		num1 = input.nextInt();
		System.out.println("please enter second number : ");
		num2 = input.nextInt();
		num1 = num1 ^ num2;
		num2 = num1 ^ num2;
		num1 = num1 ^ num2;
		System.out.println("after swapping\nfirst number : "+num1);
		System.out.println("second number : "+num2);

	}

}
