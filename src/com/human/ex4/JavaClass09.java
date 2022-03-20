package com.human.ex4;
import java.util.*;
public class JavaClass09 {

	public static void main(String[] args) {
		System.out.println("문제1");
		int a[] = {1,2,3};
		
		for(int i=0; i<a.length;i++) {
			System.out.println("배열에 2를 더하기 전 값: " + a[i]);
			a[i] += 2;
			System.out.println("배열에 2를 더한 값: " + a[i]);
		}
		System.out.println();
		
		System.out.println("문제2");
		int a2[] = new int[10];
		for(int i=0; i<a2.length;i++) {
			a2[i] = 3*(i+1);
			System.out.printf("a2[%d]=%d\n",i,a2[i]);
		}
		System.out.println();
		
		System.out.println("문제3");
		int a3[] = new int[100];
		for(int i=1; i<a3.length;i++) {
			a3[i] = i;
			if(i%2==0) {
				System.out.println(a3[i]);
			}
		}
		System.out.println();
		
		System.out.println("문제4");
		int a4[] = {12,1,5,3,6,8,5,3};
		int sum4=0;
		for(int i=0; i<a4.length;i++) {
			sum4 += a4[i];
		}
		System.out.println(sum4);
		System.out.println();
		
		System.out.println("문제5");
		int sum5=0;
		int a5[] = {12,1,5,3,6,8,5,3};
		for(int i=0; i<a5.length;i++) {
			if(a5[i]%2==0) {
				sum5 += a5[i];
			}
		}
		System.out.println(sum5);
		System.out.println();
		
		int max = 0, min = 0;
		System.out.println("문제6");
		int a6[] = {12,1,5,3,6,8,5};
		for(int i=0;i<a6.length;i++) {
			if(max < a6[i]) {
				max = a6[i];
			}
		}
		min = a6[0];
		for(int i=0;i<a6.length;i++) {
			if(min > a6[i]) {
				min = a6[i];
			}
		}
		System.out.println("가장 큰 값: "+max);
		System.out.println("가장 작은 값: "+min);
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("문제37-1");
		int arr1[] = new int[5];
		for(int i=0;i<arr1.length;i++) {
			System.out.println("배열에 들어갈 숫자를 입력하시오.");
			arr1[i] = sc.nextInt();
		}
		System.out.println("인덱스를 입력하시오.");
		int num4 = sc.nextInt(); 
		System.out.printf("%d번째 인덱스에 들어 있는 수는 %d입니다.\n", num4,arr1[num4-1]);
		System.out.println();
		
		System.out.println("문제37-2");
		System.out.println("배열의 크기를 입력하시오.");
		int num2 = sc.nextInt();
		int arr2[] = new int[num2];
		int c=0;
		for(int i=0;i<num2;i++) {
			for(int j=1; j<4; j++) {
				if(c==num2) {
					break;
				} else {
					arr2[c] = j;
					c++;
				}
				
			}
			System.out.println(arr2[i]);
		}
		System.out.println();
		
		System.out.println("문제37-3");
		int arr3[] = {1,2,3,4};
		int count3 = arr3.length;
		int arr32[] = new int[(arr3.length)*2];
		for(int i=0; i< arr3.length;i++) {
			arr32[i] = arr3[i];
		}
		
		for(int i=arr3.length; i<arr32.length;i++) {
			--count3;
			arr32[i] =arr3[count3];
			
		}
		for(int i=0; i<arr32.length; i++) {
			System.out.printf("%2d",arr32[i]);
		}
		System.out.println();
		
		System.out.println();
		System.out.println("문제37-4");
		int arr4[] = new int[100];
		for(int i=1; i<=arr4.length; i++) {
			int dice = (int)(Math.random()*6+1);
			if(dice==1) {
				arr4[1] += 1; 
			} else if(dice==2) {
				arr4[2] += 1;
			} else if(dice==3) {
				arr4[3] += 1;
			} else if(dice==4) {
				arr4[4] += 1;
			} else if(dice==5) {
				arr4[5] += 1;
			} else {
				arr4[6] += 1;
			}
		}
		
		for(int i=1; i<=6; i++) {
			System.out.println(String.format("주사위 수%d : %d번 ", i, arr4[i]));
		}
		System.out.println();
	}

}
