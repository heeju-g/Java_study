package com.test01;

public class MTest01 {
	/*
	 * while (조건) {
	 *   조건이 참일 때 반복될 명령;
	 * }
	 */
	public static void prn03() {
		int i = 1;
		while (true) {
			System.out.println(i);
			i++;
			if (i == 10) {
				break;
				}
		}
	}
	public static void main(String[] args) {
		//prn01();
		prn02();
		//prn03();
	}

	public static void prn01() {
		int i = 10;
		while (i < 10) {
			System.out.println(i);
			i++;
		}
		System.out.println("while이 종료된 이후의 i값 :" + i);
	}
	// do while은 무조건 한번은 실행. 조건 따지기 전에 do가 오니까
	public static void prn02() {
		int i = 1;
		do {
			System.out.println(i);
			i++;
		}while (i < 10);
		// i == 10이라고 하면 조건이 거짓임. 헷갈리지 않기
		System.out.println("do ~while 종료 후 i :" + i);
	}
}
