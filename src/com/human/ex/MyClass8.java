package com.human.ex;
// Ŭ���� �����ִ� ������ ��� ���α׷����� ������ ��
// Ŭ���� �����ִ� ������ �޼ҵ带 ��� ���α׷����� ������ ��
// �̰� ���� �� ������ ����� ��ü
// ��ü �ĺ������� ��� ���� ��ü�� �Ѵ�. ��ü���� ���α׷����
// Ŭ������ ����ο� �����η� ������ �ִ�.

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
//		h1.name = "ȫ�浿";
//		h1.age = 24;
//		h1.height=178.4;
//		
//		Human h2=new Human();
//		h2.name = "ȫ�泲";
//		h2.age = 36;
//		h2.height=188.4;
//		
//		Human h3=new Human();
//		h3.name = "ȫ���";
//		h3.age = 36;
//		h3.height=168.4;
//		
//		//3���� ��� ������ �����
//		String name1="ȫ�浿";
//		int age1=24;
//		double height1=178.4;
//		
//		String name2="ȫ�泲";
//		int age2=36;
//		double height2=188.4;
//		
//		String name3="ȫ���";
//		int age3=23;
//		double height3=168.4;
//
//		System.out.println("�̸�: "+h2.name);
//		System.out.println("����: "+h2.age);
//		System.out.println("Ű  : "+h2.height);
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
		
		System.out.println(String.format("��ȣ: %d ����: %s ��Ż�: %s",p1.number, p1.model,p1.agency));
		System.out.println(String.format("��ȣ: %d ����: %s ��Ż�: %s",p2.number, p2.model,p2.agency));
		System.out.println(String.format("��ȣ: %d ����: %s ��Ż�: %s",p3.number, p3.model,p3.agency));
		
		Coffee c1 = new Coffee();
		c1.shop = "EDIYA";
		c1.price = 5000;
		c1.home = "�ݷҺ��";
		
		Coffee c2 = new Coffee();
		c2.shop = "TOM N TOMS";
		c2.price = 5500;
		c2.home = "�ε��׽þ�";
		
		Coffee c3 = new Coffee();
		c3.shop = "STARBUCKS";
		c3.price = 6000;
		c3.home = "���׸���";
		
		System.out.println(String.format("����: %s ����: %d ������: %s",c1.shop, c1.price,c1.home));
		System.out.println(String.format("����: %s ����: %d ������: %s",c2.shop, c2.price,c2.home));
		System.out.println(String.format("����: %s ����: %d ������: %s",c3.shop, c3.price,c3.home));
	}

}
