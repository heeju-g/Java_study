package com.test01;

public class MTest01 {
	public static void main(String[] args) {
		// array 만드는 방법
		//1. 
		int [] a;       //선언
		a = new int[5]; //정의
		a[0] = 1;       //초기화
		a[1] = 2;
		a[2] = 3;
		a[3] = 4;
		a[4] = 5;
		
		System.out.println(a[2]);
		System.out.println(a[1]+ a[3]);
		
		//2.
		int [] b = new int[]{5,4,3,2,1}; // 선언, 정의, 초기화 한번에
		System.out.println(b[1]);
		
		//3.
		int [] c = {7,8,9,1,2};  //선언하고 바로 초기화
		System.out.println(c);
		prn(c);
		String[] s = new String[] {"have", "a", "nice", "day"};
		modi(s);
	}          
	public static void modi(String[]arr) {
		//nice를 good으로 바꾸로 전체출력하자
		//arr[2] = "good";
		 for(int i= 0;i< arr.length;i++) {
			 if(arr[i].equals("nice")) {
				 arr[i]="good";
				 
			 }
			 System.out.printf("%s ", arr[i]);
		 }
	}
	                      //아규   파라
	public static void prn(int[]arr) {
		for(int i = 0;i < arr.length; i++) {
			System.out.printf("%2d", arr[i]);
		}
		System.out.println();
	}

}
