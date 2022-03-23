package com.human.ex4;
import java.util.*;
public class JavaClass16 {

	public static void main(String[] args) {
		int arr[] = { 6, 5, 1,8, 7, 4, 2, 3};
		
		for(int i=0; i<arr.length-1; i++) {
			int minIndex = i;
			for(int j=i+1; j<arr.length;j++) {
				if(arr[minIndex] > arr[j]) {
					minIndex =j;
				}
			}
			System.out.println(Arrays.toString(arr));
			//탐색이 완료되면 가장 작은 값을 가장 앞의 값과 교환
			int temp = arr[minIndex];
			arr[minIndex] = arr[i];
			arr[i] = temp;
			System.out.println(Arrays.toString(arr));
		}
		System.out.println(Arrays.toString(arr));

	}

}
