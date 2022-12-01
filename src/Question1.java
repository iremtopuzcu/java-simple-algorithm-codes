import java.util.Scanner;
public class Question1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int num1,num2,sum;
		
		System.out.println("please enter first number  : ");
		num1 = input.nextInt();
		System.out.println("please enter second number  : ");
		num2 = input.nextInt();
		sum = num1 + num2;
		System.out.println(" sum of two number is : "+sum);
		
		

	}

}
