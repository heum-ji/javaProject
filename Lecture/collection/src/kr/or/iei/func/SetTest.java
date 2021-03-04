package kr.or.iei.func;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class SetTest {

	public void main() {
		HashSet<Integer> set = new HashSet<Integer>();
		boolean bool1 = set.add(10); // 데이터 입력 성공/실패 -> true/false 리턴 해줌
		System.out.println(bool1 + " " + set + " size : " + set.size());

		boolean bool2 = set.add(20);
		System.out.println(bool2 + " " + set + " size : " + set.size());

		boolean bool3 = set.add(10);
		System.out.println(bool3 + " " + set + " size : " + set.size());
		set.add(30);
		System.out.println(bool3 + " " + set + " size : " + set.size());
		set.add(40);
		System.out.println(bool3 + " " + set + " size : " + set.size());

		// set은 index로 값을 관리하지 않아서 하나씩 꺼내서 사용하는 방법이 필요
		// 1. ArrayList를 이용
		ArrayList<Integer> list = new ArrayList<Integer>(set);
		for (Integer integer : list) {
			System.out.print(integer + " ");
		}
		System.out.println();

		// 2. foreach사용
		for (Integer num : set) {
			System.out.print(num + " ");
		}
		System.out.println();

		// 3. 반복자(iterator)
		Iterator<Integer> iter = set.iterator();
		//
		// iterator 객체 메서드
		// next() : 값 1개를 가져옴(잘라내기)
		// hasNext() : 꺼내올 값이 남아 있으면 true, 없으면 false return
		//
		while (iter.hasNext()) {
			System.out.print(iter.next() + " ");
		}
		System.out.println();
	}

	public void check() {
		Scanner sc = new Scanner(System.in);
		HashSet<Integer> set = new HashSet<Integer>();

		while (set.size() != 6) {
			System.out.print("숫자 입력 : ");
			if (!set.add(sc.nextInt())) {
				System.out.println("중복숫자임");
			}
		}

		System.out.println(set);

		sc.close();
	}

	public void lotto() {
		Scanner sc = new Scanner(System.in);
		HashSet<Integer> userSet = new HashSet<Integer>();
		HashSet<Integer> comSet = new HashSet<Integer>();
		Random r = new Random();

		int cnt = 1;
		int sum = 0;

		System.out.println("======= 로또 프로그램 =======");

		// userLotto 입력
		while (userSet.size() != 6) {
			System.out.print(cnt + "번째 번호 입력(1~45) : ");
			int num = sc.nextInt();

			if (1 <= num && num <= 45) { // 1 ~ 45
				if (!userSet.add(num)) { // 중복 체크
					System.out.println("이미 중복된 번호입니다. 다시 입력해주세요.");
				} else {
					cnt++;
				}
			} else {
				System.out.println("잘못입력하셨습니다. 1~45 중 한개를 입력해주세요.");
			}
		}

		// userLotto -> list에 대입
		ArrayList<Integer> userLottoList = new ArrayList<Integer>(userSet);
		// userLottoList 오름차순 정렬
		Collections.sort(userLottoList);

		// userLottoList 출력
		System.out.println("사용자 번호");
		for (Integer integer : userLottoList) {
			System.out.print(integer + " ");
		}
		System.out.println();

		// comLotto 입력
		while (comSet.size() != 6) {
			comSet.add(r.nextInt(45) + 1); // 1 ~ 45
		}

		// comLotto -> list에 대입
		ArrayList<Integer> comLottoList = new ArrayList<Integer>(comSet);
		// comLottoList 오름차순 정렬
		Collections.sort(comLottoList);

		// comLotto 출력
		System.out.println("컴퓨터 번호");
		for (Integer integer : comLottoList) {
			System.out.print(integer + " ");
		}
		System.out.println();

		// Lotto 맞은 갯수 판단
		for (Integer userNum : userLottoList) {
			for (Integer comNum : comLottoList) {
				if (userNum == comNum) {
					sum++;
					break;
				}
			}
		}

		// Lotto 맞은 갯수 출력
		System.out.println("맞은 갯수 : " + sum);

		// 맞은 갯수별 등수 판단
		switch (sum) {
		case 4:
			System.out.println("3등!");
			break;
		case 5:
			System.out.println("2등!!");
			break;
		case 6:
			System.out.println("1등!!!");
			break;
		default:
			System.out.println("꽝");
			break;
		}
		sc.close();
	}
}