package com.human.ex3;

public class JavaClass01 {

	public static void main(String[] args) {
		
		System.out.println("0번");
		
		int arr0[] = { 53, 6, 85, 3, 5};
		
		for(int i=0; i<arr0.length; i++) {
			System.out.println(arr0[i]);
		}
		
		System.out.println();
		System.out.println("1번");
		
		int arr1[] = { 12, 1, 53, 6, 85, 3};
		int sum = 0;
		for(int i=0; i<arr1.length; i++) {
			sum += arr1[i];
		}
		System.out.println(sum);
		System.out.println();

		System.out.println("2번");
		int arr2[] = { 1, 2, 3};
		for(int i=0; i<arr2.length; i++) {
			arr2[i] = arr2[i] + 2;
			System.out.println(arr2[i]);
		}
		System.out.println();
		
		System.out.println("3번");
		int arr3[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		for(int i=0; i<arr3.length; i++) {
			if(arr3[i]%2 == 0) {
				System.out.println(arr3[i]);
			}
		}
		System.out.println();
		
		System.out.println("4번");
		int arr4[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		for(int i=0; i<arr4.length; i++) {
			if(i%2 == 1) {
				System.out.println(arr4[i]);
			}
		}
		
		System.out.println();
		
		
		
	}

}
