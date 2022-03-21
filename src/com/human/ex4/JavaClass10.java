package com.human.ex4;
import java.util.*;
public class JavaClass10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//문제 0) 50명의 학생의 출석 사항을 처리하는 프로그램을 만들어 보자.
		boolean student[] = new boolean[50];
		while(true) {
			System.out.println("메뉴를 선택하시오.");
			System.out.println("=============================================");
			System.out.println("1.전체 출석사항 2.결석자 추가 3.출석자 추가 6.프로그램 종료");
			System.out.println("=============================================");
			int menu = sc.nextInt();
			switch(menu) {
			case 1:
				System.out.println("1. 전체 출석사항");
				for(int i=0;i<student.length;i++) {
					System.out.printf("%d번. %b%n", i+1, student[i]);
				}
				continue;
			case 2:
				System.out.println("2. 결석자 추가");
				System.out.println("결석할 번호를 입력하시오.");
				int co = sc.nextInt();
				student[(co-1)] = false;
				continue;
			case 3:
				System.out.println("3. 출석자 추가");
				System.out.println("출석할 번호를 입력하시오.");
				int ci = sc.nextInt();
				student[(ci-1)] = true;
				continue;
			case 6:
				System.out.println("6. 프로그램 종료");
				return;
				
				default:
					System.out.println("잘못된 숫자 입력.");
			}
				
		}
		//문제 1) 은행 프로그램을 순서도와 프로그래밍 언어로 만들어보자.
		int account = 0;
		while(true) {
			System.out.println("1번 은행 프로그램.");
			System.out.println("메뉴를 선택하시오.");
			System.out.println("===================================");
			System.out.println("전체메뉴: 1.입금  2.출금  3.조회  0.종료");
			System.out.println("===================================");
			int menu2 = sc.nextInt();
			
			switch(menu2) {
			case 1:
				System.out.println("1. 입금");
				System.out.println("===================================");
				System.out.println("입금할 돈을 입력하시오(원 단위)");
				int plus = sc.nextInt();
				System.out.println(plus +"원 입금합니다.");
				account += plus;
				System.out.println("계좌에 남은 돈:"+ account +"원");
				break;
			case 2:
				System.out.println("2. 출금");
				System.out.println("출금할 돈을 입력하시오(원 단위)");
				int minus = sc.nextInt();
				account -= minus;
				System.out.println("계좌에 남은 돈:"+ account +"원");
				break;
			case 3:
				System.out.println("3. 조회");
					System.out.println(account +"원");
				break;
			case 0:
				System.out.println("0. 종료");
				return;
				default:
					System.out.println("잘못된 숫자 입력.");
					
			}
		}
		//문제 2) 금액을 입력받아 천원, 오백원, 백원, 오십원, 십원 짜리 잔돈으로 거슬러주는 프로그램과 순서도을 구현해 보자.
		int change1000 = 0, change500 = 0, change100 = 0, change50 =0, change10 = 0;
		while(true) {
			System.out.println("2번 잔돈 프로그램.");
			System.out.println("==============");
			System.out.println("잔돈을 입력하시오.");
			System.out.println("==============");
			int moneyInput = sc.nextInt();
			change1000 = moneyInput/1000;
			change500 = (moneyInput%1000)/500;
			change100 = (moneyInput%1000%500)/100;
			change50 = (moneyInput%1000%500%100)/50;
			change10 = (moneyInput%1000%500%100%50)/10;
			if(moneyInput >= 1000) {
				System.out.println("천원짜리 "+change1000+"개, 오백원짜리" +change500+"개, 백원짜리" 
			+ change100+"개, 오십원짜리" + change50 + "개, 십원짜리" +change10 + "개");
			} else if(moneyInput >= 500) {
				System.out.println("천원짜리 "+change1000+"개, 오백원짜리" +change500+"개, 백원짜리" 
						+ change100+"개, 오십원짜리" + change50 + "개, 십원짜리" +change10 + "개");
			} else if(moneyInput >= 100) {
				System.out.println("천원짜리 "+change1000+"개, 오백원짜리" +change500+"개, 백원짜리" 
						+ change100+"개, 오십원짜리" + change50 + "개, 십원짜리" +change10 + "개");
			} else if(moneyInput >= 50) {
				System.out.println("천원짜리 "+change1000+"개, 오백원짜리" +change500+"개, 백원짜리" 
						+ change100+"개, 오십원짜리" + change50 + "개, 십원짜리" +change10 + "개");
			} else if(moneyInput > 10) {
				System.out.println("천원짜리 "+change1000+"개, 오백원짜리" +change500+"개, 백원짜리" 
						+ change100+"개, 오십원짜리" + change50 + "개, 십원짜리" +change10 + "개");
			} else if(moneyInput <=10) {
				System.out.println("10원 이하는 입력받지 않습니다.");
			}
		}
		//문제 3) 실존하는 자판기와 동일하게 만들어 보자.

		int cid =0, cok=0, pan =0;
		int changeB = 0,changeB1000 = 0, changeB500 = 0, changeB100 = 0, changeB50 =0;
		System.out.println("3번. 자판기 ");
		while(true) {
			System.out.printf("남은 돈 %d원%n", changeB);
			System.out.println("=======================================================");
			System.out.println("메뉴: 1.사이다 (700) 2.콜라 (500) 3.환타 (350) 4.1000원투입 5.500원투입 6.100원투입 "
					+ "7.50원 투입  8.반환");
			System.out.printf("음료반환구에 사이다 %d개 콜라 %d개 환타 %d개가 있음", cid, cok, pan);
			System.out.println("=======================================================");
			int menu3 = sc.nextInt();
			
			switch(menu3) {
			case 1:
				if(changeB < 700) {
					System.out.printf("남은 돈 %d원%n", changeB);
					System.out.println("돈을 더 투입해주세요.");
				} else {
					cid += 1;
					changeB -= 700;
				}
				break;
			case 2:
				
				if(changeB < 500) {
					System.out.printf("남은 돈 %d원%n", changeB);
					System.out.println("돈을 더 투입해주세요.");
				} else {
					cok += 1;
					changeB -= 500;
				}
				break;
			case 3:
				if(changeB < 350) {
					System.out.printf("남은 돈 %d원%n", changeB);
					System.out.println("돈을 더 투입해주세요.");
				} else {
					pan += 1;
					changeB -= 350;
				}
				break;
			case 4:
				System.out.println("1000원 투입.");
				changeB += 1000;
				break;
			case 5: 
				System.out.println("500원 투입.");
				changeB += 500;
				break;
			case 6:
				System.out.println("100원 투입.");
				changeB += 100;
				break;
			case 7:
				System.out.println("50원 투입.");
				changeB += 50;
				break;
			case 8:
				System.out.println("반환.");
				changeB1000 = changeB/1000;
				changeB500 = (changeB%1000)/500;
				changeB100 = (changeB%1000%500)/100;
				changeB50 = (changeB%1000%500%100)/50;
				if(changeB >= 1000) {
					System.out.println("천원짜리 "+changeB1000+"개, 오백원짜리" +changeB500+"개, 백원짜리" 
				+ changeB100+"개, 오십원짜리" + changeB50 + "개");
				} else if(changeB >= 500) {
					System.out.println("천원짜리 "+changeB1000+"개, 오백원짜리" +changeB500+"개, 백원짜리" 
							+ changeB100+"개, 오십원짜리" + changeB50 + "개");
				} else if(changeB >= 100) {
					System.out.println("천원짜리 "+changeB1000+"개, 오백원짜리" +changeB500+"개, 백원짜리" 
							+ changeB100+"개, 오십원짜리" + changeB50 + "개");
				} else if(changeB >= 50) {
					System.out.println("천원짜리 "+changeB1000+"개, 오백원짜리" +changeB500+"개, 백원짜리" 
							+ changeB100+"개, 오십원짜리" + changeB50 + "개");
				} 
				changeB = 0;
				break;
			case 0:
				System.out.println("종료.");
				break;
				default:
					System.out.println("잘못된 메뉴 입력.");
			}	
		}
		
	//문제 4) 369게임 해답지를 만들어 보자.
		
		for(int i=1;i<=1000; i++) {
			if(((i/100) == 3) ||((i/100) == 6) ||((i/100) == 9)) {			//100의자리 369
				if(((i/10)%10) == 3 ||((i/10)%10 == 6) ||((i/10)%10 == 9)) {//10의자리 369
					if(i%10 == 3 || i%10==6 || i%10 ==9) {//1의 자리 369
						System.out.println("짝짝짝");		//ooo
					} else {
						System.out.println("짝짝");		//oox
					}
					
				} else {//10의 자리가 369일 때의 else
					if((i/10)%10 == 3 || (i/10)%10==6 || (i/10)%10 ==9) {//oxo or oxx
						System.out.println("짝짝");		//oxo
					} else {
						System.out.println("짝");		//oxx
					}
					
				}	
			} else if(((i/10)%10) == 3 ||((i/10)%10 == 6) ||((i/10)%10 == 9)) {//100의 자리369 x 10의 자리369 o
				if(i%10 == 3 || i%10 == 6 || i%10 == 9) {
					System.out.println("짝짝"); 	//xoo
				} else {
					System.out.println("짝");	//xox
				}
			} else if(i%10 == 3 || i%10==6 || i%10 ==9) {
				System.out.println("짝");		//xxo
			} else {
				System.out.println(i);			//xxx
			}
		
			
		}	//for문의 끝
		
	//문제 5) 랜덤하게 덧셈,뺄셈,곱셈,나눗셈 문제를 내서 사용자가 맞추는 프로그램을 구현해보자.
		int level = 1;
		boolean bool  = true;
		int userAnswer = 0;
		int result = 0;
		while(bool) {
			int ranNum1 = (int)(Math.random()*10+1);
			int ranNum2 = (int)(Math.random()*10+1);
			System.out.println("문제 시작.");
			System.out.println("===================================================");
			switch(level) {
			case 1:
				System.out.println("레벨 1: 덧셈");
				result = ranNum1 + ranNum2;
				System.out.printf("%d + %d = ?%n", ranNum1, ranNum2);
				userAnswer = sc.nextInt();
				if(userAnswer == result) {
					System.out.println("정답입니다.");
					level ++;
				} else {
					System.out.println("틀렸습니다.");
				}
				break;
			case 2:
				System.out.println("레벨 2: 뺄셈");
				result = ranNum1 - ranNum2;
				System.out.printf("%d - %d = ?%n", ranNum1, ranNum2);
				userAnswer = sc.nextInt();
				if(userAnswer == result) {
					System.out.println("정답입니다.");
					level ++;
				} else {
					System.out.println("틀렸습니다.");
				}
				break;
			case 3:
				System.out.println("레벨 3: 곱셈");
				result = ranNum1 * ranNum2;
				System.out.printf("%d * %d = ?%n", ranNum1, ranNum2);
				userAnswer = sc.nextInt();
				if(userAnswer == result) {
					System.out.println("정답입니다.");
					level ++;
				} else {
					System.out.println("틀렸습니다.");
				}
				break;
			case 4:
				System.out.println("레벨 4: 나눗셈");
				result = ranNum1 / ranNum2;
				System.out.printf("%d / %d = ?%n", ranNum1, ranNum2);
				userAnswer = sc.nextInt();
				if(userAnswer == result) {
					System.out.println("정답입니다.");
					level ++;
				} else {
					System.out.println("틀렸습니다.");
				}
				break;
				default:
					System.out.println("모든 문제를 맞췄습니다.");
					bool = false;
			}
		}
	//문제 6)아래표를 이용해서 요금 계산하는 프로그램을 구현해보자.
		int everCount = 0;
		while(true) {
			System.out.println("===================================================");
			System.out.println("1.대인   2.청소년  3.소인/경로  4. 총 합계");
			System.out.println("===================================================");
			int personSize = sc.nextInt();
			switch(personSize) {
			case 1:
				System.out.println("===================================================");
				System.out.println("1.주간권(1일권) 2.오후권(오후 3시) 3.윈터 야간권(오후 5시~) 4.2일권");
				System.out.println("===================================================");
				int big = sc. nextInt();
				switch(big) {
				case 1:
					System.out.println("대인 주간권(1일권)은 46,000원입니다.");
					everCount += 46000;
					break;
				case 2:
					System.out.println("대인 오후권(오후 3시)은 38,000입니다.");
					everCount += 38000;
					break;
				case 3:
					System.out.println("대인 윈터 야간권(오후 5시~)은 20,000원입니다.");
					everCount += 20000;
					break;
				case 4:
					System.out.println("대인 2일권은 74,000원입니다.");
					everCount += 74000;
					break;
				}
				break;
			case 2:
				System.out.println("===================================================");
				System.out.println("1.주간권(1일권) 2.오후권(오후 3시) 3.윈터 야간권(오후 5시~) 4.2일권");
				System.out.println("===================================================");
				int mid = sc.nextInt();
				switch(mid) {
				case 1:
					System.out.println("청소년 주간권(1일권)은 39,000원입니다.");
					everCount += 39000;
					break;
				case 2:
					System.out.println("청소년 오후권(오후 3시)은 32,000입니다.");
					everCount += 32000;
					break;
				case 3:
					System.out.println("청소년 윈터 야간권(오후 5시~)은 17,000원입니다.");
					everCount += 17000;
					break;
				case 4:
					System.out.println("청소년 2일권은 62,000원입니다.");
					everCount += 62000;
					break;
				}
				break;
			case 3:
				System.out.println("===================================================");
				System.out.println("1.주간권(1일권) 2.오후권(오후 3시) 3.윈터 야간권(오후 5시~) 4.2일권");
				System.out.println("===================================================");
				int sma = sc.nextInt();
				switch(sma) {
				case 1:
					System.out.println("소인 주간권(1일권)은 36,000원입니다.");
					everCount += 36000;
					break;
				case 2:
					System.out.println("소인 오후권(오후 3시)은 29,000입니다.");
					everCount += 29000;
					break;
				case 3:
					System.out.println("소인 윈터 야간권(오후 5시~)은 19,000원입니다.");
					everCount += 19000;
					break;
				case 4:
					System.out.println("소인 2일권은 58,000원입니다.");
					everCount += 58000;
					break;
				}
				break;
			case 4:
				System.out.println("총합계는: " + everCount + "원입니다.");
				break;
				default:
					System.out.println("잘못된 숫자 입력.");
			}
		}
		
	//문제 7)컴퓨터가 임의로 정한 하나의 숫자를 맞추는 프로그램을 만들어 보자.(up-down)
		int userNum = 0;
		boolean gamebool = true;
		int comNum = (int)(Math.random()*100);
		while(gamebool) {
			System.out.println("0부터 100미만의 숫자를 입력하시오.");
			userNum = sc.nextInt();
			if(userNum > comNum) {
				System.out.println("다운");
			} else if (userNum < comNum) {
				System.out.println("업");
			} else {
				System.out.println("정답");
				gamebool = false;
			}
		}
	}

}
