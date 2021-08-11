package com.test01;

import java.util.Scanner;



public class MTest02 {
	public static void main(String[] args) {
		test01();
	}
	public static void test01() {
		Scanner sc = new Scanner(System.in);
		System.out.println("아무거나 입력해주세요 : ");
		//공백기준 토큰 하나/ next는 토큰 하나만 가져오고, nextLine은 나머지 한 줄 다가져움.
		// 다 next쓰던가 다 nextLine쓰던가 하기.
		String token = sc.next();
		System.out.println(token);
		
		String token2 = sc.next();
		System.out.println(token2);
		
		String token3 = sc.next();
		System.out.println(token3);
		
		System.out.println("nextLine 입력");
		sc.nextLine();
		String line = sc.nextLine();
		System.out.println(line);
	}

}
