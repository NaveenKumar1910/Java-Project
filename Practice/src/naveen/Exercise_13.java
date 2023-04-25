package naveen;

import java.util.Scanner;

public class Exercise_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double w, h, A, P;
		Scanner Sushma = new Scanner(System.in);
		System.out.println("Enter the WIDTH of the rectangle");
		w = Sushma.nextDouble();
		Scanner naveen = new Scanner(System.in);
		System.out.println("Enter the HEIGHT of the rectangle");
		h = naveen.nextDouble();
		A = w * h;
		P = 2*w + 2*h;
		System.out.println("The Area of the rectangle is: " + A);
		System.out.println("The Perimeter of the rectangle is: " + P);
		
		naveen.close();
		Sushma.close();

	}

}
