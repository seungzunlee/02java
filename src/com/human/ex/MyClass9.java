package com.human.ex;

import com.human.dto.*;				//com.human.dto�� ��� ���� ������
import com.human.dto.Human2;		// Human2�� ������
import com.human.dto.Phone;

public class MyClass9 {

	public static void main(String[] args) {
		//�ٸ� ���Ϸ� ���� Ŭ������ �о����
		
		com.human.dto.Human2 h2 = new com.human.dto.Human2("lee",10,100);
		h2.age=10;
		System.out.println(h2.age);
		com.human.dto.Human2 h3 = new com.human.dto.Human2("kim",20,200);
		Human2 h4 = new Human2("choi",30,300);		//com.human.dto.Human2 ��������
		
		Phone p4 = new Phone();
		p4.agency = "SK";
		System.out.println(p4.agency);

	}

}
