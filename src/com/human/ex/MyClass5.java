package com.human.ex;

public class MyClass5 {

	public static void main(String[] args) {
		System.out.println("문제1");
		boolean b = true;
		int i=1;
		short s=2;
		char c= 'a';
		float f=1.234f; //1
		
		int s2=s+c;	//2
		int s3=s+s;	//3
		int c2=c+2;	//4
		int i2=c+s;		//5
		//int i3=b+i;		//6 boolean형의 자동형변환 및 강제 형변환이 불가능하다.
		System.out.println();
		
		System.out.println("문제2");
		System.out.println("1) 3+3+\"hello\" = 6hello");
		System.out.println("2) 3*\"hello\"  = 문자열과의 곱셈 불가능");
		System.out.println("3) \"hello\"+4+4  = hello44");
		System.out.println();
		
		System.out.println("문제3");
		System.out.println("int a= \"10\"; dobule d =(double) \"12.3\";");
		System.out.println("문자열을 정수형에 형변환없이 넣으려고 했기때문 // (double)이 아닌 Double.parseDouble(12.3)으로 바꿔야 한다.");
		System.out.println("int a= Integer.parseInt(\"10\"); int d =Double.parseDouble( \"12.3\");");
		System.out.println();
		
		System.out.println("문제4");
		String name = "홍길동"; int age = 5;
		System.out.println("이름은 " +name+ " 나이는 " +age+ "입니다.");
		System.out.println();
		
		System.out.println("문제5");
		System.out.println("문자+정수 = int에 저장함");
		System.out.println();
		
		System.out.println("문제6");
		System.out.println("1) double 2)double  3) int 4)double");
		System.out.println();
		
		System.out.println("문제7");
		System.out.println();
		System.out.println();
		
		System.out.println("문제8");
		System.out.println("10,012	//	11, 0xB, 013");
		System.out.println();
		
		

	}

}
