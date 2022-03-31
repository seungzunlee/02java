package com.human.ex5;
import com.human.ex5.*;
public class Dog {
	public String name = "";
	public int age = 0;
	public boolean vaccination = false;
	
	public Dog(String name, int age, boolean vaccination) {
		this.name = name;
		this.age = age;
		this.vaccination = vaccination;
	}
	@Override
	public String toString() {
		return "������ [�̸��� " + name + "�̰� ���̴� " + age + "���Դϴ�. ��������� " + vaccination + "]";
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
	
	
	public static void main(String[] args) {
		Dog d1 = new Dog("dog1", 10, false);
		System.out.println(d1);
		d1.addAge(5);
		System.out.println(d1);
		
		Cat c1 = new Cat("Cat1" , 6, true);
		
		Vaccination v1 = Vaccination.getInstance(10);
		v1.Vaccination(d1);
		v1.Vaccination(d1);
		v1.Vaccination(new Dog("dog2", 3, false));
		Vaccination v2 = Vaccination.getInstance();
		v2.Vaccination(c1);
		v2.Vaccination(c1);
		v2.Vaccination(new Cat("Cat11", 10, false));

	}

}
