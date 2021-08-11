package com.test05;

public interface TV {
	int volumeUp();
	int volumeDown();
	
	/*
	 * IgTV 클래스를 만들자
	 * - private int volume;
	 * - volumeUp() 메소드에서는 현재 볼륨에 더하기 3;
	 * - volumeDown()메소드에서는 현재 볼륨에 -3;
	 *  toString () 메소드에서는 "IgTV의 현재 볼륨은 n입니다."
	 * - 생성자가 호출될 시, "IgTV가 켜졌습니다."
	 * 
	 * SamsongTV 클래스만들자
	 * - private int volume;
	 * - volumeUp() 메소드에서는 현재 볼륨에 더하기 5;
	 * - volumeDown()메소드에서는 현재 볼륨에 -5;
	 *  toString () 메소드에서는 "SamsongTV의 현재 볼륨은 n입니다."
	 * - 생성자가 호출될 시, "SamsongTV가 켜졌습니다."
	 */

}
