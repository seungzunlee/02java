package com.human.ex4;
import java.util.*;
public class JavaClass05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1-1
		for(int i=2; i<5; i++) {
			System.out.println("0"+(i-1));
		}
		System.out.println();
		//1-2
		for(int i=1; i<5; i++) {
			
			if(i==2) {
				System.out.println("0"+(i));
				i=i+2;
			} else if(i==3) {
				i++;
			}
			System.out.println("0"+(i));
			
		}
		System.out.println();
		//1-3-0
		for(int i=2; i<5; i++) {
			
			while(i==3) {
				i++;
			}
			System.out.println("0"+(i-1));
			
		}
		System.out.println();
		//1-3-1
		for(int i=2; i<5; i++) {
					
			while(i==5) {
				i++;
			}
			System.out.println("0"+(i-1));
					
		}
		System.out.println();
		//1-3-2
		for(int i=2; i<5; i++) {
					
			while(i==3) {
				for(int j=0; j<3; j++) {
					System.out.println("0"+(i-1));
				}
				
				i++;
			}
			System.out.println("0"+(i-1));
					
		}
		System.out.println();
		
		System.out.println("기찻길");
		for(int i=1; i<11; i++) {
			
			while(i==2) {
				System.out.println(i);
				i++;
			}
			while(i==4) {
				System.out.println(i);
				System.out.println(i+7);
				i++;
			}
			if(i==6) {
				System.out.println(i);
				i=i+3;
			}
			System.out.println(i);
		}
		System.out.println();
		
		System.out.println("2번");
		int a = 2;
		int b = 1;
		b++;
		System.out.println(String.format("a=%d, b=%d", a, b));
		while(b<15) {
			a = a+1;
			b = b+a;
			
		}
		System.out.println(String.format("a=%d, b=%d", a, b));
		System.out.println();

		System.out.println("문제3");
		int x = 1;
		while(x<10) {
			if(x==2) {
				for(int i=0; i<2; i++) {
					System.out.printf("p%d ",x);
				}
			}
			if(x>4) {
				if(x==5) {
					System.out.printf("p%d ",x);
					x=x+3;
				}
			} else if(x==6) {
				System.out.printf("p%d ",x);
				x = x+1;
			}
			System.out.printf("p%d ",x);
			x++;
		}
		System.out.println();
		
		
		System.out.println("4번");
		for(int i=1; i<4; i++) {
			System.out.println(i);
		}
		
		int num4 = 1;
		while(num4 <4) {
			System.out.println(num4);
			num4++;
		}
		System.out.println();
		
		System.out.println("5번");
		int num5=0;
		while(num5<3) {
			num5 += 1;
		}
		System.out.println(num5);
		System.out.println();
		
		System.out.println("6번");
		for(int i=3; i<11; i++) {
			System.out.println(i);
		}
		System.out.println();
		System.out.println("7번");
		int sum7= 0;
		for(int i=1; i<11; i++) {
			sum7 += i;
		}
		System.out.println(sum7);
		System.out.println();
		
		System.out.println("8번");
		int sum8= 0;
		for(int i=15; i<31; i++) {
			sum8 += i;
		}
		System.out.println(sum8);
		System.out.println();
		
		System.out.println("9번");
		Scanner sc = new Scanner(System.in);
		System.out.println("구구단의 단을 입력하시오. >>");
		int input9 = Integer.parseInt(sc.nextLine());
		
		for(int i=1; i <10; i++) {
			System.out.println(String.format("%d단 : %d X %d = %d", input9, input9, i, input9*i));
		}
		System.out.println();
		
		
		
	}

}
