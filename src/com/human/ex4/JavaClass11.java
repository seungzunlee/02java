package com.human.ex4;

public class JavaClass11 {

	public static void main(String[] args) {
		int num1 = 11;
		System.out.println("11");		//1번
	
		if(num1>5) {
			System.out.println("12");
			if(num1>7) {
				System.out.println("03");
			} else {
				System.out.println("02");
			}
			System.out.println("04");
			
			if(num1>9){
				System.out.println("06");
			} else {
				System.out.println("05");
			}
			System.out.println("07");
		} else {
			System.out.println("13");
			System.out.println("05");
			
		}
		System.out.println("14");
		
		//2번
		int num2 = 11;
		if(num2==11) {
			System.out.println("11");
			System.out.println("13");
			while(num2==10) {
				System.out.println("14");
				num2++;
			}
			System.out.println("15");
		} else {
			System.out.println("12");
			System.out.println("16");
			
		}
		System.out.println("17");

		//3번
		int num3  = 11;
		System.out.println("01");
		if(num3>10) {
			System.out.println("02");
			while(num3==11) {
				System.out.println("04");
				num3++;
			}
			System.out.println("06");
		} else {
			System.out.println("03");
		}
		System.out.println("07");
		
		//4번
		int num4 = 11;
		System.out.println("01");
		if(num4>10) {
			System.out.println("03");
			if(num4==11) {
				System.out.println("06");
			} else {
				System.out.println("07");
				while(num4>7) {
					System.out.println("13");
					while(num4 > 10) {
						System.out.println("07");
					}
					System.out.println("12");
					System.out.println("11");
				}
				System.out.println("12");
			}
			System.out.println("09");
		} else {
			System.out.println("02");
			while(num4 < 4) {
				System.out.println("04");
			}
			System.out.println("05");
			System.out.println("08");
		}
		
		System.out.println("10");
		//5번
		int num5 = 10;
		System.out.println("1");
		if(num5>5) {
			System.out.println("3");
			System.out.println("4");
		} else {
			while(num5<3) {
				System.out.println("6");
			}
			System.out.println("8");
		}
		System.out.println("5");
		System.out.println("7");
		if(num5>6) {
			System.out.println("11");
			while(num5==7) {
				System.out.println("12");
			}
			System.out.println("13");
		}else {
			System.out.println("16");
		}
		System.out.println("13");
		while(num5>11) {
			System.out.println("17");
			if(num5>12) {
				System.out.println("22");
				
			} else {
				System.out.println("21");
			}
			
			System.out.println("18");	
		}
		
		System.out.println("19");
		
		
	}

}
