package com.b;

import com.a.AAA;
// AAA 를 상속받은 BBB
public class BBB extends AAA {
	private int b;
	
	//기본생성자
	public BBB()	{
		// super(); -> 해당 명령어가 없어도 자동으로 부모 생성자 호출됨
		System.out.println("BBB()");
	}
	//파라미터 한개짜리 생성자
	public BBB(int b) {
		//부모의 생성자 -> AAA(int abc);
		super(b);
		this.b = b;
		System.out.println("BBB(int b)");
	}
	// 파라미터 두개짜리 생성자
	public BBB(int abc, int b) {
		super(abc);
		this.b = b;
		System.out.println("BBB(int abc, int b");
	}
	// getter & setter
	public int getB()	{
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	public int getSum()	{
		// super : 부모객체 AAA
		// this : 나 객체. 여기선 BBB
		// super(): 부모생성자
		// this(): 나생성자
		//         super.이랑 this. 생략가능
		int sum = super.getAbc() + this.getB();
		return sum;
	}
	// 재정의
	@Override
	//부모 메소드랑 이름이 같은 메소드prn
	public void prn()	{
		System.out.println("BB의 prn()");
	}

}
