package com.test;

import java.util.Vector;

public class MTest02 {
	public static void main(String[] args) {
		Vector<String> v = new Vector<String>();
		v.add("홍길동");
		v.add("이순신");
		v.add("강호동");
		v.add("유재석");
		v.add("신동엽");
		v.add("조세호");

		System.out.println(v);
        //이렇게 쓰면 주소값도 나와야하는데 안나옴. toString이 오버라이드 되어있는 것
		// prnVector(v);
		transElement(v);
	}

	public static void prnVector(Vector<String> v) {
		// <홍길동,이순신, 강호동, 유재석, 신동엽, 조세호>로 출력

		System.out.print("<");
		/*
		 * for(int i = 0;i < v.size(); i++) { System.out.print(v.get(i) + " "); }
		 */
		// 향상된 for문(forEach문) for( : ) 오른쪽 안의 값들을 하나하나 왼쪽에 넣은 뒤 반복문 끝나면 그다음 값 넣고
		for (String s : v) {
			System.out.print(s + " ");
		}
		System.out.println(">");
	}

	public static void transElement(Vector<String> v) {
		// 1. 홍길동의 인덱스를 찾아, 해당 인덱스의 값을 홍길순으로 바꿔라
		v.set(v.indexOf("홍길동"), "홍길순");
		System.out.println(v);
		// 2. ~신으로 끝나는 객체를 찾아서, 신을 자로 바꾸자
		for (int i = 0; i < v.size(); i++) {
			//endsWith는 String클래스 메소드임. 벡터안에 있는 값이 스트링값이니까(벡터 i번지값이 스트링이므로)
			if (v.get(i).endsWith("신")) {
				v.set(i, v.get(i).replace("신", "자"));
			}
		}
		// 3. 마지막 글자가 호인 객체를 찾아서 있으면 삭제하라
		System.out.println(v);
		for(String s : v) {
			if(s.endsWith("호")) {
				//java.util.ConcurrentModificationException
				//예를 들어 v안에 5개 있다고 하면, for는 몇개 할 지 아는데 중간에 1개를 remove해서 사라지니까 에러
				//v.remove(s);
			}
			
		}
		for(int i = 0;i < v.size();i++) {
			//얘는 i<v.size 이 조건이 참인지만 보고 하는 거라서 됨.
			if(v.get(i).endsWith("호")) {
				v.remove(i);
			}
		}

	}

}
