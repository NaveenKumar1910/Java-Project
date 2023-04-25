package naveen3;

public class And_Or {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = 45;
		
		if ((age>=18) && (age<=30)){
			System.out.println("You are eligible for bank exams");
		}
		else if ((age<18) || (age>30)) {
			System.out.println("You are not eligible for bank exams");
		}

	}

}
