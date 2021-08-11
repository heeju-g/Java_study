package com.b;

import com.a.AAA;

public class MTest {

	public static void main(String[] args) {
		           //기본생성자를 호출하고 있음 
		AAA a1 = new AAA();
		// 자바에 설정된 기본값이 나옴 null같은
		System.out.println(a1.getAbc());
		           // 파라있는 생성자 호출
		AAA a2 = new AAA(10);
		System.out.println(a2.getAbc());
		// 부모가 만들어진 다음 자식객체가 만들어짐
		//기본생성자 호출
		BBB b1 = new BBB();
		
		b1.setAbc(10);
		//b1에는 setAbc, setB라는 메소드 없지만 부모의 것을 상속받아 사용.
		//부모님한테 따로 말하지 않고 바로 쓰는 것.
		b1.setB(20);
	    System.out.println(b1.getAbc());
		System.out.println(b1.getSum());
		
		BBB b2 = new BBB(10);
		// 
		System.out.println(b2.getAbc());
		System.out.println(b2.getB());
		System.out.println(b2.getSum());
		b2.prn();
		
		//AAA a1 = new AAA();
		//AAA a2 = new BBB();
		
		a1.prn();
		// heap에 new AAA, BBB가 있고 거기에 a2변수가 연결되어있는데,
		// a2.prn을 부르면 AAA의 prn을 통해서 
		// BBB의 prn이 호출되는 것
		a2.prn();
	}

}
