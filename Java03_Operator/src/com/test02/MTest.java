package com.test02;

public class MTest {
	
	public static void main(String[]arge) {
		FruitBasket bananaBasket = new FruitBasket();
		bananaBasket.basketSetting("바나나", 10);
		bananaBasket.fruitCount = 50;
		System.out.println(bananaBasket.fruitCount);
		//bananaBasket.basketSize = 100; // static을 건드릴 순 있으나 지양(모든 객체에 적용되니까)
	    FruitBasket.basketSize = 100;
		//System.out.println(bananaBasket.basketSize);
		
		//FruitCount.fruitCount = 30; static이 non-static 건드릴 수 없다.
		
		FruitBasket appleBasket = new FruitBasket();
		
		appleBasket.basketSetting("사과", 30);
		System.out.println(appleBasket.fruitCount);
		//System.out.println(appleBasket.basketSize);
	}

}
