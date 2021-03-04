package kr.or.iei.func;

import java.util.ArrayList;
import java.util.Collections;

public class ListTest {

	public void listTest1() {
		String[] str = new String[3];
		str[0] = "Hi";
		str[1] = "Hello";
		str[2] = "안녕하세요";

		for (int i = 0; i < str.length; i++) {
			System.out.println((i + 1) + ". " + str[i]);
		}

		ArrayList<String> list = new ArrayList<>();
		System.out.println("listsize : " + list.size());
		list.add("Hi"); // list에 Hi를 추가
		System.out.println("listsize : " + list.size());
		list.add("Hello");
		System.out.println("listsize : " + list.size());
		list.add("안녕하세요");
		System.out.println("listsize : " + list.size());
		list.add("아니요");

		System.out.println("리스트 출력");
		for (int i = 0; i < list.size(); i++) {
			System.out.println((i + 1) + ". " + list.get(i));
		}
	}

	public void listTest2() {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(230);
		list.add(-123);
		list.add(80);
		list.add(555);

		System.out.println("listsize : " + list.size());
		list.remove(2); // indexValue 제거

		int num = list.set(3, 777); // 해당 index의 값을 변경하고, 변경 전 값을 리턴
		System.out.println("num : " + num);

		System.out.println("리스트 출력");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		Collections.sort(list); // 정렬 기능

		System.out.println("리스트 출력");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		Collections.reverse(list); // - 내림차순 // sort 하면 오름차순으로 되기 때문

		System.out.println("리스트 출력");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		System.out.println(list);
		list.clear();
		System.out.println(list);
	}
}
