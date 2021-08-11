package com.test01;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MTest03 {
	public static void main(String[] args) {
		File fi = new File("a.txt");
		MyOutPut(fi);
		MyInput(fi);
	}
    //read
	//InputStream : 파일에서 들어오는 것. byte가 기본
	private static void MyInput(File fi) {
		FileInputStream fin = null;
		try {
			fin = new FileInputStream(fi);
			int res = 0;
			while ((res = fin.read()) != -1) {
				System.out.print((char) res);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		} finally {
			try {
				//close해주는 게 중요
				fin.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
    //write
	//OuputStream : 코드에서 파일로 나가는 것
	private static void MyOutPut(File fi) {
		FileOutputStream fo = null;
		try {
			fo = new FileOutputStream(fi);
			for (int i = 65; i <= 90; i++) {
				fo.write(i);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fo.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
