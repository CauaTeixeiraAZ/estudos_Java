package entities;

public class Product {
	private String name;
	private Double price;
	private Integer quantity;
	
	public Product(String name, Double price, Integer qiantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Integer getQiantity() {
		return quantity;
	}

	public void setQiantity(Integer qiantity) {
		this.quantity = qiantity;
	}
	
	public double total() {
		return price * quantity;
	}
}
