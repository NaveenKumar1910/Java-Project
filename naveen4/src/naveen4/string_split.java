package naveen4;

public class string_split {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "1) Cow is a domestic animal which is reared mainly for milk and dairy products. 2) It is a female class of mammals; the male is called as Bull. 3) The offspring of a cow is called as Calf. 4) When cows move in a group, their group is called as Herd.";
		
		String[] arr3 = str.split(" ");
		
		System.out.println("The no. of words in a string = " + arr3.length);
		
		System.out.println("All the items in array are ");

	}

}
