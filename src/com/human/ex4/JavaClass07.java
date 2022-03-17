package com.human.ex4;
import java.util.*;
public class JavaClass07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("문제0.");
		
		int n1 = 3, n2 = 3, sum0 = 0;
		
		do {
			System.out.println(n1);
			n1++;
		} while(n1 < 11);
		
		while(n2 < 11) {
			System.out.println(n2);
			n2++;
		}
		
		for(int i = 3; i < 11; i++) {
			System.out.println(i);
		}
		
		for(int i = 9; i < 31; i++) {
			sum0 = sum0 + i;
		} System.out.println(sum0);
		System.out.println();
		
		System.out.println("문제1.");
		int a=2, b=1;
		b++;
		System.out.println(String.format("a=%d, b=%d", a, b));
		
		while(b<15) {
			a=a+1;
			b=b+a;
		}
		System.out.println(String.format("a=%d, b=%d", a, b));
		
		int a2=2;
		int b2=1;
		b2++;
		System.out.println(String.format("a2=%d, b2=%d", a2, b2));
		for(;b2<15; b++) {
			a2=a2+1;
			b2=b2+a2;
		}
		System.out.println(String.format("a2=%d, b2=%d", a2, b2));
		System.out.println();
		
		System.out.println("문제2.");
		System.out.println("100의 약수:");
		for(int i =1; i<101; i++) {
			if(100%i==0) {
				System.out.println(i);
			}
		}
		System.out.println();
		
		System.out.println("문제3.");	
		System.out.println("숫자를 입력하시오.");
		int input1 = Integer.parseInt(sc.nextLine());
		System.out.println("숫자를 입력하시오.");
		int input2 = Integer.parseInt(sc.nextLine());
		int min=0;
		if(input1 > input2) {
			min = input2;
		} else {
			min = input1;
		} for(int i=1; i <= min; i++) {
			if(input1%i==0 && input2%i==0) {
				System.out.println("공약수: " + i);
			}
		}
		
		System.out.println();
		System.out.println("문제4.");
		System.out.println("숫자를 입력하시오.");
		int input3 = Integer.parseInt(sc.nextLine());
		System.out.println("숫자를 입력하시오.");
		int input4 = Integer.parseInt(sc.nextLine());
		int min4=0;
		int max4=1;
		if(input3 > input4) {
			min4 = input4;
			for(int i=1; i <=min4; i++) {
				if(input3%i==0 && input4%i==0) {
					max4 = i;
				}
			}
		} else {
			min4 = input3;
			for(int i=1; i <=min4; i++) {
				if(input4%i==0 && input3%i==0) {
					max4 = i;		
				}
			}
		}
		System.out.println("최대공약수: " + max4);
		System.out.println();
		
		System.out.println("문제5.");
		int sum = 0;
		while(sum<=100) {
			System.out.println("숫자를 입력하시오.");
			int input5 = Integer.parseInt(sc.nextLine());
			sum = sum + input5;
		}
		System.out.println("100이 넘었습니다.");
		System.out.println();
		
		System.out.println("문제6.");
		int g6 = 0, b6 = 0;
		for(int i = 0; i< 3; i++) {
			System.out.println("1~10사이의 숫자를 3번 입력하시오.");
			int input6 = Integer.parseInt(sc.nextLine());
			if(input6>0&&input6<11) {
				g6++;
			} else {
				b6++;
			}
		}
		System.out.println(String.format("제대로 입력한 횟수: %d , 잘못 입력한 횟수: %d", g6, b6));
		System.out.println();
		
		System.out.println("문제7.");	
		System.out.println("첫번째 수를 입력하시오.");
		int input71 = Integer.parseInt(sc.nextLine());
		System.out.println("두번째 수를 입력하시오.");
		int input72 = Integer.parseInt(sc.nextLine());
		int min7=0;
		int max7=1;
		if(input71 > input72) {
			min7 = input72;
			for(int i=1; i <=min7; i++) {
				if(input71%i==0 && input72%i==0) {
					max7 = i;
				}
			}
		} else {
			min7 = input71;
			for(int i=1; i <=min7; i++) {
				if(input72%i==0 && input71%i==0) {
					max7 = i;		
				}
			}
		}
		System.out.println("최소공배수: " + (input71*input72)/max7);
		System.out.println();
		System.out.println();
		
		System.out.println("문제8.");	
		System.out.println("첫 번째 수를 입력하시오.");
		int input81 = Integer.parseInt(sc.nextLine());
		System.out.println("두 번째 수를 입력하시오.");
		int input82 = Integer.parseInt(sc.nextLine());
		System.out.println("세 번째 수를 입력하시오.");
		int input83 = Integer.parseInt(sc.nextLine());
		
		if( input81 > input82 && input81 > input83) {
			System.out.println(String.format("가장 큰수는 첫 번째 입력한 수: %d", input81));
		} else if(input82 > input81 && input82 > input83) {
			System.out.println(String.format("가장 큰수는 두 번째 입력한 수: %d", input82));
		} else if(input83 > input81 && input83 > input82) {
			System.out.println(String.format("가장 큰수는 세 번째 입력한 수: %d", input83));
		}
		if( input81 < input82 && input81 < input83) {
			System.out.println(String.format("가장 작은 수는 첫 번째 입력한 수: %d", input81));
		} else if(input82 < input81 && input82 < input83) {
			System.out.println(String.format("가장 작은 수는 두 번째 입력한 수: %d", input82));
		} else if(input83 < input81 && input83 < input82) {
			System.out.println(String.format("가장 작은 수는 세 번째 입력한 수: %d", input83));
		} 
		System.out.println();
		
		System.out.println("문제9.");
		
		int count = 0;
		for(int i=0; i< 5; i++) {
			System.out.println("수학과목 점수를 입력하시오.");
			int input9 = Integer.parseInt(sc.nextLine());
			if(input9 <= 60) {
			
				count++;
			}
		}
		System.out.println(String.format("탈락자는 %d명입니다.", count));
		System.out.println();

		System.out.println("10번");
		int sum10 = 0;
		for(int i=1; sum10<100; i++) {
			sum10 = sum10 + i;
			if(sum10 > 100) {
				break;
			}
			System.out.println(String.format("%d:%d", i,sum10));
		}
		System.out.println();
		
		System.out.println("11번");
		System.out.println("문자열을 입력하시오.");
		String str11 = sc.nextLine();
		System.out.println("숫자를 입력하시오.");
		int num11 =Integer.parseInt(sc.nextLine());
		int count11 = 0;
		while(count11 < num11) {
			System.out.println(str11);
			count11++;
		}
		System.out.println();
		
		System.out.println("12번"); 
		System.out.println("숫자를 입력하시오.");
		int a12 =Integer.parseInt(sc.nextLine());	// 큰 수
		System.out.println("숫자를 입력하시오.");
		int b12 =Integer.parseInt(sc.nextLine());	// 작은 수
		int sum12 = 0, tmp = 0;
		if(a12 < b12) {
			tmp = a12;
			a12 = b12;
			b12 = tmp;
		}
		int bb= 0;
		bb = a12 - b12;
		for(int i=1; i< bb; i++) {
			b12++;		
			sum12 += (b12);
				
		}
		System.out.println(String.format("두 수의 차이의 합은 %d", sum12));
		System.out.println();
		
		System.out.println("13번");
		int count13 = 0;
		System.out.println("숫자를 입력하시오.");
		int a13 =Integer.parseInt(sc.nextLine());
		for(int i=2; i< a13; i++) {
			if(a13%i==0) {
				count13++;
			}
		}
		if(a13 == 1) {
			System.out.println("1은 소수가 아닙니다.");
		}
		if(count13 > 0) {
			System.out.println("소수가 아닙니다.");
		} else if(a13!=1) {
			System.out.println("소수입니다.");
		}
		
		System.out.println();
		
		System.out.println("14번");			
		System.out.println("첫 번째 숫자를 입력하시오.");
		int a14 =Integer.parseInt(sc.nextLine());
		System.out.println("두 번째를 입력하시오.");
		int b14 =Integer.parseInt(sc.nextLine());
		int count14=0;
		while(count14<b14) {
			System.out.printf(a14+count14+" ");
			count14++;
		}
		
		System.out.println();
		
		System.out.println("15-1번");
		
		for(;;) {
			System.out.println("'종료'를 입력하시오.");
			String input15 = sc.nextLine();
			if(input15.equals("종료")){
				break;
			}
		}
		System.out.println("종료합니다.");
		System.out.println();
		System.out.println("15-2번");
		
		while(true) {
			System.out.println("'종료'를 입력하시오.");
			String input151 = sc.nextLine();

			if(input151.equals("종료")){
				break;
			}
		}
		System.out.println("종료합니다.");	
		System.out.println();
		
		System.out.println("15-3번");
		do {
			System.out.println("'종료'를 입력하시오.");
			String input153 = sc.nextLine();
			if(input153.equals("종료")){
				break;
			}
		} while(true);
		
		System.out.println("종료합니다.");	
		System.out.println();
		
		System.out.println("16번");
		System.out.println("숫자를 입력하시오.");
		int input16 =Integer.parseInt(sc.nextLine());
		for(int i=1; i < 10; i++) {
			System.out.println(String.format("%d X %d = %d", input16, i, input16*i));
		}
		System.out.println();
		
		System.out.println("17번");
		System.out.println("숫자를 입력하시오.");
		int input17 =Integer.parseInt(sc.nextLine());
		System.out.println(String.format("%d의 배수의 개수는 %d개이다.", input17, 1000/input17));
		System.out.println();
		
		System.out.println("18번");			//다시
		System.out.println("행을 입력하시오.");
		int a18 =Integer.parseInt(sc.nextLine());
		System.out.println("열 입력하시오.");
		int b18 =Integer.parseInt(sc.nextLine());
		for(int i=1; i<a18; i++) {
			for(int j=1; j<b18; j++) {
				System.out.println(j);
				if(b18==j) {
					break;
				}
			}
		}
		
		System.out.println("19번");
		int w = 0;
		int l =0;
		while(w < 3) {
			System.out.println("앞면이면 0 뒷면이면 1을입력하시오.");
			int input19 = Integer.parseInt(sc.nextLine());
			int coin = (int)(Math.random()*2);
			
			if(coin==input19) {
				System.out.println("맞췄습니다.");
				w++;
			}else {
				System.out.println("틀렸습니다.");
				l++;
			}
		}
		System.out.println(String.format("맞춘 횟수: %d, 틀린 횟수: %d", w, l));
		System.out.println();
		
		System.out.println("20번");
		int w2 = 0;
		int l2 =0;
		while(w2 < 10) {
			System.out.println("1~6중에 입력하시오(주사위).");
			int input20 = Integer.parseInt(sc.nextLine());
			int dice = (int)((Math.random()*6)+1);
			System.out.println(String.format("주사위의 수: %d", dice));
			if(dice==input20) {
				System.out.println("맞췄습니다.");
				
				w2++;
			}else {
				System.out.println("틀렸습니다.");
				l2++;
			}
		}
		System.out.println(String.format("맞춘 횟수: %d, 틀린 횟수: %d", w2, l2));
		System.out.println();
		
		System.out.println();
		
	}

}
