package com.human.ex5;

public class JavaClass03 {

	public static void function1() {
		System.out.println("함수 1시작");
		function2();
		System.out.println("함수 1종료");
	}
	public static void function2() {
		System.out.println("함수 2시작");
		function3();
		System.out.println("함수 2종료");
	}
	public static void function3() {
		System.out.println("함수 3시작");
		function4();
		System.out.println("함수 3종료");
	}
	public static void function4() {
		System.out.println("함수 4시작");
		System.out.println("함수 4 종료");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		function1();
		function2();
		function3();
		function4();
	}

}
