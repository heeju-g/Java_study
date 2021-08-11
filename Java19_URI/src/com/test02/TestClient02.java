package com.test02;

import java.io.*;
import java.net.Socket;

public class TestClient02 implements Runnable {
//스레드화
//예를 들어 서버가 있는데 client한명이 쓰는 동안 다른 애는 못쓰면 안되니까, 실행되는 동안 다른 애도 쓸 수 있도로 해놓는 것
	@Override
	public void run() {
		try{
			//clienSocket객체 생성
			Socket clientSocket;
			//서버처럼 입출력 스트림 만들고
			PrintWriter out = null;
			BufferedReader in = null;
			//하나 더 만듬
			BufferedReader stdin = null;
			
			System.out.println("server에 접속합니다...");
			//여기에 접속할거야. server클래스의 serviceSocket = serverSocket.accept();연결
			clientSocket = new Socket("localhost",9999);
			
			//출력(클라이언트에서 서버로)
			out = new PrintWriter(clientSocket.getOutputStream(),true);
			//입력(서버에서 클라이언트로)
			in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
			//콘솔창에 입력받은 걸 읽어서 버퍼로. 입력(console에서 code로). 
			stdin = new BufferedReader(new InputStreamReader(System.in));	
			
			String inputLine;
			//한줄씩 읽을거
			while((inputLine = stdin.readLine()) != null){
				out.println(inputLine);			
				System.out.println("server로부터 다시 받은 메시지 :" + in.readLine());
			}
			
			out.close();
			in.close();
			stdin.close();
			clientSocket.close();
			
			System.out.println("소켓을 닫는다...");
			
		}catch(IOException e){
		}
	}
	
	public static void main(String[] args) throws Exception{
		Thread t1 = new Thread(new TestClient02());
		t1.start();
	}
}
