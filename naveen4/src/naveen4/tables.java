package naveen4;

import java.util.Scanner;

public class tables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num; int i;
		System.out.println("Enter the no. of tables");
		Scanner naveen = new Scanner(System.in);
		num = naveen.nextInt();
		System.out.println("The Tables for given no.:" + num);
		for (i=1;i<=10;i++) {
			System.out.printf("%d * %d = %d\n", num, i, num*i);
			
		}
		

	}

}
