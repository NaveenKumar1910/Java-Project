package naveen4;

public class break_continue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 1; int num1 = 1;

		while (num<11) {
			if (num == 5) {
				
				System.out.println("skip");
				num++;
				continue; // for skipping something
				
			}
			System.out.println(num);
			num++;
			
		}

		while (num1<10) {
			if (num1 == 5) {
				System.out.println("Stop");
				
				break; // for stoping something
			}
			System.out.println(num1);
			num1++;
			
			
		}

	}

}
