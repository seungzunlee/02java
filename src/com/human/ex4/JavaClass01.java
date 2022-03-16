package com.human.ex4;
import java.util.*;
public class JavaClass01 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		System.out.println("몇월 인지 입력하시오.");
		String input1 = sc.nextLine();
		
		
		switch(input1) {
		case "1": case "3": case "5": case "7": case "8": case "10": case "12":
			System.out.println("31일");
			break;
			
		case "2":
			System.out.println("28일");
			break;
			
		case "4": case "6": case "9": case "11":
			System.out.println("30일");
			break;
			
		default:
			System.out.println("없는 달입니다.");
			break;
			
		}
		
		//비밀번호가 		111이고 		key는 "108호 키"이다.
		int num=111;
		String key="108호";
		
//		int numInput = Integer.parseInt(sc.nextLine());
//		String keyInput = sc.nextLine();
		
		// 둘 다 입력해야 들어갈 수 있음.
		if(num==111 && key.equals("108호")) {
			System.out.println("들어감");
		} else {
			System.out.println("못 들어감");
		}
		
		// 둘 중에 하나만 맞으면 들어갈 수 있음
		if(num==111 || key.equals("108호")) {
			System.out.println("들어감");
		} else {
			System.out.println("못 들어감");
		}
		
		
		// 비밀번호만  
		if(num==111) {
			System.out.println("들어감");
		} else {
			System.out.println("못 들어감");
		}
		//키만 맞으면 들어 갈 수 있음.
		if(key.equals("108호")) {
			System.out.println("들어감");
		} else {
			System.out.println("못 들어감");
		}
		
		boolean isFlag1=true, isFlag2=true;
		if(isFlag1) {
			if(isFlag2) {
				System.out.println("맞음"); //맞음 //틀림 // 틀림
			} else {
				System.out.println("틀림"); //맞음 //틀림 // 맞음
			}
		} else {
			if(isFlag2) {
				System.out.println("틀림"); //맞음 //틀림 // 맞음
			} else {
				System.out.println("틀림"); //틀림 //맞음 // 맞음
			}
		}
		// 1번쨰 ,맞음 ,틀, 틀 , 틀
		if(isFlag1 && isFlag2) {		//1번 조건을 구하는 것
			System.out.println("맞음");
		} else {
			System.out.println("틀림");
		}
		// 2번째 맞음 , 맞음, 맞음, 틀림 구현

		if(isFlag1 || isFlag2) {		
			System.out.println("맞음");
		} else {
			System.out.println("틀림");
		}
		
		// 3번째 틀림 , 틀림, 틀림, 맞음
		if(!(isFlag1 || isFlag2 )) {		
			System.out.println("맞음");
		} else {
			System.out.println("틀림");
		}
		
		// 4번째 틀림, 맞음, 맞음, 맞음
		if(!(isFlag1 && isFlag2)) {		
			System.out.println("맞음");
		} else {
			System.out.println("틀림");
		}
		
		
	}

}
