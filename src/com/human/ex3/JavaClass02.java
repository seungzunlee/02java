package com.human.ex3;
import java.util.*;
public class JavaClass02 {

	public static void main(String[] args) {
		System.out.println("1번");
		Scanner scanner = new Scanner(System.in);
		int a =11, b = 14;
		System.out.println("숫자를 입력하시오. >>");
		String input1 = scanner.nextLine();
		int num1 = Integer.parseInt(input1);
		if(num1 == 0) {
			a=5;
			
		} else {
			b=a+3;
		}
		System.out.println(a);
		System.out.println(b);
		System.out.println();
		
		System.out.println("2번");
		System.out.println("5 또는 -5를 입력하시오.>> ");
		String input2 = scanner.nextLine();
		int num2 = Integer.parseInt(input2);
		if(num2 == 5) {
			System.out.println(num2);
		} else if(num2 == -5) {
			System.out.println(-num2);
		}
		System.out.println();
		
		System.out.println("3번");
		System.out.println("숫자를 입력하시오. >>");
		String input3 = scanner.nextLine();
		int num3 = Integer.parseInt(input3);
		if((126%num3)==0) {
			System.out.println("126의 약수이다.");
		} else {
			System.out.println("126의 약수가 아닙니다.");
		}
		System.out.println();
		
		
		System.out.println("4번");
		
		System.out.println("국어점수를 입력하시오. >>");
		String input41 = scanner.nextLine();
		int num41 = Integer.parseInt(input41);
		
		System.out.println("영어점수를 입력하시오. >>");
		String input42 = scanner.nextLine();
		int num42 = Integer.parseInt(input42);
		
		System.out.println("수학점수를 입력하시오. >>");
		String input43 = scanner.nextLine();
		int num43 = Integer.parseInt(input43);
		
		double sum = ((num41 + num42 + num43)/3);
		
		if(sum >= 80) {
			System.out.println("합격입니다.");
		} else {
			System.out.println("불합격입니다.");
		}
		System.out.println();
		
		System.out.println("5번");
		System.out.println("숫자를 입력하시오. >>");
		String input5 = scanner.nextLine();
		int num5 = Integer.parseInt(input5);
		if(num5<=5) {
			System.out.println(num5+15);
		} else {
			System.out.println(num5+5);
		}
		System.out.println();
		
		System.out.println("6번");
		boolean b1 = 5!=3;
		boolean b2 = 5==3;
		if(b1)
			if(b2)
				System.out.println("1번");
			else
				System.out.println("2번");
		else
			System.out.println("3번");
			System.out.println("4번");
			//2번
			//4번   으로출력
		System.out.println();

	}

}
