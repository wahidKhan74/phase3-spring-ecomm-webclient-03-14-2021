package com.simplilearn.webclient.entity;

public class Product {
	
	private int id;
	private String name;
	private String description;
	private double price;
	
	
	// constructor 
	public Product(int id, String name, String description, double price) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
	}

	public Product() { }

	// getter & setter
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	// override tostring
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", description=" 
	+ description + ", price=" + price + "]";
	}	
	
	
	
}
