package com.test04;

public class MTest {
	public static void main(String[] args) {
		//전에는 Animal cat = new Cat();이런식으로 했는데
		//Eagle의 경우 Animal이랑 Bird 둘을 상속받았기 때문에 
		Cat cat = new Cat();
		cat.bark();
		cat.eat("참치");
		
		Dog dog = new Dog();
		dog.bark();
		dog.eat("소고기");
		
		//Animal eagle 이렇게 하면 bird꺼 못가져옴
		Eagle eagle = new Eagle();
		eagle.bark();
		eagle.eat("고기");
		eagle.fly();
	}

}
