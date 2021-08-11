package com.test03;

public class SumX {
	
	/*
	 * 1  2  3  4  5
	 * 6  7  8  9  10
	 * 11 12 13 14 15
	 * 16 17 18 19 20
	 * 21 22 23 24 25
	 * X의 총합을 구하자
	 * 힌트 ; 행렬로 생각하자. 중첩된 for문
	 * i + j = 4
	 * i == j
	 */
	public static void main(String[] args) {
		int cnt = 1;
		int sum = 0;
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j <5; j++) {
				if((i == j)||(i + j == 4)) {
					sum += cnt;
				}
				System.out.printf("%3d", cnt++);
			}
			System.out.println();
		}
		System.out.println(sum);
	}

}
