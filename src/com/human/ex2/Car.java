package com.human.ex2;

public class Car {
	

	public String name = "";
	public int price=0;
	public Tire tire = new Tire();
	public Car() {}
	
	public Car(String name, int price) {
		
		this.name=name;
		this.price=price;
	}
	
	public Car(String name, int price, Tire tire) {

//		this.name=name;
//		this.price=price;
//		this.tire=tire;
//		
		this(name, price);		//자기자신의 생성자로 이동
		this.tire=tire;
	}

	public Car(String name, int price,String tName,int tYear) {
		this.name = name;
		this.price = price;
		this.tire.name=tName;
		this.tire.year=tYear;
	}
	
	
	@Override
	public String toString() {
		return "Car [name=" + name + ", price=" + price + ", tire=" + tire + "]";
	}

}
