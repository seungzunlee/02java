package com.human.ex4;
import java.util.*;
public class test {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("18번");			//다시
		System.out.println("행을 입력하시오.");
		int a18 =Integer.parseInt(sc.nextLine());
		System.out.println("열 입력하시오.");
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
