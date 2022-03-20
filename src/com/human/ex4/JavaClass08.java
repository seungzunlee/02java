package com.human.ex4;
import java.util.*;
public class JavaClass08 {

	public static void main(String[] args) {
		int a=6, b=30;
		int i=1;
		boolean isFlag=true;
		int result=0;
		while(isFlag) {
			if(i%a==0 && i%b==0) {
				result=i;
				isFlag=false;
			}
			i++;
		}
		System.out.println(result);

		i=1;
		while(!(i%a==0&&i%b==0)) {
			i++;
		}
		System.out.println(i);
		//for, do while로 만들어보자.
		
		int result2=0;
		for(int j=1; j <=a*b ; j++) {
			if(j%a==0 && j%b==0) {
				result2=i;
			}
		}
		
		do {
			if(i%a==0 && i%b==0) {
				result=i;
				isFlag=false;
			}
		} while(isFlag);
	}

}
