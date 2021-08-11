package com.vehicle;

public class SportCar extends Car {
	
	public SportCar() {
		
	}
	public SportCar(int speed) {
		super(speed);
		//this.speed = speed;
	}
	public void accelPedal() {
		//System.out.println("속도가 더 빨리 증가합니다");
		
		//speed += 15;
		//speed = speed +15;
		setSpeed(getSpeed()+ 15);
		System.out.println("속도가 더 빨리 증가합니다");
	}
	public void breakPedal() {
		setSpeed(getSpeed()- 15);
		//speed -= 15;
		if(getSpeed() > 0) {
			System.out.println("속도가 더 빨리 줄어듭니다");
			
		}else {
			System.out.println("멈췄습니다");
			setSpeed(0);
		}
	}

}
