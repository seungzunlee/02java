package com.human.ex3;
import java.util.*;
public class JavaClass04 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("����1��");
		System.out.println("���ڸ� �Է��Ͻÿ�. >>");
		String input1 = scanner.nextLine();
		int num1 = Integer.parseInt(input1);
		System.out.println("���ڸ� �Է��Ͻÿ�. >>");
		String input1 = scanner.nextLine();
		int num1 = Integer.parseInt(input1);
		
		
		System.out.println("����2��");
		System.out.println("���ڸ� �Է��Ͻÿ�. >>");
		String input2 = scanner.nextLine();
		int num2 = Integer.parseInt(input2);
		if(num2%2==0) {
			System.out.println("¦���Դϴ�.");
		} else {
			System.out.println("Ȧ���Դϴ�.");
		}
		System.out.println();
		
		System.out.println("����3��");
		System.out.println("���ڸ� �Է��Ͻÿ�. >>");
		String input3 = scanner.nextLine();
		int num3 = Integer.parseInt(input3);
		if(num3>500) {
			System.out.println("500���� ������"+(num3/500) + ", ���� ����"+(num3%500)+"�̴�.");
		} else {
			System.out.println("�ܵ����� �Ž��� �� �� ����.");
		}
		
		System.out.println();
		

	}

}
