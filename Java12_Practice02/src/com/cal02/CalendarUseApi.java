package com.cal02;

import java.util.Calendar;

/*
 * java.util.Calendar사용하여 달력만들기.
 */
public class CalendarUseApi {
	public void prn(int year, int month) {
		//java.util패키지의 Calendar를 사용
		// Calendar cal = new Calendar(); 이렇게 못함
		// singleton이라서-> 객체를 단 한번만 생성
		// getInstance사용 - cal 변수에 현재날짜를 저장함.
		Calendar cal = Calendar.getInstance();
		Calendar cal2 = Calendar.getInstance();
		
		// Scanner사용하여 연도,월 입력받은 걸로 출력 2021년 12월
		System.out.printf("\t\t%d년 %d월\n", year, month);
		// 달력에 요일 표시 출력 
		System.out.printf("일\t월\t화\t수\t목\t금\t토\n");
		
		//cal.set으로 연도,월,일을 설정함. year년 month년 1일로 Calendar객체설정
		//java에서 month 0~11 - ex) 12월이면 11
		cal.set(year, month-1,1);
		
		// start 변수에 시작일의 요일을 구함.(DAY_OF_WEEK사용)
        // 1-7의 값을 리턴해줌. ex) 시작일의 요일이 수요일이면 4.
		// year년 month월 1일의 요일 값
		int start = cal.get(Calendar.DAY_OF_WEEK);
		
		// 만약, 수요일(4)이 시작일이면 그 이전의 일,월,화요일은 공백이어야 하니까
		for(int i = 1; i < start; i++) {
			System.out.printf("\t");
		}
		// 해당 month의 마지막 날짜가 뭔지?
		// i : 1일부터 해당 연,월의 마지막 일까지 1~말일까지 출력
		 for(int i = 1; i <= cal.getActualMaximum(Calendar.DATE);i++) {
			System.out.printf("%d\t", i);
			
			// 요일값(1~7)을 증가시키면서 7의 배수가 되면
			// 다음 줄로 넘어가야 하기 떄문에 println 
			if(start % 7 == 0) {
				System.out.println();
			}
			// 하루 넘어가면서 날짜도 증가해야 하니까
			start++;
		}
	}

}
