package com.test01;

public class MTest01 {
	public static void main(String[] args) {
		prn01();
		prn02(2);
	}
	public static void prn01() {
		// if 는 순차적으로 모든 코드를 읽어들이지만
		// switch는 해당 case로 jumping하기 때문에 컴파일러가 작업하는데 수월하다.
		// fall through
		int i = 2;
		// switch(식 또는 값이 들어감)
		switch(i) {
		case 1:
			System.out.println("1입니다.");
			break;
		case 2:
			System.out.println("2입니다.");
			break;
		case 3:
			System.out.println("3입니다.");
			break;
		case 4:
			System.out.println("4입니다.");
			break;
		}
	}
	public static void prn02(int i) {
		
		switch (i)	{
		case 1 :
		case 3 :
			System.out.println("홀수");
			break;
		case 2 :
		case 4 :
			System.out.println("짝수");
			break;
		default :
			System.out.println("1~4사이의 숫자가 아닙니다.");
		}
	}
	

}
