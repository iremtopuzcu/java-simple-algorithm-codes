//This is a Java Program to Illustrate how User Authentication is Done.

import java.util.Scanner;

public class Question_15 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String userName, password;
		System.out.println("enter username : ");
		userName = input.nextLine();
		System.out.println("enter password : ");
		password = input.nextLine();
		
		if(userName.equals(password))
			System.out.println("Authentication Successful");
		else
			System.out.println("Authentication Failed");

	}

}
