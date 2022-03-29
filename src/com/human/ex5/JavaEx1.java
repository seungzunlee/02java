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
		System.out.println("�̸�: "+name);
		System.out.println("��ȣ: "+pNumber);
		System.out.println("�ּ�: "+address);
	}
	public static int plus(int[] arr) {
		int sum=0;
		for(int i=0; i<arr.length;i++) {
			sum += arr[i];
		}
		return sum;
	}
	public static void calendar() {		//���� ���ۿ��ϰ� �ϼ��� �ʿ�
		System.out.println("������ �Է��Ͻÿ�.");
		String inputWeek = sc.nextLine();
		System.out.println("�ϼ��� �Է��Ͻÿ�.");
		int day = sc.nextInt();
		System.out.println("��\t��\tȭ\t��\t��\t��\t��");
		switch(inputWeek) {
		case "�Ͽ���": 
			for( int i=1; i<=day; i++) {
				
				if(i%7==0) {
					System.out.printf("%d\n",i);
				} else {
					System.out.printf("%d\t",i);
				}
				
			}
			break;
		case "������":
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
		case "ȭ����":
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
		case "������":
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
		case "�����":
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
		case "�ݿ���":
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
		case "�����":
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
				System.out.println("�ùٸ� ������ �Է��Ͻÿ�.");
		}
	}
	
	public static Cat catFunc(Cat cat) {
		Cat rValue = cat;
		System.out.println(cat);
		rValue.age = 16;
		rValue.name = "��";
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
		System.out.println("���� ���� :" + result);
		return result;
	}
	public static int square(int a, int b) {
		int result = a*b;
		System.out.println("�簢���� ���� :" + result);
		return result;
	}
	public static int triangle(int a, int b) {
		int result = (a*b);
		System.out.println("�ﰢ���� ���� :" + result);
		return result;
	}
	public static void gugudan(int a) {
		for(int i=1; i<10; i++) {
			System.out.printf("%d x %d = %d\n",a,i,a*i);
		}
	}

	public static void main(String[] args) {
		System.out.println("1��");
		triangle1();
		triangle2();
		triangle3();
		System.out.println();
		
		System.out.println("2��");
		card();
		System.out.println();
		
		System.out.println("3��");
		int[] arr ={1,2,3,4,5,6,7,8,9,10};
		int result3 = plus(arr);
		System.out.println(result3);
		System.out.println();
		
		System.out.println("4��");
		calendar();
		System.out.println();
		
		System.out.println("5��");
		com.human.ex5.Cat cat = new com.human.ex5.Cat(15, "����");
		// Cat cat = new Cat(15,"����"); ��������
		System.out.println(cat);
		System.out.println(catFunc(cat));
		System.out.println();
		
		System.out.println("6��");
		System.out.println("1.��, 2.�簢��, 3.�ﰢ�� �� �Է�");
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
		
		System.out.println("7��");
		gugudan(7);
	}

}
