package com.test03;

public class MySum {
	public static int sum(int i , int j) {
		return i + j;
	}
	//파라미터의 갯수나 타입이 다르면, 메소드명이 같게 만들 수 있다.
	//이전엔 같은 메소드명 안됐었는데
	//overload : 같은 이름으로 다양한 기능을 하는 것.
	public static double sum(double i, double j) {
		return i + j;
	}
	public static void sum(int i, int j, int k) {
		System.out.println(i + j + k);
	}

}
