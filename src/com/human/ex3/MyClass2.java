package com.human.ex3;
import java.util.*;
public class MyClass2 {

	public static void main(String[] args) {
		int arr1[] = new int[5];
		int []arr2 = new int[5];
		int []arr3;
		arr3 = new int[5];
		int arr4[] = { 0, 0, 0, 0, 0};
		
		arr1[0] = 10;
		arr1[1] = 20;
		arr1[2] = 30;
		arr1[3] = 40;
		arr1[4] = 50;
//		arr1[5] = 60;
		for(int i=0; i < arr1.length; i++) {
		System.out.println(arr1[i]);
		}
		//arr1[인덱스] 이런 형태 하나가 변수 하나랑 동일함
		int sum=arr1[1] + arr1[4] + 10;
		arr1[0] = arr1[1] + arr1[2];
		//
		arr2[0]=arr2[0]; arr2[1]=arr2[1]; arr2[2]=arr2[2]; arr2[3]=arr2[3]; arr2[4]=arr2[4];
		
		System.out.println(arr2[0]);
		System.out.println(Arrays.toString(arr1));
		
		double arrDouble[] = new double[3];
		arrDouble[0] = 1.1;
		arrDouble[1] = 1.2;
		arrDouble[2] = 1.3;
		System.out.println(Arrays.toString(arrDouble));
		
		Human arrHuman[] = new Human[3];
		arrHuman[0] = new Human("홍길동", 20, 188);
		arrHuman[0].age = 10;					//Null Point Exception

	}

}
