package Entities;

public class Reservas {
	private String name;
	private String email;
	
	public Reservas() {
		
	}

	public Reservas(String name, String email) {
		this.name = name;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return  name 
				+ ", " 
				+ email ;
	}
	
}
