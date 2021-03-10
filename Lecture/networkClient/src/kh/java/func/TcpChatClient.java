package kh.java.func;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class TcpChatClient {

	public void main() {
		Socket socket = null;
		DataInputStream dis = null;
		DataOutputStream dos = null;

		String serverIp = "127.0.0.1";
		int serverPort = 5555;
		boolean chatCheck = false;
		Scanner sc = null;

		while (true) {
			System.out.println("----- Client Menu -----");
			System.out.println("1. 채팅 클라이언트 시작");
			System.out.println("2. DNS 클라이언트 시작");
			System.out.println("3. 프로그램 종료");
			System.out.print("선택> ");
			sc = new Scanner(System.in);
			int sel = sc.nextInt();
			sc.nextLine();

			switch (sel) {
			case 1:
				chatCheck = true;
				break;
			case 2:
				break;
			case 3:
				sc.close();
				System.out.println("===== Client Exit =====");
				return;
			default:
				System.out.println("잘못입력하셨습니다.");
				System.out.println();
				continue;
			}
			// Server 연결
			try {
				socket = new Socket(serverIp, serverPort);
				dis = new DataInputStream(socket.getInputStream());
				dos = new DataOutputStream(socket.getOutputStream());
			} catch (IOException e) {
				System.out.println("서버가 연결되지 않습니다.");
				continue;
			}

			try {
				if (chatCheck) {// Chat
					System.out.println("채팅 서버 접속 완료!!");
					System.out.println("서버 메시지 대기중...");

					while (true) {
						String serverMsg = dis.readUTF();

						if (!serverMsg.equals("exit")) {
							System.out.println("[server] : " + serverMsg);
							System.out.print("나 : ");
							String msg = sc.nextLine();

							dos.writeUTF(msg);
							if (msg.equals("exit")) {
								break;
							}
						} else {
							System.out.println("채팅이 종료되었습니다.");
							break;
						}
					}
				} else { // DNS
					System.out.print("알고 싶은 도메인 주소를 입력하세요 : ");
					String requestDns = sc.nextLine();

					dos.writeUTF(requestDns);
					String serverMsg = dis.readUTF();
					if (serverMsg.equals("no address")) {
						System.out.println("주소가 존재하지 않습니다.");
						System.out.println();
					} else {
						System.out.println("[" + requestDns + "]의 주소는 " + serverMsg + " 입니다.");
					}
				}
			} catch (IOException e) {
				System.out.println("서버가 끊겼습니다.");
			} finally {
				try {
					socket.close();
					dis.close();
					dos.close();
					chatCheck = false;
				} catch (IOException e) {
					System.out.println("Server 종료 실패");
				}
			}
		}
	}

	public String now() {
		Date time = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("[HH:mm:ss] ");
		return sdf.format(time);
	}
}