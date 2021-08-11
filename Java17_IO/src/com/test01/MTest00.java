package com.test01;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MTest00 {
	public static void main(String[] args) {
		File fi = new File("a.txt");
		try {
			MyOutput(fi);
			MyInput(fi);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}

	private static void MyInput(File fi) throws IOException {
		FileReader fr = new FileReader(fi);
		int ch;
		while ((ch = fr.read()) != -1) {
			System.out.print(ch);
		}
		fr.close();
	}

	private static void MyOutput(File fi) throws IOException {
		FileWriter fw = new FileWriter(fi,true);
		fw.write("abcdefg\n");
		fw.append("연습중입니다").append("java.io재미.\n\n");
		fw.close();
	}

}
