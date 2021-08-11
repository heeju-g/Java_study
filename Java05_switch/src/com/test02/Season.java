package com.test02;

public class Season {
	
	public String prn(int month) {
		String result = null;
		switch (month) {
		case 12 :
		case 1 :
		case 2 :
			result = "겨울";
			break;
		case 3 :
		case 4 :
		case 5 :
			result = "봄";
			break;
		case 6 :
		case 7 :
		case 8 :
			result = "여름";
		case 9 :
		case 10 :
		case 11 :
			result = "가을";
			break;
		
		}
		return result;
	}
 /* 2. Season class에서 어디서나 접근 가능하고, int형 "월"값을 받으면
		 *String으로 리턴하는 prn메소드를 만들자(non - static)
		 * 3. Season class의 prn method에서는 
		 * 입력받을 월 값이 12, 1, 2이면 "겨울" 리텅
		 * 3, 4, 5 면 "봄" 리턴
		 * 9, 10, 11이면 "가을" 리턴
		 * (switch를 사용하자)
  * 
  */

	
}
