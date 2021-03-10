package kh.java.func;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Random;

public class BaseballServer {

	public void main() {
		ServerSocket server = null;
		DataInputStream dis = null;
		DataOutputStream dos = null;
		ArrayList<Integer> serverBallArr = new ArrayList<Integer>();
		ArrayList<Integer> clientBallArr = new ArrayList<Integer>();
		int port = 5555;

		Random r = new Random();
		int quizCnt = 0;
		int strikeCnt = 0;
		int ballCnt = 0;

		// Server 생성
		try {
			server = new ServerSocket(port);
		} catch (IOException e) {
			System.out.println("서버 생성 실패");
		}

		System.out.println("< < < < < BaseBall Game > > > > > ");
		try {
			while (true) {

				System.out.println("클라이언트 접속 요청을 기다립니다.....");
				// Client - Server 연결
				try {
					Socket client = server.accept();
					dis = new DataInputStream(client.getInputStream());
					dos = new DataOutputStream(client.getOutputStream());
				} catch (IOException e) {
					System.out.println("클라이언트 연결 실패");
					continue;
				}
				System.out.println("클라이언트가 접속했습니다.");
				// game reset
				quizCnt = 0;
				strikeCnt = 0;
				ballCnt = 0;
				serverBallArr.clear();
				// Random 생성
				while (true) {
					int ball = r.nextInt(9);
					// 중복 체크
					if (!serverBallArr.contains(ball)) {
						serverBallArr.add(ball);
					} else {
						continue;
					}
					// 3개 입력
					if (serverBallArr.size() == 3) {
						break;
					}
				}
				// 서버 숫자 출력
				System.out.print("서버 숫자 : ");
				for (Integer ball : serverBallArr) {
					System.out.print(ball + " ");
				}
				System.out.println();

				// Client 정답 읽기
				while (true) {
					clientBallArr.clear();
					while (true) {
						clientBallArr.add(dis.readInt());
						if (clientBallArr.size() == 3) {
							break;
						}
					}
					quizCnt++; // quiz 푼 횟수 증가
					System.out.print("클라이언트가 입력한 수 -> ");
					for (Integer ball : clientBallArr) {
						System.out.print(ball + " ");
					}
					System.out.println();

					for (int i = 0; i < clientBallArr.size(); i++) {
						// clientball read
						int answer = clientBallArr.get(i);
						// ballCheck
						if (serverBallArr.contains(answer)) {
							int serverball = serverBallArr.indexOf(answer);
							// Strike
							if (serverball == i) {
								strikeCnt++;
							} else { // ball
								ballCnt++;
							}
						}
					}
					// Strike/Ball 전달
					dos.writeInt(strikeCnt);
					dos.writeInt(ballCnt);

					System.out.println(quizCnt + "회 -----> " + strikeCnt + "스트라이크 " + ballCnt + "볼");

					// 정답
					if (strikeCnt == 3) {
						System.out.println("정답!!");
						System.out.println("현재 클라이언트와의 접속을 종료합니다.");
						break;
					}
					// 10회 초과
					if (quizCnt == 10) {
						System.out.println("시도횟수  " + quizCnt + " 회로 클라이언트 접속을 종료합니다.");

						for (Integer ball : serverBallArr) {
							dos.writeInt(ball);
						}
						break;
					}
					// 전송 후 값 초기화
					strikeCnt = 0;
					ballCnt = 0;
				}
			}
		} catch (IOException e) {
			System.out.println("클라이언트 사망");
			try {
				server.close();
				dis.close();
				dos.close();
			} catch (IOException e2) {
				System.out.println("서버 종료 실패");
			}
		}
	}
}
