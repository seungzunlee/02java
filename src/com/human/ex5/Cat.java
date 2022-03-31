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
		return "고양이 [이름은 " + name + "이고 나이는 " + age + "살입니다. 접종결과는 " + vaccination + "]";
	}
	public int addAge(int age) {
		this.age += age;
		return this.age;
	}
	public boolean isVaccination( ) {
		if(this.age >= 5) { 
			if(vaccination == false) {
				System.out.println("예방 접종을 하겠습니다.");
				this.vaccination = true;
			} else {
				System.out.println("이미 예방접종을 받았습니다");
			}
		}
		return this.vaccination;
	}
}
