package com.di;

public class Product {
	private int id;
	private String name;
	private int price;
	private String company;
	
	public Product(int id, String name, int price, String company) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.company = company;
	}
	
	@Override
	public String toString() {
		
		return "Product [id=" + id + ", name=" + name + ", price=" + price + ", company=" + company + "]";
	}
}
