package com.test06;

public class MTest {
	public static void main(String[] args) {
		//새로운 MyProfile객체가 생성됐고, String타입의 name과 phone을 받았오는
		MyProfile my = new MyProfile("심희주", "010-5433-1026");
		//this.loc = loc; 였으니까 loc에 "서울시 송파구" 입력된 상태
		my.jobLoc("서울시 송파구");
		//printProfile메소드("이름 :name, 전화번호 : phone") 그대로 사용
		//위에서 입력된 loc받아와서 ("회사주소 :" + loc)출력해주고
		//인터페이스 JOB에서 JOB_ID에 IT넣어준거
		//("직무 :" + JOB_ID)에 그대로 출력해주면 됨.
		my.display();
	}

}
