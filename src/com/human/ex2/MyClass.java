package com.human.ex2;
import com.human.ex2.Car;

public class MyClass {

	public static void main(String[] args) {
		
		Car c1 = new Car();
		c1.name = "���";
		c1.price = 50000;
		System.out.println(c1.name);
		
		Car c2 = new Car("morning", 70000, "��ȣ", 2022);
		System.out.println(c2.tire.name);
		System.out.println(c2.tire.year);
		
		
		Tire t1=new Tire("��ȣ", 2020);
		
		Car c4 = new Car("morning2",4000, t1);
		System.out.println(c4.name);
		System.out.println(c4.tire.name);
		System.out.println(c4.tire.year);
		System.out.println(c4);
		
		//Car c5 = new Car("morning5", 4000, t1); 	// t1ó�� ���� �ּҸ� ������ ����
		//Ÿ�̾� �ּҸ� ������ tire�ν��Ͻ��� �����.
		
		Car c5 = new Car("morning2",4000, new Tire("�츮",1990));
		System.out.println(c5.name);
		System.out.println(c5.tire.name);
		System.out.println(c5);
	}

}
