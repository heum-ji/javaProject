package kh.java.func;

public class TV {
	// �Ӽ� : ũ��, ����, ����, ä�� -> ����
	// ũ�� -> ������Ÿ�� : int, ������ : size
	// ���� -> ������Ÿ�� : boolean, ������ : power
	// ���� -> ������Ÿ�� : int, ������ : vol
	// ä�� -> ������Ÿ�� : int, ������ : ch

	// ���������� ���� �� �ڵ����� �ʱ�ȭ
	// ����(����*4, �Ǽ�*2) > 0, ����(''), �� > false, ������ > null
	int size;
	boolean power;
	int vol;
	int ch;

	// ��� : ���� on/off, ��������, ä�κ��� -> �޼ҵ�
	// ���� on/off -> �޼ҵ��̸� : power
	// �������� -> �޼ҵ��̸� : volUp(), volDown()
	// ä�κ��� -> �޼ҵ� �̸� : chUp(), chDown(), chChange()
	public void power() {
		power = !power;
		if (power) {
			System.out.println("������ �������ϴ�.");
		} else {
			System.out.println("������ �������ϴ�.");
		}
	}

	public void volUp() {
		if (vol != 100) {
			vol++;
		}
		System.out.println("���� ���� : " + vol);
	}

	public void volDown() {
		if (vol != 0) {
			vol--;
		}
		System.out.println("���� ���� : " + vol);
	}

	public void chUp() {
		ch++;
		System.out.println("���� ä�� : " + ch);
	}

	public void chDown() {
		ch--;
		System.out.println("���� ä�� : " + ch);
	}

	public void chChange(int chNum) {
		ch = chNum;
		System.out.println("���� ä�� : " + ch);
	}
}