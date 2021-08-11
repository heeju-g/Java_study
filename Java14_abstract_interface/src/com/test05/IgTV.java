package com.test05;

public class IgTV implements TV {
	private int volume;
	public IgTV () {
		System.out.println("IgTV가 켜졌습니다");
	}

	@Override
	public int volumeUp() {
		volume +=3;
		return volume;
	}

	@Override
	public int volumeDown() {
		volume -=3;
		return volume;
	}
	//public void volume(toString volume) {
		//System.out.println("IgTV의 현재 볼륨은 " + volume + " 입니다");

	@Override
	public String toString() {
			return "IgTV의 현재볼륨은" + volume + "입니다";
			
	}
	

}
