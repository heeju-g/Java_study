package com.compare;

import java.util.Arrays;

public class MTest {
	public static void main(String[] args) {
		Score[] qclass = new Score[3];
		Score hong = new Score();
		hong.setName("홍길동");
		hong.setKor(100);
		hong.setEng(78);
		hong.setMath(39);
		qclass[0] = hong;

		Score lee = new Score("이순신", 79, 100, 78);
		qclass[1] = lee;

		qclass[2] = new Score("김선달", 50, 90, 100);

		for (Score s : qclass) {
			System.out.println(s);
		}
		System.out.println("-------------");
		//Arrays.sort부르면 qclass가 comparable상속받았는지 확인하고, 상속 받았으면
		// 그 안의 compareTo메소드를 이용해서 this나와 other를 비교해줌
		Arrays.sort(qclass);
		for (Score s : qclass) {
			System.out.println(s);
		}
	}

}
