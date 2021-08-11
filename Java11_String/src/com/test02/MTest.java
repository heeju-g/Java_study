package com.test02;

public class MTest {
	// string을 +연산할 때, 내부적으로는 StringBuilder로 변환하여 연산함.(자바1.5)
	public static void main(String[] args) {
		//stringTest();
		stringBufferTest();
	}
	public static void stringBufferTest() {
		StringBuffer sb = new StringBuffer();
		//StringBuffer는 mutable. 값은 바뀌지만 주소값 그대로임. 
		//기본타입처럼 사용 불가능, 그건 스트링만 가능
		sb.append("안녕하세요!")
		  .append("저는")
		  .append("심희주입니다");
		//매소드 체이닝
		 
		System.out.println(sb);
		System.out.println(sb.hashCode());
		
		sb.replace(0, 6, "하이!");
		System.out.println(sb);
		System.out.println(sb.hashCode());
		//sb에 대입안해도 값이 바뀜. 주소값은 그대로
		
		sb.reverse();
		System.out.println(sb);
		
		
	}
	public static void stringTest() {
		//immutable
		String s = "안녕하세요";
		s += "저는";
		//주소값 바뀜. 새로운 애가 string pool에 또 저장됨. 변수에 새로운 애가 연결
		s += "심희주입니다";
		System.out.println(s);
		System.out.println(s.hashCode());
		
		//s.replace("안녕하세요", "하이"); -> 안녕하세요저는심희주로 나옴.
		//s에 대입하지 않으면, 변하지 않는다. 새로 만들어졌지만 연결이 안되었기 때문에.
		s = s.replace("안녕하세요", "하이");
		System.out.println(s);
		
	}

}
