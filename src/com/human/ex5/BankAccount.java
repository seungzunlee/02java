package com.human.ex5;
import java.util.*;
public class BankAccount {
	//100의 id, pw, account 가 필요하여 배열을 사용
	public static String id[] = new String[100];
	public static String pw[] = new String[100];
	public static double account[] = new double[100];
	// 사용자 입력시 사용하는 변수들
	public static Scanner sc = new Scanner(System.in);
	public static String inputId = null;
	public static String inputPw = null;
	public static double inputAccount = 0;
	// 운영시 필요한 변수들
	public static int totalUserCount = 0;	//전체 가입한 유저 데이터 개수
	// 로그인 관련 변수들   // final은 해당 변수가 변경 불가능한 상수를 의미한다.
	public static final int LOGIN_LOG_OFF = 0;		//로그오프상태
	public static final int LOGIN_NORMAL_USER = 1;	//일반사용자로그인
	public static final int LOGIN_ADMIN_USER = 2;	//관리자 로그인
	//현재 로그인 상태저장 처음에는 로그오프상태이므로 LOGIN_LOG_OFF값을 가짐
	public static int loginState = BankAccount.LOGIN_LOG_OFF;
	public static int loginIndex = -1;		// 일반 로그인의 데이터가 있는
	//관리자 계정정보
	public static String adminId = "admin";
	public static String adminPw = "1111";
	//
	public static boolean isAdmin = true;
	public static boolean isUser = true;
	//은행 초기 데이터 3명의 계좌 정보입력
	public static void init() {
		id[0] = "user1";	id[1] = "user2";	id[2] = "user3";
		pw[0] = "user1";	pw[1] = "user2";	pw[2] = "user3";
		account[0] = 1000;	account[1] = 2000;	account[2] = 3000;
		totalUserCount = 3;
	}
	//사용자나 관리자로 로그인 하기
	public static void login() {
		while(loginState == BankAccount.LOGIN_LOG_OFF) {
			System.out.println("login");
			System.out.println("id>>");
			inputId = sc.nextLine();
			System.out.println("pw>>");
			inputPw = sc.nextLine();
			//일반 사용자 로그인
			boolean isFindId = false;
			for(int i=0; i<totalUserCount; i++) {
				if(id[i].equals(inputId)) {
					if(pw[i].equals(inputPw)) {
						System.out.println(id[i]+"님 로그인.");
						loginState = BankAccount.LOGIN_NORMAL_USER;
						loginIndex = i;
					} else {
						System.out.println("잘못된 비밀번호 입력");
					}
					isFindId= true;
					break;
				}
			}
			if(!isFindId) {
				if(adminId.equals(inputId)) {
					if(adminPw.equals(inputPw)) {
						System.out.println("admin으로 로그인");
						loginState = BankAccount.LOGIN_ADMIN_USER;
						isFindId= true;
						break;
					}else {
						System.out.println("잘못된 비밀번호 입력");
					}
				} 
			}
		}
	}
	//사용자가 사용할 메뉴
	public static void userMenu() {
		while(isUser) {		
			System.out.println("=========================================");
			System.out.println("1.입금 	 2.출금	 3.확인	 4.종료	 ");
			System.out.println("=========================================");
			String userMenu = sc.nextLine();
			switch(userMenu) {
			case "1":
				System.out.println("입금액 입력 >>");
				double deposit = sc.nextDouble();
				account[loginIndex] = deposit;
				System.out.println("잔액: "+account[loginIndex]);
				
				break;
			case "2":
				System.out.println("출금액 입력>>");
				double withd = sc.nextDouble();
				if(account[loginIndex]-withd > 0) {
					account[loginIndex] = (account[loginIndex] - withd);
					System.out.println("잔액: " + account[loginIndex]);
				} else {
					System.out.println("출금하려는 금액이 남은 금액보다 큽니다.");
				}
				break;
			case "3":
				System.out.println(id[loginIndex]+"님 잠액은: " +account[loginIndex]);
				break;
			case "4":
				System.out.println("사용자 메뉴 종료");
				BankAccount.loginState = BankAccount.LOGIN_LOG_OFF;
				isUser = false;
				break;
				
				default:
					System.out.println("올바르지 않은 메뉴 선택");
			}
		}
	}
	//관리자가 사용할 메뉴
	public static void adminMenu() {
		while(isAdmin) {		
			System.out.println("=========================================");
			System.out.println("1.계정추가  2.계정삭제 3.id변경 4.모든 사용자 출력 6.종료");
			System.out.println("=========================================");
			String adminMenu = sc.nextLine();
			switch(adminMenu) {
			case "1":
				System.out.println("계정추가");
				System.out.println("추가할 계정의 아이디>>");
				inputId = sc.nextLine();
				System.out.println("추가할 계정의 비밀번호>>");
				inputPw = sc.nextLine();
				id[BankAccount.totalUserCount] = inputId;
				pw[BankAccount.totalUserCount] = inputPw;
				account[BankAccount.totalUserCount] = 0.0;
				System.out.println(id[BankAccount.totalUserCount]+"계정생성");
				BankAccount.totalUserCount++;
				
				break;
			case "2":		//수정 필요
				System.out.println("계정삭제");
				System.out.println("삭제할 계정 입력>>");
				String delId = sc.nextLine();
				for(int i=0; i<totalUserCount; i++) {
					if(id[i].equals(delId)) {
						id[i] = null; pw[i] = null; account[i] = 0.0;
					}
				}
				BankAccount.totalUserCount--;
				break;
			case "3":
				System.out.println("id변경");
				System.out.println("변경할 아이디 입력>>");
				String findId = sc.nextLine();
				for(int i=0; i<totalUserCount;i++) {
					if(id[i].equals(findId)) {
						System.out.println("변경할 아이디 입력>>"); 
						String changeId = sc.nextLine();
						id[i] = changeId;
						System.out.println("변경할 비밀번호 입력>>");
						String changePw = sc.nextLine();
						pw[i] = changePw;
					}
				}
				break;
			case "4":
				for(int i=0; i<BankAccount.totalUserCount; i++) {
					System.out.println(i+"번째"+" id>>"+id[i]+" pw>>"+pw[i]+ " account>>" + account[i]);
				}
				break;
			case "6":
				System.out.println("관리자 메뉴 종료");
				BankAccount.loginState = BankAccount.LOGIN_LOG_OFF;
				isAdmin =false;
				break;
				
			default:
				System.out.println("올바르지 않은 메뉴 선택");
			}

		}
	}
	//은행 프로그램 시작 메소드
	public static void playBank() {
		boolean startMethod = true;
		while(startMethod) {
			login();
			switch(loginState) {
			case BankAccount.LOGIN_LOG_OFF:
				break;
			case BankAccount.LOGIN_NORMAL_USER:
				userMenu();
				break;
			case BankAccount.LOGIN_ADMIN_USER:
				adminMenu();
				break;
			default:
				break;
			}
			System.out.println("초기화면으로 돌아가시겠습니까? true or false");
			startMethod = Boolean.parseBoolean(sc.nextLine());
		}
	}

	//메인
	public static void main(String[] args) {
		init();
		playBank();
		System.out.println("프로그램 종료");
		
	}	

}
