package com.human.ex5;

public class Triangle {
	public double height = 0;
	public double width = 0;
	public void area() {
		System.out.println("³ÐÀÌ : " + height*(width/2));
	}
	public void periphery() {
		double x = (height*height)+(width*width);  // aÁ¦°ö + bÁ¦°ö = cÁ¦°ö
		double c = Math.sqrt(x);	//Á¦°ö±Ù
		System.out.println("µÑ·¹: "+(height + width + c));
	}
	public static void main(String[] args) {
		Triangle t1 = new Triangle();
		t1.height = 40;		t1.width = 40;
		t1.area();			t1.periphery();
		Triangle t2 = new Triangle();
		t2.height = 20;		t2.width = 40;
		t2.area();			t2.periphery();
		Triangle t3 = new Triangle();
		t3.height = 20;		t3.width = 20;
		t3.area();			t3.periphery();

	}

}
