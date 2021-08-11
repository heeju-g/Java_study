package com.test;

import java.util.Vector;

public class MTest01 {
	public static void main(String[] args) {
		//Vector(10,5) -> initial capacity 10/ capacity increase 5 
		//10의 용량을 가진 벡터를 만드는데, 꽉찬 후에 값을 또 넣으면 용량이 5증가
		Vector<Integer>	v = new Vector<Integer>(10,5);
		System.out.println(v.size()+ " : " + v.capacity());
		for(int i = 0;i < 9;i++) {
			v.add(i);
		}
		System.out.println(v.size()+ " : " + v.capacity());
		System.out.println(v);
		v.add(9);
		System.out.println(v.size()+ " : " + v.capacity());
		System.out.println(v);
		
		//사이즈도, 용량도 늘어남
		v.add(10);
		System.out.println(v.size()+ " : " + v.capacity());
		System.out.println(v);
	
		Vector vector = new Vector();
		//문자,숫자 상관없이 다 들어감.
		vector.add("1");
		vector.add(2);
		vector.add(3);
		System.out.println(vector);
		
	}

}
