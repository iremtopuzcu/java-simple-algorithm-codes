// Program to find division of positive numbers using subtraction

import java.util.Scanner;

public class Question7 {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int counter=0;
	float dividingNumber,denominator;
	System.out.println(" please enter the number you want to divide : ");
	dividingNumber = input.nextInt();
	System.out.println(" Please enter by which number you want the number you entered to be divided by : ");
	denominator = input.nextInt();
	while(dividingNumber >= denominator) {
		dividingNumber -= denominator;
		counter++;
		
	}//end of while
	
	System.out.println("conclusion : "+counter);
	
	
		

	}

}
