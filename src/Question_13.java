//This is a Java Program to Reverse a Given Number.

import java.util.Scanner;

public class Question_13 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int number,x,sum=0;
		System.out.println("please enter a number");
		number = input.nextInt();
		
		while(number>0) {
			x = number%10;
			
			sum = sum * 10 + x;
			
			number = number/10;
			
		}
		
		System.out.println("reverse : "+sum571);
		

	}

}
