package naveen;
import java.util.Scanner;
public class Exercise_33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b=0, temp;
		Scanner naveen = new Scanner(System.in);
		System.out.println("Enter the integer");
		a = naveen.nextInt();
		while(a!=0) {
			temp = a%10;
			b = b + temp;
			a = a / 10;
		
		}
		System.out.println("The sum of digits of an integer is: " + b);
		
	}

}
