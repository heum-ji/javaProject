package test.run;

//import test.func.Func; // test.func ��Ű���� Func Ŭ���� ���� ����� ����ϱ� ���� ����
import test.func.func1.Function;

// ���� Ŭ���� ����
public class TestStart {
	// ����� ���θ޼ҵ�
	public static void main(String[] args) {
		/*
		 * func1()�޼ҵ� ���ο� �ҽ��ڵ带 �����ϰ� �ʹ�.
		 * func1()�޼ҵ尡 ���ԵǾ��ִ� Ŭ���� �̸� : Func
		 * Func Ŭ������ �ҼӵǾ��ִ� ��Ű�� : test.func
		 */
		
		// Ŭ���� �̸� ��� = new Ŭ�����̸�();
		//Func f = new Func();
		// ���.�����ϰ� ���� �޼ҵ��̸�();
		//f.func1();
		//f.func2();
		//f.func1();

		/*
		 * �ǽ�
		 * 1. ��Ű������ test.func.func1
		 * 2. Ŭ���� ���� Function 
		 * 3. FunctionŬ���� �� �޼ҵ� ����
		 * public void test() {
		 *  
		 * }
		 * 
		 * 4.�޼ҵ� ���� �ҽ��ڵ� �ۼ�
		 * �����̸� ���
		 * 
		 * 5.���������� ���� �̸� ��µ� �� �ֵ��� ���� �޼ҵ� �ڵ� ����
		 */
		
		Function fc = new Function();
		fc.test();

	}

}
