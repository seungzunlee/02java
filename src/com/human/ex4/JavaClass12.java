package com.human.ex4;

public class JavaClass12 {

	public static void main(String[] args) {
		// �� ���
		//���� 1��
		System.out.println();
		for(int i=1;i>0;i--) {
			System.out.print(i);
			for(int j=0;j<22;j++) {
				System.out.print("*");
			}
			System.out.print(i);
		}
		//���� 2��
		for(int i=0; i<4;i++) {
			for(int j=0;j<5;j++) {
				System.out.print("*");
			}
			System.out.print("1");
		}
		System.out.println();
		
		//���� 3��
		for(int i=0; i<4; i++) {
			for(int j=0; j<1; j++) {
				System.out.print("2");
			}
			System.out.print("*****");
		}
		System.out.println();
		
		//���� 4��
		System.out.print("2");
		for(int i=1;i>0;i--) {
			System.out.print(i);
			for(int j=0;j<22;j++) {
				System.out.print("*");
			}
			System.out.print(i);
		}
		System.out.println();
		
		//���� 5��
		for(int x=0; x<2;x++) {
			for(int i=1; i<=2; i++) {
				System.out.print(i);
				for(int j=0; j<4; j++) {
					System.out.print("*");
				}
				System.out.print(i);
			}
		}
		System.out.println();
		
		//���� 6��
		for(int i=1; i<5;i++) {
			for(int j=0;j<4;j++) {
				System.out.print("1");
			}
			for(int k=0;k<4;k++) {
				System.out.print("*");
			}
			for(int x=0;x<1;x++) {
				System.out.print("2");
			}
		}
		
		System.out.println();
		//���� 7��
		for(int i=1;i<3;i++) {
			for(int j=1;j<3;j++) {
				for(int x=0; x<4;x++) {
					System.out.print(j);
				}
				for(int k=1;k<5;k++) {
					System.out.print("*");
				}
				for(int y=0; y<4;y++) {
					System.out.print(j);
				}
			}
		}
		System.out.println();
		
		//���� 8��
		for(int i=1; i<4;i++) {
			for(int j=1; j<5;j++) {
				for(int k=1; k<5;k++) {
					System.out.print(j);
				}
				
			}
		}

	}

}
