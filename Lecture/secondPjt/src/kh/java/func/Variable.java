package kh.java.func;

public class Variable {
	public void test1() {
		// ������ ���� ����
		int num;
		// System.out.println(num);
		// ������ ���� num ������ 10 ����
		num = 10; // ù��°�� ������ ���� �����ϴ� �� -> ���� �ʱ�ȭ
		System.out.println(num);
		num = 100;// = : ���Կ����� -> �������� ���� ���ʿ� �����Ѵ�.
		System.out.println(num);

		int num1 = 100; // ������ ���� num1�� �����ϸ鼭 100���� �ʱ�ȭ
		System.out.println(num1);
	}

	public void test2() {
		// ���� ���� ���� �� true ����
		boolean bool = true;
		// ������ ���� ���� �� ���� A ����
		char ch = 'A';
		// ������ ���� ���� �� �� ���� (�� 4��)
		// byte�� ���� ���� �� �� ����
		byte bNum = 100;
		// short�� ���� ���� �� �� ����
		short sNum = 150;
		// int�� ���� ���� �� �� ����
		int iNum = 1000;
		// long�� ���� ���� �� �� ����
		long lNum = 100000000l;
		// �Ǽ��� ���� ���� �� �� ����(�� 2��)
		// float�� ���� ���� �� �� ����
		float fNum = 123.11f;
		// double�� ���� ���� �� �� ����
		double dNum = 3.14;
		// ���ڿ� ���� ���� �� �� ����
		String str = "Hello Java";
		// ����� ���� ���� �� �� ����
		final double PI = 3.14;

		System.out.println("���� ������ �� : " + bool);
		System.out.println("������ ������ �� : " + ch);
	}

	public void test3() {
		// byte ������ Ÿ���� ǥ�� ���� : -128 ~ 127
		byte bNum = 10;
		int iNum = bNum; // bNum������ ���� �����ؼ� �ڵ����� int�� ����ȯ�Ͽ� ����

		int number1 = 128;
		byte number2 = (byte) number1;
		System.out.println(number1);
		System.out.println(number2);

		int num1 = 2147483647;
		long num2 = (long) num1 + 1;
		System.out.println(num2);
	}

	public void test4() {
		System.out.println("�ȳ��ϼ���");
		System.out.println("����");
		System.out.println("ab�Դϴ�.");
	}

	public void test5() {
		System.out.print("�ȳ��ϼ���");
		System.out.print("����");
		System.out.print("ab�Դϴ�.");
	}

	public void test6() {
		// 1. ���ڿ� ���� name ���� �� �����̸� ����
		// 2. ������ ���� age ���� �� ���� ���� ����
		// 3. ���ڿ� ���� addr ���� �� �ּ� ���� (����, ��õ, �λ�)
		// 4. ������¹�
		// -> �ȳ��ϼ��� xxx�Դϴ�. �� ���̴� xx���̰� �ּҴ� xx�Դϴ�.

		String name = "������";
		int age = 28;
		String addr = "����";

		System.out.println("�ȳ��ϼ��� " + name + "�Դϴ�. �� ���̴� " + age + "���̰� �ּҴ� " + addr + "�Դϴ�.");

		// System.out.printf("�ȳ��ϼ��� %s�Դϴ�. �� ���̴� %d���̰� �ּҴ� %s�Դϴ�.", name, age, addr);
		System.out.printf("�Ǽ� �� : %.2f", 3.11554455);
	}

	public void test7() {

		System.out.println("�ȳ��ϼ��� �׿��Դϴ�.\n�� ���̴� 20���̰�\n�ּҴ� �����Դϴ�.");
		System.out.println("���������� ����ϰ� ���� ���� \\\\ �ι����� ����");
		System.out.println("��\t��\t��\t��\t��");
		System.out.println("�ڹٿ��� ���ڿ��� ǥ���ϱ� ���ؼ��� �ֵ���ǥ(\")�� ����մϴ�.");
	}
}
