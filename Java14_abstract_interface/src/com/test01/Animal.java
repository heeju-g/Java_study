package com.test01;

public abstract class Animal {
	//공통적인 부분은 이렇게 미리 만들어 놓고, 자식 객체마다 다른 부분은 bark처럼 추상클래스로 만들어 놓음.
	public void eat(String feed) {
		System.out.println(feed + "먹는다");
	}
	//추상메소드 : 상속받은 자식클래스가 반드시 구현해야함.
	public abstract void bark();

}
