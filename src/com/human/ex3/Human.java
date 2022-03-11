package com.human.ex3;

public class Human {				//Ŭ���� ����
	
	public String name="ȫ�浿";		//�ʵ�
	public int age =20;
	public double height=160.1;
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		long temp;
		temp = Double.doubleToLongBits(height);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Human other = (Human) obj;
		if (age != other.age)
			return false;
		if (Double.doubleToLongBits(height) != Double.doubleToLongBits(other.height))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	public Human() {}
	
	public Human(String name, int age, double height) {
		super();
		this.name = name;
		this.age = age;
		this.height = height;
	}


	@Override
	public String toString() {		//�޼ҵ�
		return "Human [�̸�=" + name + ", ����=" + age + ", Ű=" + height + "]";
	}
	
	

}
