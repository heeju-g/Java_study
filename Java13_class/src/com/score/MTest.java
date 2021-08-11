package com.score;

public class MTest {
	public static void main(String[] args) {
		Score lee = new Score();
		lee.setName("이순신");
		lee.setKor(85);
		lee.setEng(89);
		lee.setMath(100);
		
		Score hong = new Score("홍길동", 100, 79, 89);
		
		//print,printf,println은 해당 객체의 주소값 호출해줌
		//때문에 hong.toString이랑 hong이랑 값이 같게 나옴
		System.out.println(lee);
		System.out.println(hong.toString());
	}

}
