package kh.java.func;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UdpServer {

	public void main() {
		// 1. 서버에서 사용할 포트 번호 지정
		int port = 9090;

		DatagramSocket socket = null;

		// 2. DatagramSocket객체 생성 (UDP 포트 열림)
		try {
			socket = new DatagramSocket(port);

			System.out.println("서버 소켓 생성 완료");
			// 클라이언트가 보낸 데이터를 수신하기 위한 저장공간 생성
			byte[] inMsg = new byte[1024];
			// 클라이언트가 보낸 데이터를 받기 위한 객체
			DatagramPacket inPacket = new DatagramPacket(inMsg, inMsg.length);
			// 클라이언트가 보낸 메세지를 받기 위해 대기
			socket.receive(inPacket);
			String clientMsg = new String(inMsg).trim();// 사용하지 않는 부분을 잘라냄
			System.out.println(clientMsg);
		} catch (SocketException e) {
			System.out.println("SocketError");
		} catch (IOException e) {
			System.out.println("IOError");
		} finally {
			socket.close();
		}
	}

}