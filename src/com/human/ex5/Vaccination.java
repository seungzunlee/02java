package com.human.ex5;

class Vaccination {
	public int vaccinCount = 0;
	private static Vaccination instance = new Vaccination();
	private Vaccination() {};
	public static Vaccination getInstance() {
		return instance;
	}
	public static Vaccination getInstance(int ins) {
		instance.vaccinCount = ins;
		return instance;
	}
	
	public void Vaccination(Dog d1) {	
		if(d1.vaccination == false) {
			if(d1.age >=5) {
				
				System.out.println((d1.name)+"님에게 "+vaccinCount+ "번째로"+ " 예방접종을 하였습니다.");
				d1.vaccination = true;
				vaccinCount++;
			} else {
				System.out.println((d1.name)+ "님은 5세 이하여서 대상이 아닙니다.");
			}
		} else if (d1.vaccination == true) {
			System.out.println((d1.name)+"님에게 예방접종을 이미 하셨습니다.");
		}
	}
	
	public void Vaccination(Cat c1) {	
		if(c1.vaccination == false) {
			if(c1.age >=5) {
				c1.vaccination = true;
				System.out.println((c1.name)+"님에게 "+vaccinCount+ "번째로"+ " 예방접종을 하였습니다.");
			} else {
				System.out.println((c1.name)+ "님은 5세 이하여서 대상이 아닙니다.");
			}
		} else if (c1.vaccination == true) {
			System.out.println((c1.name)+"님에게 예방접종을 이미 하셨습니다.");
		}
	}

}
