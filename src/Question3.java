import java.lang.Math;
public class Question3 {

	public static void main(String[] args) {
		
		double total=0;
		for(int i=1;i<11;i++) {
			total+= Math.pow(i, 3);
		}
		System.out.println("Sum of cubes of numbers from 1 to 10 : "+total);

	}

}
