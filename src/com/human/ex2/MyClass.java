package com.human.ex2;
import com.human.ex2.Car;

public class MyClass {

	public static void main(String[] args) {
		
		Car c1 = new Car();
		c1.name = "모닝";
		c1.price = 50000;
		System.out.println(c1.name);
		
		Car c2 = new Car("morning", 70000, "금호", 2022);
		System.out.println(c2.tire.name);
		System.out.println(c2.tire.year);
		
		
		Tire t1=new Tire("금호", 2020);
		
		Car c4 = new Car("morning2",4000, t1);
		System.out.println(c4.name);
		System.out.println(c4.tire.name);
		System.out.println(c4.tire.year);
		System.out.println(c4);
		
		//Car c5 = new Car("morning5", 4000, t1); 	// t1처럼 같은 주소를 넣으면 같은
		//타이어 주소를 가지는 tire인스턴스가 생긴다.
		
		Car c5 = new Car("morning2",4000, new Tire("우리",1990));
		System.out.println(c5.name);
		System.out.println(c5.tire.name);
		System.out.println(c5);
	}

}
