package com.human.ex;

public class MyClass5 {

	public static void main(String[] args) {
		System.out.println("����1");
		boolean b = true;
		int i=1;
		short s=2;
		char c= 'a';
		float f=1.234f; //1
		
		int s2=s+c;	//2
		int s3=s+s;	//3
		int c2=c+2;	//4
		int i2=c+s;		//5
		//int i3=b+i;		//6 boolean���� �ڵ�����ȯ �� ���� ����ȯ�� �Ұ����ϴ�.
		System.out.println();
		
		System.out.println("����2");
		System.out.println("1) 3+3+\"hello\" = 6hello");
		System.out.println("2) 3*\"hello\"  = ���ڿ����� ���� �Ұ���");
		System.out.println("3) \"hello\"+4+4  = hello44");
		System.out.println();
		
		System.out.println("����3");
		System.out.println("int a= \"10\"; dobule d =(double) \"12.3\";");
		System.out.println("���ڿ��� �������� ����ȯ���� �������� �߱⶧�� // (double)�� �ƴ� Double.parseDouble(12.3)���� �ٲ�� �Ѵ�.");
		System.out.println("int a= Integer.parseInt(\"10\"); int d =Double.parseDouble( \"12.3\");");
		System.out.println();
		
		System.out.println("����4");
		String name = "ȫ�浿"; int age = 5;
		System.out.println("�̸��� " +name+ " ���̴� " +age+ "�Դϴ�.");
		System.out.println();
		
		System.out.println("����5");
		System.out.println("����+���� = int�� ������");
		System.out.println();
		
		System.out.println("����6");
		System.out.println("1) double 2)double  3) int 4)double");
		System.out.println();
		
		System.out.println("����7");
		System.out.println();
		System.out.println();
		
		System.out.println("����8");
		System.out.println("10,012	//	11, 0xB, 013");
		System.out.println();
		
		

	}

}
