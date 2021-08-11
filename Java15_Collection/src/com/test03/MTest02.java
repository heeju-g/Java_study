package com.test03;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import com.compare.Score;

public class MTest02 {
	public static void main(String[] args) {
		Set<Score> set = new HashSet<Score>();
		set.add(new Score("홍길동", 100, 90, 60));
		set.add(new Score("이순신", 50, 95, 100));
		set.add(new Score("김선달", 88, 100, 58));
		//printSet(set);
		transElement(set,"이순신",10);

	}
	private static void transElement(Set<Score> set, String name, int kor) {
		//set에서 name을 찾아서 국어점수 값을 kor로 바꾸고 전체 출력
		Iterator<Score> ir = set.iterator();
		while(ir.hasNext()) {
			Score temp = ir.next();
			if(temp.getName().equals(name)) {
				//temp해주기 전에 그냥 ir.next로만 두번 했을 땐 커서 옮겨서 next랑 name같은지 보고 또 next썼으니까 김선달이 바뀐 것.
				//ir.next를 한번만 하고 변수에 담아줘서 해결
				temp.setKor(kor);
			}
		}
		System.out.println(set);
	}

	private static void printSet(Set<Score> set) {
		// 방법1
		/*
		 * for (Score sc : set) { System.out.println(sc); }
		 */
		// 방법2
		/*Object[] objectArr = set.toArray();
		 *부모타입으로 바꿔서 담아준 상태
		 *
		 * for(int i =0; i < objectArr.length;i++) { //얘가 현재 object타입이니까 get()가져오려면 다시
		 * Score타입으로 바꿔줘야함. //object[i]는 부모타입입
		 * System.out.println(((Score)objectArr[i]).getName()); }
		 */
		// 방법3
		// iterator : 콜렉션의 저장 요소들을 읽어들이는 표준화된 방법
		Iterator<Score> iterator = set.iterator();
		while (iterator.hasNext()) {
			//커서 다음에 값이 있니? 있으면 그 다음 애 출력해와
			System.out.println(iterator.next());
		}
	}

}
