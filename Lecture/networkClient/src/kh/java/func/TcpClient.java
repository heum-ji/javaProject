package kh.java.func;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class TcpClient {

	public void main() {
		// 1. 서버 ip주소 / port 번호 지정
		String serverIp = "127.0.0.1"; // 자기자신컴퓨터를 호출하는 ip(loopBackIp)
		int serverPort = 7777;

		Socket socket = null;
		DataInputStream dis = null;
		DataOutputStream dos = null;
		Scanner sc = new Scanner(System.in);
		// 2. 지정된 server IP/Port로 socket 객체를 생성하면서 요청
		try {
			socket = new Socket(serverIp, serverPort);
			// 3. 서버와 입/출력 스트림 생성
			InputStream in = socket.getInputStream();
			OutputStream out = socket.getOutputStream();
			// 4. 보조스트림을 통한 성능 개선
			dis = new DataInputStream(in);
			dos = new DataOutputStream(out);
			// 5. 스트림을 통한 입/출력
			System.out.println("server : " + dis.readUTF());
			System.out.print("입력 : ");
			dos.writeUTF(sc.nextLine());
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				socket.close();
				dis.close();
				dos.close();
				sc.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}