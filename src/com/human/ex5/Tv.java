package com.human.ex5;
import java.util.*;

public class Tv {
	public static Scanner sc = new Scanner(System.in);
	public static boolean isMenu = true;
	public static boolean isChannel = true;
	public static boolean isVolume = true;
	public static int channel = 0;
	public static int volume  = 0;
	
	public static void TvOn() {
		System.out.println("TV�� �ѽðڽ��ϱ�? 1.Yes 2.No");
		int inputTvOn = Integer.parseInt(sc.nextLine());
		if(inputTvOn ==1) {
			System.out.println("TV�� �մϴ�.");
			Remote();
		} else if (inputTvOn == 2) {
			System.out.println("TV�� ���� �ʽ��ϴ�.");
		} else {
			System.out.println("1���� 2���߿� �����ּ���.");
		}
	
	}
	public static void TvOff() {
		System.out.println("TV�� ���ðڽ���? 1.Yes 2.No");
		int inputTvOff = Integer.parseInt(sc.nextLine());
		if(inputTvOff==1) {
			System.out.println("Tv�� �����մϴ�.");
			isMenu = false;
		} else if(inputTvOff == 2) {
		System.out.println("Tv�� �������� �ʽ��ϴ�.");
		} else{
			System.out.println("1���� 2���߿� �����ּ���.");
		}
	}
	public static void ChangeChannel() {
		while(isChannel) {
			System.out.println("===========ä�κ���===========");
			System.out.println("1. ä�Ρ�	2. ä�Ρ�	3.ä�κ��� ����");
			System.out.println("===========================");
			System.out.println("���� ä��: "+channel+"��");
			int inputChannel = Integer.parseInt(sc.nextLine());
			switch(inputChannel) {
			case 1:
				channel += 1;
				break;
			case 2:
				channel -= 1;
				break;
			case 3:
				isChannel = false;
				break;
			default:
				System.out.println("���� �޴��Դϴ�.");
			}
		}
	}
	public static void Volume() {
		while(isVolume) {
			System.out.println("===========��������===========");
			System.out.println("1. ������ 2. ���� ��	3.���Ұ� 4.����");
			System.out.println("===========================");
			System.out.println("���� ����: "+volume);
			int inputVolume = Integer.parseInt(sc.nextLine());
			switch(inputVolume) {
			case 1:
				volume += 1;
				break;
			case 2:
				volume -= 1;
				break;
			case 3:
				volume = 0;
				break;
			case 4:
				isVolume = false;
				default:
					System.out.println("���� �޴��Դϴ�.");
			}
		}
	}
	public static void Remote() {
		while(isMenu) {
			System.out.println("===========������===========");
			System.out.println("1. ä�� ����  2. ���� ����  3.TV����");
			System.out.println("==========================");
			int rMenu = Integer.parseInt(sc.nextLine());
			switch(rMenu) {
			case 1:
				ChangeChannel();
				break;
			case 2:
				Volume();
				break;
			case 3:
				TvOff();
				break;
				default:
					System.out.println("�ùٸ� �޴��� ����ּ���.");
			
			}
		}
	}

	public static void main(String[] args) {
		TvOn();
	}
}
