//This is a Java Program to Check if a Given Integer is Positive or Negative.
import java.util.Scanner;

public class Question_12 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int number;
		
		System.out.println("please enter a number : ");
		
		number = input.nextInt();
		
		if(number>0)
			System.out.println("this number is positive");
		else if(number<0)
			System.out.println("this number is negative");
		else
			System.out.println("this number is notr");
		
	}

}
