package com.human.ex;
// 클래스 관련있는 변수를 묶어서 프로그램으로 구현한 것
// 클래스 관련있는 변수와 메소드를 묶어서 프로그램으로 구현한 것
// 이것 저것 다 묶여진 결과물 객체
// 객체 식별가능한 모든 것을 객체라 한다. 객체지향 프로그램언어
// 클래스는 선언부와 생성부로 나눠져 있다.

//
//class Human{
//	public String name;
//	public int age;
//	public double height;
//}

class Phone {
	public int number;
	public String model;
	public String agency;
}
class Coffee {
	public String shop;
	public int price;
	public String home;
}


public class MyClass8 {

	public static void main(String[] args) {

//		Human h1=new Human();
//		h1.name = "홍길동";
//		h1.age = 24;
//		h1.height=178.4;
//		
//		Human h2=new Human();
//		h2.name = "홍길남";
//		h2.age = 36;
//		h2.height=188.4;
//		
//		Human h3=new Human();
//		h3.name = "홍길수";
//		h3.age = 36;
//		h3.height=168.4;
//		
//		//3명의 사람 데이터 만들기
//		String name1="홍길동";
//		int age1=24;
//		double height1=178.4;
//		
//		String name2="홍길남";
//		int age2=36;
//		double height2=188.4;
//		
//		String name3="홍길수";
//		int age3=23;
//		double height3=168.4;
//
//		System.out.println("이름: "+h2.name);
//		System.out.println("나이: "+h2.age);
//		System.out.println("키  : "+h2.height);
//		
		Phone p1 = new Phone();
		p1.number = 12341234;
		p1.model = "IPhone13";
		p1.agency = "SK";
		
		Phone p2 = new Phone();
		p2.number = 45674567;
		p2.model = "Galaxy12";
		p2.agency = "KT";
		
		Phone p3 = new Phone();
		p3.number = 78907890;
		p3.model = "IPhone11";
		p3.agency = "LG";
		
		System.out.println(String.format("번호: %d 기종: %s 통신사: %s",p1.number, p1.model,p1.agency));
		System.out.println(String.format("번호: %d 기종: %s 통신사: %s",p2.number, p2.model,p2.agency));
		System.out.println(String.format("번호: %d 기종: %s 통신사: %s",p3.number, p3.model,p3.agency));
		
		Coffee c1 = new Coffee();
		c1.shop = "EDIYA";
		c1.price = 5000;
		c1.home = "콜롬비아";
		
		Coffee c2 = new Coffee();
		c2.shop = "TOM N TOMS";
		c2.price = 5500;
		c2.home = "인도네시아";
		
		Coffee c3 = new Coffee();
		c3.shop = "STARBUCKS";
		c3.price = 6000;
		c3.home = "과테말라";
		
		System.out.println(String.format("가게: %s 가격: %d 원산지: %s",c1.shop, c1.price,c1.home));
		System.out.println(String.format("가게: %s 가격: %d 원산지: %s",c2.shop, c2.price,c2.home));
		System.out.println(String.format("가게: %s 가격: %d 원산지: %s",c3.shop, c3.price,c3.home));
	}

}
