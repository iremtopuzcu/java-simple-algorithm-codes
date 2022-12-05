import java.util.Scanner;

public class Binary_Decimal 
{
	Scanner input;
	int num;
	
	void getVal()
	{
		System.out.println("Binary to Decimal");
		input = new Scanner(System.in);
		System.out.println("enter the number : ");
		num = Integer.parseInt(input.nextLine(), 2);
		
	}
	
	void convert()
	{
		String decimal = Integer.toString(num);
		System.out.println("decimal value is : "+decimal);
		
	}

}
