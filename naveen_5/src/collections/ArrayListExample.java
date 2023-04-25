package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names = {"Naveen", "Sushma", "Raj", "Manju"};
		
		System.out.println("The second name is: " + names[1]);

		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("Naveen");
		list1.add("Sushma");
		list1.add("Raj");
		list1.add("Manju");
		list1.add("Sushma");
		list1.add("Sushma");
		
		
		System.out.println("The list is " + list1);
		System.out.println("The size of the list is: " + list1.size());
		System.out.println("The first name of the list is: " + list1.get(0));
		System.out.println(" The Last name of the list is: " + list1.get(list1.size()-1));
		
		list1.add(1, "who");
		System.out.println("The list after adding Who: " + list1);
		
		list1.set(2, "who");
		System.out.println("The list after updating Who: " + list1);
		
		list1.remove(2);
		System.out.println("The list after removing: " + list1);
		
		for (int i=0; i<list1.size(); i++) {
			System.out.println("Element name: " + list1.get(i));
		}
		for(String Value:list1) {
			System.out.println("Element value: " + Value);
		
		}
		Iterator<String> itr = list1.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		Collections.sort(list1);
		System.out.println("After sorting the list" + list1); 
		
		Collections.reverse(list1);
		System.out.println("After Reversing the list" + list1);
		
		Collections.sort(list1, Collections.reverseOrder());
		System.out.println("After Sorting in Descending order" + list1);
		
		
		
	}

}
