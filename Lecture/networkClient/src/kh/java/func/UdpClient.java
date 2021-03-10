package kh.java.func;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class UdpClient {

	public void main() {
		// 1. 서버 포트 번호 지정
		int serverPort = 9090;
		DatagramSocket socket = null;
		try {
			socket = new DatagramSocket();

			InetAddress serverIp = InetAddress.getByName("127.0.0.1");
			String msg = "안녕 난 UDP 클라이언트야!";
			byte[] outMsg = msg.getBytes();// 보낼 메시지를 byte[]로 변환
			DatagramPacket outPacket = new DatagramPacket(outMsg, outMsg.length, serverIp, serverPort);
			socket.send(outPacket);
		} catch (SocketException e) {
			System.out.println("socket Error");
		} catch (UnknownHostException e) {
			System.out.println("UnknownHost");
		} catch (IOException e) {
			System.out.println("전송 실패");
		} finally {
			socket.close();
		}

	}

}