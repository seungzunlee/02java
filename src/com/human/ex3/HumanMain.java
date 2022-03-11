package com.human.ex3;
import com.human.ex3.Human;
public class HumanMain {

	public static void main(String[] args) {
//		Human h1;			//스택에 Human클래스이 주소를 담을 수 있는 변수 선언
//							// 힙에 Human클래스 저장공간을 힙에 생성하고 생성된 주소를 스택에 h2에 저장
//		//System.out.println(h1); Human h1=null;
//		Human h2 = new Human(); 
//		System.out.println(h2);
//		h2.name="홍길동";
//		h2.age=19;
//		h2.height=123.5;
//		System.out.println(h2);
//		System.out.println();
//		
//		Human h3 = new Human("홍길남", 19, 188.8);
//		System.out.println(h3);
//		
		//객체 비교
		
		Human h1=new Human("홍길동", 10, 166.5);
		Human h2=new Human("홍길동", 10, 166.5);
		Human h3=h1;
		
		System.out.println(h1==h2);
		System.out.println(h1==h3);
		System.out.println(h1.equals(h2));
		System.out.println(h1.equals(h3));
		
		//모든 클래스는 Object를 상속받고 Object를 상속받으면 Object가
		//가지고 있는 것들을 사용할 수 있다.
		//.equals는 객체를 비교하기 위해서 사용되는 메소드이다.
		//Object에 있어서 만들지 않아도 사용할 수 있다.
		
		
		
		
		System.out.println();
		
	}

}
