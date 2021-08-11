package com.test07;

import java.util.Scanner;

public class Circle extends AreaImpl {
	
	@Override
	public void make() {
		Scanner sc = new Scanner(System.in);
		System.out.println("반지름을 입력해 주세요 : ");
		
		int r = sc.nextInt();
		//result만들기...
		double res = Math.PI*Math.pow(r, 2);
		//result = res;
		/*
		 * Double.toString(res);
		 * String.valueOf(res);
		 */
		//스트링에 다른 타입 더해지면 스트링이니까
		setResult(res+"");

	}
	public void print() {
		
	
		System.out.print("원의 " ); 
		super.print();
		
	}
}
