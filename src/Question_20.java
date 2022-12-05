//Java Program to Check Whether a Given Year is a Leap Year

import java.util.Scanner;

public class Question_20 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        System.out.print("Enter any year:");
        int year = s.nextInt();
        boolean flag = false;
        if(year % 4 == 0)
        {
            flag = true;
        }
        
        else
        {
            flag = false;
        }
        if(flag)
        {
            System.out.println("Year "+year+" is a Leap Year");
        }
        else
        {
            System.out.println("Year "+year+" is not a Leap Year");
        }

	}

}
