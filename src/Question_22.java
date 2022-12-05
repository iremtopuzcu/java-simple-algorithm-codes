//Java Program to Find the Factorial of a Number using Recursion

import java.util.Scanner;

public class Question_22 {

	public static void main(String[] args) {
		int n,mult;
		Scanner input = new Scanner(System.in);
		System.out.println("enter any integer : ");
		n = input.nextInt();
		Question_22 obj = new  Question_22();
		mult = obj.fact(n);
		System.out.println("factorial of "+n+" : "+mult);

	}
	
	int fact(int x) 
	{
		if(x>1)
		{
			return(x * fact(x-1));
			
		}
		return 1;
	}

}
