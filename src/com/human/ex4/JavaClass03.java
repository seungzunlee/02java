package com.human.ex4;
import java.util.*;
public class JavaClass03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("9번");
		
		System.out.println("키를 입력하시오.");
		int x = Integer.parseInt(sc.nextLine());
		System.out.println("체중을 입력하시오.");
		int y = Integer.parseInt(sc.nextLine());
		System.out.println("나이를 입력하시오.");
		int z = Integer.parseInt(sc.nextLine());
		double height = 0;
		
		height = (y / ((x-100)*0.9)) * 100;
		
		if(z>=20) {			//성인
			if(height >=150) {
				System.out.println("고도비만");
			} else if( height > 120) {
				System.out.println("비만");
			} else if( height > 110) {
				System.out.println("과체중");
			} else if( height > 100) {
				System.out.println("정상");
			} else {
				System.out.println("체중미달");
			} 
		} else {			//초중고교생
			
			if(height >=150) {
				System.out.println("고도비만");
			} else if( height > 130) {
				System.out.println("중도 비만");
			} else if( height > 120) {
				System.out.println("경도 비만");
			} else if( height > 95) {
				System.out.println("정상");
			} else {
				System.out.println("체중미달");
			} 
		}
		
		
		System.out.println();
		System.out.println("10번");
		System.out.println("1~4 번 중에 고르시오.");
		System.out.println("1. 목둘레 \n"
						 + "2. 가슴둘레\n"
						 + "3. 팔 길이\n"
						 + "4. 허리둘레\n");
		int input10 = Integer.parseInt(sc.nextLine());
		
		switch(input10) {
		case 1:
			System.out.println("목둘레 입력하시오.");
			int x1 = Integer.parseInt(sc.nextLine());
			if(x1 <45 && x1 >= 43) {
				System.out.println("XXL , 110이상");
			} else if( x1 <42 && x1 >= 41) {
				System.out.println("XL, 105~120");
			} else if( x1 <39 && x1 >= 38) {
				System.out.println("L, 100~105");
			} else if( x1 <37 && x1 >= 36) {
				System.out.println("M, 95~100");
			} else if( x1 <35 && x1 >= 33) {
				System.out.println("S,  90~95");
			} else {
				System.out.printf("범위안에 숫자를 입력해주세요.");
			}
			break;
		case 2:
			System.out.println("가슴둘레 입력하시오.");
			int y1 = Integer.parseInt(sc.nextLine());
			if(y1 <132 && y1 >= 127) {
				System.out.println("XXL , 110이상");
			} else if(y1 <122 && y1 >= 117) {
				System.out.println("XL, 105~120");
			} else if( y1 <112 && y1 >= 107) {
				System.out.println("L, 100~105");
			} else if( y1 <102 && y1 >= 96) {
				System.out.println("M, 95~100");
			} else if( y1 <86 && y1 >= 91) {
				System.out.println("S, 90~95");
			} else {
				System.out.printf("범위안에 숫자를 입력해주세요.");
			}
			break;
		case 3:
			System.out.println("팔둘레 입력하시오.");
			int z1 = Integer.parseInt(sc.nextLine());
			if( z1 <91 && z1 >= 89) {
				System.out.println("XXL , 110이상");
			} else if(z1 <89 && z1 >= 86) {
				System.out.println("XL, 105~120");
			} else if( z1 <86 && z1 >= 84) {
				System.out.println("L, 100~105");
			} else if( z1 <84 && z1 >= 81) {
				System.out.println("M, 95~100");
			} else if( z1 <78 && z1 >= 81) {
				System.out.println("S, 90~95");
			} else {
				System.out.printf("범위안에 숫자를 입력해주세요.");
			}
			break;
		case 4:
			System.out.println("허리둘레 입력하시오.");
			int v1 = Integer.parseInt(sc.nextLine());
			if( v1 <40 && v1 >= 38) {
				System.out.println("XXL , 110이상");
			} else if(v1 <37 && v1 >= 34) {
				System.out.println("XL, 105~120");
			} else if( v1 <34 && v1 >= 32) {
				System.out.println("L, 100~105");
			} else if( v1 <31 && v1 >= 30) {
				System.out.println("M, 95~100");
			} else if( v1 <29 && v1 >= 28) {
				System.out.println("S, 90~95");
			} else {
				System.out.printf("범위안에 숫자를 입력해주세요.");
			}
			break;
			default:
				System.out.println("잘못된 숫자 입력");
		}
		System.out.println();
		
		System.out.println("11번");
		System.out.println("첫 번째 수 입력.");
		int num1 = Integer.parseInt(sc.nextLine());
		System.out.println("연산자 선택.\n 1. + \n 2. -\n 3. *\n 4. /\n");
		String menu = sc.nextLine();
		System.out.println("두 번쨰 수 입력.");
		int num2 = Integer.parseInt(sc.nextLine());
		switch(menu) {
		case "+":
			System.out.printf("%d+%d=%d 입니다.\n", num1,num2,num1+num2);
			break;
		case "-":
			System.out.printf("%d-%d=%d 입니다.\n", num1,num2,num1-num2);
			break;
		case "*":
			System.out.printf("%d*%d=%d 입니다.\n", num1,num2,num1*num2);
			break;
		case "/":
			System.out.printf("%d/%d=%d 입니다.\n", num1,num2,num1/num2);
			break;
		}
		
		System.out.println();
		
		System.out.println("12번");
		System.out.println("가위 바위 보 중 하나 입력.");
		String input12 = sc.nextLine();
		
		int result12 =(int)(Math.random()*3 + 1);
		// 1 가위 	2바위 	3보
		switch(input12) {
		case "가위":
			if(result12==1) {
				System.out.println("비겼습니다.");
			} else if(result12==2) {
				System.out.println("졌습니다.");
			} else {
				System.out.println("이겼습니다.");
			}
			break;
		case "바위":
			if(result12==1) {
				System.out.println("이겼습니다.");
			} else if(result12==2) {
				System.out.println("비겼습니다.");
			} else {
				System.out.println("졌습니다.");
			}
			break;
		case "보":
			if(result12==1) {
				System.out.println("졌습니다.");
			} else if(result12==2) {
				System.out.println("이겼습니다.");
			} else {
				System.out.println("비겼습니다.");
			}
			break;
			default:
				System.out.println("가위 바위 보 를 입력하지 않음.");
		
		}
		System.out.println();
		
		System.out.println("13번");
		int x13 = (int)(Math.random()*5 +6);
		System.out.println(x13);
		System.out.println();
		
		System.out.println("14번");
		int x14 = (int)(Math.random()*45 +1);
		System.out.println(x14);
		System.out.println();
		
		System.out.println("15번");
		System.out.println("번 돈을 입력하시오.(만원단위)");
		int money = Integer.parseInt(sc.nextLine());
		if(money > 50000) {
			System.out.println(money*0.4+((money-50000)*0.42)+"(만원)");
		} else if(money >30000 && money <= 50000) {
			System.out.println(money*0.38+((money-30000)*0.4)+"(만원)");
		} else if(money >15000 && money <= 30000) {
			System.out.println(money*0.35+((money-15000)*0.38)+"(만원)");
		} else if(money >8800 && money <= 15000) {
			System.out.println(money*0.24+((money-8800)*0.35)+"(만원)");
		} else if(money >4600 && money <= 8800) {
			System.out.println(money*0.15+((money-4600)*0.24)+"(만원)");
		} else if(money >1200 && money <= 4600) {
			System.out.println(money*0.06+((money-1200)*0.15)+"(만원)");
		} else {
			System.out.println(money*0.06+"(만원)");
		}
		System.out.println();
		

	}

}
