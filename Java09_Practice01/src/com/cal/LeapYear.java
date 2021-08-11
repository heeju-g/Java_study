package com.cal;

import java.util.Scanner;

/*① 서력 기원 연수가 4로 나누어 떨어지는 해는 우선 윤년으로 하고,
 *② 그 중에서 100으로 나누어 떨어지는 해는 평년으로 하며,
 *③ 다만 400으로 나누어 떨어지는 해는 다시 윤년으로 정하였다. 이로써 1년의 평균길이를 365.2425일로 정하여 역에 썼으므로 실제의 1년보다 0.0003일이 길다.
 * 
 * 힌트 1 & 2 || 3
 * 1을 만족하면서, 100으로 나누어 떨어지지 않으면 윤년이다.
 * 
 */
public class LeapYear {
	public static boolean isLeapYear(int year) {
		boolean isLeap = false;
		// 2) year%100 ! = 0
		// 3) year% 400 = 0
		if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
			isLeap = true;
		}
		return isLeap;
	}

	public static void main(String[] args) {
		// 연도를 입력받아, 입력받은 년도가 윤년이면 "xxxx년은 윤년이 맞습니다."출력
		// 아니면 "xxxx년은 윤년이 아닙니다." 출력
		Scanner sc = new Scanner(System.in);
		System.out.println("연도입력 : ");
		int year = sc.nextInt();
		if(isLeapYear(year)) {
			System.out.println(year + "년은 윤년이 맞습니다");
			
		}else {
			System.out.println(year + "년은 윤년이 아닙니다");
		}
	}

}
