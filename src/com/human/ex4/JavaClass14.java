package com.human.ex4;
import java.util.*;
class JavaClass14 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		//문제 1) 1~50까지의 짝수를 출력하는 코드를 만들어 보자.
		System.out.println("문제1)");
		for(int i=1; i<=50;i++) {
			System.out.print(i+" ");
		}
		System.out.println();
		//문제 2) 1~100사이의 10의 배수을 출력하는 코드를 만들어 보자.
		System.out.println("문제2)");
		for(int i=1;i<=100;i++) {
			if(i%10==0) {
				System.out.print(i+" ");
			}
		}
		System.out.println();
		//문제 3) 30~300까지의 6의 배수의 합을 출력하는 코드를 만들어 보자.
		System.out.println("문제3)");
		int sum3 = 0;
		for(int i=30;i<=300;i++) {
			if(i%3==0) {
				sum3 += i;
			}
		}
		System.out.println(sum3);
		System.out.println();
		//문제 4) 숫자를 하나 입력 받아 1부터 입력한 수까지 순서대로 화면에 출력 되도록 코드를만들어 보자
		System.out.println("문제4)");
		System.out.println("숫자를 입력하시오.");
		int input4 = sc.nextInt();
		for(int i=1; i<=input4;i++) {
			System.out.print(i+" ");
		}
		System.out.println();
		//문제 5) 사용자에게 두 수를 입력받아 두 수의 사이에 있는 모든 수를 오름차 순으로 
		//출력하는 순서도와 프로그램을 만들어 보자. 예)5 9 입력시 6 7 8 더한 결과를 얻음
		System.out.println("문제5)");
		System.out.println("첫 번째 숫자를 입력하시오.");
		int i51 = sc.nextInt();
		System.out.println("두 번째 숫자를 입력하시오.");
		int i52 = sc.nextInt();
		int sum5 = 0;
		if(i51>i52) {		//큰 수가 먼저 입력 될 때 교환.
			int tmp=0;
			tmp=i51;
			i51=i52;
			i52=i51;
		}
		for(int i=1;i<(i52-i51);i++) {
			System.out.println(i51+i);
			sum5 += (i51+i);
		}
		System.out.println("합: "+sum5);
		System.out.println();
		
		//문제 6) 두수를 입력 받아 사이에 있는 짝수를 화면에 오름차 순으로 출력 되도록 순서도와 프로그램을 만들어 보자.
		System.out.println("문제6)");
		System.out.println("첫 번째 숫자를 입력하시오.");
		int i61 = sc.nextInt();
		System.out.println("두 번째 숫자를 입력하시오.");
		int i62 = sc.nextInt();
		if(i61>i62) {		//큰 수가 먼저 입력 될 때 교환.
			int tmp=0;
			tmp=i61;
			i61=i62;
			i62=i61;
		}
		for(int i=1;i<(i62-i61);i++) {
			if((i61+i)%2==0) {
				System.out.println(i61+i);
			}
		}
		System.out.println();
		//문제 7) 1-2+3-4+5-6……+99-100의 결과를 구하는 프로그램을 작성해 보자.
		System.out.println("문제7)");
		int sum7 = 0;
		for(int i=1; i<=100;i++) {
			if(i%2==0) {
				sum7 += -i;
			} else {
				sum7 += i;
			}
		}
		System.out.println("합: " + sum7);
		System.out.println();
		//문제 8) 1/2+2/3+3/4+4/5+ 5/6+6/7+....+99/100의 결과를 구하는 프로그램을 작성해보자.
		System.out.println("문제8)");
		double sum8 = 0.0;
		for(int i=1;i<100;i++) {
			sum8 += ((double)i/(i+1)); 
		}
		System.out.println(sum8);
		System.out.println();
		//문제 9) 피보나치 수열을 10개를 순서대로 출력하는 프로그램을 작성해 보자. 피보나치
		//수열이 무엇인지는 웹사이트를 검색해서 스스로 알아보자.
		System.out.println("문제9)");
		int[] sum9 = new int[12];
		sum9[0] = 0;
		sum9[1] = 1;
		for(int i=0; i<10; i++) {
			sum9[i+2] = sum9[i] + sum9[i+1];
			System.out.println(sum9[i]);
		}
		
		System.out.println();
		//문제 10) 원하는 색의 전구와 밝기를 입력 받아 처리하는 프로그램을 만들어 보자. 
		System.out.println("문제10)");
		String color = "빨강"; 
		int	brightness = 50;
		
		System.out.println("전구의 색을 입력하시오.");
		String colorInput = sc.nextLine();
		if(colorInput.equals("빨강")||colorInput.equals("노랑")||colorInput.equals("파랑")) {
			color = colorInput;
		} else {
			System.out.println("전구의 색은 빨강, 노랑, 파랑으로 만 바꿀 수 있습니다.");
		}
		
		System.out.println("전구의 밝기를 입력하시오.");
		int brightnessInput = sc.nextInt();
		if(brightnessInput > brightness) {			//입력값이 클 때
			while(brightnessInput > brightness) {
				brightness += 1;
				System.out.println("밝기 +1:" +brightness);
			}
		} else if(brightnessInput==brightness) {		//같을 때
			System.out.println("밝기가 같습니다.");
		} else {
			while(brightnessInput < brightness) {
				brightness -= 1;
				System.out.println("밝기 -1:" +brightness);
			}
		}
		System.out.println("현재 색상은 "+color+" 밝기는 "+brightness+"이다");
		System.out.println();
		//문제 11) 1-2+3-4+5-6……+99-100의 결과를 구하는 순서도와 프로그램을 작성해 보자.
		System.out.println("문제11)");
		int sum11 = 0;
		for(int i=1; i<=100;i++) {
			if(i%2==0) {
				sum11 += -i;
			} else {
				sum11 += i;
			}
		}
		System.out.println(sum11);
		System.out.println();
		//문제 12) 1/2+2/3+3/4+4/5+ 5/6+6/7+....+99/100의 결과를 구하는 순서도와 프로그램을 작성해 보자.
		System.out.println("문제12)");
		double sum12 = 0.0;
		for(int i=1;i<100;i++) {
			sum12 += ((double)i/(i+1)); 
		}
		System.out.println(sum12);
		System.out.println();
		System.out.println();

		int count5 = 0;
		System.out.println("문제13)");
		for(int i=1; i<=25; i++) {
			
		}
		System.out.println();
		
		System.out.println("문제14)");
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
		System.out.println();
		//문제 15) 배열 1,2,3,4,5,6,7,8,9 에서 이동방향, 이동칸수, 채울수자를 입력 받아 배열의 내용을 변경후 출력해보자.
		System.out.println("문제15)");
		int arr1[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9};
		System.out.println("이동방향을 입력.(왼쪽, 오른쪽)");
		String way = sc.nextLine();
		System.out.println("이동칸 수 입력.");
		int wayNum = sc.nextInt();
		System.out.println("채울 숫자 입력.");
		int inputNum15 = sc.nextInt();
		if(way.equals("왼쪽")) {
			for(int i=0; i<9-wayNum; i++) {
				arr1[i] = arr1[wayNum+i];
			}
			for(int i=9-wayNum; i<9; i++) {
				arr1[i] = inputNum15;
			}
			for(int i=0; i<9; i++) {
				System.out.printf("%d ",arr1[i]);
			}
		} else if(way.equals("오른쪽")) {
			for(int i=8; i>=wayNum; i--) {
				arr1[i] = arr1[i-wayNum];
			}
			for(int i=0; i<wayNum; i++) {
				arr1[i] = inputNum15;
			}
			for(int i=0; i<9; i++) {
				System.out.printf("%d ",arr1[i]);
			}
		} 
		
		System.out.println();
		//문제 16)배열 1,2,3,4,5,6,7,8,9 에서 회전방향과 회수를 입력받아 배열 내용을 회전시키고 출력해보자.
		System.out.println("문제16)");
		int arr2[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9};
		int tmp2[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9};
		System.out.println("회전방향을 입력.(왼쪽, 오른쪽)");
		String way2 = sc.nextLine();
		System.out.println("회전 횟수 입력.");
		int wayNum2 = sc.nextInt();
		if(way2.equals("왼쪽")) {
			for(int i=0;i<9-wayNum2;i++) {
				arr2[i] = tmp2[i+wayNum2];
			}
			for(int i=0;i<wayNum2;i++) {
				arr2[9-wayNum2+i] = tmp2[i];
			}
			for(int i=0;i<9;i++) {
				System.out.printf("%d ",arr2[i]);
			}
		} else if(way2.equals("오른쪽")) {
			for(int i=0;i+wayNum2<9;i++) {
				arr2[wayNum2+i] = tmp2[i];
			}
			for(int i=0;i<wayNum2;i++) {
				arr2[i] = tmp2[9-wayNum2+i];
			}
			for(int i=0;i<9;i++) {
				System.out.printf("%d ",arr2[i]);
			}
			
		}
		System.out.println();
		//배열을 100개 선언하여 0~99까지 넣은 다음 i=2 부터 50까지 i를 제외한 i의
		//배수와 같은 인덱스에 0를 넣은 다음 배열에 0이 아닌 수를 출력해 보자.
		System.out.println("문제17)");
		int arr7[] = new int[100];
		for(int i=0; i<100;i++) {
			arr7[i] = i;
		}
		for(int i=2;i<50;i++) {
			for(int j=i+1;j<100;j++) {
				if(j%i==0) {
					arr7[j] = 0;
				}
			}
		}
		for(int i=0; i<100;i++) {
			if(arr7[i] != 0) {
				System.out.println(arr7[i]);
			}
		}
		System.out.println();
		

	}

}
