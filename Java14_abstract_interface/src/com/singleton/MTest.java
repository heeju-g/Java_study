package com.singleton;

public class MTest {
	public static void main(String[] args) {
		
		//Singleton s = new Singleton();
		//생성자가 private이기 때문에 이렇게 못함
		Singleton st01 = Singleton.getInstance();
		System.out.println(st01);
		//필드값에 값이 있는지 보고 없으면 new하고 새로 객체 만들고 주소값 리턴
		
		Singleton st02 = Singleton.getInstance();
		System.out.println(st02);
		//확인했더니 만들어진게 있으니까 exists하고 이미 있던 주소값리턴
		//때문에 주소값이 동일함. 
		System.out.println(st01 == st02);
		System.out.println(st01.hashCode());
		System.out.println(st02.hashCode());
	}

}
