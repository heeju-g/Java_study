package com.test03;

public class MTest {
	public static void main(String[] args) {
		/*
		 * 1. 같은 패키지에 Score클래스를 만들자.
		 * 2. Score class에서,
		 *    kor, eng, math 값을 받아서, 세 값의 평균을 리턴하는
		 *    gerAvg 메소드를 만들자.
		 *    같은 패키지에서만 접근 가능하고, static영역에 저장
		 *    
		 *  3. Score class에서,
		 *  평균값을 받아서, 등급을 리턴하는 getGrade메소드를 만들자.
		 *  평균이 90.8보다 크면 "A"
		 *  80.0보다 크고 89.9점보다 작으면 "B"
		 *  70.0점보다 크고 79.9점보다 작으면 "C"
		 *  60.0점보다 크고 69.9보다 작으면 "D"
		 *  그 외에는 "F"를 리턴
		 *  어디서나 접근 가능하고ㅡ Static영역에 저장된다.
		 *  4. MTest class 에서 Score 클래스의 두 메소드를 호출해서
		 *  리턴받은 값을 출력하자.
		 *  예 : 홍길동 님의 평균은 98.99점이고, 등급은 "A"입니다.
		 * 
		 */
		String name = "홍길동"	;
		int kor = 100;
		int eng = 40;
		int math = 84;
		//int r = Score.getAvg(kor, eng, math);
		//double s = Score.getGrade(i);
		double avg = Score.getAvg(kor, eng, math);
		String grade = Score.getGrade(avg);
		//                                          (""는 역슬래시)
		System.out.printf("%s 님의 평균은 %.2f점 이고, 등급은 \"%s\" 입니다.",
				name, avg, grade);
	}

}
