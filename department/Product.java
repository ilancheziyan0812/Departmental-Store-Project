package com.department;

public class Product {

	//private ---> id (Autogenerate),name,cost,quantity
	//public constructor
	//4 public getter method @& 3 public setter method
	//toString()
	
	private String id;
	private String name;
	private double cost;
	private double quantity;
	
	private static int count = 101;
	
	Product (String name,double cost,double quantity)
	{
		this.id = "PRODUCT"+count;
		this.name = name;
		this.cost = cost;
		this.quantity = quantity;
		count++;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public double getQuantity() {
		return quantity;
	}

	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}
	
	public String toString()
	{
		return ("Product id : "+id+"\nProduct Name : "+name+"\nProduct Cost : "+cost+"\nProduct quantity : "+quantity+"\n\n");
	}
	
	
}
