package oops;

public class insurance extends Citizen {
	
	public int Insuranceid;

	public void Displayinsurance() {
		System.out.println(" InsuranceID = " + Insuranceid);
		
	}
	public void Print() {
		super.Print();
		System.out.println("Insurance id is: " + Insuranceid);
	}

}
	
