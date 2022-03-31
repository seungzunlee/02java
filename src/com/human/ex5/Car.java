package com.human.ex5;

public class Car {
	public String carName = "";
	public int carSpeed = 0;
	public Car(String carName) {
		this.carName = carName;
	}
	public void statement() {
		System.out.println("현재 차종:" + carName + " 속력은" +carSpeed);
	}
	public void speedUp() {
		this.carSpeed = carSpeed + 10;
		System.out.println("차의 속도를 10 높임");
	}
	public void speedDown() {
		this.carSpeed = carSpeed - 10;
		System.out.println("차의 속도를 10 낮춤");
	}
	public static void main(String[] args) {
		Car c1 = new Car("소나타");
		c1.statement();
		c1.speedUp();
		c1.speedUp();
		c1.statement();
		c1.speedDown();
		c1.statement();
		
		Car c2 = new Car("그랜져");
		c2.statement();
		c2.speedUp();
		c2.speedUp();
		c2.statement();
		c2.speedDown();
		c2.statement();
		

	}

}
