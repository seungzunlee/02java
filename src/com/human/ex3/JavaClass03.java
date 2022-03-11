package com.human.ex3;
import java.util.*;

public class JavaClass03 {

	public static void main(String[] args) {
		System.out.println("문제1번");
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
		
		System.out.println("문제2번");
		System.out.println("숫자를 입력하시오. >>");
		Scanner scanner = new Scanner(System.in);
		String input2 = scanner.nextLine();
		int num2 = Integer.parseInt(input2);
		if(num2>10) {
			System.out.println("10보다 큰 수");
		} else {
			System.out.println("10보다 크지 않은 수");
		}
		System.out.println();
		
		System.out.println("문제3번");
		int result3 = 0;
		System.out.println("숫자를 입력하시오. >>");
		String input3 = scanner.nextLine();
		int num3 = Integer.parseInt(input3);
		if(num3 == 0) {
			result3 = 0;
		} else if(num3 != 0) {
			result3 = 1;
		}
		System.out.println(result3);
		System.out.println();
		
		System.out.println("문제5번");
		System.out.println("숫자를 입력하시오. >>");
		String input5 = scanner.nextLine();
		int num5 = Integer.parseInt(input5);
		if(num5 > 0) {
			System.out.println(num5);
		} else if (num5 <0) {
			System.out.println(-num5);
		}
		System.out.println();
		
		System.out.println("문제6번");
		int result6 = 0;
		System.out.println("첫 번째 숫자를 입력하시오. >>");
		String input61 = scanner.nextLine();
		int num61 = Integer.parseInt(input61);
		System.out.println("두 번째 숫자를 입력하시오. >>");
		String input62 = scanner.nextLine();
		int num62 = Integer.parseInt(input62);
		result6 = (num61 - num62);
		if(result6 >= 0) {
			System.out.println(result6);
		} else { 
			System.out.println(-result6);
		}
		System.out.println();
		
		System.out.println("문제7번");
		System.out.println("첫 번째 숫자를 입력하시오. >>");
		String input71 = scanner.nextLine();
		int num71 = Integer.parseInt(input71);
		System.out.println("두 번째 숫자를 입력하시오. >>");
		String input72 = scanner.nextLine();
		int num72 = Integer.parseInt(input72);
		System.out.println("세 번째 숫자를 입력하시오. >>");
		String input73 = scanner.nextLine();
		int num73 = Integer.parseInt(input73);
		
		if(num71>num72&&num71>num73) {
			System.out.println("첫번째 숫자가 가장 큰수");
		} else if(num72>num71&&num72>num73) {
			System.out.println("두번째 숫자가 가장 큰수");
		} else if(num73>num71&&num73>num72)
			System.out.println("세번째 숫자가 가장 큰수");
		System.out.println();
		


	}

}
