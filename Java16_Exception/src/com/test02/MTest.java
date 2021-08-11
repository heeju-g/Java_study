package com.test02;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MTest {
	public static void main(String[] args) {
		int a = 0;
		try {
			System.out.println("숫자를 입력해 주세요");
			Scanner sc = new Scanner(System.in);
			a = sc.nextInt();

			if (a == 4) {
				//throw 하면 예외를 발생시킬 수 있다
				throw new MyException("반장이 좋아하는 4");
			}
		} catch (MyException e) {
			System.out.println("MyException 발생");
			e.printStackTrace();
		
		}catch(InputMismatchException e) {
			System.out.println("숫자가 아닌 다른것");
			e.printStackTrace();
		}catch(ArithmeticException e) {
			System.out.println("계산 잘못");
			e.printStackTrace();
		}catch(Exception e) {
			System.out.println("뭔진 몰라도 예외 발생");
			e.printStackTrace();
		}
		//정상실행이던 예외로 캐치문을 실행했던 마지막에 무조건 수행해야 하는 명령문 finally
		finally {
			System.out.println("입력한 값 : " +a);
		}
	}

}
