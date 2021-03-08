package kh.java.func;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class StreamTest {

	public void main() {
		// quiz.txt 파일에 있는 내용 읽기용 보조 스트림
		BufferedReader br = null;
		// 읽어온 파일을 변환해서 이미지 파일로 내보내기 위한 보조 스트림
		BufferedOutputStream bos = null;
		try {
			// quiz.txt를 읽기 위한 주 스트림 생성
			FileReader fr = new FileReader("quiz.txt");
			// 기능 개선을 위한 보조스트림 생성
			br = new BufferedReader(fr);
			String str = br.readLine(); // quiz.txt파일의 1줄 읽어옴

			// 읽어온 값을 이미지 파일로 내보내기 위한 주 스트림 생성
			FileOutputStream fos = new FileOutputStream("test.gif");
			// 파일을 내보내기 위한 보조 스트림 생성
			bos = new BufferedOutputStream(fos);

			// String -> int 형변환
			ArrayList<Integer> arr = new ArrayList<Integer>();
			StringTokenizer sT = new StringTokenizer(str, " ");

			while (sT.hasMoreTokens()) {
				String num = sT.nextToken();
				int iNum = Integer.parseInt(num, 16); // 16진수로 int형으로 변환
				arr.add(iNum);
			}
			for (int b : arr) {
				bos.write(b);
			}
			System.out.println("파일 내보내기 완료");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
				bos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}