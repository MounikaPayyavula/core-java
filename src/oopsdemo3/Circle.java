package oopsdemo3;

//Rectangle class implementing Shape Interface

public class Circle implements IShape {
	
	private double radius;
	
	
//generate constructor using fields 
	
	public Circle(double radius) {
		this.radius = radius;
	}

	@Override
	public void draw() {
		System.out.println("Drawing Circle ");
	}

	@Override
	public double getArea() {
		
		return Math.PI*this.radius*this.radius;
	}

	//generate getter() for radius
	public double getRadius() {
		return radius;
	}
	

}
