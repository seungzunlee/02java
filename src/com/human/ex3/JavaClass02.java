package com.human.ex3;
import java.util.*;
public class JavaClass02 {

	public static void main(String[] args) {
		System.out.println("1��");
		Scanner scanner = new Scanner(System.in);
		int a =11, b = 14;
		System.out.println("���ڸ� �Է��Ͻÿ�. >>");
		String input1 = scanner.nextLine();
		int num1 = Integer.parseInt(input1);
		if(num1 == 0) {
			a=5;
			
		} else {
			b=a+3;
		}
		System.out.println(a);
		System.out.println(b);
		System.out.println();
		
		System.out.println("2��");
		System.out.println("5 �Ǵ� -5�� �Է��Ͻÿ�.>> ");
		String input2 = scanner.nextLine();
		int num2 = Integer.parseInt(input2);
		if(num2 == 5) {
			System.out.println(num2);
		} else if(num2 == -5) {
			System.out.println(-num2);
		}
		System.out.println();
		
		System.out.println("3��");
		System.out.println("���ڸ� �Է��Ͻÿ�. >>");
		String input3 = scanner.nextLine();
		int num3 = Integer.parseInt(input3);
		if((126%num3)==0) {
			System.out.println("126�� ����̴�.");
		} else {
			System.out.println("126�� ����� �ƴմϴ�.");
		}
		System.out.println();
		
		
		System.out.println("4��");
		
		System.out.println("���������� �Է��Ͻÿ�. >>");
		String input41 = scanner.nextLine();
		int num41 = Integer.parseInt(input41);
		
		System.out.println("���������� �Է��Ͻÿ�. >>");
		String input42 = scanner.nextLine();
		int num42 = Integer.parseInt(input42);
		
		System.out.println("���������� �Է��Ͻÿ�. >>");
		String input43 = scanner.nextLine();
		int num43 = Integer.parseInt(input43);
		
		double sum = ((num41 + num42 + num43)/3);
		
		if(sum >= 80) {
			System.out.println("�հ��Դϴ�.");
		} else {
			System.out.println("���հ��Դϴ�.");
		}
		System.out.println();
		
		System.out.println("5��");
		System.out.println("���ڸ� �Է��Ͻÿ�. >>");
		String input5 = scanner.nextLine();
		int num5 = Integer.parseInt(input5);
		if(num5<=5) {
			System.out.println(num5+15);
		} else {
			System.out.println(num5+5);
		}
		System.out.println();
		
		System.out.println("6��");
		boolean b1 = 5!=3;
		boolean b2 = 5==3;
		if(b1)
			if(b2)
				System.out.println("1��");
			else
				System.out.println("2��");
		else
			System.out.println("3��");
			System.out.println("4��");
			//2��
			//4��   �������
		System.out.println();

	}

}
