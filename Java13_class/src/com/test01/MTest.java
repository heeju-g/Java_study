package com.test01;

public class MTest {
	public static void main(String[] args) {
		AA a = new AA();
		
		//부모 타입으로 자식 객체 대입해주고 있음.
		//SUPER가 큰 타입. 묵시적 형변환임(작은 타입 a를 super에 넣고 있으니까)
		Super s = a;
		
		//AA abc = (AA)s;
		//System.out.println(abc);
		
		//jaba.lang.ClassCastException
		BB b = (BB)s;
		System.out.println(b);
	}

}
