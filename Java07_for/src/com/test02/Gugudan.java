package com.test02;

public class Gugudan {
	public static void main(String[] args) {
		gugu();
	}

	public static void gugu() {
		// 2단부터 9단까지 전체 출력. while로도 풀어보기.
		for (int i = 2; i < 10; i++) {
			System.out.println("<" + i + "단>");
			for (int j = 1; j < 10; j++) {
				System.out.println(i + "*" + j + "=" + i * j);
			}
		}
	}

}
