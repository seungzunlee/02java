package com.human.ex5;

public class JavaClass01 {

	public static int sum(int a, int b) {
		int sum =0;
		sum=a+b;
		return sum;
	}
	public static int div(int a, int b) {
		return a/b;
	}
	public static int min(int a, int b) {
		return a-b;
	}
	public static int mul(int a, int b) {
		return a*b;
	}
	public static void hello() {
		System.out.println("æ»≥Á«œººø‰");
	}
	public static void main(String[] args) {
		int a = sum(1,2);
		int b = a + sum(2,2);
		System.out.println(a+b);
		System.out.println(mul(a,b));
		hello();
		hello();
		hello();
		for(int i=0; i<3; i++) {
			hello();
		}
	}

}
