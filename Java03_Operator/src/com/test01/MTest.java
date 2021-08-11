package com.test01;

public class MTest {
	
	// 1. 상수 : 변수 앞에 final을 붙인다.
	public static final int TEN = 10;
	
	public static void main(String[]args) {
		System.out.println(opr01(TEN,3));
		
		System.out.println(opr02());
		
		opr03(TEN, 3);
		opr04();
		//System.out.println(opr04()); 오류뜸
		opr05();
		boolean result = opr06();
		System.out.println(result);
		
		opr07();
	}
	public static String opr01(int a, int b) {
		System.out.printf("%d + %d = %d\n", a, b, a+b);
		System.out.printf("%d - %d = %d\n", a, b, a-b);
		System.out.printf("%d * %d = %d\n", a,b,a*b);
		System.out.printf("%d / %d = %d\n", a,b,a/b);
		System.out.printf("%d %% %d = %d\n", a,b,a%b);
		
		
		
		
		return "사칙연산 끝\n"	;
	}
	// 2. 대입연산( +=, -=, *=, /=, %=)
	public static String opr02() {
		int res = 0;
		System.out.println("res : "+ res); //0
		res = res + TEN;
		System.out.println("res :" + res); //10
		res = res + 3;
		System.out.println("res :" + res); //13
		
		//res = res + TEN;
		res += TEN;
		System.out.println("res : " + res); //23
		
		return "---------";
	}
	
	// 3. 증감연산자             10       3
	/*
	 * 증감연산 (++, --)
	 * 변수의 앞,뒤에 증가/증감연산자를 붙이게 되면, 변수가 가진 값을 1씩 증가, 증감하게 된다.
	 * 전위연산자(++a) : 연산자를 변수 앞에 붙이면, 연산을 먼저 하고, 값을 나중에 리턴한다.
	 * 후위연산자(a++) : 연산자를 변수 뒤에 붙이면, 값을 먼저 리턴하고 연산을 나중에 한다.
	 */
	public static void opr03(int a, int b) {
		System.out.println(a);   //10 (10)
		System.out.println(a++); //10 (11)
		System.out.println(++a); //12 (12)
		
		int result = a++ + --b + b++ + ++a;
		//result 결과는? 30
		//           12(13) 2(2)  2(3) 14(13)
		System.out.println(result);

		
	}
	// 4. 논리연산자
	public static void opr04() {
		// & : and (그리고)
		// | : or (또는)
		// 결과 -> true / false
		
		// & : 양 쪽 모두 TRUE 여야 TRUE
		
		System.out.println(true & true); //true
		System.out.println(true & false); //false
		System.out.println(false & true); //false
		System.out.println(false & false); //false
		
		// | : 둘 중 하나만 true 면 true
		System.out.println(true | true); // true
		System.out.println(true | false); //true
		System.out.println(false | true); //true
		System.out.println(false | false); //false
		
		System.out.println("------");
		
		// && : 앞의 값이 false면, 뒤의 조건을 확인하지 않음
		System.out.println(true && true); 
		System.out.println(true && false);
		System.out.println(false && true);//뒷부분은 확인 안하니까 dead code
		System.out.println(false && false); 
		// || : 앞의 값이 true면, 뒤의 조건을 확인하지 않음
		System.out.println( true || true);
		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);
		
		System.out.println("----------");
		int a = 2;
		int b = 3;
		
		System.out.println((a>b)&&(a<b));//앞만 보고 false나옴
		
		
		
	}
	// 5. 비교연산 
	public static void opr05() {
		int i =10;
		System.out.println("--");
		System.out.println( i == TEN);
		System.out.println(i != TEN);
		System.out.println(i > 50);
		System.out.println(TEN <= 50);
		
	}
	// 6. 삼항연산
	public static boolean opr06() {
		// 타입 변수 = (조건) ? 참일떄 리턴값 : 거짓일떄 리턴값;
		// 타입 = 참 리턴값 = 거짓 리턴값의 타입이 일치!
		
		int a = 2;
		int b = 3;
		int i = (a>b) ? a+b : a-b;
		System.out.println(i);
		
		boolean res = (a>b) ? true : false;
		return res;
	}
	// 7. 비트연산
	public static void opr07() {
		// &, |, ^, ~, <<, >>
		// 0, 1비트 상태에서 연산한다.
		
		// int -> 4byte -> 32 bit
		int a = 10;
	//  0000 0000 0000 0000 0000 0000 0000 1010
		int b = 2;
	//  0000 0000 0000 0000 0000 0000 0000 0010
		System.out.println(a & b);
	//  0000 0000 0000 0000 0000 0000 0000 1010
	//  0000 0000 0000 0000 0000 0000 0000 0010
    // &---------------------------------
	//  0000 0000 0000 0000 0000 0000 0000 0010
		System.out.println(a | b);
	//  0000 0000 0000 0000 0000 0000 0000 1010
    //  0000 0000 0000 0000 0000 0000 0000 0010
    //  |---------------------------------
    //  0000 0000 0000 0000 0000 0000 0000 1010
		System.out.println(~a);
	//  0000 0000 0000 0000 0000 0000 0000 1010
	//  1111 1111 111 1111 1111 1111 1111 0101
		System.out.println("---------");
		
		int c = 10;
		//0000 0000 0000 0000 0000 0000 0000 1010
		System.out.println(Integer.toBinaryString(c));
		System.out.println(Integer.toBinaryString(c >> 2));
		System.out.println(c >> 2);
		// 00 0000 0000 0000 0000 0000 0000 0000 10
		
		System.out.println(Integer.toBinaryString(c<<1));
		// 000 0000 0000 0000 0000 0000 0000 1010 0
		System.out.println(c << 1);
							
	}	
}
