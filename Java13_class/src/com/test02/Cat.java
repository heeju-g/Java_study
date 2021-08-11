package com.test02;

public class Cat extends Animal {
	public Cat() {
		System.out.println("고양이");
	}
	//@~~ : annotation
	@Override
	public void bark() {
		//재정의 : 부모 메소드를 맘대로 바꾸기(접근제한자,리턴타입,메소드명 같아야 함)
		// 부모꺼 바꿀건데 부모꺼 부른 다음 나오게 할거야
		super.bark();
			System.out.println("야옹");
	}
	public void eat() {
		System.out.println("냠냠");
	}

}
