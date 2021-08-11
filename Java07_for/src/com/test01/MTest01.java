package com.test01;

public class MTest01 {
	public static void main(String[] args) {
		//prn01();
		prn02();
	}
	public static void prn02() {
		for (int i = 100; i > 0; i--) {
			System.out.println(i);
		}
	}
	public static void prn01() {
		// 초기값 ; 조건식 ; 증감식
		// 초기값->조건식->명령->증감식->조건식->명령->증감식 반복(조건 거짓이면 밖으로)
		// for와 while을 바꿔쓸 줄 알아야함. 모양만 다를 뿐.
		for(int i = 0; i < 10; i++) {
			System.out.println(i);
		}
	}

}
