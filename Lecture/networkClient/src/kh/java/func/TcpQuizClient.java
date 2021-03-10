package kh.java.func;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class TcpQuizClient {

	public void main() {
		String serverIp = "1.220.236.74";
		int serverPort = 18080;

		Socket socket = null;
		DataInputStream dis = null;
		DataOutputStream dos = null;
		Scanner sc = new Scanner(System.in);

		try {
			socket = new Socket(serverIp, serverPort);

			dis = new DataInputStream(socket.getInputStream());
			dos = new DataOutputStream(socket.getOutputStream());

			while (true) {

				while (true) {
					String serverMsg = dis.readUTF();
					System.out.println("server : " + serverMsg);

					// 질문 체크
					if (serverMsg.charAt(serverMsg.length() - 1) == '?') {
						break;
					}
				}
				System.out.print("나의 정답은? : ");
				dos.writeUTF(sc.nextLine());
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				socket.close();
				dis.close();
				dos.close();
				sc.close();
				System.out.println("퀴즈가 종료되었습니다.");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}