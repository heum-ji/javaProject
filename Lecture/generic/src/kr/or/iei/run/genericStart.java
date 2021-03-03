package kr.or.iei.run;

import kr.or.iei.func.GenericEx1;
import kr.or.iei.func.GenericEx2;

public class genericStart {

	public static void main(String[] args) {
		GenericEx1<Integer> g = new GenericEx1<Integer>(10);
		System.out.println(g.getData() + 10);

		GenericEx2<Integer, String> g2 = new GenericEx2<>();
		int num1 = g2.getData1(); // auto un-boxing 포함
		String str = g2.getData2();

		// GenericEx1<Object> ge = new GenericEx1<Object>();

		// Tiger t = new Tiger(100);
		// Bear b = new Bear(200);
		// AnimalMgr<Tiger> mgr1 = new AnimalMgr<Tiger>(t);
		// AnimalMgr<Bear> mgr2 = new AnimalMgr<Bear>(b);
		//
		// System.out.println(mgr1.getData().getHp());

		// AnimalMgr mgr1 = new AnimalMgr(t);
		// AnimalMgr mgr2 = new AnimalMgr(b);
		// // mgr1에 있는 data의 hp -> 100
		// // mgr2에 있는 data의 hp -> 200
		// Object obj1 = mgr1.getData(); // Tiger 객체의 주소
		// int hp1 = ((Tiger) obj1).getHp(); // downCasting
		//
		// System.out.println(hp1);
		//
		// int hp2 = ((Bear) mgr2.getData()).getHp();
		// System.out.println(hp2);
	}

}