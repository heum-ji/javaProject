package kh.java.func;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class ClientExam {

	public void main() {
		String serverIp = "127.0.0.1";
		int serverPort = 7777;

		Socket socket = null;
		DataInputStream dis = null;
		DataOutputStream dos = null;
		Scanner sc = new Scanner(System.in);
		boolean chatCheck = false;

		while (true) {
			System.out.println("----- 네트워크 프로그래밍 실습 -----");
			System.out.println("1. 채팅 클라이언트 시작");
			System.out.println("2. DNS 클라이언트 시작");
			System.out.print("선택> ");
			int sel = sc.nextInt();
			sc.nextLine();

			if (sel == 1) {
				chatCheck = true;
			} else if (sel != 2) {
				System.out.println("잘못입력하셨습니다.");
				continue;
			}

			try {
				socket = new Socket(serverIp, serverPort);
				dis = new DataInputStream(socket.getInputStream());
				dos = new DataOutputStream(socket.getOutputStream());

				if (chatCheck) { // Chat
					System.out.println("채팅 서버 접속 완료!!");
					while (true) {
						String serverMsg = dis.readUTF();

						if (!serverMsg.equals("exit")) {
							System.out.println("[server] : " + serverMsg);
							System.out.print("나 : ");

							String msg = sc.nextLine();

							if (msg.equals("exit")) {
								dos.writeUTF(msg);
								break;
							}
							dos.writeUTF(msg);
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
					System.out.println("[" + requestDns + "]의 주소는 " + serverMsg + " 입니다.");
				}
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				try {
					socket.close();
					dis.close();
					dos.close();
					chatCheck = false;
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

}