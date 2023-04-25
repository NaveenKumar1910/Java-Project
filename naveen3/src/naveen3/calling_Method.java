package naveen3;

public class calling_Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1 = 10;
		int num2 = 20;
		
		int result = div(num1, num2);
		
		System.out.println("The Result is: " + result);
		

	}
	
	public static int addition(int a, int b) {
		return a+b;
	}
	
	public static int sub(int a, int b) {
		return a-b;
	}
	
	public static int mul(int a, int b) {
		return a*b;
	}
	public static int div(int a, int b) {
		return b/a;
	}
}
