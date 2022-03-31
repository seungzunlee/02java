package com.human.ex5;

public class Rectangle {
	public double height =0;
	public double width = 0;
	public void area() {
		System.out.println("≥–¿Ã : " + height*width);
	}
	public void area(double height) {
		System.out.println("≥–¿Ã: " + height*width);
	}
	public void periphery() {
		System.out.println("µ—∑π: " + (height*2+width*2));
	}
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle();
		r1.height = 40;		r1.width = 40;
		r1.area();			r1.periphery();
		Rectangle r2 = new Rectangle();
		r2.height = 20;		r2.width = 40;
		r2.area();			r2.periphery();
		Rectangle r3 = new Rectangle();
		r3.height = 20;		r3.width = 20;
		r3.area();			r3.periphery();
	}

}
