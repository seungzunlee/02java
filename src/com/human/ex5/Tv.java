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
		System.out.println("TV를 켜시겠습니까? 1.Yes 2.No");
		int inputTvOn = Integer.parseInt(sc.nextLine());
		if(inputTvOn ==1) {
			System.out.println("TV를 켭니다.");
			Remote();
		} else if (inputTvOn == 2) {
			System.out.println("TV를 켜지 않습니다.");
		} else {
			System.out.println("1번과 2번중에 눌러주세요.");
		}
	
	}
	public static void TvOff() {
		System.out.println("TV를 끄시겠습까? 1.Yes 2.No");
		int inputTvOff = Integer.parseInt(sc.nextLine());
		if(inputTvOff==1) {
			System.out.println("Tv를 종료합니다.");
			isMenu = false;
		} else if(inputTvOff == 2) {
		System.out.println("Tv를 종료하지 않습니다.");
		} else{
			System.out.println("1번과 2번중에 눌러주세요.");
		}
	}
	public static void ChangeChannel() {
		while(isChannel) {
			System.out.println("===========채널변경===========");
			System.out.println("1. 채널▲	2. 채널▼	3.채널변경 종료");
			System.out.println("===========================");
			System.out.println("현재 채널: "+channel+"번");
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
				System.out.println("없는 메뉴입니다.");
			}
		}
	}
	public static void Volume() {
		while(isVolume) {
			System.out.println("===========음량조절===========");
			System.out.println("1. 음량▲ 2. 음량 ▼	3.음소거 4.종료");
			System.out.println("===========================");
			System.out.println("현재 음량: "+volume);
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
					System.out.println("없는 메뉴입니다.");
			}
		}
	}
	public static void Remote() {
		while(isMenu) {
			System.out.println("===========리모콘===========");
			System.out.println("1. 채널 변경  2. 음량 조절  3.TV종료");
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
					System.out.println("올바른 메뉴를 골라주세요.");
			
			}
		}
	}

	public static void main(String[] args) {
		TvOn();
	}
}
