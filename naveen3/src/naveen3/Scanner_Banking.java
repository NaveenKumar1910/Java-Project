package naveen3;

import java.util.Scanner;

public class Scanner_Banking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int age;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the Age");
		
		age = scanner.nextInt();
		
		if ((age>=18) && (age<=30)){
			System.out.println("You are eligible for bank exams");
		}
		else if ((age<18) || (age>30)) {
			System.out.println("You are not eligible for bank exams");
		}
		
		scanner.close();
	}

}
