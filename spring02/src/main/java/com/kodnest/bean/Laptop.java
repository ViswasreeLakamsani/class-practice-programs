package com.kodnest.bean;

public class Laptop {
	int id;
	String model;
	double cost;
	public Laptop() {
		super();
	}
	public Laptop(int id, String model, double cost) {
		super();
		this.id = id;
		this.model = model;
		this.cost = cost;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	@Override
	public String toString() {
		return "Laptop [id=" + id + ", model=" + model + ", cost=" + cost + "]";
	}
	

}
