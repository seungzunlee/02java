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
		
		System.out.println("전화번호: " +phone.number);
		System.out.println("기종: "+ phone.model);
		System.out.println("통신사: "+phone.agency);
		System.out.println("가격: " +phone.price);
		System.out.println("화면크기:" + phone.d.display );
		System.out.println("두께: " + phone.d.thickness);
		System.out.println("무게: " + phone.d.weight);

	}

}
