package com.human.ex4;
import java.util.*;
public class test {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("18��");			//�ٽ�
		System.out.println("���� �Է��Ͻÿ�.");
		int a18 =Integer.parseInt(sc.nextLine());
		System.out.println("�� �Է��Ͻÿ�.");
		int b18 =Integer.parseInt(sc.nextLine());
		for(int i=1; i<a18; i++) {
			for(int j=1; j<b18; j++) {
				System.out.println(j);
				if(b18==j) {
					break;
				}
			}
		}

	}

}
