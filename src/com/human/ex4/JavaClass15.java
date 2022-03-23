package com.human.ex4;

public class JavaClass15 {

	public static void main(String[] args) {
	
		int arr[] = { 6, 5, 1,8, 7, 4, 2, 3};
//		for(int j=0; j<arr.length-1;j++) {
//			for(int i=0; i< arr.length-1;i++) {
//				if(arr[i]> arr[i+1]) {
//					int temp=arr[i];
//					arr[i] = arr[i+1];
//					arr[i+1] = temp;
//				}
//				//System.out.println(arr[i]+ ":"+arr[i+1]);
//			}
//			System.out.println(java.util.Arrays.toString(arr));
//		}
//	
//	
//		
//		for(int i=0;i<arr.length-1;i++) {
//			if(arr[i]>arr[i+1]) {
//				int temp=arr[i];
//				arr[i]=arr[i+1];
//				arr[i+1]=temp;
//			}
//		}
//		System.out.println(java.util.Arrays.toString(arr));
//		
		for(int i=7; i>0; i--) {
			int maxIndex=0;
			int selectIndex=i;
			for(int j=0; j<=selectIndex;j++) {
				if(arr[j] > arr[maxIndex]) {
					maxIndex=j;
				}
			}
		int temp=arr[maxIndex];			//±³È¯
		arr[maxIndex]=arr[selectIndex];
		arr[selectIndex]=temp;
		System.out.println(java.util.Arrays.toString(arr));
		}
		
	}

}
