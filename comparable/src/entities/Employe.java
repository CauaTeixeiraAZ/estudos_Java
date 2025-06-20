package entities;

public class Employe implements Comparable<Employe>{
	private String name;
	private Double salary;
	
	public Employe() {
		
	}

	public Employe(String name, Double salary) {
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	@Override
	public int compareTo(Employe other) {
		return name.compareTo(other.getName());
	}
	
	
	
}
