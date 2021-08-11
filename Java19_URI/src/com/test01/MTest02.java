package com.test01;

import java.io.DataInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;

public class MTest02 {
	public static void main(String[] args) throws IOException {
		URL url = new URL("https://cdn1.iconfinder.com/data/icons/system-black-circles/512/java-512.png");
		//자바가 서버랑 연결 url
		URLConnection urlConnection =  url.openConnection();
		urlConnection.connect();
		//inputstream : 서버에 있는 파일주소를 읽어옴 read
		DataInputStream din = new DataInputStream(urlConnection.getInputStream());
		//java에서 어떤 폴더에 저장해줘야함. 나한테서 나가는 것이니까 outputStream. write
		FileOutputStream fout = new FileOutputStream("a.png");
		
		byte[] b = new byte[1];
		while(din.read(b,0,1) != -1) {
			fout.write(b,0,1);
		}
		fout.close();
		din.close();
	}

}
