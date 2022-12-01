import java.util.Scanner;
import java.lang.Math;


/* 
 The java.lang.Math.pow() is used to calculate a number raise to the power of some other number.
 This function accepts two parameters and returns the value of first parameter raised to the second parameter.
 */
public class Question2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num1,num2,total1;
		double total;
		System.out.println("please enter first number : ");
		num1 = input.nextInt();
		System.out.println("please enter second number : ");
		num2 = input.nextInt();
		total = Math.pow(num1, 2) + Math.pow(num2, 2);
		//In pow method, the result is double by default
		total1 = (int)total;
		//here I am assigning the result of type double to another variable of type int
		System.out.println("the sum of the squares of the two numbers entered : "+total1);
        
	}

}
