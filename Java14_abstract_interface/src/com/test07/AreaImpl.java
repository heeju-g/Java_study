package com.test07;

public abstract class AreaImpl implements Area{
	
	private String result;
	
	@Override
	//공통된 부분
	public void print() {
		System.out.println(Area.PRINT + result);
	}
	
	@Override
	//abstract붙음. 추상메소드로 자식들이 구현해줘야하는 부분
	public abstract void make();
	// setter : 필드값을 내가 원하는 걸로 저장
	public void setResult(String result) {
		this.result = result;
	}
}
