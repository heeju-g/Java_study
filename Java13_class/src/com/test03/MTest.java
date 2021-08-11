package com.test03;

public class MTest {
	public static void main(String[] args) {
		//실제 구현된 기능은 조금씩 다르지만 추상적으로 비슷함
		//모두 더하기를 하고 있음 오버로딩
		System.out.println(MySum.sum(10, 20));
		System.out.println(MySum.sum(11.2, 22.2));
		MySum.sum(1, 2, 3);
	}

}
