package com.human.ex;
import java.util.*;

public class MyClass7 {

	public static void main(String[] args) {
//		String str1 = "ȫ�浿";
//		String str2 = String.format("�̸� : %s",  str1);
//		String str3 = "�̸� : " + str1;
//		
//		System.out.println(String.format("�̸� : %s", str1));
//		System.out.println(str2);
//		System.out.println(str3);
//		
		System.out.println("1��");
		int age = 156;
		String name = "hong";
		double height = 175.3;
		System.out.println(String.format("%d, %s, %f", age, name, height));
		System.out.println();
		
		
		System.out.println("2��");
		Scanner scanner =new Scanner(System.in);
		
		System.out.println("ù��° ������ �Է��Ͻÿ�. >>");
		String input1 = scanner.nextLine();
		int a1 = Integer.parseInt(input1);
		System.out.println("�ι�° ������ �Է��Ͻÿ�. >>");
		String input2 = scanner.nextLine();
		int a2 =Integer.parseInt(input2);
		
		int share = (a1 / a2);
		int remainder = (a1 % a2);
		
		System.out.println(String.format("���� %d �̰�, �������� %d�̴�.", share, remainder));
		System.out.println();
		
		System.out.println("3��");
		System.out.println("���ڸ� ���ڸ� �Է��Ͻÿ�. >>");
		String input3 = scanner.nextLine();
		int a3 = Integer.parseInt(input3);
		int bak = a3/100;
		int sib = (a3/10)%10;
		int il =(a3%10);
		System.out.println(String.format("���� �ڸ�:%d ���� �ڸ�:%d ���� �ڸ�:%d", bak, sib,il));
		System.out.println();

		System.out.println("4��");
		System.out.println("ù��° ���� x��ǥ�� �Է��Ͻÿ�. >>");
		String input4 = scanner.nextLine();
		int x1 = Integer.parseInt(input4);
		System.out.println("ù��° ���� y��ǥ�� �Է��Ͻÿ�. >>");
		String input5 = scanner.nextLine();
		int y1 = Integer.parseInt(input5);
		System.out.println("�ι�° ���� x��ǥ�� �Է��Ͻÿ�. >>");
		String input6 = scanner.nextLine();
		int x2 = Integer.parseInt(input6);
		System.out.println("�ι�° ���� y��ǥ�� �Է��Ͻÿ�. >>");
		String input7 = scanner.nextLine();
		int y2 = Integer.parseInt(input7);
		
		int x3 = (x1-x2)*(x1-x2);
		int y3 = (y1-y2)*(y1-y2);
		double result = Math.sqrt(x3+y3);
		System.out.println(String.format("������ �Ÿ�: %f", result));
		System.out.println();
		

	}

}
