package com.human.ex;

import com.human.dto.Phone;

public class Start002 {

	public static void main(String[] args) {


		Phone phone = new Phone();
		phone.number = 01012341234;
		phone.model = "IPhone11";
		phone.agency = "SK";
		phone.price = 1380000;
		phone.d.display = 6.1;
		phone.d.thickness = 9;
		phone.d.weight =194;
		
		System.out.println("��ȭ��ȣ: " +phone.number);
		System.out.println("����: "+ phone.model);
		System.out.println("��Ż�: "+phone.agency);
		System.out.println("����: " +phone.price);
		System.out.println("ȭ��ũ��:" + phone.d.display );
		System.out.println("�β�: " + phone.d.thickness);
		System.out.println("����: " + phone.d.weight);

	}

}
