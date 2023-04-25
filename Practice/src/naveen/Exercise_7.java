package naveen;

import java.util.Scanner;

public class Exercise_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		Scanner naveen = new Scanner(System.in);
		System.out.println("Enter the number of tables");
		a = naveen.nextInt();
		for (int i=1;i<11;i++) {
			System.out.printf("%d * %d = %d", a , i, a*i).println();
		}

	}

}
