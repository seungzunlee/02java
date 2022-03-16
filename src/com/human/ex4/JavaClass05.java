package com.human.ex4;

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
			
			if(i==3) {
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
		
		System.out.println("2번");
		int a = 2;
		int b = 1;
		b++;
		System.out.println(String.format("a=%d, b=%d", a, b));
		while(b<15) {
			a += 1;
			b = b+a;
		}
		System.out.println(String.format("a=%d, b=%d", a, b));
		System.out.println();

//		System.out.println("문제3");
//		int p=1;
//		while(p==2) {
//			System.out.println(p);
//			p++;
//		}
//		System.out.println(p);
//		while(p < 8) {
//			if(p < 6) {
//				p++;
//				System.out.println(p);
//			} else {
//				++p;
//				System.out.println(p);
//				
//			}
//		}
//		p++;
//		System.out.println(p);
//		System.out.println();
		
		System.out.println("4번");
		
		System.out.println();
		
	}

}
