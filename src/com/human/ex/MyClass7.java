package com.human.ex;
import java.util.*;

public class MyClass7 {

	public static void main(String[] args) {
//		String str1 = "홍길동";
//		String str2 = String.format("이름 : %s",  str1);
//		String str3 = "이름 : " + str1;
//		
//		System.out.println(String.format("이름 : %s", str1));
//		System.out.println(str2);
//		System.out.println(str3);
//		
		System.out.println("1번");
		int age = 156;
		String name = "hong";
		double height = 175.3;
		System.out.println(String.format("%d, %s, %f", age, name, height));
		System.out.println();
		
		
		System.out.println("2번");
		Scanner scanner =new Scanner(System.in);
		
		System.out.println("첫번째 정수를 입력하시오. >>");
		String input1 = scanner.nextLine();
		int a1 = Integer.parseInt(input1);
		System.out.println("두번째 정수를 입력하시오. >>");
		String input2 = scanner.nextLine();
		int a2 =Integer.parseInt(input2);
		
		int share = (a1 / a2);
		int remainder = (a1 % a2);
		
		System.out.println(String.format("몫은 %d 이고, 나머지는 %d이다.", share, remainder));
		System.out.println();
		
		System.out.println("3번");
		System.out.println("세자리 숫자를 입력하시오. >>");
		String input3 = scanner.nextLine();
		int a3 = Integer.parseInt(input3);
		int bak = a3/100;
		int sib = (a3/10)%10;
		int il =(a3%10);
		System.out.println(String.format("백의 자리:%d 십의 자리:%d 일의 자리:%d", bak, sib,il));
		System.out.println();

		System.out.println("4번");
		System.out.println("첫번째 점의 x좌표를 입력하시오. >>");
		String input4 = scanner.nextLine();
		int x1 = Integer.parseInt(input4);
		System.out.println("첫번째 점의 y좌표를 입력하시오. >>");
		String input5 = scanner.nextLine();
		int y1 = Integer.parseInt(input5);
		System.out.println("두번째 점의 x좌표를 입력하시오. >>");
		String input6 = scanner.nextLine();
		int x2 = Integer.parseInt(input6);
		System.out.println("두번째 점의 y좌표를 입력하시오. >>");
		String input7 = scanner.nextLine();
		int y2 = Integer.parseInt(input7);
		
		int x3 = (x1-x2)*(x1-x2);
		int y3 = (y1-y2)*(y1-y2);
		double result = Math.sqrt(x3+y3);
		System.out.println(String.format("두점의 거리: %f", result));
		System.out.println();
		

	}

}
