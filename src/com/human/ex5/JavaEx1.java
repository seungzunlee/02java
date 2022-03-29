package com.human.ex5;
import java.util.*;
import com.human.ex5.*;
public class JavaEx1 {
	public static Scanner sc = new Scanner(System.in);
	public static void triangle1() {
		for(int i=1; i<7;i++) {
			for(int j=0; j<i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
	public static void triangle2() {
		for(int i=0; i<7;i++) {
			for(int j=6; j>i;j--) {
				System.out.print(" ");
			}
			for(int k=0; k<i;k++) {
				System.out.print("*");
			}
			System.out.println("");
		}
 	}
	public static void triangle3() {
		
	}
	public static void card() {
		String name = "leeseungzun";
		int pNumber = 92429999;
		String address = "Cheonan";
		System.out.println("이름: "+name);
		System.out.println("번호: "+pNumber);
		System.out.println("주소: "+address);
	}
	public static int plus(int[] arr) {
		int sum=0;
		for(int i=0; i<arr.length;i++) {
			sum += arr[i];
		}
		return sum;
	}
	public static void calendar() {		//달의 시작요일과 일수가 필요
		System.out.println("요일을 입력하시오.");
		String inputWeek = sc.nextLine();
		System.out.println("일수를 입력하시오.");
		int day = sc.nextInt();
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		switch(inputWeek) {
		case "일요일": 
			for( int i=1; i<=day; i++) {
				
				if(i%7==0) {
					System.out.printf("%d\n",i);
				} else {
					System.out.printf("%d\t",i);
				}
				
			}
			break;
		case "월요일":
			System.out.print("\t");
			for( int i=1; i<=day; i++) {			
				if(i%7==0) {
					System.out.printf("%d\t",i);
				} else {
					if(i%7==6) {
						System.out.printf("%d\t\n",i);
					}else {
						System.out.printf("%d\t",i);
					}
				}
			}
			break;
		case "화요일":
			System.out.print("\t\t");
			for( int i=1; i<=day; i++) {			
				if(i%7==0) {
					System.out.printf("%d\t",i);
				} else {
					if(i%7==5) {
						System.out.printf("%d\t\n",i);
					}else {
						System.out.printf("%d\t",i);
					}
				}
			}
			break;
		case "수요일":
			System.out.print("\t\t\t");
			for( int i=1; i<=day; i++) {			
				if(i%7==0) {
					System.out.printf("%d\t",i);
				} else {
					if(i%7==4) {
						System.out.printf("%d\t\n",i);
					}else {
						System.out.printf("%d\t",i);
					}
				}
			}
			break;
		case "목요일":
			System.out.print("\t\t\t\t");
			for( int i=1; i<=day; i++) {			
				if(i%7==0) {
					System.out.printf("%d\t",i);
				} else {
					if(i%7==3) {
						System.out.printf("%d\t\n",i);
					}else {
						System.out.printf("%d\t",i);
					}
				}
			}
			break;
		case "금요일":
			System.out.print("\t\t\t\t\t");
			for( int i=1; i<=day; i++) {			
				if(i%7==0) {
					System.out.printf("%d\t",i);
				} else {
					if(i%7==2) {
						System.out.printf("%d\t\n",i);
					}else {
						System.out.printf("%d\t",i);
					}
				}
			}
			break;
		case "토요일":
			System.out.print("\t\t\t\t\t\t");
			for( int i=1; i<=day; i++) {			
				if(i%7==0) {
					System.out.printf("%d\t",i);
				} else {
					if(i%7==1) {
						System.out.printf("%d\t\n",i);
					}else {
						System.out.printf("%d\t",i);
					}
				}
			}
			break;
			default:
				System.out.println("올바른 요일을 입력하시오.");
		}
	}
	
	public static Cat catFunc(Cat cat) {
		Cat rValue = cat;
		System.out.println(cat);
		rValue.age = 16;
		rValue.name = "벌";
		return rValue;
	}
	
	public static Cat intFunc(int a) {
		System.out.println(a);
		return a;
	}
	public static Cat doubleFunc(double a) {
		System.out.println(a);
		return a;
	}
	public static Cat StringFunc(String a) {
		System.out.println(a);
	}
	public static Cat intArrFunc() {
		
	}
	public Cat catObjectFunc() {
		
	}
	public static double circle(int r) {
		double result = (r*r)*3.141592;
		System.out.println("원의 넓이 :" + result);
		return result;
	}
	public static int square(int a, int b) {
		int result = a*b;
		System.out.println("사각형의 넓이 :" + result);
		return result;
	}
	public static int triangle(int a, int b) {
		int result = (a*b);
		System.out.println("삼각형의 넓이 :" + result);
		return result;
	}
	public static void gugudan(int a) {
		for(int i=1; i<10; i++) {
			System.out.printf("%d x %d = %d\n",a,i,a*i);
		}
	}

	public static void main(String[] args) {
		System.out.println("1번");
		triangle1();
		triangle2();
		triangle3();
		System.out.println();
		
		System.out.println("2번");
		card();
		System.out.println();
		
		System.out.println("3번");
		int[] arr ={1,2,3,4,5,6,7,8,9,10};
		int result3 = plus(arr);
		System.out.println(result3);
		System.out.println();
		
		System.out.println("4번");
		calendar();
		System.out.println();
		
		System.out.println("5번");
		com.human.ex5.Cat cat = new com.human.ex5.Cat(15, "나비");
		// Cat cat = new Cat(15,"나비"); 생략가능
		System.out.println(cat);
		System.out.println(catFunc(cat));
		System.out.println();
		
		System.out.println("6번");
		System.out.println("1.원, 2.사각형, 3.삼각형 중 입력");
		String input6 = sc.nextLine();
		switch(input6) {
		case "1":
			circle(4);
			break;
		case "2":
			square(4,4);
			break;
		case "3":
			triangle(10,4);
			break;
		}
		System.out.println(cat);
		
		System.out.println("7번");
		gugudan(7);
	}

}
