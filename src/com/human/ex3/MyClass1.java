package com.human.ex3;
import java.util.*;
public class MyClass1 {

	public static void main(String[] args) {
		
		System.out.println("����1");
		Scanner scanner = new Scanner(System.in);
		System.out.println("������ �Է��Ͻÿ�. >>");
		String input1 = scanner.nextLine();
		int num1 = Integer.parseInt(input1);
		if(num1>10) {
			System.out.println("10���� ũ��.");
		} else if (num1 == 10) {
			System.out.println("10�� ����.");
		} else {
			System.out.println("10���� �۴�.");
		}
		System.out.println();
		
		System.out.println("����2");
		System.out.println("true�� �Է��Ͻÿ�. >>");
		String input2 = scanner.nextLine();
		
		if(input2.equals("true")) {
			System.out.println("true�� �ԷµǾ����ϴ�.");
		} else {
			System.out.println("true�� �Էµ��� �ʾҽ��ϴ�.");
		}
		System.out.println();
		
		System.out.println("����3");
		
		System.out.println("��ȣ�� �Է��Ͻÿ�. >>");
		String input3 = scanner.nextLine();
		int num3 = Integer.parseInt(input3);
		if(num3==1004) {
			System.out.println("��ȣ�� ����");
		} else {
			System.out.println("��ȣ�� Ʋ��");
		}
		System.out.println();
		
		System.out.println("����4");
		System.out.println("�ȳ�, ����, �߰��߿� �ϳ��� �Է��Ͻÿ�. >>");
		String input4 = scanner.nextLine();
		if(input4.equals("�ȳ�")) {
			System.out.println("�ʵ� �ȳ�");
		} else if(input4.equals("����")) {
			System.out.println("�ʵ� ����"); 
			} else if(input4.equals("�߰�")) {
				System.out.println("�ʵ� �߰�"); 
		}
		
		System.out.println(); 

	}

}
