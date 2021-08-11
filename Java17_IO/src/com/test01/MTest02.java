package com.test01;

import java.io.File;

public class MTest02 {
	/*
	 * c:\ -> window
	 * /User/heeju/ -> linux(mac os)
	 */
	public static void main(String[] args) {
		File fi = new File("c:\\");
		//prnFolder01(fi);
		prnFolder02(fi);
	}
	private static void prnFolder02(File fi) {
		//파일과 폴더를 구분해서 출력
		//ex) file : 
		//    file :
		//    dir :
		// file의 총 갯수 : n개  
		// dir의 총 갯수 : m개
		int cntFile = 0;
		int cntDir = 0;
		
		for(File file : fi.listFiles()) {
			if(file.isFile()) {
				cntFile++;
				System.out.println("file : " + file);
			}else if(file.isDirectory()) {
				cntDir++;
				System.out.println("dir : " + file);
			}
		}
		System.out.println("file의 총 개수 : " + cntFile + "개");
		System.out.println("dir의 총 개수 : " + cntDir + "개");
	}
	private static void prnFolder01(File fi) {
		for(String list: fi.list()) {
			System.out.println(list);
		}
	}
	

}
