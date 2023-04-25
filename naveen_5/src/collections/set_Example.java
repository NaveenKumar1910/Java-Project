package collections;

import java.util.HashSet;
import java.util.TreeSet;

public class set_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String> set1 = new HashSet<String>();
		set1.add("Naveen");
		set1.add("Raj");
		set1.add("Naveen");
		set1.add("Sushma");
		set1.add(null);
		
		
		System.out.println("The set is: " + set1);
		
		TreeSet<String> set2 = new TreeSet<String>();
		set2.add("Naveen");
		set2.add("Raj");
		set2.add("Naveen");
		set2.add("Sushma");
		
		
		System.out.println("The set is: " + set2);

	}

}
