package com.human.dto;

public class Tree {
	// 나무이름, 나무 가격, 키우는데 걸리는 시간, 경험치, 현재 심은 나무수, 최대 심을 수 있는 나무수
	public String name ="";
	public int price;
	public int hour;
	public int ex;
	public int num;
	public int maxNum = 50;
	public Tree() {}
	
	public Tree(String name, int price, int hour, int ex, int num, int maxNum,String oName, int oAge, int oPn) {
		super();
		this.name = name;
		this.price = price;
		this.hour = hour;
		this.ex = ex;
		this.num = num;
		this.maxNum = maxNum;
		this.o.name = oName;
		this.o.age = oAge;
		this.o.pn = oPn;
	}

	@Override
	public String toString() {
		return "Tree [나무이름=" + name + ", 나무가격=" + price + ", 키운는데 걸리는 시간=" + hour + ", 경험치=" + ex + ", 현재 심은 나무수=" + num
				+ ", 최대 싶은 수 있는 나무 수=" + maxNum+"]"+"\n Owner [" +"주인의 이름="+o.name+"주인의 나이" +o.age+"주인의 연락처 ="+o.pn+ "]";
	}

	public Owner o = new Owner();

}
