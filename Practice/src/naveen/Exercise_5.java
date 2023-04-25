package naveen;

import java.util.Scanner;

public class Exercise_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b, c, d, e, f, g;
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the first number");
		a = scanner.nextInt();
		Scanner scanner2 = new Scanner(System.in);
		System.out.println("Enter the second number");
		b = scanner2.nextInt();
		c = a + b;
		d = a - b;
		e = a * b;
		f = a/b;
		g = a%b;
		System.out.println("The result of addition operation is: " + c);
		System.out.println("The result of Substraction operation is: " + d);
		System.out.println("The result of Multiplication operation is: " + e);
		System.out.println("The result of division operation is: " + f);
		System.out.println("The result of remainder operation is: " + g);

	}

}
