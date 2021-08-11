package com.test03;

import java.util.HashSet;
import java.util.Set;


public class MTest01 {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		set.add("1");
		set.add("3");
		set.add("5");
		set.add("2");
		set.add("6");
		set.add("4");
		set.add("7");
		set.add("3");
		set.add("3");
		//set이 정렬한 거 아님
		//set은 순서가 없고 중복이 불가능함.
		
		for(String s : set) {
			System.out.println(s);
			
		}
		findSetElement(set,"5");
	}
	public static void findSetElement(Set<String> set, String find) {
		//set에 있는 특정 요소가 find와 같은 값일 때, "5 찾았다!"라고 출력하자.
		//if(set.contains(find)) {
			//System.out.println(find + " 찾았다!" );
	    // }		
		//for(int i = 0;i < set.size(); i++) {
			//set.get(i);
		//} for문으로 저렇게 하려면 배열에 넣듯 i번지를 가져오려면 순서가 있어야 하는데 set은 순서없어서 그렇게 못함.
		//그렇기에 set에는 get(i)가 없음
		for(String s : set) {
			//지금 얘는 set안의 string가져온ㄴ 거니까 string의 api를 봐야함
			if(s.equals(find)){
				System.out.println(find + " 찾았다!");
				//contains써도 됨
			}
		}
	}
}
