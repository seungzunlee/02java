package com.human.ex4;
import java.util.*;
class JavaClass14 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		//���� 1) 1~50������ ¦���� ����ϴ� �ڵ带 ����� ����.
		System.out.println("����1)");
		for(int i=1; i<=50;i++) {
			System.out.print(i+" ");
		}
		System.out.println();
		//���� 2) 1~100������ 10�� ����� ����ϴ� �ڵ带 ����� ����.
		System.out.println("����2)");
		for(int i=1;i<=100;i++) {
			if(i%10==0) {
				System.out.print(i+" ");
			}
		}
		System.out.println();
		//���� 3) 30~300������ 6�� ����� ���� ����ϴ� �ڵ带 ����� ����.
		System.out.println("����3)");
		int sum3 = 0;
		for(int i=30;i<=300;i++) {
			if(i%3==0) {
				sum3 += i;
			}
		}
		System.out.println(sum3);
		System.out.println();
		//���� 4) ���ڸ� �ϳ� �Է� �޾� 1���� �Է��� ������ ������� ȭ�鿡 ��� �ǵ��� �ڵ带����� ����
		System.out.println("����4)");
		System.out.println("���ڸ� �Է��Ͻÿ�.");
		int input4 = sc.nextInt();
		for(int i=1; i<=input4;i++) {
			System.out.print(i+" ");
		}
		System.out.println();
		//���� 5) ����ڿ��� �� ���� �Է¹޾� �� ���� ���̿� �ִ� ��� ���� ������ ������ 
		//����ϴ� �������� ���α׷��� ����� ����. ��)5 9 �Է½� 6 7 8 ���� ����� ����
		System.out.println("����5)");
		System.out.println("ù ��° ���ڸ� �Է��Ͻÿ�.");
		int i51 = sc.nextInt();
		System.out.println("�� ��° ���ڸ� �Է��Ͻÿ�.");
		int i52 = sc.nextInt();
		int sum5 = 0;
		if(i51>i52) {		//ū ���� ���� �Է� �� �� ��ȯ.
			int tmp=0;
			tmp=i51;
			i51=i52;
			i52=i51;
		}
		for(int i=1;i<(i52-i51);i++) {
			System.out.println(i51+i);
			sum5 += (i51+i);
		}
		System.out.println("��: "+sum5);
		System.out.println();
		
		//���� 6) �μ��� �Է� �޾� ���̿� �ִ� ¦���� ȭ�鿡 ������ ������ ��� �ǵ��� �������� ���α׷��� ����� ����.
		System.out.println("����6)");
		System.out.println("ù ��° ���ڸ� �Է��Ͻÿ�.");
		int i61 = sc.nextInt();
		System.out.println("�� ��° ���ڸ� �Է��Ͻÿ�.");
		int i62 = sc.nextInt();
		if(i61>i62) {		//ū ���� ���� �Է� �� �� ��ȯ.
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
		//���� 7) 1-2+3-4+5-6����+99-100�� ����� ���ϴ� ���α׷��� �ۼ��� ����.
		System.out.println("����7)");
		int sum7 = 0;
		for(int i=1; i<=100;i++) {
			if(i%2==0) {
				sum7 += -i;
			} else {
				sum7 += i;
			}
		}
		System.out.println("��: " + sum7);
		System.out.println();
		//���� 8) 1/2+2/3+3/4+4/5+ 5/6+6/7+....+99/100�� ����� ���ϴ� ���α׷��� �ۼ��غ���.
		System.out.println("����8)");
		double sum8 = 0.0;
		for(int i=1;i<100;i++) {
			sum8 += ((double)i/(i+1)); 
		}
		System.out.println(sum8);
		System.out.println();
		//���� 9) �Ǻ���ġ ������ 10���� ������� ����ϴ� ���α׷��� �ۼ��� ����. �Ǻ���ġ
		//������ ���������� ������Ʈ�� �˻��ؼ� ������ �˾ƺ���.
		System.out.println("����9)");
		int[] sum9 = new int[12];
		sum9[0] = 0;
		sum9[1] = 1;
		for(int i=0; i<10; i++) {
			sum9[i+2] = sum9[i] + sum9[i+1];
			System.out.println(sum9[i]);
		}
		
		System.out.println();
		//���� 10) ���ϴ� ���� ������ ��⸦ �Է� �޾� ó���ϴ� ���α׷��� ����� ����. 
		System.out.println("����10)");
		String color = "����"; 
		int	brightness = 50;
		
		System.out.println("������ ���� �Է��Ͻÿ�.");
		String colorInput = sc.nextLine();
		if(colorInput.equals("����")||colorInput.equals("���")||colorInput.equals("�Ķ�")) {
			color = colorInput;
		} else {
			System.out.println("������ ���� ����, ���, �Ķ����� �� �ٲ� �� �ֽ��ϴ�.");
		}
		
		System.out.println("������ ��⸦ �Է��Ͻÿ�.");
		int brightnessInput = sc.nextInt();
		if(brightnessInput > brightness) {			//�Է°��� Ŭ ��
			while(brightnessInput > brightness) {
				brightness += 1;
				System.out.println("��� +1:" +brightness);
			}
		} else if(brightnessInput==brightness) {		//���� ��
			System.out.println("��Ⱑ �����ϴ�.");
		} else {
			while(brightnessInput < brightness) {
				brightness -= 1;
				System.out.println("��� -1:" +brightness);
			}
		}
		System.out.println("���� ������ "+color+" ���� "+brightness+"�̴�");
		System.out.println();
		//���� 11) 1-2+3-4+5-6����+99-100�� ����� ���ϴ� �������� ���α׷��� �ۼ��� ����.
		System.out.println("����11)");
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
		//���� 12) 1/2+2/3+3/4+4/5+ 5/6+6/7+....+99/100�� ����� ���ϴ� �������� ���α׷��� �ۼ��� ����.
		System.out.println("����12)");
		double sum12 = 0.0;
		for(int i=1;i<100;i++) {
			sum12 += ((double)i/(i+1)); 
		}
		System.out.println(sum12);
		System.out.println();
		System.out.println();

		int count5 = 0;
		System.out.println("����13)");
		for(int i=1; i<=25; i++) {
			
		}
		System.out.println();
		
		System.out.println("����14)");
		System.out.println("������ �Է��Ͻÿ�.");
		String inputWeek = sc.nextLine();
		System.out.println("�ϼ��� �Է��Ͻÿ�.");
		int day = sc.nextInt();
		System.out.println("��\t��\tȭ\t��\t��\t��\t��");
		switch(inputWeek) {
		case "�Ͽ���": 
			for( int i=1; i<=day; i++) {
				
				if(i%7==0) {
					System.out.printf("%d\n",i);
				} else {
					System.out.printf("%d\t",i);
				}
				
			}
			break;
		case "������":
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
		case "ȭ����":
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
		case "������":
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
		case "�����":
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
		case "�ݿ���":
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
		case "�����":
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
				System.out.println("�ùٸ� ������ �Է��Ͻÿ�.");
		}
		System.out.println();
		//���� 15) �迭 1,2,3,4,5,6,7,8,9 ���� �̵�����, �̵�ĭ��, ä����ڸ� �Է� �޾� �迭�� ������ ������ ����غ���.
		System.out.println("����15)");
		int arr1[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9};
		System.out.println("�̵������� �Է�.(����, ������)");
		String way = sc.nextLine();
		System.out.println("�̵�ĭ �� �Է�.");
		int wayNum = sc.nextInt();
		System.out.println("ä�� ���� �Է�.");
		int inputNum15 = sc.nextInt();
		if(way.equals("����")) {
			for(int i=0; i<9-wayNum; i++) {
				arr1[i] = arr1[wayNum+i];
			}
			for(int i=9-wayNum; i<9; i++) {
				arr1[i] = inputNum15;
			}
			for(int i=0; i<9; i++) {
				System.out.printf("%d ",arr1[i]);
			}
		} else if(way.equals("������")) {
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
		//���� 16)�迭 1,2,3,4,5,6,7,8,9 ���� ȸ������� ȸ���� �Է¹޾� �迭 ������ ȸ����Ű�� ����غ���.
		System.out.println("����16)");
		int arr2[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9};
		int tmp2[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9};
		System.out.println("ȸ�������� �Է�.(����, ������)");
		String way2 = sc.nextLine();
		System.out.println("ȸ�� Ƚ�� �Է�.");
		int wayNum2 = sc.nextInt();
		if(way2.equals("����")) {
			for(int i=0;i<9-wayNum2;i++) {
				arr2[i] = tmp2[i+wayNum2];
			}
			for(int i=0;i<wayNum2;i++) {
				arr2[9-wayNum2+i] = tmp2[i];
			}
			for(int i=0;i<9;i++) {
				System.out.printf("%d ",arr2[i]);
			}
		} else if(way2.equals("������")) {
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
		//�迭�� 100�� �����Ͽ� 0~99���� ���� ���� i=2 ���� 50���� i�� ������ i��
		//����� ���� �ε����� 0�� ���� ���� �迭�� 0�� �ƴ� ���� ����� ����.
		System.out.println("����17)");
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
