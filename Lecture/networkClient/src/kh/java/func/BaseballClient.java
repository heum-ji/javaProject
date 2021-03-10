package kh.java.func;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Scanner;

public class BaseballClient {

	public void main() {
		Socket socket = null;
		DataInputStream dis = null;
		DataOutputStream dos = null;
		String serverIp = "127.0.0.1";
		int serverPort = 5555;

		ArrayList<Integer> ballArr = new ArrayList<Integer>();
		int quizCnt = 0;
		int strikeCnt = 0;
		int ballCnt = 0;
		int valueCheck = 0;
		Scanner sc = new Scanner(System.in);

		try {
			socket = new Socket(serverIp, serverPort);
			dis = new DataInputStream(socket.getInputStream());
			dos = new DataOutputStream(socket.getOutputStream());
		} catch (IOException e) {
			System.out.println("서버가 연결되지 않습니다.");
			sc.close();
			return;
		}
		System.out.println("< < < < < BaseBall Game > > > > > ");
		System.out.println("< < < < < Game Start > > > > > ");

		try {
			while (quizCnt < 10) {
				valueCheck = 1;
				while (true) {
					System.out.print(valueCheck + "번째 숫자 입력 : ");
					int ball = sc.nextInt();
					// 중복 체크
					if (!ballArr.contains(ball)) {
						ballArr.add(ball);
						dos.writeInt(ball);
						valueCheck++;
						if (ballArr.size() == 3) {
							break;
						}
					} else {
						System.out.println("잘못입력했어요. 다시 입력해주세요.");
						continue;
					}
				}
				ballArr.clear();
				quizCnt++;
				// Strike/Ball 확인
				strikeCnt = dis.readInt();
				ballCnt = dis.readInt();

				// Strike/Ball 출력
				System.out.println(quizCnt + "회 -----> " + strikeCnt + "스트라이크 " + ballCnt + "볼");
				System.out.println();

				// 정답
				if (strikeCnt == 3) {
					System.out.println("축하합니다.!!");
					System.out.println("프로그램을 종료합니다.");
					sc.close();
					return;
				}
				// 10회 초과
				if (quizCnt == 10) {
					System.out.println("기회를 모두 사용하셨습니다.");
					System.out.print("정답은 ");
					for (int i = 0; i < 3; i++) {
						System.out.print(dis.readInt() + " ");
					}
					System.out.println(" 입니다.");
					System.out.println("프로그램을 종료합니다.");
					break;
				}
			}
		} catch (IOException e) {
			System.out.println("서버가 종료되었습니다.");
		} finally {
			try {
				socket.close();
				dis.close();
				dos.close();
			} catch (IOException e) {
				System.out.println("서버 종료 실패");
			}

		}
	}

}