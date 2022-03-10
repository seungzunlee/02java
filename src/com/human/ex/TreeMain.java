package com.human.ex;
import com.human.dto.Tree;


public class TreeMain {

	public static void main(String[] args) {
		// 나무이름, 나무 가격, 키우는데 걸리는 시간, 경험치, 현재 심은 나무수, 최대 심을 수 있는 나무수
		// 이름 나이 연락처
		Tree t1 = new Tree("Mango",200,4,4,7,50,"정상수",20,12341234);
//		t1.name = "Mango";
//		t1.price = 200;
//		t1.hour = 4;
//		t1.ex = 4;
//		t1.num = 7;
//		t1.maxNum = 50;
//		t1.o.name = "정상수";
//		t1.o.age = 20;
//		t1.o.pn = 12341234;
		
		Tree t2 = new Tree("Papaya",375,6,6,6,50,"신동갑",25,45644564);
//		t2.name = "Papaya";
//		t2.price = 375;
//		t2.hour = 6;
//		t2.ex = 6;
//		t2.num = 6;
//		t2.maxNum = 50;
//		t2.o.name = "신동갑";
//		t2.o.age = 25;
//		t2.o.pn = 45644564;
		
		Tree t3 = new Tree("Banana Palm",500,5,5,7,50,"김훈기",30,12121212);
//		t3.name = "Banana Palm";
//		t3.price = 500;
//		t3.hour = 5;
//		t3.ex = 5;
//		t3.num = 7;
//		t3.maxNum = 50;
//		t3.o.name = "김훈기";
//		t3.o.age = 30;
//		t3.o.pn = 12121212;
		
		Tree t4 = new Tree("Lemon",750,8,8,1,50,"문지훈",35,22222222);
//		t4.name = "Lemon";
//		t4.price = 750;
//		t4.hour = 8;
//		t4.ex = 8;
//		t4.num = 1;
//		t4.maxNum = 50;
//		t4.o.name = "문지훈";
//		t4.o.age = 35;
//		t4.o.pn = 22222222;
		
		System.out.println("나무이름: "+t1.name);
		System.out.println("나무가격: "+t1.price);
		System.out.println("키우는데 걸리는 시간: "+t1.hour);
		System.out.println("경험치: "+t1.ex);
		System.out.println("현재 심은 나무수: "+t1.num);
		System.out.println("최대 심을 수 있는 나무수: "+t1.maxNum);
		System.out.println("주인의 이름:" +t1.o.name);
		System.out.println("주인의 나이: "+t1.o.age);
		System.out.println("주인의 연락처: "+t1.o.pn);
		System.out.println(t1);
		System.out.println();
		System.out.println("나무이름: "+t2.name);
		System.out.println("나무가격: "+t2.price);
		System.out.println("키우는데 걸리는 시간: "+t2.hour);
		System.out.println("경험치: "+t2.ex);
		System.out.println("현재 심은 나무수: "+t2.num);
		System.out.println("최대 심을 수 있는 나무수: "+t2.maxNum);
		System.out.println("주인의 이름:" +t2.o.name);
		System.out.println("주인의 나이: "+t2.o.age);
		System.out.println("주인의 연락처: "+t2.o.pn);
		System.out.println(t2);
		System.out.println();
		System.out.println("나무이름: "+t3.name);
		System.out.println("나무가격: "+t3.price);
		System.out.println("키우는데 걸리는 시간: "+t3.hour);
		System.out.println("경험치: "+t3.ex);
		System.out.println("현재 심은 나무수: "+t3.num);
		System.out.println("최대 심을 수 있는 나무수: "+t3.maxNum);
		System.out.println("주인의 이름:" +t3.o.name);
		System.out.println("주인의 나이: "+t3.o.age);
		System.out.println("주인의 연락처: "+t3.o.pn);
		System.out.println(t3);
		System.out.println();
		System.out.println("나무이름: "+t4.name);
		System.out.println("나무가격: "+t4.price);
		System.out.println("키우는데 걸리는 시간: "+t4.hour);
		System.out.println("경험치: "+t4.ex);
		System.out.println("현재 심은 나무수: "+t4.num);
		System.out.println("최대 심을 수 있는 나무수: "+t4.maxNum);
		System.out.println("주인의 이름:" +t4.o.name);
		System.out.println("주인의 나이: "+t4.o.age);
		System.out.println("주인의 연락처: "+t4.o.pn);
		System.out.println(t4);
	}

}
