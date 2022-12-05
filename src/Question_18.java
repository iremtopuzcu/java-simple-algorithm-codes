//Java Program To Find Two Elements whose Sum is Closest to Zero

import java.util.Scanner;

public class Question_18 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int numberOfElements,sum,minimum;
		int min1=0,min2=0;
		System.out.println("Enter the number of elements you want : ");
		numberOfElements = input.nextInt();
		
		int numbers[] = new int[numberOfElements];
		
		System.out.println("please enter all numbers : ");
		
		for(int i=0; i<numberOfElements ; i++) {
			numbers[i] = input.nextInt();
				
		}
		
		minimum = Math.abs(numbers[0] + numbers[1]);
		
		for(int i=0; i<numberOfElements ; i++) {
			
			for(int j = i+1 ;j < numberOfElements; j++) {
				
				sum = Math.abs(numbers[i] + numbers[j]);
				if(sum < minimum) {
					
					min1 = i;
					min2 = j;
					minimum = sum;
				}
				
			}
		}
		
		System.out.println("1. element : "+numbers[min1]);
		System.out.println("2. element : "+numbers[min2]);
			
		}
		

	}


