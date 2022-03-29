package com.human.ex5;

public class JavaClass02 {

	public static int sumAll(int a, int b) {
		int sum = 0;
		if(a>b) {
			int temp;
			temp=a;
			a=b;
			b=temp;
		}
		for(int i=a; i<=b;i++) {
			sum=sum+i;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		int a=10, b=12;
		System.out.println(sumAll(a,b));
		System.out.println(sumAll(5,12));
		System.out.println(sumAll(2,5));
		
	}

}
