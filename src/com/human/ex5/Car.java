package com.human.ex5;

public class Car {
	public String carName = "";
	public int carSpeed = 0;
	public Car(String carName) {
		this.carName = carName;
	}
	public void statement() {
		System.out.println("���� ����:" + carName + " �ӷ���" +carSpeed);
	}
	public void speedUp() {
		this.carSpeed = carSpeed + 10;
		System.out.println("���� �ӵ��� 10 ����");
	}
	public void speedDown() {
		this.carSpeed = carSpeed - 10;
		System.out.println("���� �ӵ��� 10 ����");
	}
	public static void main(String[] args) {
		Car c1 = new Car("�ҳ�Ÿ");
		c1.statement();
		c1.speedUp();
		c1.speedUp();
		c1.statement();
		c1.speedDown();
		c1.statement();
		
		Car c2 = new Car("�׷���");
		c2.statement();
		c2.speedUp();
		c2.speedUp();
		c2.statement();
		c2.speedDown();
		c2.statement();
		

	}

}
