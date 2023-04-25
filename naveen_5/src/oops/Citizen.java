package oops;

public class Citizen extends person {
	
	public int SSN;
	
	public Citizen() {
		System.out.println("Inside default cons citizen");
	}
	public Citizen(String Name, String CountryName, int age, int SSN) {
		this.Name = Name;
		this.CountryName = CountryName;
		this.age = age;
		this.SSN = SSN;
		
	}
	
	public void DisplayCitizen() {
		System.out.println("Name of the person: " + Name);
		System.out.println("Country Name: " + CountryName);
		System.out.println("Age: " + age);
		System.out.println("SSN is: " + SSN);
	}
	
	public void Print() {
		System.out.println("SSN is: " + SSN);
	}

}
