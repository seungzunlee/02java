package com.human.ex5;

public class JavaClass04 {

	public static void function1() {
		System.out.println("함수1시작");
		function5();
		function6();
		System.out.println("함수1종료");
	}
	public static void function3() {
		System.out.println("함수3시작");
		System.out.println("함수3종료");
	}
	public static void function4() {
		System.out.println("함수4시작");
		System.out.println("함수4종료");
	}
	public static void function5() {
		System.out.println("함수5시작");
		function3();
		System.out.println("함수5종료");
	}
	public static void function6() {
		System.out.println("함수6시작");
		System.out.println("함수6종료");
	}
	public static void main(String[] args) {
		function1();
		function3();
		function4();

	}

}
