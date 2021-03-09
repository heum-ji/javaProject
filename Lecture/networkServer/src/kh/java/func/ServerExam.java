package kh.java.func;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerExam {

	public void main() {
		int port = 7777;
		ServerSocket server = null;
		DataInputStream dis = null;
		DataOutputStream dos = null;
		Scanner sc = new Scanner(System.in);
		boolean chatCheck = false;
		int dnsCount = 0;

		while (true) {
			System.out.println("----- Server Menu -----");
			System.out.println("1. 채팅 서버 시작");
			System.out.println("2. DNS 서버 시작");
			System.out.println("3. 프로그램 종료");
			System.out.print("선택> ");
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
				System.out.println("===== Server Exit =====");
				return;
			default:
				System.out.println("잘못입력하셨습니다.");
				System.out.println();
				continue;
			}

			try {
				server = new ServerSocket(port);
			} catch (IOException e) {
				System.out.println("[서버 준비 실패]");
			}
			try {
				if (chatCheck) {
					System.out.println("[서버 준비 완료]");
					System.out.println("클라이언트 접속 요청을 기다립니다.....");

					Socket client = server.accept();
					System.out.println("클라이언트 접속 완료");
					dis = new DataInputStream(client.getInputStream());
					dos = new DataOutputStream(client.getOutputStream());

					while (true) {
						System.out.print("나 : ");
						String msg = sc.nextLine();

						if (msg.equals("exit")) {
							dos.writeUTF(msg);
							break;
						}
						dos.writeUTF(msg);

						String clientMsg = dis.readUTF();

						if (clientMsg.equals("exit")) {
							System.out.println("채팅이 종료되었습니다.");
							break;
						} else {
							System.out.println("[client] : " + clientMsg);
						}
					}
				} else {
					System.out.println("[DNS서버 준비 완료]");

					while (true) {
						System.out.println("클라이언트 접속 요청을 기다립니다.....");
						Socket client = server.accept();

						dis = new DataInputStream(client.getInputStream());
						dos = new DataOutputStream(client.getOutputStream());

						String clientRequestDns = dis.readUTF();

						if (clientRequestDns.equals("www.naver.com")) {
							dos.writeUTF("125.209.222.142");
						} else if (clientRequestDns.equals("www.google.com")) {
							dos.writeUTF("172.217.175.4");
						} else if (clientRequestDns.equals("www.iei.or.kr")) {
							dos.writeUTF("211.43.14.187");
						} else {
							dos.writeUTF("no address");
						}

						System.out.println("요청  " + (++dnsCount) + "건 처리 완료");
						System.out.print("서버를 종료하시겠습니까[y/n]");
						String str = sc.next();

						if (str.equals("y") || str.equals("Y")) {
							System.out.println("서버가 종료되었습니다.");
							dnsCount = 0;
							break;
						} else if (!(str.equals("n") || str.equals("N"))) {
							System.out.println("잘못입력하셨습니다. 서버를 종료합니다.");
							break;
						}
					}
				}
			} catch (IOException e) {
				System.out.println("클라이언트가 끊겼습니다.");
			} finally {
				try {
					server.close();
					dis.close();
					dos.close();
					chatCheck = false;
				} catch (IOException e) {
					System.out.println("Server 종료 실패");
				}
			}
		}
	}
}