package naveen;

import java.util.Scanner;

public class Exercise_11 {

	public static void main(String[] args) {
	
	// TODO Auto-generated method stub
		double R, A, C;
		Scanner sushma = new Scanner(System.in);
		System.out.println("Enter the Value of a Radius of a Circle: ");
		R = sushma.nextDouble();
		
		A = (22/7)* R * R;
		C = 2 * (22/7) * R;
		
		System.out.println("The area of a circle are: " + A);
		System.out.println("The Circumference of a circle are: " + C);
	}
	
}
