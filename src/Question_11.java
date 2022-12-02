// A Java Program That Checks If A Given Integer Is Odd or Even
import java.util.Scanner;

public class Question_11 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number;
		System.out.println("please enter a number : ");
		number = input.nextInt();
		
		if(number%2 == 0) {
			System.out.println("The number you entered is even.");
		}
		else
			System.out.println("The number you entered is odd.");

	}

}
