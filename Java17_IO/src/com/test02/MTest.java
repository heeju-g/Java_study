package com.test02;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.io.IOException;

public class MTest {
	public static void main(String[] args) throws IOException {
		String fileName = "a.png";
		//a.jpg파일 읽어서 복사할 것
		//FileInputStream fi = new FileInputStream(fileName);
		//BufferedInputStream bi = new BufferedInputStream(fi);
		BufferedInputStream bi = new BufferedInputStream(new FileInputStream(fileName));
		FileOutputStream fo = new FileOutputStream(new File("b.png"));
		int a = 0;
		while((a = bi.read())!= -1) {
			fo.write(a);
		}
		//나중에 만든 객체부터 먼저 닫자.
		fo.close();
		bi.close();
	}

}
