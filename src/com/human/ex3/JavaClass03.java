package com.human.ex3;
import java.util.*;

public class JavaClass03 {

	public static void main(String[] args) {
		System.out.println("����1��");
		int a, b=0;
		a =20; 
		b=0;
		if(a>10) {
			a=b;
		} else {
			b=a;
		}
		System.out.println(a);
		System.out.println(b);
		System.out.println();
		
		System.out.println("����2��");
		System.out.println("���ڸ� �Է��Ͻÿ�. >>");
		Scanner scanner = new Scanner(System.in);
		String input2 = scanner.nextLine();
		int num2 = Integer.parseInt(input2);
		if(num2>10) {
			System.out.println("10���� ū ��");
		} else {
			System.out.println("10���� ũ�� ���� ��");
		}
		System.out.println();
		
		System.out.println("����3��");
		int result3 = 0;
		System.out.println("���ڸ� �Է��Ͻÿ�. >>");
		String input3 = scanner.nextLine();
		int num3 = Integer.parseInt(input3);
		if(num3 == 0) {
			result3 = 0;
		} else if(num3 != 0) {
			result3 = 1;
		}
		System.out.println(result3);
		System.out.println();
		
		System.out.println("����5��");
		System.out.println("���ڸ� �Է��Ͻÿ�. >>");
		String input5 = scanner.nextLine();
		int num5 = Integer.parseInt(input5);
		if(num5 > 0) {
			System.out.println(num5);
		} else if (num5 <0) {
			System.out.println(-num5);
		}
		System.out.println();
		
		System.out.println("����6��");
		int result6 = 0;
		System.out.println("ù ��° ���ڸ� �Է��Ͻÿ�. >>");
		String input61 = scanner.nextLine();
		int num61 = Integer.parseInt(input61);
		System.out.println("�� ��° ���ڸ� �Է��Ͻÿ�. >>");
		String input62 = scanner.nextLine();
		int num62 = Integer.parseInt(input62);
		result6 = (num61 - num62);
		if(result6 >= 0) {
			System.out.println(result6);
		} else { 
			System.out.println(-result6);
		}
		System.out.println();
		
		System.out.println("����7��");
		System.out.println("ù ��° ���ڸ� �Է��Ͻÿ�. >>");
		String input71 = scanner.nextLine();
		int num71 = Integer.parseInt(input71);
		System.out.println("�� ��° ���ڸ� �Է��Ͻÿ�. >>");
		String input72 = scanner.nextLine();
		int num72 = Integer.parseInt(input72);
		System.out.println("�� ��° ���ڸ� �Է��Ͻÿ�. >>");
		String input73 = scanner.nextLine();
		int num73 = Integer.parseInt(input73);
		
		if(num71>num72&&num71>num73) {
			System.out.println("ù��° ���ڰ� ���� ū��");
		} else if(num72>num71&&num72>num73) {
			System.out.println("�ι�° ���ڰ� ���� ū��");
		} else if(num73>num71&&num73>num72)
			System.out.println("����° ���ڰ� ���� ū��");
		System.out.println();
		


	}

}
