package com.human.ex;
import com.human.dto.Car;
public class Start001 {
	public static void main(String[] args) {
		Car car = new Car();
		car.color="빨강";
		car.company="현대";
		car.maxSpeed=200;
		car.model="소나타";
		car.tire.company="금호타이어";
		car.tire.mileage=20;
		car.tire.price=50000;
		
		Car newCar=new Car();
		//Car newCar=car;
		newCar.color=car.color;
		newCar.company=car.company;
		newCar.maxSpeed=car.maxSpeed;
		newCar.model=car.model;
		//newCar.tire=car.tire;
		newCar.tire.company=car.tire.company;
		newCar.tire.mileage=car.tire.mileage;
		newCar.tire.price=car.tire.price;
		
		Car car2 = new Car();
		car2.color="검정";
		car2.company="KIA";
		car2.maxSpeed=200;
		car.model="k5";
		car2.tire.company="한국타이어";
		car2.tire.mileage=20;
		car2.tire.price=55000;
		
		System.out.println(car.color);
		System.out.println(car.tire.company);
		System.out.println(newCar.color);
		System.out.println(newCar.tire.company);
		System.out.println(car2.color);
		System.out.println(car2.tire.company);

	}

}
