package com.human.ex4;
import java.util.*;
public class JavaClass03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("9��");
		
		System.out.println("Ű�� �Է��Ͻÿ�.");
		int x = Integer.parseInt(sc.nextLine());
		System.out.println("ü���� �Է��Ͻÿ�.");
		int y = Integer.parseInt(sc.nextLine());
		System.out.println("���̸� �Է��Ͻÿ�.");
		int z = Integer.parseInt(sc.nextLine());
		double height = 0;
		
		height = (y / ((x-100)*0.9)) * 100;
		
		if(z>=20) {			//����
			if(height >=150) {
				System.out.println("����");
			} else if( height > 120) {
				System.out.println("��");
			} else if( height > 110) {
				System.out.println("��ü��");
			} else if( height > 100) {
				System.out.println("����");
			} else {
				System.out.println("ü�߹̴�");
			} 
		} else {			//���߰���
			
			if(height >=150) {
				System.out.println("����");
			} else if( height > 130) {
				System.out.println("�ߵ� ��");
			} else if( height > 120) {
				System.out.println("�浵 ��");
			} else if( height > 95) {
				System.out.println("����");
			} else {
				System.out.println("ü�߹̴�");
			} 
		}
		
		
		System.out.println();
		System.out.println("10��");
		System.out.println("1~4 �� �߿� ���ÿ�.");
		System.out.println("1. ��ѷ� \n"
						 + "2. �����ѷ�\n"
						 + "3. �� ����\n"
						 + "4. �㸮�ѷ�\n");
		int input10 = Integer.parseInt(sc.nextLine());
		
		switch(input10) {
		case 1:
			System.out.println("��ѷ� �Է��Ͻÿ�.");
			int x1 = Integer.parseInt(sc.nextLine());
			if(x1 <45 && x1 >= 43) {
				System.out.println("XXL , 110�̻�");
			} else if( x1 <42 && x1 >= 41) {
				System.out.println("XL, 105~120");
			} else if( x1 <39 && x1 >= 38) {
				System.out.println("L, 100~105");
			} else if( x1 <37 && x1 >= 36) {
				System.out.println("M, 95~100");
			} else if( x1 <35 && x1 >= 33) {
				System.out.println("S,  90~95");
			} else {
				System.out.printf("�����ȿ� ���ڸ� �Է����ּ���.");
			}
			break;
		case 2:
			System.out.println("�����ѷ� �Է��Ͻÿ�.");
			int y1 = Integer.parseInt(sc.nextLine());
			if(y1 <132 && y1 >= 127) {
				System.out.println("XXL , 110�̻�");
			} else if(y1 <122 && y1 >= 117) {
				System.out.println("XL, 105~120");
			} else if( y1 <112 && y1 >= 107) {
				System.out.println("L, 100~105");
			} else if( y1 <102 && y1 >= 96) {
				System.out.println("M, 95~100");
			} else if( y1 <86 && y1 >= 91) {
				System.out.println("S, 90~95");
			} else {
				System.out.printf("�����ȿ� ���ڸ� �Է����ּ���.");
			}
			break;
		case 3:
			System.out.println("�ȵѷ� �Է��Ͻÿ�.");
			int z1 = Integer.parseInt(sc.nextLine());
			if( z1 <91 && z1 >= 89) {
				System.out.println("XXL , 110�̻�");
			} else if(z1 <89 && z1 >= 86) {
				System.out.println("XL, 105~120");
			} else if( z1 <86 && z1 >= 84) {
				System.out.println("L, 100~105");
			} else if( z1 <84 && z1 >= 81) {
				System.out.println("M, 95~100");
			} else if( z1 <78 && z1 >= 81) {
				System.out.println("S, 90~95");
			} else {
				System.out.printf("�����ȿ� ���ڸ� �Է����ּ���.");
			}
			break;
		case 4:
			System.out.println("�㸮�ѷ� �Է��Ͻÿ�.");
			int v1 = Integer.parseInt(sc.nextLine());
			if( v1 <40 && v1 >= 38) {
				System.out.println("XXL , 110�̻�");
			} else if(v1 <37 && v1 >= 34) {
				System.out.println("XL, 105~120");
			} else if( v1 <34 && v1 >= 32) {
				System.out.println("L, 100~105");
			} else if( v1 <31 && v1 >= 30) {
				System.out.println("M, 95~100");
			} else if( v1 <29 && v1 >= 28) {
				System.out.println("S, 90~95");
			} else {
				System.out.printf("�����ȿ� ���ڸ� �Է����ּ���.");
			}
			break;
			default:
				System.out.println("�߸��� ���� �Է�");
		}
		System.out.println();
		
		System.out.println("11��");
		System.out.println("ù ��° �� �Է�.");
		int num1 = Integer.parseInt(sc.nextLine());
		System.out.println("������ ����.\n 1. + \n 2. -\n 3. *\n 4. /\n");
		String menu = sc.nextLine();
		System.out.println("�� ���� �� �Է�.");
		int num2 = Integer.parseInt(sc.nextLine());
		switch(menu) {
		case "+":
			System.out.printf("%d+%d=%d �Դϴ�.\n", num1,num2,num1+num2);
			break;
		case "-":
			System.out.printf("%d-%d=%d �Դϴ�.\n", num1,num2,num1-num2);
			break;
		case "*":
			System.out.printf("%d*%d=%d �Դϴ�.\n", num1,num2,num1*num2);
			break;
		case "/":
			System.out.printf("%d/%d=%d �Դϴ�.\n", num1,num2,num1/num2);
			break;
		}
		
		System.out.println();
		
		System.out.println("12��");
		System.out.println("���� ���� �� �� �ϳ� �Է�.");
		String input12 = sc.nextLine();
		
		int result12 =(int)(Math.random()*3 + 1);
		// 1 ���� 	2���� 	3��
		switch(input12) {
		case "����":
			if(result12==1) {
				System.out.println("�����ϴ�.");
			} else if(result12==2) {
				System.out.println("�����ϴ�.");
			} else {
				System.out.println("�̰���ϴ�.");
			}
			break;
		case "����":
			if(result12==1) {
				System.out.println("�̰���ϴ�.");
			} else if(result12==2) {
				System.out.println("�����ϴ�.");
			} else {
				System.out.println("�����ϴ�.");
			}
			break;
		case "��":
			if(result12==1) {
				System.out.println("�����ϴ�.");
			} else if(result12==2) {
				System.out.println("�̰���ϴ�.");
			} else {
				System.out.println("�����ϴ�.");
			}
			break;
			default:
				System.out.println("���� ���� �� �� �Է����� ����.");
		
		}
		System.out.println();
		
		System.out.println("13��");
		int x13 = (int)(Math.random()*5 +6);
		System.out.println(x13);
		System.out.println();
		
		System.out.println("14��");
		int x14 = (int)(Math.random()*45 +1);
		System.out.println(x14);
		System.out.println();
		
		System.out.println("15��");
		System.out.println("�� ���� �Է��Ͻÿ�.(��������)");
		int money = Integer.parseInt(sc.nextLine());
		if(money > 50000) {
			System.out.println(money*0.4+((money-50000)*0.42)+"(����)");
		} else if(money >30000 && money <= 50000) {
			System.out.println(money*0.38+((money-30000)*0.4)+"(����)");
		} else if(money >15000 && money <= 30000) {
			System.out.println(money*0.35+((money-15000)*0.38)+"(����)");
		} else if(money >8800 && money <= 15000) {
			System.out.println(money*0.24+((money-8800)*0.35)+"(����)");
		} else if(money >4600 && money <= 8800) {
			System.out.println(money*0.15+((money-4600)*0.24)+"(����)");
		} else if(money >1200 && money <= 4600) {
			System.out.println(money*0.06+((money-1200)*0.15)+"(����)");
		} else {
			System.out.println(money*0.06+"(����)");
		}
		System.out.println();
		

	}

}
