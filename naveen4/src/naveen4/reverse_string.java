package naveen4;

public class reverse_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 = "Racecar";
		
		String result = ""; int i;
		
		for (i=str1.length()-1;i>=0;i--) {
			result = result + str1.charAt(i);
		}
		System.out.println(result);
		if (str1.equalsIgnoreCase(result)) {
			System.out.println("This is palindrome");
		}
		else {
			System.out.println("This is not palindrome");
		}
		String str2 = "Naveen Meets Sushma";
		String[] arr = str2.split(" ");
		String result2 = "";
		for (int j=arr.length-1; j>=0;j--) {
			 result2 = result2 + arr[j] + " ";
		 }
		System.out.println("The result is " + result2.trim()); 
	}	
	

}
