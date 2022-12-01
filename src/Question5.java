import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
		// 
		Scanner input = new Scanner(System.in);
		int fak, num;
		System.out.println("please enter the number whose factorial you want to get : ");
		num = input.nextInt();
		fak=1;
		while(num!=1) {
			fak=fak*num;
			num--;
		}
		System.out.println("factorial : "+fak);

	}

}
