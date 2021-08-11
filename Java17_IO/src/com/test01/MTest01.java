package com.test01;

import java.io.File;
import java.io.IOException;

public class MTest01 {
	public static void main(String[] args) {
		//해당 경로에 fi 생성
		File fi = new File("c:/TEST_IO");
		if(fi.exists()) {
			System.out.println("exists");
		}else {
			System.out.println("new");
			fi.mkdirs();
			
		}
		//fi 밑에 AA생성
		File aa = new File(fi, "AA");
		aa.mkdir();
		//fi 밑에 BB 생성
		File bb = new File(fi, "BB");
		bb.mkdir();
		//AA밑에 a.txt생성
		File a = new File(aa,"a.txt");
		//compile시 처리해야하는 예외 : checked exception
		try {
			a.createNewFile();
		} catch (IOException e) {
				e.printStackTrace();
		}
		
	}

}
