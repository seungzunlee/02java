package com.human.ex3;
import java.util.*;
public class JavaClass04 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("문제1번");
		System.out.println("숫자를 입력하시오. >>");
		String input1 = scanner.nextLine();
		int num1 = Integer.parseInt(input1);
		System.out.println("숫자를 입력하시오. >>");
		String input1 = scanner.nextLine();
		int num1 = Integer.parseInt(input1);
		
		
		System.out.println("문제2번");
		System.out.println("숫자를 입력하시오. >>");
		String input2 = scanner.nextLine();
		int num2 = Integer.parseInt(input2);
		if(num2%2==0) {
			System.out.println("짝수입니다.");
		} else {
			System.out.println("홀수입니다.");
		}
		System.out.println();
		
		System.out.println("문제3번");
		System.out.println("숫자를 입력하시오. >>");
		String input3 = scanner.nextLine();
		int num3 = Integer.parseInt(input3);
		if(num3>500) {
			System.out.println("500원의 개수는"+(num3/500) + ", 남은 돈은"+(num3%500)+"이다.");
		} else {
			System.out.println("잔돈으로 거슬러 줄 수 없다.");
		}
		
		System.out.println();
		

	}

}
