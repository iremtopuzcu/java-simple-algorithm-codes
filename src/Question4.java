import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		 
		double yearOfBirth, year, age;
		Scanner input = new Scanner(System.in);
		System.out.println("please enter your year of birth : ");
		yearOfBirth = input.nextDouble();
		System.out.println("please enter your current year : ");
		year = input.nextDouble();
		age = year - yearOfBirth;
		System.out.println("your age : "+age);

	}

}
