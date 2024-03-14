package com.java.kiragi.practice;

public class CarClass extends Vehicle{

	private String color;
	private String model;
	private String make;
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public void getFulldetails() {
		System.out.println("The car color is "+ getColor()+ "  Make is "+getMake()+ "  model is  "+getModel());		
	}
	
}
