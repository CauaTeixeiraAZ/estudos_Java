package entities;

public class Employer {
	public String name;
	public double grossSalary ;
	public double tax;
	private double salary;
	
	public double netSalary(){
		 salary = grossSalary - tax;
		 return salary;
	}
	
	public void increaseSalary(double percentage) {
		 grossSalary += (grossSalary/100.0) * percentage;
		 netSalary();
	}
	
	public String toString(){
		return "Name: " + name + ", Salary: " + salary; 
	}
}
