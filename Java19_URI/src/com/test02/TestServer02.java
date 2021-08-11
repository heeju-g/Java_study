package com.test02;

import java.io.*;
import java.net.*;

public class TestServer02 {
	public static void main(String[] args) {
	//TCP
	
		ServerSocket serverSocket = null; //서버	
		Socket serviceSocket; //접속될 클라이언트
		PrintWriter out = null; //출력객체. 서버입장에서 출력 -> 클라이언트로
		BufferedReader in = null; //입력객체. 클라이언트로부터 서버로
		
		try {
			//서버객체
			serverSocket = new ServerSocket(9999);
		} catch (IOException e) {
		}
		
		while(true){
			System.out.println("client를 기다립니다...");
			try {
			//client가 접속 요청하면 serverSocket이 접속을 허용함
				//서버소켓에 클라이언트가 접속
				//서버에 연결된 애를 serviceSocket에 담아두자
				serviceSocket = serverSocket.accept();
				System.out.println("client가 접속했습니다...");
				//클라이언트에게서 받은 내용을 라인 단위로 읽음
				//in.readLine()
				//클에서 흘러온 데이터(getInputStream) 읽긴 읽는데(InputStreamReader) buffer에 담아서 읽을 거야
				in = new BufferedReader(new InputStreamReader(serviceSocket.getInputStream()));
				//클라이언트에게 보낼 거. true는 데이터 보내고 다 보냈다고 말해주는거 (오토플러쉬)
				out = new PrintWriter(serviceSocket.getOutputStream(),true);
				
				String inputLine;
				//라인단위로 읽기
				while((inputLine = in.readLine()) != null){
					//client가 입력한 메세지를 읽어서 출력하란 명령
					System.out.println("client가 보낸 메시지 : " + inputLine);
					//클라이언트한테 보냄
					out.println(inputLine);
				}
				
				out.close();
				in.close();
				serviceSocket.close();
				serverSocket.close();
				
				System.out.println("client에 데이터 전송했습니다...");
				
			} catch (IOException e) {
			}
		}
	}
}
