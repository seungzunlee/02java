package com.human.ex5;

public class Student {
	public double korean = 0.0;
	public double english = 0.0;
	public double math = 0.0;
	
	public Student(double korean, double english, double math) {
		this.korean = korean;
		this.english = english;
		this.math = math;
	}
	public void Sum() {
		System.out.println("ÃÑÁ¡: " +(korean+english+math));
	}
	public double Sum(double korean, double english, double math) {
		System.out.println("ÃÑÁ¡: " +(korean+english+math));
		return (korean+english+math);
	}
	public void Average() {
		System.out.println("Æò±Õ: " + ((korean+english+math)/3));
	}

	public static void main(String[] args) {

		Student s1 = new Student(100, 100, 100);
		s1.Sum();	s1.Average();
		Student s2 = new Student(90,92,96);
		s2.Sum();	s2.Average();
		Student s3 = new Student(77, 89, 69);
		s3.Sum();	s3.Average();

	}

}
