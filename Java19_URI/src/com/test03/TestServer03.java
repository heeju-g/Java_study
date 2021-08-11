package com.test03;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class TestServer03 {
//UDP
	public static void main(String[] args) throws Exception {
		//서버 생성
		DatagramSocket ds = new DatagramSocket(8888);
		System.out.println("서버입니다.");
		//받을 내용. 보내준 걸 담을 공간
		byte[] buff = new byte[1024];
		//패킷을 받을 준비
		DatagramPacket recieveP = new DatagramPacket(buff, buff.length);
		//클라이언트가 보낸 패킷을 받음
		ds.receive(recieveP);
		
		
		System.out.println(new String(recieveP.getData()));
		
		ds.close();
		ds.disconnect();
	}
}
