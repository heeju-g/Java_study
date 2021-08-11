package com.test02;

import java.util.Arrays;

public class ShallowCopy {
	public static void main(String[] args) {
		//referance복사 (얕은 값 복사, 주소값 복사)
		int[] original = {10,20,30,40};
		int[] copy = original;
		// original배열의 주소값을 copy배열에 넣겠다. 배열은 참조타입이니까
		// original이라는 변수에는 값이 있는게 아니라 주소값이 있는 것.
		System.out.println(Arrays.toString(original));
		System.out.println(Arrays.toString(copy));
		System.out.println(original == copy);
		copy[1]= 200;
		System.out.println(Arrays.toString(original));
		System.out.println(Arrays.toString(copy));
	    System.out.println("---------");
	    System.out.println(original.hashCode());
	    System.out.println(copy.hashCode());
	}

}
