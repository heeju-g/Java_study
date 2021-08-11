package com.test02;

import java.util.Scanner;

public class MTest {
	public static void main(String[] args) {
		/*
		 * 동적 바인딩 : 실행 시(runtime) 메모리 할당을 하면서 메소드를 동적으로 연동하는 방식.
		 * 코드 절약, 실행속도 향상, 행위가 은닉됨.
		 */
		System.out.println("선택해주세요 : [1: 고양이 2: 멍멍이 3: 코끼리]");
		Scanner sc = new Scanner(System.in);
		int select = sc.nextInt();
		
		//부모타입 변수만 만들어둠. cat,dog, elephant 다 만드는 것보다 코드절약
		Animal animal = null;
		
		switch(select) {
		case 1 :
			//어쩔 땐 고양이
			animal =new Cat();
			break;
		case 2 :
			//어쩔 떈 멍멍이
			animal = new Dog();
			break;
		case 3 : 
			//어쩔 땐 꼬끼
			animal = new Elephant();
			break;
		}
		//동적 바인딩
		//컴파일 시에는 animal에 어느 객체가 들어가는지 모르지만 실행할 때 runtime시에 우리가 콘솔창에 숫자 입력해주면 이후에
		//객체가 만들어지면서 메모리 할당하면서 메소드 동적으로 연결(다형성 사용)
		//부모타입 변수를 하나 만들어두고(animal) 메소드 호출했을 떄, 부모타입에 연결된 자식타입안의 메소드가 호출되는 것. 다형성
		animal.start();
		animal.stop();
		//instanceof는 타입 확인하는 연산자
		if(animal instanceof Cat) {
			System.out.println("Cat type");
		}else if(animal instanceof Dog) {
			System.out.println("Dog type");
		}else if(animal instanceof Elephant){
			System.out.println("Elephant type");
		}
	}

}
