package kh.java.func;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class TcpServer {

	public void main() {
		// 1. 서버에서 사용할 포트번호를 지정
		// 0 ~ 65535 // 1000예약 번호가 많으므로 1000번 이후 사용 권장
		int port = 7777;
		// 반환할 객체들을 미리 선언
		ServerSocket server = null;
		DataInputStream dis = null;
		DataOutputStream dos = null;
		Scanner sc = new Scanner(System.in);
		// 2. 서버용 소켓객체를 생성 - > 서버의 포트가 열리면서 서버가 대기상태가 가능
		try {
			server = new ServerSocket(port);
			// 3. 클라이언트 접속 요청 대기
			// 4. 클라이언트 접속 요청이 들어오면 수락하여 클라이언트에 대한 소켓 객체 생성
			Socket client = server.accept();
			// 5. 연결된 클라이언트와 입력 및 출력 스트림 생성
			// 객체를 새로 만드는 것이 아닌 소켓에 만들어진 스트림을 가져오는 개념
			InputStream in = client.getInputStream();
			OutputStream out = client.getOutputStream();
			// 6. 보조 스트림을 통한 성능 개선
			dis = new DataInputStream(in);
			dos = new DataOutputStream(out);
			// 7. 스트림을 통한 데이터 입/츨력
			System.out.print("입력 : ");
			dos.writeUTF(sc.nextLine());
			System.out.println("client : " + dis.readUTF());
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				server.close();
				dis.close();
				dos.close();
				sc.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}