package com.human.ex5;

public class JavaClass03 {

	public static void function1() {
		System.out.println("�Լ� 1����");
		function2();
		System.out.println("�Լ� 1����");
	}
	public static void function2() {
		System.out.println("�Լ� 2����");
		function3();
		System.out.println("�Լ� 2����");
	}
	public static void function3() {
		System.out.println("�Լ� 3����");
		function4();
		System.out.println("�Լ� 3����");
	}
	public static void function4() {
		System.out.println("�Լ� 4����");
		System.out.println("�Լ� 4 ����");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		function1();
		function2();
		function3();
		function4();
	}

}
