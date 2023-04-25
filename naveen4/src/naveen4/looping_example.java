package naveen4;

import java.util.Scanner;

public class looping_example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num; int k;
		
		Scanner naveen = new Scanner(System.in);
		
		System.out.println("Enter the starting no. ");
		
		num = naveen.nextInt();
		
		Scanner raj = new Scanner(System.in);
		
		System.out.println("Enter the ending no. ");
		
		k = raj.nextInt();
		
		while (num<=k) {
			if (num!=5) {
		
		System.out.println(num);
			}
		num = num + 1; // num++
		
		}

	}

}
