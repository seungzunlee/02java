package com.human.ex5;

public class Cat {
	public int age = 0;
	public String name;
	public Cat(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Cat [나이=" + age + ", 이름=" + name + "]";
	}
	

}
