package com.test02;

public class ContinueTest {
	public static void main(String[] args) {
		prn();
	}
	public static void prn() {
		int i = 0;
		while (i < 10) {
			i++;
			if(i % 2 == 0) {
				continue;
				//아래의 조건(println)을 무시하고 올라가서 다음 거 반복
			}
			System.out.println(i);
		}
	}

}
