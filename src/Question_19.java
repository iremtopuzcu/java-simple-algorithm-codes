//This is a Java Program to Find Prime Numbers Within a Range of n1 and n2.
import java.util.Scanner;

public class Question_19 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int n1,n2,n3,flag=0,i,j;
		
		System.out.println("please enter the lower limit : ");
		n1 = input.nextInt();
		System.out.println("please enter the upper limit : ");
		n2 = input.nextInt();
		System.out.println("the prime numbers in between the entered limits are :");
		
		
		for(i = n1 ; i<=n2 ; i++) 
		{
			
			for(j=2 ; j<i ; j++) 
			{
				
				if(i % j == 0) {
					flag = 0;
					break;
				}
				else {
					flag = 1;
					
				}
				
			}
			
			if(flag == 1) {
				System.out.println(i);
			}
		}
		
		
		
	}
}

