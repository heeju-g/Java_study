package com.test03;

public class Score {
	static double getAvg( int kor, int eng, int math) {
		
		//int sum = kor + eng + math;
		//res = (double)sum /3 ;
	    // return res;
		// 내가 한 것 : double i = (kor + eng + math)/3;
		//				return i;
		return (double)(kor + eng + math)/3;
	}
	public static String getGrade(double avg) {
		switch ((int)avg/10){
		case 10 :
		case 9 :
			return "A"	;
		case 8 :
			return "B"	;
		case 7 :
			return "C"	;
		case 6 :
			return "D"	;
		default :
			return "F";
		
		}
		
	}

}
