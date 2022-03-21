package com.human.ex4;
import java.util.*;
public class JavaClass10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//���� 0) 50���� �л��� �⼮ ������ ó���ϴ� ���α׷��� ����� ����.
		boolean student[] = new boolean[50];
		while(true) {
			System.out.println("�޴��� �����Ͻÿ�.");
			System.out.println("=============================================");
			System.out.println("1.��ü �⼮���� 2.�Ἦ�� �߰� 3.�⼮�� �߰� 6.���α׷� ����");
			System.out.println("=============================================");
			int menu = sc.nextInt();
			switch(menu) {
			case 1:
				System.out.println("1. ��ü �⼮����");
				for(int i=0;i<student.length;i++) {
					System.out.printf("%d��. %b%n", i+1, student[i]);
				}
				continue;
			case 2:
				System.out.println("2. �Ἦ�� �߰�");
				System.out.println("�Ἦ�� ��ȣ�� �Է��Ͻÿ�.");
				int co = sc.nextInt();
				student[(co-1)] = false;
				continue;
			case 3:
				System.out.println("3. �⼮�� �߰�");
				System.out.println("�⼮�� ��ȣ�� �Է��Ͻÿ�.");
				int ci = sc.nextInt();
				student[(ci-1)] = true;
				continue;
			case 6:
				System.out.println("6. ���α׷� ����");
				return;
				
				default:
					System.out.println("�߸��� ���� �Է�.");
			}
				
		}
		//���� 1) ���� ���α׷��� �������� ���α׷��� ���� ������.
		int account = 0;
		while(true) {
			System.out.println("1�� ���� ���α׷�.");
			System.out.println("�޴��� �����Ͻÿ�.");
			System.out.println("===================================");
			System.out.println("��ü�޴�: 1.�Ա�  2.���  3.��ȸ  0.����");
			System.out.println("===================================");
			int menu2 = sc.nextInt();
			
			switch(menu2) {
			case 1:
				System.out.println("1. �Ա�");
				System.out.println("===================================");
				System.out.println("�Ա��� ���� �Է��Ͻÿ�(�� ����)");
				int plus = sc.nextInt();
				System.out.println(plus +"�� �Ա��մϴ�.");
				account += plus;
				System.out.println("���¿� ���� ��:"+ account +"��");
				break;
			case 2:
				System.out.println("2. ���");
				System.out.println("����� ���� �Է��Ͻÿ�(�� ����)");
				int minus = sc.nextInt();
				account -= minus;
				System.out.println("���¿� ���� ��:"+ account +"��");
				break;
			case 3:
				System.out.println("3. ��ȸ");
					System.out.println(account +"��");
				break;
			case 0:
				System.out.println("0. ����");
				return;
				default:
					System.out.println("�߸��� ���� �Է�.");
					
			}
		}
		//���� 2) �ݾ��� �Է¹޾� õ��, �����, ���, ���ʿ�, �ʿ� ¥�� �ܵ����� �Ž����ִ� ���α׷��� �������� ������ ����.
		int change1000 = 0, change500 = 0, change100 = 0, change50 =0, change10 = 0;
		while(true) {
			System.out.println("2�� �ܵ� ���α׷�.");
			System.out.println("==============");
			System.out.println("�ܵ��� �Է��Ͻÿ�.");
			System.out.println("==============");
			int moneyInput = sc.nextInt();
			change1000 = moneyInput/1000;
			change500 = (moneyInput%1000)/500;
			change100 = (moneyInput%1000%500)/100;
			change50 = (moneyInput%1000%500%100)/50;
			change10 = (moneyInput%1000%500%100%50)/10;
			if(moneyInput >= 1000) {
				System.out.println("õ��¥�� "+change1000+"��, �����¥��" +change500+"��, ���¥��" 
			+ change100+"��, ���ʿ�¥��" + change50 + "��, �ʿ�¥��" +change10 + "��");
			} else if(moneyInput >= 500) {
				System.out.println("õ��¥�� "+change1000+"��, �����¥��" +change500+"��, ���¥��" 
						+ change100+"��, ���ʿ�¥��" + change50 + "��, �ʿ�¥��" +change10 + "��");
			} else if(moneyInput >= 100) {
				System.out.println("õ��¥�� "+change1000+"��, �����¥��" +change500+"��, ���¥��" 
						+ change100+"��, ���ʿ�¥��" + change50 + "��, �ʿ�¥��" +change10 + "��");
			} else if(moneyInput >= 50) {
				System.out.println("õ��¥�� "+change1000+"��, �����¥��" +change500+"��, ���¥��" 
						+ change100+"��, ���ʿ�¥��" + change50 + "��, �ʿ�¥��" +change10 + "��");
			} else if(moneyInput > 10) {
				System.out.println("õ��¥�� "+change1000+"��, �����¥��" +change500+"��, ���¥��" 
						+ change100+"��, ���ʿ�¥��" + change50 + "��, �ʿ�¥��" +change10 + "��");
			} else if(moneyInput <=10) {
				System.out.println("10�� ���ϴ� �Է¹��� �ʽ��ϴ�.");
			}
		}
		//���� 3) �����ϴ� ���Ǳ�� �����ϰ� ����� ����.

		int cid =0, cok=0, pan =0;
		int changeB = 0,changeB1000 = 0, changeB500 = 0, changeB100 = 0, changeB50 =0;
		System.out.println("3��. ���Ǳ� ");
		while(true) {
			System.out.printf("���� �� %d��%n", changeB);
			System.out.println("=======================================================");
			System.out.println("�޴�: 1.���̴� (700) 2.�ݶ� (500) 3.ȯŸ (350) 4.1000������ 5.500������ 6.100������ "
					+ "7.50�� ����  8.��ȯ");
			System.out.printf("�����ȯ���� ���̴� %d�� �ݶ� %d�� ȯŸ %d���� ����", cid, cok, pan);
			System.out.println("=======================================================");
			int menu3 = sc.nextInt();
			
			switch(menu3) {
			case 1:
				if(changeB < 700) {
					System.out.printf("���� �� %d��%n", changeB);
					System.out.println("���� �� �������ּ���.");
				} else {
					cid += 1;
					changeB -= 700;
				}
				break;
			case 2:
				
				if(changeB < 500) {
					System.out.printf("���� �� %d��%n", changeB);
					System.out.println("���� �� �������ּ���.");
				} else {
					cok += 1;
					changeB -= 500;
				}
				break;
			case 3:
				if(changeB < 350) {
					System.out.printf("���� �� %d��%n", changeB);
					System.out.println("���� �� �������ּ���.");
				} else {
					pan += 1;
					changeB -= 350;
				}
				break;
			case 4:
				System.out.println("1000�� ����.");
				changeB += 1000;
				break;
			case 5: 
				System.out.println("500�� ����.");
				changeB += 500;
				break;
			case 6:
				System.out.println("100�� ����.");
				changeB += 100;
				break;
			case 7:
				System.out.println("50�� ����.");
				changeB += 50;
				break;
			case 8:
				System.out.println("��ȯ.");
				changeB1000 = changeB/1000;
				changeB500 = (changeB%1000)/500;
				changeB100 = (changeB%1000%500)/100;
				changeB50 = (changeB%1000%500%100)/50;
				if(changeB >= 1000) {
					System.out.println("õ��¥�� "+changeB1000+"��, �����¥��" +changeB500+"��, ���¥��" 
				+ changeB100+"��, ���ʿ�¥��" + changeB50 + "��");
				} else if(changeB >= 500) {
					System.out.println("õ��¥�� "+changeB1000+"��, �����¥��" +changeB500+"��, ���¥��" 
							+ changeB100+"��, ���ʿ�¥��" + changeB50 + "��");
				} else if(changeB >= 100) {
					System.out.println("õ��¥�� "+changeB1000+"��, �����¥��" +changeB500+"��, ���¥��" 
							+ changeB100+"��, ���ʿ�¥��" + changeB50 + "��");
				} else if(changeB >= 50) {
					System.out.println("õ��¥�� "+changeB1000+"��, �����¥��" +changeB500+"��, ���¥��" 
							+ changeB100+"��, ���ʿ�¥��" + changeB50 + "��");
				} 
				changeB = 0;
				break;
			case 0:
				System.out.println("����.");
				break;
				default:
					System.out.println("�߸��� �޴� �Է�.");
			}	
		}
		
	//���� 4) 369���� �ش����� ����� ����.
		
		for(int i=1;i<=1000; i++) {
			if(((i/100) == 3) ||((i/100) == 6) ||((i/100) == 9)) {			//100���ڸ� 369
				if(((i/10)%10) == 3 ||((i/10)%10 == 6) ||((i/10)%10 == 9)) {//10���ڸ� 369
					if(i%10 == 3 || i%10==6 || i%10 ==9) {//1�� �ڸ� 369
						System.out.println("¦¦¦");		//ooo
					} else {
						System.out.println("¦¦");		//oox
					}
					
				} else {//10�� �ڸ��� 369�� ���� else
					if((i/10)%10 == 3 || (i/10)%10==6 || (i/10)%10 ==9) {//oxo or oxx
						System.out.println("¦¦");		//oxo
					} else {
						System.out.println("¦");		//oxx
					}
					
				}	
			} else if(((i/10)%10) == 3 ||((i/10)%10 == 6) ||((i/10)%10 == 9)) {//100�� �ڸ�369 x 10�� �ڸ�369 o
				if(i%10 == 3 || i%10 == 6 || i%10 == 9) {
					System.out.println("¦¦"); 	//xoo
				} else {
					System.out.println("¦");	//xox
				}
			} else if(i%10 == 3 || i%10==6 || i%10 ==9) {
				System.out.println("¦");		//xxo
			} else {
				System.out.println(i);			//xxx
			}
		
			
		}	//for���� ��
		
	//���� 5) �����ϰ� ����,����,����,������ ������ ���� ����ڰ� ���ߴ� ���α׷��� �����غ���.
		int level = 1;
		boolean bool  = true;
		int userAnswer = 0;
		int result = 0;
		while(bool) {
			int ranNum1 = (int)(Math.random()*10+1);
			int ranNum2 = (int)(Math.random()*10+1);
			System.out.println("���� ����.");
			System.out.println("===================================================");
			switch(level) {
			case 1:
				System.out.println("���� 1: ����");
				result = ranNum1 + ranNum2;
				System.out.printf("%d + %d = ?%n", ranNum1, ranNum2);
				userAnswer = sc.nextInt();
				if(userAnswer == result) {
					System.out.println("�����Դϴ�.");
					level ++;
				} else {
					System.out.println("Ʋ�Ƚ��ϴ�.");
				}
				break;
			case 2:
				System.out.println("���� 2: ����");
				result = ranNum1 - ranNum2;
				System.out.printf("%d - %d = ?%n", ranNum1, ranNum2);
				userAnswer = sc.nextInt();
				if(userAnswer == result) {
					System.out.println("�����Դϴ�.");
					level ++;
				} else {
					System.out.println("Ʋ�Ƚ��ϴ�.");
				}
				break;
			case 3:
				System.out.println("���� 3: ����");
				result = ranNum1 * ranNum2;
				System.out.printf("%d * %d = ?%n", ranNum1, ranNum2);
				userAnswer = sc.nextInt();
				if(userAnswer == result) {
					System.out.println("�����Դϴ�.");
					level ++;
				} else {
					System.out.println("Ʋ�Ƚ��ϴ�.");
				}
				break;
			case 4:
				System.out.println("���� 4: ������");
				result = ranNum1 / ranNum2;
				System.out.printf("%d / %d = ?%n", ranNum1, ranNum2);
				userAnswer = sc.nextInt();
				if(userAnswer == result) {
					System.out.println("�����Դϴ�.");
					level ++;
				} else {
					System.out.println("Ʋ�Ƚ��ϴ�.");
				}
				break;
				default:
					System.out.println("��� ������ ������ϴ�.");
					bool = false;
			}
		}
	//���� 6)�Ʒ�ǥ�� �̿��ؼ� ��� ����ϴ� ���α׷��� �����غ���.
		int everCount = 0;
		while(true) {
			System.out.println("===================================================");
			System.out.println("1.����   2.û�ҳ�  3.����/���  4. �� �հ�");
			System.out.println("===================================================");
			int personSize = sc.nextInt();
			switch(personSize) {
			case 1:
				System.out.println("===================================================");
				System.out.println("1.�ְ���(1�ϱ�) 2.���ı�(���� 3��) 3.���� �߰���(���� 5��~) 4.2�ϱ�");
				System.out.println("===================================================");
				int big = sc. nextInt();
				switch(big) {
				case 1:
					System.out.println("���� �ְ���(1�ϱ�)�� 46,000���Դϴ�.");
					everCount += 46000;
					break;
				case 2:
					System.out.println("���� ���ı�(���� 3��)�� 38,000�Դϴ�.");
					everCount += 38000;
					break;
				case 3:
					System.out.println("���� ���� �߰���(���� 5��~)�� 20,000���Դϴ�.");
					everCount += 20000;
					break;
				case 4:
					System.out.println("���� 2�ϱ��� 74,000���Դϴ�.");
					everCount += 74000;
					break;
				}
				break;
			case 2:
				System.out.println("===================================================");
				System.out.println("1.�ְ���(1�ϱ�) 2.���ı�(���� 3��) 3.���� �߰���(���� 5��~) 4.2�ϱ�");
				System.out.println("===================================================");
				int mid = sc.nextInt();
				switch(mid) {
				case 1:
					System.out.println("û�ҳ� �ְ���(1�ϱ�)�� 39,000���Դϴ�.");
					everCount += 39000;
					break;
				case 2:
					System.out.println("û�ҳ� ���ı�(���� 3��)�� 32,000�Դϴ�.");
					everCount += 32000;
					break;
				case 3:
					System.out.println("û�ҳ� ���� �߰���(���� 5��~)�� 17,000���Դϴ�.");
					everCount += 17000;
					break;
				case 4:
					System.out.println("û�ҳ� 2�ϱ��� 62,000���Դϴ�.");
					everCount += 62000;
					break;
				}
				break;
			case 3:
				System.out.println("===================================================");
				System.out.println("1.�ְ���(1�ϱ�) 2.���ı�(���� 3��) 3.���� �߰���(���� 5��~) 4.2�ϱ�");
				System.out.println("===================================================");
				int sma = sc.nextInt();
				switch(sma) {
				case 1:
					System.out.println("���� �ְ���(1�ϱ�)�� 36,000���Դϴ�.");
					everCount += 36000;
					break;
				case 2:
					System.out.println("���� ���ı�(���� 3��)�� 29,000�Դϴ�.");
					everCount += 29000;
					break;
				case 3:
					System.out.println("���� ���� �߰���(���� 5��~)�� 19,000���Դϴ�.");
					everCount += 19000;
					break;
				case 4:
					System.out.println("���� 2�ϱ��� 58,000���Դϴ�.");
					everCount += 58000;
					break;
				}
				break;
			case 4:
				System.out.println("���հ��: " + everCount + "���Դϴ�.");
				break;
				default:
					System.out.println("�߸��� ���� �Է�.");
			}
		}
		
	//���� 7)��ǻ�Ͱ� ���Ƿ� ���� �ϳ��� ���ڸ� ���ߴ� ���α׷��� ����� ����.(up-down)
		int userNum = 0;
		boolean gamebool = true;
		int comNum = (int)(Math.random()*100);
		while(gamebool) {
			System.out.println("0���� 100�̸��� ���ڸ� �Է��Ͻÿ�.");
			userNum = sc.nextInt();
			if(userNum > comNum) {
				System.out.println("�ٿ�");
			} else if (userNum < comNum) {
				System.out.println("��");
			} else {
				System.out.println("����");
				gamebool = false;
			}
		}
	}

}
