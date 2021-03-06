package com.a;

// Public class AAA (extends Object)
public class AAA {
	// field
	private int abc;
	// constructor (생성자)
	// 기본생성자
	public AAA() {
		System.out.println("AAA 기본 생성자");
	}
	// 파라미터 있는 생성자
	public AAA(int abc) {
		//this : 나 객체(변수에 들어간 실제 값)
		this.abc = abc;
		System.out.println("AAA 파라미터 한개 있는 생성자");
	}
	// getter & setter
	public int getAbc() {
		return abc;
	}
	public void setAbc(int abc) {
		// this : instance AAA 나 객체	. 힙 영역에 만들어진 AAA객체
		// 여기는 지역변수랑 전역변수랑 이름이 같아서 this생략 못함
		this.abc = abc;
	}
	public void prn() {
		System.out.println("AAA의 prn()");
	}
	
}
/*
 * 생성자
 * 1. 클래스 이름과 동일하되, 리턴타입없고, 객체 생성시 접근제한자는 public
 * class Test{
 *     // 생성자
 *     public Test(){
 *     }
 * }
 * 2. 생성자는 객체 생성을 하는 new연산자와 함께 사용하며ㅣ
 * 생성시 단 한번만 호출된다.
 * Test t1 = new Test();
 * 3. 메소드처럼 객체 및 클래스명으로 호출할 수 없다.
 * t1.Test안됨
 * 4. overload 할 수 있다.
 * class Test{
 *   //기본생성자(default constructor)
 *   public Test(){
 *   }
 *   public Test(int a){
 *   }
 *   public Test(int a, int b){
 *   }
 * }
 * 5. 생성자를 명시하지 않으면 기본 생성자가 제공되어 field를 초기화하고,
 * 명시된 생성자를 선언하게 되면, 명시된 생성자만 호출 가능하고 
 * 기본 생성자는 제공되지 않는다.
 * class AA{
 *     // new AA(); 가능
 * }
 * class BB{
 *     public BB(){
 *     }
 *     // new BB(); 가능
 * }
 * class CC{
 *    public CC (int a){
 *    }
 *    // new CC(); 불가능
 *    // new CC(10); 가능
 *}
 * 6. 생성자는 상속되지 않는다.
 * 7. 생성자는 내부 호출할 수 있으며, 키워드는 this()로 사용한다.
 * 8. 생성자의 목적은 객체 생성 및 field 초기화에 있다.
 */