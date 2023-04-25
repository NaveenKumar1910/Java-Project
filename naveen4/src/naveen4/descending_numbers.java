package naveen4;

import java.util.Scanner;

public class descending_numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num;  int k;
		
		Scanner naveen = new Scanner(System.in);
		
		System.out.println(" Enter the last no.");
		
		num = naveen.nextInt();
		
		Scanner raj = new Scanner(System.in);
		
		System.out.println("Enter the first no.");
		
		k = raj.nextInt();
		
		while (num>=k){
			
			System.out.println(num);
			
			num = num - 1; // num--
		}
		

	}

}
