package naveen;
import java.util.Scanner;
public class Exercise_34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int s; double A;
		Scanner naveen = new Scanner(System.in);
		System.out.println("Enter the side of a Hexagon");
		s = naveen.nextInt();
		A = (6 * s*s)/(4*Math.tan(Math.PI/6));
		System.out.println("The area of Hexagon is: " + A);
		naveen.close();
		
	}

}
