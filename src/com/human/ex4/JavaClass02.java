package com.human.ex4;
import java.util.*;
public class JavaClass02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1번");
		System.out.println("정수를 입력하시오.");
		int input1 = Integer.parseInt(sc.nextLine());
		if(input1 >14) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		System.out.println();
		
		System.out.println("2번");
		System.out.println("정수를 입력하시오.");
		int input2 = Integer.parseInt(sc.nextLine());
		if(input2 <= 22 && input2 > 12 ) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		System.out.println();
		
		System.out.println("3번");
		System.out.println("정수를 입력하시오.");
		int input3 = Integer.parseInt(sc.nextLine());
		if((input3%3==0) || (input3%7==0)) {
			if((input3%2==0) || (input3%5==0)) {
				System.out.println("3또는 7의 배수");
				System.out.println("2또는 5의 배수");
			} else {
				System.out.println("3또는 7의 배수");
			}  
				
			} else {
				System.out.println("2또는 5의 배수");
		} 
		
		System.out.println("4번");
		System.out.println("x축을 입력하시오.");
		int x = Integer.parseInt(sc.nextLine());
		System.out.println("y축을 입력하시오.");
		int y = Integer.parseInt(sc.nextLine());
		if(x > 0 ) {
			if(y > 0) {
				System.out.println("2번위치");
			} else if(y==0) {
				System.out.println("x축에 있다.");
			} else {
				System.out.println("3번위치");
			}
		} else if(x < 0) {
			if(y > 0) {
				System.out.println("1번위치");
			} else {
				System.out.println("4번위치");
			}
		} else { if(y == 0) {
			System.out.println("가운데");
		} else {
			System.out.println("y축에 있다.");
		}
		
			
		}
		System.out.println();
		
		System.out.println("5번");
		System.out.println("나이 입력.");
		int input5 = Integer.parseInt(sc.nextLine());
		System.out.println("교통카드 유무 입력.");
		Boolean isCard = Boolean.parseBoolean(sc.nextLine());
		int change = 0;
		if(input5 <= 15) {
			if(isCard==true) {
				System.out.println("교통카드 요금은 1200원입니다.");
			}else {
				System.out.println("교통카드 요금은 1300원입니다.");
				
			}
		}else {
			if(isCard==true) {
				System.out.println("교통카드 요금은 1500원입니다.");
			}else {
				System.out.println("교통카드 요금은 1600원입니다.");
				
			}
			
		}
			
		System.out.println();
		
		System.out.println("6번");
		int i =(new java.util.Date()).getDay();
		switch(i) {
		case 0:
			System.out.println("일요일");
			break;
		case 1:
			System.out.println("월요일");
			break;
		case 2:
			System.out.println("화요일");
			break;
		case 3:
			System.out.println("수요일");
			break;
		case 4:
			System.out.println("목요일");
			break;
		case 5:
			System.out.println("금요일");
			break;
		case 6:
			System.out.println("토요일");
			break;
			default:
			
				
		}
		
		System.out.println("7번");
		System.out.println("한국 사이즈 입력.");
		int input7 = Integer.parseInt(sc.nextLine());
		if(input7 >= 110) {
			System.out.println("XXL사이즈");
		} else if(input7 >= 105 ) {
			System.out.println("XL사이즈");
		} else if(input7 >= 100) {
			System.out.println("L사이즈");
		} else if(input7 >= 95) {
			System.out.println("M사이즈");
		} else if(input7 >= 90) {
			System.out.println("S사이즈");
		} else {
			System.out.println("아동복");
		}
		
		System.out.println("8번");
		System.out.println("java 성적 입력.");
		int j1 = Integer.parseInt(sc.nextLine());
		System.out.println("html 성적 입력.");
		int h1 = Integer.parseInt(sc.nextLine());
		System.out.println("db 성적 입력.");
		int d1 = Integer.parseInt(sc.nextLine());
		int avg = (j1 * h1 * d1) / 3;
		if(j1 > 40 && h1 > 40 && d1 >40) {
			if(avg >= 60) {
				System.out.println("합격");
			}else {
				System.out.println("불합격");
			}
		} else {
			System.out.println("과락");
		}
			
			
	}

}
