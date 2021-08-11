package com.test03;

import java.util.Arrays;

public class MTest01 {
	public static void main(String[] args) {
		/*
		 * 1. 5칸짜리 int type의값을 받을 수있는 1차원 배열을 생성하자.
		 * 2. 반복문을 사용하여, 배열의 0번지부터 3번지까지 (4칸) 5~9사이의
		 * 랜덤한 숫자를 각각 대입하자.
		 * 3. 배열의 0번지부터 3번지에 저장된 값들을 모두 곱해서, 4번 인덱스에 저장
		 * 4. 배열을 출력
		 * 5. 배열 안에 있는 모든 값(0~4번지)을 더해서 출력.
		 */
		//1.
		int[] arr = new int [5];
		//2.
		for (int i = 0; i < 4; i++) {
			arr[i]= (int)(Math.random()*5)+5;
		}
		//3.		
		int tmp = 1;
		for(int i = 0; i < 4; i++) {
			tmp *= arr[i];
			//tmp = tmp*arr[i];
		}
		arr[4] = tmp;
		//4.
		for(int i = 0;i < arr.length;i++) {
			System.out.printf("%2d", arr[i]);
		}
		//5.
		int sum = 0;
		for(int i = 0;i < arr.length; i++) {
			sum +=arr[i];
		}
		System.out.println("\n총 합 :" +sum);
	}

}
