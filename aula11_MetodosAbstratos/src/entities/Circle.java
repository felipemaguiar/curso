package entities;

import entities.enums.Color;

public class Circle extends Shape{

	private Double radius;
	
	public Circle() {
		super();
	}
	
	
	public Circle(Color color, Double radius) {
		super(color);
		this.radius = radius;
	}



	public Double getRadious() {
		return radius;
	}


	public void setRadious(Double radius) {
		this.radius = radius;
	}


	@Override
	public double area() {
		return Math.PI * radius * radius;
	}
	

}
