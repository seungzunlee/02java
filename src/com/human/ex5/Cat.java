package com.human.ex5;

class Cat{
	public String name = "";
	public int age = 0;
	public boolean vaccination = false;
	
	public Cat(String name, int age, boolean vaccination) {
		this.name = name;
		this.age = age;
		this.vaccination = vaccination;
	}
	@Override
	public String toString() {
		return "����� [�̸��� " + name + "�̰� ���̴� " + age + "���Դϴ�. ��������� " + vaccination + "]";
	}
	public int addAge(int age) {
		this.age += age;
		return this.age;
	}
	public boolean isVaccination( ) {
		if(this.age >= 5) { 
			if(vaccination == false) {
				System.out.println("���� ������ �ϰڽ��ϴ�.");
				this.vaccination = true;
			} else {
				System.out.println("�̹� ���������� �޾ҽ��ϴ�");
			}
		}
		return this.vaccination;
	}
}
