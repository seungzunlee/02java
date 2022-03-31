package com.human.ex5;

public class Circle {
	public double radius = 0;
	public static double PI = 3.141592;
	public void area() {
		System.out.println("≥–¿Ã: " + radius*radius*PI);
	}
	public void area(double radius) {
		System.out.println("≥–¿Ã: " + radius*radius*PI);
	}
	public void periphery() {
		System.out.println("µ—∑π: " + (2*radius)*PI);
	}
	public static void main(String[] args) {
		Circle c1 = new Circle();
		c1.radius = 4;
		c1.area();		c1.periphery();
		Circle c2 = new Circle();
		c2.radius = 6;
		c2.area();		c2.periphery();
		Circle c3 = new Circle();
		c3.radius = 8;
		c3.area();		c3.periphery();
	}

}
