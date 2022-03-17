package com.human.ex4;

public class JavaClass06 {

	public static void main(String[] args) {
		// if
		if(5>3) {
			System.out.println("true");
		} 
		//if-else
		if(4>1) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		int a=2;
		if(a==1) {
			System.out.println("1");
		} else if(a==2) {
			System.out.println("2");
		} else if(a==2) {
			System.out.println("2");
		} else {
			
		}
		//switch
		switch(a) {
		case 1:
			System.out.println("1");
			break;
		case 2:
			System.out.println("2");
		case 3:
			System.out.println("3");
			break;
			default:
				System.out.println("4");
		}
		// for
		// for(초기식; 조건식; 증감식;){}
		// 초기식: 조건식의 변수를 초기화하는 식
		// 조건식: for문의 반복 유무를 결정하는 식
		// 증감식: 조건식의 변수를 증감하는 식
		// 1~10까지의 합
		int sum=0;
		for(int i=0; i<10; i++) {
			if(i%2==0) {
			sum=sum+i;
			}
		}
		System.out.println(sum);
		
		// while
		// 초기식
		// while(조건식) {
		// 증감식
		// }
		int sum2=0;
		int i=0;
		while(i<10) {
			if(i%2==0) {
			sum2 += i;
			}
			i++;
		}
		System.out.println(sum2);
		
		// do while ====> 반드시 한번 출력
		// 초기식
		// do{
		// 		반복문
		// 		증감식
		// } while(조건식);
		
		int sum3=0;
		int i2=1;
		do {
			if(i2%2==0) {
				sum3 += i2;
			}
			i2++;
		}while(i2<10);
		System.out.println(sum3);
		

	}

}
