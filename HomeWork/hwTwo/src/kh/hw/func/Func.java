package kh.hw.func;

public class Func {
	
	// ���� ��� �޼���
	public void printVar() {
	/*
	 * [ ���� 1 ]
	 * �Ʒ� �־��� ���� �ش��ϴ� ������ ����� �־��� ������ �ʱ�ȭ �� ��
	 * �� ���� ����ϴ� �ڵ� �ۼ�
	 * 
	 * ������ 100
	 * ������ 9999��
	 * �Ǽ��� 486.520(float)
	 * �Ǽ��� 5697.890123
	 * ���� A
	 * ���ڿ� Hello JAVA
	 * �� true
	 * 
	 * ��� ���� ������ �����ϰ� ������ ���
	 * */

		int 	iNum = 100;
		long 	lNum = 999900000000L;
		float 	fNum = 486.520f;
		double	dNum = 5697.890123;
		char 	ch 	 = 'A';
		String 	str  = "Hello JAVA";
		boolean	bool = true;

		System.out.println("iNum : " + iNum);
		System.out.println("lNum : " + lNum);
		System.out.printf("fNum : %.3f\n", fNum); // �Ҽ��� 3�ڸ� ���
		System.out.println("dNum : " + dNum);
		System.out.println("ch   : " + ch);
		System.out.println("str  : " + str);
		System.out.println("bool : " + bool);
	}

	// �Ż� ���� ��� �޼���
	public void printMyInfo() {
		/*
		 * [ ���� 2 ] 
		 * �ڽ��� �Ż������� ������ ������ ����� ������ ������ ����, ����ϴ� ���α׷� �ۼ�
		 * - �̸�, ����, ����, ����, ��ȭ��ȣ, �̸���	
		 * - 2�� �̻� �����
		 */
		// �� �Ż�����
		String 	name 	= "������";
		int 	age	 	= 28;
		char	gender	= '��';
		String 	addr	= "����";
		String	telNum	= "01051414556";
		String	mail	= "dragon2009t@gmail.com";
		
		// Ÿ�� �Ż�����
		String 	name2 	= "��浿";
		int 	age2	= 50;
		char	gender2	= '��';
		String 	addr2	= "��⵵";
		String	telNum2	= "01098765432";
		String	mail2	= "mrgogo@email.com";
		
		System.out.println(); // ���� 1 ���� �� �� �����
		System.out.printf("�̸�\t����\t����\t����\t��ȭ��ȣ\t\t�̸���\n"); // �� ������
		System.out.println("----------------------------------------------------------------------"); // �� ������
		System.out.printf("%s\t%d\t%c\t%s\t%s\t%s\n", name, age, gender, addr, telNum, mail);
		System.out.println("----------------------------------------------------------------------"); // �� ������
		System.out.printf("%s\t%d\t%c\t%s\t%s\t%s\n", name2, age2, gender2, addr2, telNum2, mail2);
		
	}
}