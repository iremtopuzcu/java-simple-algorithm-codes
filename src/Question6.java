import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) {
		// Program to find positive numbers multiplication using addition
		Scanner input = new Scanner(System.in);
		int counter = 0;
		int num1,num2;
		System.out.println("Enter the first of the numbers you want to multiply : ");
		num1 = input.nextInt();
		System.out.println("Enter the second of the numbers you want to multiply : ");
		num2 = input.nextInt();
		
		if(num1>0 && num2>0) {
			while(num2 != 0) {
				counter += num1;
				num2--;
			}// end of while
			
			System.out.println("multiplication of numbers : "+counter);
		} // end of if
		else {
			System.out.println("You entered a number in the wrong range.");
		}
			

	}

}
