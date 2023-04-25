package naveen;

import java.util.Scanner;

public class Exercise_32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b;
		Scanner sushma = new Scanner(System.in);
		System.out.println("Enter 1st Integer");
		a = sushma.nextInt();
		Scanner naveen = new Scanner(System.in);
		System.out.println("Enter 2nd Integer");
		b = naveen.nextInt();
		if (a==b) {
			System.out.println("Given numbers are equal");
		}
		else if (a>b) {
			System.out.println("Number A is greater than B");
		}
		else {
			System.out.println("Number B is greater than A");
			
		}
		naveen.close();
		sushma.close();

	}

}
