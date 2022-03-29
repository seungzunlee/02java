package com.human.ex5;
import java.util.*;
public class BankAccount {
	//100�� id, pw, account �� �ʿ��Ͽ� �迭�� ���
	public static String id[] = new String[100];
	public static String pw[] = new String[100];
	public static double account[] = new double[100];
	// ����� �Է½� ����ϴ� ������
	public static Scanner sc = new Scanner(System.in);
	public static String inputId = null;
	public static String inputPw = null;
	public static double inputAccount = 0;
	// ��� �ʿ��� ������
	public static int totalUserCount = 0;	//��ü ������ ���� ������ ����
	// �α��� ���� ������   // final�� �ش� ������ ���� �Ұ����� ����� �ǹ��Ѵ�.
	public static final int LOGIN_LOG_OFF = 0;		//�α׿�������
	public static final int LOGIN_NORMAL_USER = 1;	//�Ϲݻ���ڷα���
	public static final int LOGIN_ADMIN_USER = 2;	//������ �α���
	//���� �α��� �������� ó������ �α׿��������̹Ƿ� LOGIN_LOG_OFF���� ����
	public static int loginState = BankAccount.LOGIN_LOG_OFF;
	public static int loginIndex = -1;		// �Ϲ� �α����� �����Ͱ� �ִ�
	//������ ��������
	public static String adminId = "admin";
	public static String adminPw = "1111";
	//
	public static boolean isAdmin = true;
	public static boolean isUser = true;
	//���� �ʱ� ������ 3���� ���� �����Է�
	public static void init() {
		id[0] = "user1";	id[1] = "user2";	id[2] = "user3";
		pw[0] = "user1";	pw[1] = "user2";	pw[2] = "user3";
		account[0] = 1000;	account[1] = 2000;	account[2] = 3000;
		totalUserCount = 3;
	}
	//����ڳ� �����ڷ� �α��� �ϱ�
	public static void login() {
		while(loginState == BankAccount.LOGIN_LOG_OFF) {
			System.out.println("login");
			System.out.println("id>>");
			inputId = sc.nextLine();
			System.out.println("pw>>");
			inputPw = sc.nextLine();
			//�Ϲ� ����� �α���
			boolean isFindId = false;
			for(int i=0; i<totalUserCount; i++) {
				if(id[i].equals(inputId)) {
					if(pw[i].equals(inputPw)) {
						System.out.println(id[i]+"�� �α���.");
						loginState = BankAccount.LOGIN_NORMAL_USER;
						loginIndex = i;
					} else {
						System.out.println("�߸��� ��й�ȣ �Է�");
					}
					isFindId= true;
					break;
				}
			}
			if(!isFindId) {
				if(adminId.equals(inputId)) {
					if(adminPw.equals(inputPw)) {
						System.out.println("admin���� �α���");
						loginState = BankAccount.LOGIN_ADMIN_USER;
						isFindId= true;
						break;
					}else {
						System.out.println("�߸��� ��й�ȣ �Է�");
					}
				} 
			}
		}
	}
	//����ڰ� ����� �޴�
	public static void userMenu() {
		while(isUser) {		
			System.out.println("=========================================");
			System.out.println("1.�Ա� 	 2.���	 3.Ȯ��	 4.����	 ");
			System.out.println("=========================================");
			String userMenu = sc.nextLine();
			switch(userMenu) {
			case "1":
				System.out.println("�Աݾ� �Է� >>");
				double deposit = sc.nextDouble();
				account[loginIndex] = deposit;
				System.out.println("�ܾ�: "+account[loginIndex]);
				
				break;
			case "2":
				System.out.println("��ݾ� �Է�>>");
				double withd = sc.nextDouble();
				if(account[loginIndex]-withd > 0) {
					account[loginIndex] = (account[loginIndex] - withd);
					System.out.println("�ܾ�: " + account[loginIndex]);
				} else {
					System.out.println("����Ϸ��� �ݾ��� ���� �ݾ׺��� Ů�ϴ�.");
				}
				break;
			case "3":
				System.out.println(id[loginIndex]+"�� �����: " +account[loginIndex]);
				break;
			case "4":
				System.out.println("����� �޴� ����");
				BankAccount.loginState = BankAccount.LOGIN_LOG_OFF;
				isUser = false;
				break;
				
				default:
					System.out.println("�ùٸ��� ���� �޴� ����");
			}
		}
	}
	//�����ڰ� ����� �޴�
	public static void adminMenu() {
		while(isAdmin) {		
			System.out.println("=========================================");
			System.out.println("1.�����߰�  2.�������� 3.id���� 4.��� ����� ��� 6.����");
			System.out.println("=========================================");
			String adminMenu = sc.nextLine();
			switch(adminMenu) {
			case "1":
				System.out.println("�����߰�");
				System.out.println("�߰��� ������ ���̵�>>");
				inputId = sc.nextLine();
				System.out.println("�߰��� ������ ��й�ȣ>>");
				inputPw = sc.nextLine();
				id[BankAccount.totalUserCount] = inputId;
				pw[BankAccount.totalUserCount] = inputPw;
				account[BankAccount.totalUserCount] = 0.0;
				System.out.println(id[BankAccount.totalUserCount]+"��������");
				BankAccount.totalUserCount++;
				
				break;
			case "2":		//���� �ʿ�
				System.out.println("��������");
				System.out.println("������ ���� �Է�>>");
				String delId = sc.nextLine();
				for(int i=0; i<totalUserCount; i++) {
					if(id[i].equals(delId)) {
						id[i] = null; pw[i] = null; account[i] = 0.0;
					}
				}
				BankAccount.totalUserCount--;
				break;
			case "3":
				System.out.println("id����");
				System.out.println("������ ���̵� �Է�>>");
				String findId = sc.nextLine();
				for(int i=0; i<totalUserCount;i++) {
					if(id[i].equals(findId)) {
						System.out.println("������ ���̵� �Է�>>"); 
						String changeId = sc.nextLine();
						id[i] = changeId;
						System.out.println("������ ��й�ȣ �Է�>>");
						String changePw = sc.nextLine();
						pw[i] = changePw;
					}
				}
				break;
			case "4":
				for(int i=0; i<BankAccount.totalUserCount; i++) {
					System.out.println(i+"��°"+" id>>"+id[i]+" pw>>"+pw[i]+ " account>>" + account[i]);
				}
				break;
			case "6":
				System.out.println("������ �޴� ����");
				BankAccount.loginState = BankAccount.LOGIN_LOG_OFF;
				isAdmin =false;
				break;
				
			default:
				System.out.println("�ùٸ��� ���� �޴� ����");
			}

		}
	}
	//���� ���α׷� ���� �޼ҵ�
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
			System.out.println("�ʱ�ȭ������ ���ư��ðڽ��ϱ�? true or false");
			startMethod = Boolean.parseBoolean(sc.nextLine());
		}
	}

	//����
	public static void main(String[] args) {
		init();
		playBank();
		System.out.println("���α׷� ����");
		
	}	

}
