//This is a Java Program to Read Two Integers M and N & Swap their Values.

import java.util.Scanner;

public class Question_14 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number1,number2,x;
		System.out.println("enter first number : ");
		number1= input.nextInt();
		System.out.println("enter second number : ");
		number2 = input.nextInt();
		
		System.out.printf("the first number you enter %d, the second number %d\n\n",number1,number2);

		x = number1;
		number1 = number2;
		number2 = x;
		
		System.out.printf("We changed the order of the numbers you entered\nnow your first number is : %d , your second number is : %d",number1,number2);
	}

}
