package oops;

public class Employee {
	
	public String Name;
	public int Empid;
	private static int Salary = 50000;
	
	
	public Employee(String var1, int var2) {
		// TODO Auto-generated constructor stub
		System.out.println("Inside Parameterised constructor");
		Name = var1;
		Empid = var2;
	}


	public Employee() {
		// TODO Auto-generated constructor stub
		System.out.println("Inside Default constructor");
	}


	public void DisplayName() {
		
		System.out.println("Name of the Employee is " + Name);
		System.out.println("Employee ID: " + Empid);
	}
	
	public static void DisplaySalary() {
		System.out.println("Salary of an Employee " + Salary);
	}

}
