package com.test02;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import com.compare.Score;

public class MTest02 {
	public static void main(String[] args) {
		List<Score> list = new ArrayList<Score>();
		Score hong = new Score();
		hong.setName("홍길동");
		hong.setKor(100);
		hong.setEng(78);
		hong.setMath(39);
		list.add(hong);
		
		Score lee = new Score("이순신", 79, 100, 78);
		list.add(lee);

		list.add(new Score("김선달", 50, 90, 100));
		System.out.println(list);
		//넣은 순서대로 출력됨
		System.out.println("------------");
		//Collections.sort는 Comparator가지고 정렬해주는데 얘는 compare메소드로 해줌
		//other1과 other2를 비교함
		//외부의 다른 애가 둘을 비교해주는 것임.
		//저번에 했던 Comparable의 comparTo를 사용해서 this와 other를 비교함. 
		//나랑 다른 애랑 비교하는 거기 떄문에 나 안에 있어야함(예를 들어 a,b,c객체가 있으면 그 각자가 나임)/Comparable의 comparTo가
		
		Collections.sort(list, new MySortTest());
		//평균 낮은 순대로 출력됨
		System.out.println(list);
		
		
	}

}
//클래스 또 만들 순 있는데 퍼블릭은 안됨. 클래스 안에 또 클래스 만드는 것도 가능
// + 앞의 인자가 더 큰 값
// 0 같음
// - 앞의 인자가 더 작은 값
class MySortTest implements Comparator<Score>{
	public int compare(Score o1, Score o2) {
		if(o1.getAvg()> o2.getAvg()) {
			return 1;
		}else if(o1.getAvg()< o2.getAvg()) {
			return -1;
		}
		return 0;
	}
}
