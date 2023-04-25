package naveen4;

import java.util.Scanner;

public class odd_even {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i; int num; int num1; int j;
		
		Scanner naveen = new Scanner(System.in);
		Scanner naveen1 = new Scanner(System.in);
		System.out.println("Enter the highest even no.");
		num = naveen.nextInt();
		for (i=2;i<=num;i=i+2) {
			System.out.println(i);
		}
		System.out.println("Enter the highest odd no.");
		num1 = naveen1.nextInt();
		for (j=1;j<=num1;j=j+2) {
			System.out.println(j);
		}

	}

}
