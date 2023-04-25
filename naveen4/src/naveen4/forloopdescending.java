package naveen4;

import java.util.Scanner;

public class forloopdescending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i; int num;
		 Scanner scanner = new Scanner(System.in);
		 System.out.println("Enter the highest no.");
		 num = scanner.nextInt();
		 
		 for(i=num;i>0;i--) {
			 System.out.println(i);
		 }
	System.out.println("End of For Loop");
	scanner.close();
	}

}
