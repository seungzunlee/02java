package com.human.ex;
import java.util.*;

public class MyClass6 {

	public static void main(String[] args) {
	java.util.Scanner sc = new java.util.Scanner(System.in);
	System.out.print("정수입력 >>");
	String st = sc.nextLine();
	int i = Integer.parseInt(st);
	System.out.println(i);
	
	Scanner scanner = new Scanner(System.in);
	System.out.println("가로를 입력하시오. >>");
	String input = scanner.nextLine();
	int g = Integer.parseInt(input);
	System.out.println("세로를 입력하시오. >>");
	String input2 = scanner.nextLine();
	int s = Integer.parseInt(input2);
	System.out.println("넓이는 "+(g*s));
	System.out.println();
	
	
	System.out.println("가로를 입력하시오. >>");
	String input3 = scanner.nextLine();
	int g2 = Integer.parseInt(input);
	System.out.println("세로를 입력하시오. >>");
	String input4 = scanner.nextLine();
	int s2 = Integer.parseInt(input2);
	System.out.println("높이를 입력하시오. >>");
	String input5 = scanner.nextLine();
	int h2 = Integer.parseInt(input2);
	System.out.println("부피는 "+(g2*s2*h2));
	System.out.println();
	
	System.out.println("cm를 입력하시오. >>");
	String input6 = scanner.nextLine();
	double cm = Double.parseDouble(input6);
	System.out.println((cm/100)+("m입니다."));
	System.out.println();
	
	System.out.println("윗변을 입력하시오. >>");
	String input7 = scanner.nextLine();
	int g3 = Integer.parseInt(input);
	System.out.println("아랫변을 입력하시오. >>");
	String input8 = scanner.nextLine();
	int s3 = Integer.parseInt(input2);
	System.out.println("높이를 입력하시오. >>");
	String input9 = scanner.nextLine();
	int h3 = Integer.parseInt(input9);
	System.out.println("부피는 "+((g3+s3)*h3/2));
	System.out.println();
	
	System.out.println("이름을 입력하시오. >>");
	String name = scanner.nextLine();
	System.out.println("나이를 입력하시오. >>");
	String input11 = scanner.nextLine();
	int age = Integer.parseInt(input11);
	System.out.println("키를 입력하시오. >>");
	String input12 = scanner.nextLine();
	double height = Double.parseDouble(input12);
	System.out.println("당신의 이름은 "+name +"입니다.");
	System.out.println("당신의 나이는 "+age +"입니다.");
	System.out.println("당신의 키는 "+height +"입니다.");
	System.out.println();
	
	System.out.println("큰 수를 입력하시오. >>");
	String input13 = scanner.nextLine();
	int num1 = Integer.parseInt(input13);
	System.out.println("작은 수를 입력하시오. >>");
	String input14 = scanner.nextLine();
	int num2 = Integer.parseInt(input14);
	System.out.println("두수의 차는 " +(num1 - num2));
	System.out.println();
	
	System.out.println("국어 점수를 입력하시오. >>");
	String input15 = scanner.nextLine();
	int k1 = Integer.parseInt(input15);
	System.out.println("영어 점수를 입력하시오. >>");
	String input16 = scanner.nextLine();
	int e1 = Integer.parseInt(input16);
	System.out.println("수학 점수를 입력하시오. >>");
	String input17 = scanner.nextLine();
	int m1 = Integer.parseInt(input17);
	System.out.println("국어:"+k1+" 영어:"+e1+" 수학:"+m1+" 평균: "+((k1+e1+m1)/3));
	System.out.println();
	
	System.out.println("키를 m단위로 입력하시오. >>");
	String input18 = scanner.nextLine();
	double h4 = Double.parseDouble(input18);
	System.out.println(h4*100+"cm입니다.");
	System.out.println();
	
	System.out.println("가로를 입력하시오. >>");
	String input19 = scanner.nextLine();
	int g5 = Integer.parseInt(input19);
	System.out.println("세로를 입력하시오. >>");
	String input20 = scanner.nextLine();
	int s5 = Integer.parseInt(input20);
	System.out.println("높이를 입력하시오. >>");
	String input21 = scanner.nextLine();
	int h5 = Integer.parseInt(input21);
	System.out.println("상장의 부피는 "+(g5*s5*h5));
	System.out.println();
	
	System.out.println("구매할 연필의 개수를 입력하시오. >>");
	String input22 = scanner.nextLine();
	int p1 = Integer.parseInt(input22);
	System.out.println("박스:"+(p1/12)+" 자루:"+p1+ " 금액:"+(p1*1000));
	System.out.println();
	
	
	
	
	}

}
