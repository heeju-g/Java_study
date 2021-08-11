package com.generic;

public class MTest {
	public static void main(String[] args) {
		Emp emp01 = new Emp();
		emp01.setEmpno("a111");
		emp01.setEname("홍길동");
		System.out.println(emp01);
		
		Emp emp02 = new Emp();
		emp02.setEmpno(222);
		emp02.setEname("김선달");
		System.out.println(emp02);
		//empno는 문자열이든 숫자열이든 다 들어갈 수 있음. 그냥 T라고 특정해놨을 뿐이니까.
		//emp01.setEmpno((int)emp01.getEmpno()+1); 에러(타입을 맘대로 넣어서)
		emp02.setEmpno((int)emp02.getEmpno()+1);
		System.out.println(emp01);
		System.out.println(emp02);
		System.out.println("-------");
		Emp<Integer> emp03 = new Emp<Integer>();
		//emp03.setEmpno("111"); Emp<> 써서 타입을 숫자로 강제했으니까 에러
		emp03.setEmpno(111);
		
		Emp<Integer> emp04 = new Emp<Integer>(113, "이순신");
		emp04.setEmpno(114);
		System.out.println(emp04);
	}

}
