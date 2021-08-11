package com.test01;

import java.util.InputMismatchException;
import java.util.Scanner;

//예외 처리의 이유 : 에러가 났다고 해서 그냥 작동을 정지해버리면 안되니까
public class ExceptionCalc {
	public int calculation() {
		int res = 0;
		while (true) {
			//try{ 에외가 발생할 수도 있는 코드 }
			//catch(발생할 수도 있는 예외 타입){해당타입의 예외 발생했을 때 수행할 명령문}
			try {
				res = inputNum() / inputNum();
				break;
				//e는 위에서 발생한 예외 객체의 변수같은 거
			} catch (InputMismatchException e) {
				System.out.println("숫자만 넣으라고");
				e.printStackTrace();
			} catch (ArithmeticException e) {
				System.out.println("0으로 나누면 안돼");
				e.printStackTrace();
			}
		}

		return res;
	}

	public int inputNum() {
		System.out.println("숫자만 입력해 주세요 : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		return n;
	}

}
