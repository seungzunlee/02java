package com.human.dto;

public class Tree {
	// �����̸�, ���� ����, Ű��µ� �ɸ��� �ð�, ����ġ, ���� ���� ������, �ִ� ���� �� �ִ� ������
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
		return "Tree [�����̸�=" + name + ", ��������=" + price + ", Ű��µ� �ɸ��� �ð�=" + hour + ", ����ġ=" + ex + ", ���� ���� ������=" + num
				+ ", �ִ� ���� �� �ִ� ���� ��=" + maxNum+"]"+"\n Owner [" +"������ �̸�="+o.name+"������ ����" +o.age+"������ ����ó ="+o.pn+ "]";
	}

	public Owner o = new Owner();

}
