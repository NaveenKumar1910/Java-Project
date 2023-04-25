package oops;

public class Runnerclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Employee emp1 = new Employee();
		emp1.Name = "Naveen";
		emp1.Empid = 1000;
		emp1.DisplayName();
		
		Employee emp2 = new Employee();
		emp2.Name = "Sushma";
		emp2.Empid = 1001;
		emp2.DisplayName();
		
		Employee emp3 = new Employee("Guru", 1003);
		emp3.DisplayName();
		
		Employee.DisplaySalary(); */
		
		Citizen ct1 = new Citizen();
		
		ct1.age = 28;
		ct1.Name = "Naveen";
		ct1.SSN = 12345;
		ct1.CountryName = "India";
		ct1.Print();
		
		Citizen ct2 = new Citizen("Sushma", "India", 24, 12345);
		
		ct2.Print();
		
		
	/*	ct1.DisplayCitizen();
		ct2.DisplayCitizen(); */
		
		insurance obj1 = new insurance();
		
		obj1.Insuranceid = 3000;
		obj1.SSN = 9999;
		
		/* obj1.Displayinsurance();	*/
		
		
		
		obj1.Print();
		
		EncapsulationExample emp = new EncapsulationExample();
		emp.setSalary(5000);
		System.out.println("The salary is " + emp.getSalary());
		
		
		
		
		
		
		
	}

}
