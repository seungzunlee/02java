package com.human.ex5;
import java.util.*;

public class JavaClass06 {
	
	
	public static void loopNum(String a, int b) {
		for(int i=0; i<b;i++) {
			System.out.println(a);
		}
	}

	public static void main(String[] args) {
		//문자열과 숫자를 입력받아 해당문자열을 숫자만큼 반복출력하는 메소드
		Scanner sc = new Scanner(System.in);
		System.out.println("문자열을 입력하시오");
		String input1 = sc.nextLine();
		System.out.println("숫자를 입력하시오.");
		int input2 = Integer.parseInt(sc.nextLine());
		loopNum(input1, input2);
	}

}
