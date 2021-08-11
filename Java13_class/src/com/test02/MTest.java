package com.test02;

public class MTest {
	public static void main(String[] args) {
		/*
		Cat cat = new Cat();
		cat.bark();
		
		Dog dog = new Dog();
		dog.bark();
		*/
		
		//some.bark의 같은 형태로 다른 기능을 하고 있음 = 다형성
		//some은 Animal타입임.
		Animal some = new Dog();
		some.bark();
		
		some = new Cat();
		//애니몰 bark 부르면 오버라이드돼서 캣의 메소드 가져온 것
		some.bark();
		//some.eat(); 안됨. some이 애니몰객체니까 자식메소드 부를 수 없음
		
		/*
		 * 다형성
		 * 1.부모(선조)타입으로 자식(후손)생성
		 *   Parent p = new Child();
		 * 2.부모의 이름에 자식객체 대입
		 * 	 Child c = new Child();
		 * 	 Parent p = c;
		 * 3.부모의 메소드를 통해 자식의 메소드 호출
		 */
	}

}
