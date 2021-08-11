package com.test03;

public class RandomCube {
	public static void main(String[] args) {
		prn();
	}

	/*
	 * 1. 1~9사이의 랜덤한 숫자를 가지고 5*5형태의 숫자 큐브를 출력하자. 2 4 1 9 3 4 5 8 3 1 2 4 1 9 4 2 4 3
	 * 1 5 3 5 8 4 2
	 * 
	 * 2. 만들어진 큐브에서 x의 합을 출력하고 전체 (25개의 숫자)의 평균을 출력하자.
	 * 
	 */
	public static void prn() {
		int sumX = 0;
		int sumAll = 0;
		int cnt = 0;
		
		for (int i = 0; i < 5; i++) {
			
			for (int j = 0; j < 5; j++) {
				int ran = (int) (Math.random()*9) + 1;
				
				System.out.printf("%2d", ran);
				// x대각선의 합
				if((i + j == 4)|| (i == j)) {
				  sumX += ran;
				}
				// 전제 합
				sumAll += ran;
				cnt++;
				
			}
			System.out.println();
		}
		double avg = (double)sumAll / cnt;
		System.out.println("X의 합 : " + sumX);
		System.out.println("전제 평균 :" + avg);
	}

}
