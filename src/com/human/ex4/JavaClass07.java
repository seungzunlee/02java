package com.human.ex4;
import java.util.*;
public class JavaClass07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("����0.");
		
		int n1 = 3, n2 = 3, sum0 = 0;
		
		do {
			System.out.println(n1);
			n1++;
		} while(n1 < 11);
		
		while(n2 < 11) {
			System.out.println(n2);
			n2++;
		}
		
		for(int i = 3; i < 11; i++) {
			System.out.println(i);
		}
		
		for(int i = 9; i < 31; i++) {
			sum0 = sum0 + i;
		} System.out.println(sum0);
		System.out.println();
		
		System.out.println("����1.");
		int a=2, b=1;
		b++;
		System.out.println(String.format("a=%d, b=%d", a, b));
		
		while(b<15) {
			a=a+1;
			b=b+a;
		}
		System.out.println(String.format("a=%d, b=%d", a, b));
		
		int a2=2;
		int b2=1;
		b2++;
		System.out.println(String.format("a2=%d, b2=%d", a2, b2));
		for(;b2<15; b++) {
			a2=a2+1;
			b2=b2+a2;
		}
		System.out.println(String.format("a2=%d, b2=%d", a2, b2));
		System.out.println();
		
		System.out.println("����2.");
		System.out.println("100�� ���:");
		for(int i =1; i<101; i++) {
			if(100%i==0) {
				System.out.println(i);
			}
		}
		System.out.println();
		
		System.out.println("����3.");	
		System.out.println("���ڸ� �Է��Ͻÿ�.");
		int input1 = Integer.parseInt(sc.nextLine());
		System.out.println("���ڸ� �Է��Ͻÿ�.");
		int input2 = Integer.parseInt(sc.nextLine());
		int min=0;
		if(input1 > input2) {
			min = input2;
		} else {
			min = input1;
		} for(int i=1; i <= min; i++) {
			if(input1%i==0 && input2%i==0) {
				System.out.println("�����: " + i);
			}
		}
		
		System.out.println();
		System.out.println("����4.");
		System.out.println("���ڸ� �Է��Ͻÿ�.");
		int input3 = Integer.parseInt(sc.nextLine());
		System.out.println("���ڸ� �Է��Ͻÿ�.");
		int input4 = Integer.parseInt(sc.nextLine());
		int min4=0;
		int max4=1;
		if(input3 > input4) {
			min4 = input4;
			for(int i=1; i <=min4; i++) {
				if(input3%i==0 && input4%i==0) {
					max4 = i;
				}
			}
		} else {
			min4 = input3;
			for(int i=1; i <=min4; i++) {
				if(input4%i==0 && input3%i==0) {
					max4 = i;		
				}
			}
		}
		System.out.println("�ִ�����: " + max4);
		System.out.println();
		
		System.out.println("����5.");
		int sum = 0;
		while(sum<=100) {
			System.out.println("���ڸ� �Է��Ͻÿ�.");
			int input5 = Integer.parseInt(sc.nextLine());
			sum = sum + input5;
		}
		System.out.println("100�� �Ѿ����ϴ�.");
		System.out.println();
		
		System.out.println("����6.");
		int g6 = 0, b6 = 0;
		for(int i = 0; i< 3; i++) {
			System.out.println("1~10������ ���ڸ� 3�� �Է��Ͻÿ�.");
			int input6 = Integer.parseInt(sc.nextLine());
			if(input6>0&&input6<11) {
				g6++;
			} else {
				b6++;
			}
		}
		System.out.println(String.format("����� �Է��� Ƚ��: %d , �߸� �Է��� Ƚ��: %d", g6, b6));
		System.out.println();
		
		System.out.println("����7.");	
		System.out.println("ù��° ���� �Է��Ͻÿ�.");
		int input71 = Integer.parseInt(sc.nextLine());
		System.out.println("�ι�° ���� �Է��Ͻÿ�.");
		int input72 = Integer.parseInt(sc.nextLine());
		int min7=0;
		int max7=1;
		if(input71 > input72) {
			min7 = input72;
			for(int i=1; i <=min7; i++) {
				if(input71%i==0 && input72%i==0) {
					max7 = i;
				}
			}
		} else {
			min7 = input71;
			for(int i=1; i <=min7; i++) {
				if(input72%i==0 && input71%i==0) {
					max7 = i;		
				}
			}
		}
		System.out.println("�ּҰ����: " + (input71*input72)/max7);
		System.out.println();
		System.out.println();
		
		System.out.println("����8.");	
		System.out.println("ù ��° ���� �Է��Ͻÿ�.");
		int input81 = Integer.parseInt(sc.nextLine());
		System.out.println("�� ��° ���� �Է��Ͻÿ�.");
		int input82 = Integer.parseInt(sc.nextLine());
		System.out.println("�� ��° ���� �Է��Ͻÿ�.");
		int input83 = Integer.parseInt(sc.nextLine());
		
		if( input81 > input82 && input81 > input83) {
			System.out.println(String.format("���� ū���� ù ��° �Է��� ��: %d", input81));
		} else if(input82 > input81 && input82 > input83) {
			System.out.println(String.format("���� ū���� �� ��° �Է��� ��: %d", input82));
		} else if(input83 > input81 && input83 > input82) {
			System.out.println(String.format("���� ū���� �� ��° �Է��� ��: %d", input83));
		}
		if( input81 < input82 && input81 < input83) {
			System.out.println(String.format("���� ���� ���� ù ��° �Է��� ��: %d", input81));
		} else if(input82 < input81 && input82 < input83) {
			System.out.println(String.format("���� ���� ���� �� ��° �Է��� ��: %d", input82));
		} else if(input83 < input81 && input83 < input82) {
			System.out.println(String.format("���� ���� ���� �� ��° �Է��� ��: %d", input83));
		} 
		System.out.println();
		
		System.out.println("����9.");
		
		int count = 0;
		for(int i=0; i< 5; i++) {
			System.out.println("���а��� ������ �Է��Ͻÿ�.");
			int input9 = Integer.parseInt(sc.nextLine());
			if(input9 <= 60) {
			
				count++;
			}
		}
		System.out.println(String.format("Ż���ڴ� %d���Դϴ�.", count));
		System.out.println();

		System.out.println("10��");
		int sum10 = 0;
		for(int i=1; sum10<100; i++) {
			sum10 = sum10 + i;
			if(sum10 > 100) {
				break;
			}
			System.out.println(String.format("%d:%d", i,sum10));
		}
		System.out.println();
		
		System.out.println("11��");
		System.out.println("���ڿ��� �Է��Ͻÿ�.");
		String str11 = sc.nextLine();
		System.out.println("���ڸ� �Է��Ͻÿ�.");
		int num11 =Integer.parseInt(sc.nextLine());
		int count11 = 0;
		while(count11 < num11) {
			System.out.println(str11);
			count11++;
		}
		System.out.println();
		
		System.out.println("12��"); 
		System.out.println("���ڸ� �Է��Ͻÿ�.");
		int a12 =Integer.parseInt(sc.nextLine());	// ū ��
		System.out.println("���ڸ� �Է��Ͻÿ�.");
		int b12 =Integer.parseInt(sc.nextLine());	// ���� ��
		int sum12 = 0, tmp = 0;
		if(a12 < b12) {
			tmp = a12;
			a12 = b12;
			b12 = tmp;
		}
		int bb= 0;
		bb = a12 - b12;
		for(int i=1; i< bb; i++) {
			b12++;		
			sum12 += (b12);
				
		}
		System.out.println(String.format("�� ���� ������ ���� %d", sum12));
		System.out.println();
		
		System.out.println("13��");
		int count13 = 0;
		System.out.println("���ڸ� �Է��Ͻÿ�.");
		int a13 =Integer.parseInt(sc.nextLine());
		for(int i=2; i< a13; i++) {
			if(a13%i==0) {
				count13++;
			}
		}
		if(a13 == 1) {
			System.out.println("1�� �Ҽ��� �ƴմϴ�.");
		}
		if(count13 > 0) {
			System.out.println("�Ҽ��� �ƴմϴ�.");
		} else if(a13!=1) {
			System.out.println("�Ҽ��Դϴ�.");
		}
		
		System.out.println();
		
		System.out.println("14��");			
		System.out.println("ù ��° ���ڸ� �Է��Ͻÿ�.");
		int a14 =Integer.parseInt(sc.nextLine());
		System.out.println("�� ��°�� �Է��Ͻÿ�.");
		int b14 =Integer.parseInt(sc.nextLine());
		int count14=0;
		while(count14<b14) {
			System.out.printf(a14+count14+" ");
			count14++;
		}
		
		System.out.println();
		
		System.out.println("15-1��");
		
		for(;;) {
			System.out.println("'����'�� �Է��Ͻÿ�.");
			String input15 = sc.nextLine();
			if(input15.equals("����")){
				break;
			}
		}
		System.out.println("�����մϴ�.");
		System.out.println();
		System.out.println("15-2��");
		
		while(true) {
			System.out.println("'����'�� �Է��Ͻÿ�.");
			String input151 = sc.nextLine();

			if(input151.equals("����")){
				break;
			}
		}
		System.out.println("�����մϴ�.");	
		System.out.println();
		
		System.out.println("15-3��");
		do {
			System.out.println("'����'�� �Է��Ͻÿ�.");
			String input153 = sc.nextLine();
			if(input153.equals("����")){
				break;
			}
		} while(true);
		
		System.out.println("�����մϴ�.");	
		System.out.println();
		
		System.out.println("16��");
		System.out.println("���ڸ� �Է��Ͻÿ�.");
		int input16 =Integer.parseInt(sc.nextLine());
		for(int i=1; i < 10; i++) {
			System.out.println(String.format("%d X %d = %d", input16, i, input16*i));
		}
		System.out.println();
		
		System.out.println("17��");
		System.out.println("���ڸ� �Է��Ͻÿ�.");
		int input17 =Integer.parseInt(sc.nextLine());
		System.out.println(String.format("%d�� ����� ������ %d���̴�.", input17, 1000/input17));
		System.out.println();
		
		System.out.println("18��");			//�ٽ�
		System.out.println("���� �Է��Ͻÿ�.");
		int a18 =Integer.parseInt(sc.nextLine());
		System.out.println("�� �Է��Ͻÿ�.");
		int b18 =Integer.parseInt(sc.nextLine());
		for(int i=1; i<a18; i++) {
			for(int j=1; j<b18; j++) {
				System.out.println(j);
				if(b18==j) {
					break;
				}
			}
		}
		
		System.out.println("19��");
		int w = 0;
		int l =0;
		while(w < 3) {
			System.out.println("�ո��̸� 0 �޸��̸� 1���Է��Ͻÿ�.");
			int input19 = Integer.parseInt(sc.nextLine());
			int coin = (int)(Math.random()*2);
			
			if(coin==input19) {
				System.out.println("������ϴ�.");
				w++;
			}else {
				System.out.println("Ʋ�Ƚ��ϴ�.");
				l++;
			}
		}
		System.out.println(String.format("���� Ƚ��: %d, Ʋ�� Ƚ��: %d", w, l));
		System.out.println();
		
		System.out.println("20��");
		int w2 = 0;
		int l2 =0;
		while(w2 < 10) {
			System.out.println("1~6�߿� �Է��Ͻÿ�(�ֻ���).");
			int input20 = Integer.parseInt(sc.nextLine());
			int dice = (int)((Math.random()*6)+1);
			System.out.println(String.format("�ֻ����� ��: %d", dice));
			if(dice==input20) {
				System.out.println("������ϴ�.");
				
				w2++;
			}else {
				System.out.println("Ʋ�Ƚ��ϴ�.");
				l2++;
			}
		}
		System.out.println(String.format("���� Ƚ��: %d, Ʋ�� Ƚ��: %d", w2, l2));
		System.out.println();
		
		System.out.println();
		
	}

}
