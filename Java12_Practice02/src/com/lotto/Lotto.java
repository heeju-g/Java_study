package com.lotto;

import java.util.Arrays;

/*
 * 중복되지 않는 숫자 6개(1-45)를 작은 순부터 정렬하여 콘솔에 출력하자.
 */


public class Lotto {
	
	// 로또 배열 생성
	private int[] make() {
		int[] arr = new int[6];
		int index = 0;
		while(index < 6) {
			int insert = (int)(Math.random()*45) + 1;
			
			if(!isSame(arr, insert)) {
				arr[index] = insert;
				index++;
			}
		}
		return arr;
	}
	// 중복 값 판별
	private boolean isSame(int[] arr, int insert) {
		boolean same = false;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == insert) {
				same = true;
				break;
			}
		}
		return same;
	}
	// 정렬
	private void sorting(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr.length-1; j++) {
				//System.out.println(i + ">" + Arrays.toString(arr));
				//bubble sort- 정렬 알고리즘 중 하나
				//자료구조, 알고리즘 공부하자
				if(arr[j] > arr[j+1]) {
					// swap 자리바꾸기
					int tmp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = tmp;
				}				
			}
		}
	}
	// 배열출력
	public void prn() {
		int[] arr = make();
		sorting(arr);
		//Arrays,sort(arr);
		System.out.print("[ ");
		for(int i = 0; i < arr.length; i++ ) {
			System.out.print(arr[i] + "");
		}
		System.out.println("]");
	}
}
