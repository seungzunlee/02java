package com.human.ex4;

public class JavaClass04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0; i<5; i++) {
			System.out.println("�ȳ�");
		}
		
		for(int i=1; i<5; i++) {
			System.out.println(i);
		}
		int sum=0;
		for(int i=0; i<11; i++) {
			sum += i;
		}
		System.out.println(sum);
		
		
		//1. 8~20���� ���� ���
		int sum2=0;
		for(int i=8; i<21; i++) {
			sum2 += i;	
		}
		System.out.println(sum2);
		//2. 6~9���� ������� ���
		for(int i=6; i<10; i++) {
			System.out.println(i);
		}
		
		//20~30 ���̿� ¦���� ��� ���� ��.
		int sum3=0;
		for(int i=20; i<31; i++) {
			if(i%2==0) {
				sum3 += i;
			}
		}
		System.out.println(sum3);
		//while 1~10���� �ݺ�
		int x=1;
		int sum4 =0;
		while(x<11) {
			System.out.println(String.format("%d+%d=%d", sum4,x,sum4+x));
			sum4 += x;
			x++;
		}
		System.out.println(sum4);
		
		//�ȳ� 4�����
		//i�� �̿� 1~4 ���� ���
		//1~10������ ���� ���ؼ� ����غ���.
		//8~20���� Ȧ�� ���� ����Ͻÿ�.
		
		int num1 = 0;
		while(num1 < 4) { 
			System.out.println("�ȳ�");
			num1++;
		}
		int num2 = 1;
		while(num2 < 5) { 
			System.out.println(num2);
			num2++;
		}
		int sum33 =0;
		int num3 = 1;
		while(num3 < 11) { 
			sum33 += num3;
			num3++;
		}
		System.out.println(sum33);
		int sum44 = 0;
		int num4 = 8;
		while(num4 < 21) { 
			if(num4%2==1) {
				sum44 += num4;
			}
			num4++;
		}
		System.out.println(sum44);
	}

}
