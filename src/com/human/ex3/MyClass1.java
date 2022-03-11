package com.human.ex3;
import java.util.*;
public class MyClass1 {

	public static void main(String[] args) {
		
		System.out.println("문제1");
		Scanner scanner = new Scanner(System.in);
		System.out.println("정수를 입력하시오. >>");
		String input1 = scanner.nextLine();
		int num1 = Integer.parseInt(input1);
		if(num1>10) {
			System.out.println("10보다 크다.");
		} else if (num1 == 10) {
			System.out.println("10과 같다.");
		} else {
			System.out.println("10보다 작다.");
		}
		System.out.println();
		
		System.out.println("문제2");
		System.out.println("true를 입력하시오. >>");
		String input2 = scanner.nextLine();
		
		if(input2.equals("true")) {
			System.out.println("true가 입력되었습니다.");
		} else {
			System.out.println("true가 입력되지 않았습니다.");
		}
		System.out.println();
		
		System.out.println("문제3");
		
		System.out.println("암호를 입력하시오. >>");
		String input3 = scanner.nextLine();
		int num3 = Integer.parseInt(input3);
		if(num3==1004) {
			System.out.println("암호가 맞음");
		} else {
			System.out.println("암호가 틀림");
		}
		System.out.println();
		
		System.out.println("문제4");
		System.out.println("안녕, 잘자, 잘가중에 하나를 입력하시오. >>");
		String input4 = scanner.nextLine();
		if(input4.equals("안녕")) {
			System.out.println("너도 안녕");
		} else if(input4.equals("잘자")) {
			System.out.println("너도 잘자"); 
			} else if(input4.equals("잘가")) {
				System.out.println("너도 잘가"); 
		}
		
		System.out.println(); 

	}

}
