package com.test01;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MTest05 {
	public static void main(String[] args) {
		File fi = new File("b.txt");
		MyOutput(fi);
		MyInput(fi);
	}

	private static void MyInput(File fi) {	
		try(FileReader fr = new FileReader(fi);){
			int ch;
			//fr.read읽어서 하나하나 ch에 담아두는데 모든 데이터 담고 끝나면 -1을 리턴함
			while((ch = fr.read())!= -1) {
				System.out.print((char)ch);
			}
		} catch (FileNotFoundException e) {			
			e.printStackTrace();
		} catch (IOException e) {			
			e.printStackTrace();
		}
	}

	private static void MyOutput(File fi) {		
		//try with resources : try의 괄호 안에 close해야하는 명령문을 작성하면
		//자동으로 close. 때문에 close안해줘도 됨
		try(FileWriter fw = new FileWriter(fi)){
			fw.write("연습중입니다");
			fw.append("abcd\n");
		} catch (IOException e) {
			e.printStackTrace();
		}
	
		
	}

}
