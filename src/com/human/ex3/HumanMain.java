package com.human.ex3;
import com.human.ex3.Human;
public class HumanMain {

	public static void main(String[] args) {
//		Human h1;			//���ÿ� HumanŬ������ �ּҸ� ���� �� �ִ� ���� ����
//							// ���� HumanŬ���� ��������� ���� �����ϰ� ������ �ּҸ� ���ÿ� h2�� ����
//		//System.out.println(h1); Human h1=null;
//		Human h2 = new Human(); 
//		System.out.println(h2);
//		h2.name="ȫ�浿";
//		h2.age=19;
//		h2.height=123.5;
//		System.out.println(h2);
//		System.out.println();
//		
//		Human h3 = new Human("ȫ�泲", 19, 188.8);
//		System.out.println(h3);
//		
		//��ü ��
		
		Human h1=new Human("ȫ�浿", 10, 166.5);
		Human h2=new Human("ȫ�浿", 10, 166.5);
		Human h3=h1;
		
		System.out.println(h1==h2);
		System.out.println(h1==h3);
		System.out.println(h1.equals(h2));
		System.out.println(h1.equals(h3));
		
		//��� Ŭ������ Object�� ��ӹް� Object�� ��ӹ����� Object��
		//������ �ִ� �͵��� ����� �� �ִ�.
		//.equals�� ��ü�� ���ϱ� ���ؼ� ���Ǵ� �޼ҵ��̴�.
		//Object�� �־ ������ �ʾƵ� ����� �� �ִ�.
		
		
		
		
		System.out.println();
		
	}

}
