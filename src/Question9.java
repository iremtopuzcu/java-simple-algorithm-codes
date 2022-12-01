// Program that tells how many digits the entered positive number has
import java.util.Scanner;

public class Question9 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number;
		int counter = 1;
		System.out.println(" please enter a number : ");
		number = input.nextInt();
		
		while( number>9 ) {
			number /= 10;
			counter++;
			
		}// end of while
		
		System.out.println(" number of digits of the entered number : "+counter);
				

	}

}
