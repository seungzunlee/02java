package com.human.ex5;

public class JavaClass04 {

	public static void function1() {
		System.out.println("�Լ�1����");
		function5();
		function6();
		System.out.println("�Լ�1����");
	}
	public static void function3() {
		System.out.println("�Լ�3����");
		System.out.println("�Լ�3����");
	}
	public static void function4() {
		System.out.println("�Լ�4����");
		System.out.println("�Լ�4����");
	}
	public static void function5() {
		System.out.println("�Լ�5����");
		function3();
		System.out.println("�Լ�5����");
	}
	public static void function6() {
		System.out.println("�Լ�6����");
		System.out.println("�Լ�6����");
	}
	public static void main(String[] args) {
		function1();
		function3();
		function4();

	}

}
