package com.test02;

public class Dog extends Animal {
	public Dog() {
		System.out.println("멍멍이");
	}
	//@Override
	public void bark() {
		//부모꺼 내맘대로 바꿀거야
		System.out.println("멍멍");
	}

}
