package com.human.ex4;
import java.util.*;
public class JavaClass02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1��");
		System.out.println("������ �Է��Ͻÿ�.");
		int input1 = Integer.parseInt(sc.nextLine());
		if(input1 >14) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		System.out.println();
		
		System.out.println("2��");
		System.out.println("������ �Է��Ͻÿ�.");
		int input2 = Integer.parseInt(sc.nextLine());
		if(input2 <= 22 && input2 > 12 ) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		System.out.println();
		
		System.out.println("3��");
		System.out.println("������ �Է��Ͻÿ�.");
		int input3 = Integer.parseInt(sc.nextLine());
		if((input3%3==0) || (input3%7==0)) {
			if((input3%2==0) || (input3%5==0)) {
				System.out.println("3�Ǵ� 7�� ���");
				System.out.println("2�Ǵ� 5�� ���");
			} else {
				System.out.println("3�Ǵ� 7�� ���");
			}  
				
			} else {
				System.out.println("2�Ǵ� 5�� ���");
		} 
		
		System.out.println("4��");
		System.out.println("x���� �Է��Ͻÿ�.");
		int x = Integer.parseInt(sc.nextLine());
		System.out.println("y���� �Է��Ͻÿ�.");
		int y = Integer.parseInt(sc.nextLine());
		if(x > 0 ) {
			if(y > 0) {
				System.out.println("2����ġ");
			} else if(y==0) {
				System.out.println("x�࿡ �ִ�.");
			} else {
				System.out.println("3����ġ");
			}
		} else if(x < 0) {
			if(y > 0) {
				System.out.println("1����ġ");
			} else {
				System.out.println("4����ġ");
			}
		} else { if(y == 0) {
			System.out.println("���");
		} else {
			System.out.println("y�࿡ �ִ�.");
		}
		
			
		}
		System.out.println();
		
		System.out.println("5��");
		System.out.println("���� �Է�.");
		int input5 = Integer.parseInt(sc.nextLine());
		System.out.println("����ī�� ���� �Է�.");
		Boolean isCard = Boolean.parseBoolean(sc.nextLine());
		int change = 0;
		if(input5 <= 15) {
			if(isCard==true) {
				System.out.println("����ī�� ����� 1200���Դϴ�.");
			}else {
				System.out.println("����ī�� ����� 1300���Դϴ�.");
				
			}
		}else {
			if(isCard==true) {
				System.out.println("����ī�� ����� 1500���Դϴ�.");
			}else {
				System.out.println("����ī�� ����� 1600���Դϴ�.");
				
			}
			
		}
			
		System.out.println();
		
		System.out.println("6��");
		int i =(new java.util.Date()).getDay();
		switch(i) {
		case 0:
			System.out.println("�Ͽ���");
			break;
		case 1:
			System.out.println("������");
			break;
		case 2:
			System.out.println("ȭ����");
			break;
		case 3:
			System.out.println("������");
			break;
		case 4:
			System.out.println("�����");
			break;
		case 5:
			System.out.println("�ݿ���");
			break;
		case 6:
			System.out.println("�����");
			break;
			default:
			
				
		}
		
		System.out.println("7��");
		System.out.println("�ѱ� ������ �Է�.");
		int input7 = Integer.parseInt(sc.nextLine());
		if(input7 >= 110) {
			System.out.println("XXL������");
		} else if(input7 >= 105 ) {
			System.out.println("XL������");
		} else if(input7 >= 100) {
			System.out.println("L������");
		} else if(input7 >= 95) {
			System.out.println("M������");
		} else if(input7 >= 90) {
			System.out.println("S������");
		} else {
			System.out.println("�Ƶ���");
		}
		
		System.out.println("8��");
		System.out.println("java ���� �Է�.");
		int j1 = Integer.parseInt(sc.nextLine());
		System.out.println("html ���� �Է�.");
		int h1 = Integer.parseInt(sc.nextLine());
		System.out.println("db ���� �Է�.");
		int d1 = Integer.parseInt(sc.nextLine());
		int avg = (j1 * h1 * d1) / 3;
		if(j1 > 40 && h1 > 40 && d1 >40) {
			if(avg >= 60) {
				System.out.println("�հ�");
			}else {
				System.out.println("���հ�");
			}
		} else {
			System.out.println("����");
		}
			
			
	}

}
