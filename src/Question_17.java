//Java Program to Find Largest of Three Numbers using Ternary Operator
import java.util.Scanner;

public class Question_17 {
	
	public static void main(String[]args) {
		
		Scanner input = new Scanner(System.in);
		int num1,num2,num3,biggest;
		System.out.println("plese enter first number : ");
		num1 = input.nextInt();
		System.out.println("please enter second number : ");
		num2 = input.nextInt();
		System.out.println("plese enter third number : ");
		num3 = input.nextInt();
		biggest = num1 > ((num2 > num3) ? num2 : num3) ? num1 : ((num2 >num3) ? num2 : num3);
		System.out.println("largest number entered : "+biggest);
	}
}