package naveen4;

public class array_printing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = {1,2,3,4,5,6,7,8};
		int i;
		for(i=0;i<arr1.length;i++) {
			System.out.println(arr1[i]);
		
		}
		for (int val:arr1) {
		
			// For Each loop
			System.out.println("value is " + val);
		}
	}

}
