package com.human.ex4;
import java.util.*;
public class JavaClass01 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		System.out.println("��� ���� �Է��Ͻÿ�.");
		String input1 = sc.nextLine();
		
		
		switch(input1) {
		case "1": case "3": case "5": case "7": case "8": case "10": case "12":
			System.out.println("31��");
			break;
			
		case "2":
			System.out.println("28��");
			break;
			
		case "4": case "6": case "9": case "11":
			System.out.println("30��");
			break;
			
		default:
			System.out.println("���� ���Դϴ�.");
			break;
			
		}
		
		//��й�ȣ�� 		111�̰� 		key�� "108ȣ Ű"�̴�.
		int num=111;
		String key="108ȣ";
		
//		int numInput = Integer.parseInt(sc.nextLine());
//		String keyInput = sc.nextLine();
		
		// �� �� �Է��ؾ� �� �� ����.
		if(num==111 && key.equals("108ȣ")) {
			System.out.println("��");
		} else {
			System.out.println("�� ��");
		}
		
		// �� �߿� �ϳ��� ������ �� �� ����
		if(num==111 || key.equals("108ȣ")) {
			System.out.println("��");
		} else {
			System.out.println("�� ��");
		}
		
		
		// ��й�ȣ��  
		if(num==111) {
			System.out.println("��");
		} else {
			System.out.println("�� ��");
		}
		//Ű�� ������ ��� �� �� ����.
		if(key.equals("108ȣ")) {
			System.out.println("��");
		} else {
			System.out.println("�� ��");
		}
		
		boolean isFlag1=true, isFlag2=true;
		if(isFlag1) {
			if(isFlag2) {
				System.out.println("����"); //���� //Ʋ�� // Ʋ��
			} else {
				System.out.println("Ʋ��"); //���� //Ʋ�� // ����
			}
		} else {
			if(isFlag2) {
				System.out.println("Ʋ��"); //���� //Ʋ�� // ����
			} else {
				System.out.println("Ʋ��"); //Ʋ�� //���� // ����
			}
		}
		// 1���� ,���� ,Ʋ, Ʋ , Ʋ
		if(isFlag1 && isFlag2) {		//1�� ������ ���ϴ� ��
			System.out.println("����");
		} else {
			System.out.println("Ʋ��");
		}
		// 2��° ���� , ����, ����, Ʋ�� ����

		if(isFlag1 || isFlag2) {		
			System.out.println("����");
		} else {
			System.out.println("Ʋ��");
		}
		
		// 3��° Ʋ�� , Ʋ��, Ʋ��, ����
		if(!(isFlag1 || isFlag2 )) {		
			System.out.println("����");
		} else {
			System.out.println("Ʋ��");
		}
		
		// 4��° Ʋ��, ����, ����, ����
		if(!(isFlag1 && isFlag2)) {		
			System.out.println("����");
		} else {
			System.out.println("Ʋ��");
		}
		
		
	}

}
