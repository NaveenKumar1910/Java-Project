package naveen3;

public class middle_Char {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name1 = "Naveen Kumar Is one of the best Automation-Engineer That Simplilearn has ever produced";
		
		System.out.println("Length is" + name1.length());
		
		int L = name1.length();
		
		int K = L/2;
		
		System.out.println("The middle character is: " + name1.charAt(K-1));
		
		

	}

}
