package com.vehicle;

public class Truck extends Car {
	
	public Truck() {
		
	}
	public Truck(int speed) {
		super(speed);
	}
	public void accelPedal() {
		setSpeed(getSpeed()+ 5);
		System.out.println("속도가 더 느리게 증가합니다");
		//speed += 5;
	}
	public void breakPedal() {
		setSpeed(getSpeed() - 5);
		if(getSpeed()> 0) {
			System.out.println("속도가 더 느리게 줄어듭니다");
			
		}else {
			System.out.println("멈췄습니다");
			setSpeed(0);
		}
	}

}
