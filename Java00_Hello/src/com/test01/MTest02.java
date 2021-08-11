package com.test01;

public class MTest02 {
	public static void main(String[] args) {
		//연산자를 사용하여 su의 각 자리수를 모두 더하여서 출력하자.
		
		int su = 5879;
		
		int a = su/1000; // (su/1)%10;
		int b = su/100 - 10*a; //(su/10)%10;
		int c = su/10 - 100*a - 10*b ; // (su/100)%10;
		int d = su - 1000*a - 100*b - 10*c;//(su/1000)%10;
		
		int sum = a + b + c + d;
		System.out.println(su + "의 각 자리수의 총 합은" + sum + "입니다.");
		
	}
	// while 을 사용하여 위 문제를 풀기
}
