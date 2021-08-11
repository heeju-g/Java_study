package com.test06;

public class Profile {
	private String name;
	private String phone;
	
	//파라미터 두개짜리 생성자
	public Profile(String name, String phone) {
		this.name = name;
		this.phone = phone;
	}
	//메소드호출하면 이름,번호 와서 출력됨 
	public void printProfile() {
		System.out.println("이름 :" + name);
		System.out.println("전호번호 :" + phone);
	}

}
