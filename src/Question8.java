//The program that modifies the positive entered number according to the desired number.
import java.util.Scanner;

public class Question8 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num1,mod;
		int result = 0;
		System.out.println("please enter the divided number : ");
		num1 = input.nextInt();
		System.out.println("please enter the divisor (mod) number : ");
		mod = input.nextInt();
		
		while(num1 >= mod) {
			num1 -= mod;
			result++;
		}//end og while
		
		System.out.println(" The result is "+result);
		
		
		
	}

}
