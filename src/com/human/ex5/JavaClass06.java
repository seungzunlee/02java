package com.human.ex5;
import java.util.*;

public class JavaClass06 {
	
	
	public static void loopNum(String a, int b) {
		for(int i=0; i<b;i++) {
			System.out.println(a);
		}
	}

	public static void main(String[] args) {
		//���ڿ��� ���ڸ� �Է¹޾� �ش繮�ڿ��� ���ڸ�ŭ �ݺ�����ϴ� �޼ҵ�
		Scanner sc = new Scanner(System.in);
		System.out.println("���ڿ��� �Է��Ͻÿ�");
		String input1 = sc.nextLine();
		System.out.println("���ڸ� �Է��Ͻÿ�.");
		int input2 = Integer.parseInt(sc.nextLine());
		loopNum(input1, input2);
	}

}
