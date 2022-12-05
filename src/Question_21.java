//Java Program to Find the Factorial 

import java.util.Scanner;

public class Question_21 
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int num,fac=1;
		System.out.println("Enter the number for which you want to get the factorial  : ");
		num = input.nextInt();
		if (num>=0) 
		{
		  for(int i=1; i<=num ; i++)
		  {
			fac*= i;
		  }
		
		}
		
		else
		{
			fac=0;
			
		}
		
		System.out.println(fac);
	}

}
