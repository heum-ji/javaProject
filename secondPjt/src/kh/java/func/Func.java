package kh.java.func;

public class Func {
	public void func1() {
		System.out.println(1 + 1); // ����
		System.out.println(1.0 + 1.0); // �Ǽ�
		System.out.println('1' + '1'); // ����
		System.out.println('2' + '2'); // ����
		System.out.println("1" + "1" + "3"); // ���ڿ�
	}

	public void func2() {
		// ���� + �Ǽ� = �Ǽ�
		System.out.println(1 + 1.1);
		// ���� + �Ǽ� -> �Ǽ� + �Ǽ� -> �Ǽ�
		// 1.0 + 1.1 = 2.1
		System.out.println(1 + '1');
		// ���� + ���� -> ���� + ���� -> ����
		System.out.println(1.0 + '1');
		// �Ǽ� + ���� -> �Ǽ� + ���� -> �Ǽ� + �Ǽ� -> �Ǽ�
		System.out.println("1" + 20);
		// ���ڿ��� ���ϱ� ������ �ϴ� ��� ��� ���ڿ��� ��ȯ�Ͽ� ����
		// ���ڿ� + ���� = ���ڿ� + ���ڿ� -> ���ڿ�
		System.out.println("1" + 1.0);
		System.out.println("1" + 'a');

		System.out.println("1" + 1 + 1);
		// ���ڿ� + ���� + ����
		// ���ڿ� + ���� -> ���ڿ� + ���ڿ� -> ���ڿ� "11"
		// "11" + 1 -> ���ڿ� + ���� -> ���ڿ� + ���ڿ� -> ���ڿ� "111"

	}
}
