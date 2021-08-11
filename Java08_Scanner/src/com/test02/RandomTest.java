package com.test02;

import java.util.Random;

public class RandomTest {
	public static void main(String[] args) {
		
		mathClass();
		randomClass();
	}
	public static void randomClass() {
		Random rd = new Random();
		System.out.println(rd.nextInt(100));
	}
	public static void mathClass() {
		// Math.random을 사용하면 0.0 <= x < 1.0인 값을 가질수 있음
		// 실행하면 그 범위 내의 랜덤값이 나옴.
		// 10곱하면 0 <=  < 10
		// 더하기 1하면 1 <=  < 11(우리가 원하는 범위가 나옴)
		double dran = Math.random();
		System.out.println(dran);
		// min ~ max까지 1~10까지 하고 싶으면 곱하기 10
		// 100~110까지 하고 싶으면, 곱하기 11
		//(int)( Math.random()*(min - max + 1)) + min;
		int min = 100;
		int max = 110;
		int ran = (int)(Math.random()*(max - min + 1)) + min;
		System.out.println(ran); 
	}

}
