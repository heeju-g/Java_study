package com.test06;

public class MyProfile extends Profile implements Display, Job {
	// Display,Job은 클래스아님. 인터페이스임(다중상속가능). Profile은 클래스(하나만 상속).
	// 객체는 클래스를 구현한 거니까 객체가 되려면 클래스가 있어야 하는 것.
	
	private String loc;
	//기본 생성자 안되는 이유가 뭘까 - 부모한테 기본생성자가 없어서 호출할 수가 없음
	
	public MyProfile(String name, String phone) {
		super(name,phone);
	}

	@Override
	//인터페이스 JOB의 jobLoc메소드 오버라이딩
	//setter의 기능을 하고있다. loc라는 필드를 위에 만들어놨는데, 내가 지금 loc를 넣어서 필드를 초기화 시킬거야
	public void jobLoc(String loc) {
		//this. 나객체
		this.loc = loc;

	}

	@Override
	//인터페이스 Display의 display오버라이딩
	public void display() {
		//Profile의 printProfile메소드("이름 :name, 전화번호 : phone") 그대로 사용
		//super - 부모객체. 객체는 클래스를 구현한 거니까 객체가 되려면 클래스가 있어야 하는 것.
		super.printProfile();
		//위 jobLoc메소드에 넣은 loc받아와서 출력
		System.out.println("회사주소 :" + loc);
		//인터페이스 JOB에서 JOB_ID 받아와서 출력
		//Job_ID - "SINGER";라고 할 수 없음. 이전에 static final 상수화되었기 때문.
		System.out.println("직무 :" + JOB_ID);
		                         //super.JOB_ID 불가능. super는 부모객체인데 JOB_ID는 인터페이스꺼라서 super사용못함
								//Job.JOB_ID는 가능

	}

}
