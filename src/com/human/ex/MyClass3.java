package com.human.ex;

public class MyClass3 {

	public static void main(String[] args) {
		System.out.println("1번");
		int sum1=0;
		sum1 = 5+3;
		System.out.println(sum1);
		
		sum1= sum1*6;
		System.out.println(sum1);
		System.out.println();
		
		System.out.println("2번");
		int sum2=0;
		int a,b=0;
		
		a=8%5;
		System.out.println(a);
		a=a*1;
		System.out.println(a);
		
		b=5*5;
		System.out.println(b);
		b=b+3;
		System.out.println(b);
		sum2=a+b;
		System.out.println(sum2);
		System.out.println();
		
		System.out.println("3번");
		int sum3=0;
		int a3,b3=0;
		
		a=3*2;
		System.out.println(a);
		a=a+3;
		System.out.println(a);
		b=5%6;
		System.out.println(b);
		sum3=a+b;
		System.out.println(sum3);
		System.out.println();
		
		System.out.println("4번");
		int a4,b4,c4=0;
		a4=2+5;
		System.out.println(a4);
		b4=2%6;
		System.out.println(b4);
		b4=b4+3;
		System.out.println(b4);
		c4=3/2;
		System.out.println(c4);
		System.out.println(a4+b4+c4);
		System.out.println();
		
		System.out.println("5번");
		System.out.println("a=b=40; //값을 한번에 두 개의 변수에 넣을 수 없음.");
		System.out.println("a=5+3=8*4 //변수 한 개를 한번에 두 개의 값을 넣을 수 없음.");

	}

}
