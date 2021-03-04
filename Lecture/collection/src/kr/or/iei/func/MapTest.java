package kr.or.iei.func;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MapTest {

	public void test1() {
		ArrayList<String> list = new ArrayList<String>();
		HashMap<Integer, String> map = new HashMap<Integer, String>();

		list.add("Hello");
		list.add("Hi");
		list.add("Bye");
		list.add("안녕하세요");

		map.put(0, "Hello");
		map.put(1, "Hi");
		map.put(2, "Bye");
		map.put(100, "안녕하세요");

		// Hi 출력
		System.out.println(list.get(1));
		System.out.println(map.get(1));

		// 안녕하세요 출력
		System.out.println(list.get(3));
		System.out.println(map.get(100));

		// String num1 = list.get(5);
		String num2 = map.get(100); // 해당 key 값이 존재하면 vaule 리턴 , 없으면 null 리턴
		// System.out.println(num1);
		System.out.println(num2);

		map.remove(1);
		System.out.println(map);
	}

	public void test2() {
		HashMap<String, String> map = new HashMap<String, String>();

		map.put("one", "하나");
		map.put("two", "둘");
		map.put("three", "셋");

		System.out.println(map.get("two"));
		System.out.println(map.get("four"));

		map.put("two", "넷");

		System.out.println(map.containsKey("two")); // key 확인 method - boolean 리턴

		Set<String> keys = map.keySet(); // Set안에 키 다 넣어줌
		
		for (String key : keys) {
			System.out.print(map.get(key) + " ");
		}
		System.out.println();
	}
}