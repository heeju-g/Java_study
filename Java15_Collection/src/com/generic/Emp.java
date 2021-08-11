package com.generic;

// <> : generic =>  타입을 강제함
// T : type   E : element  K : key V : Value
public class Emp<T> {
	private T empno;
	private String ename;
	
	public Emp() {
		
	}
	public Emp(T empno, String ename) {
		this.empno = empno;
		this.ename = ename;
	}
	public T getEmpno() {
		return empno;
	}
	public void setEmpno(T empno) {
		this.empno = empno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String toString() {
		return empno + " : " + ename;
	}


}
