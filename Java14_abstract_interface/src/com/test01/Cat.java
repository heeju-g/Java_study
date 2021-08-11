package com.test01;

public class Cat extends Animal {

	@Override
	// bark() 반드시 오버라이드해서 구현해야함
	public void bark() {
		System.out.println("야옹");

	}
	//eat() -> 오버라이드 해도 되고 안해도 됨

}
