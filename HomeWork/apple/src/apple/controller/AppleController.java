package apple.controller;

import apple.view.AppleView;
import apple.vo.AppleWatch;
import apple.vo.IPad;
import apple.vo.IPhone;
import apple.vo.MacBook;
import apple.vo.Product;

public class AppleController {
	Product[][] productStock; // 재고 - 0 : Watch, 1 : Pad, 2 : Phone, 3 : MacBook
	Product[] buyList; // 구매목록

	// product
	// 재고 - 0 : Watch, 1 : Pad, 2 : Phone, 3 : MacBook
	final int WATCH = 0;
	final int PAD = 1;
	final int PHONE = 2;
	final int MACBOOK = 3;

	// index
	int buyIndex; // 구매목록 index
	int watchIndex;
	int padIndex;
	int phoneIndex;
	int macBookIndex;

	AppleView view;

	// back
	boolean toManage;
	boolean toWelcome;
	boolean toShopping;

	public AppleController() {
		super();
		productStock = new Product[4][10]; // 종류 : 4 + stock 10 까지
		buyList = new Product[10];

		buyIndex = 0;
		watchIndex = 0;
		padIndex = 0;
		phoneIndex = 0;
		macBookIndex = 0;

		// 직원 메뉴 관리
		toManage = false;

		// 손님 메뉴 관리
		toWelcome = false;
		toShopping = false;

		// 재고 추가
		inputStock();

		view = new AppleView();
	}

	public void main() {

		while (true) {
			switch (view.showAppleStore()) { // 메인메뉴 반복
			case 1: // 직원
				staff();
				break;
			case 2: // 손님
				guest();
				break;
			case 0: // 매장 나가기
				exitStore();
				return;
			default:
				view.printFaultMsg();
				break;
			}
		}
	}

	// 직원
	public void staff() {
		toManage = true;

		while (toManage) { // manage 화면
			switch (view.Manager()) {
			case 1: // Create
				switch (view.Register()) {
				case 1:
					productStock[PHONE][phoneIndex++] = view.Iphone();
					break;
				case 2:
					productStock[MACBOOK][macBookIndex++] = view.MacBook();
					break;
				case 3:
					productStock[PAD][padIndex++] = view.Ipad();
					break;
				case 4:
					productStock[WATCH][watchIndex++] = view.AppleWatch();
					break;
				case 0: // manage 돌아가기
					back("manage");
					break;
				default: // 메뉴 아닌 숫자 체크
					view.printFaultMsg();
					break;
				}
				break;
			case 2: // Read
				view.printAll(productStock, phoneIndex, PHONE);
				view.printAll2(productStock, macBookIndex, MACBOOK);
				view.printAll3(productStock, padIndex, PAD);
				view.printAll4(productStock, watchIndex, WATCH);
				break;
			case 3: // Update
				switch (view.modify()) {
				case 1: // 아이폰
					view.modifyIphone(productStock, phoneIndex, PHONE);
					break;
				case 2: // 맥북
					view.modifyMacbook(productStock, macBookIndex, MACBOOK);
					break;
				case 3: // 아이패드
					view.modifyIpad(productStock, padIndex, PAD);
					break;
				case 4: // 애플워치
					view.modifyWatch(productStock, watchIndex, WATCH);
					break;
				case 0: // manage 돌아가기
					back("manage");
					break;
				default: // 메뉴 아닌 숫자 체크
					view.printFaultMsg();
					break;
				}
				break;
			case 4: // Delete
				switch (view.deleteMenu()) {
				case 1:
					int Iphone = view.deleteIphone(productStock, phoneIndex, PHONE);
					if (Iphone != -1) {
						for (int i = Iphone - 1; i < phoneIndex - 1; i++) {
							productStock[PHONE][i] = productStock[PHONE][i + 1];
						}
						productStock[PHONE][--phoneIndex] = null;
						view.printMsg("삭제");
						break;
					}
					break;
				case 2:
					int mac = view.deletemacbook(productStock, macBookIndex, MACBOOK);
					if (mac != -1) {
						for (int i = mac - 1; i < macBookIndex - 1; i++) {
							productStock[MACBOOK][i] = productStock[MACBOOK][i + 1];
						}
						productStock[MACBOOK][--macBookIndex] = null;
						view.printMsg("삭제");
						break;
					}
					break;
				case 3:
					int Ipad = view.deleteIpad(productStock, padIndex, PAD);
					if (Ipad != -1) {
						for (int i = Ipad - 1; i < padIndex - 1; i++) {
							productStock[PAD][i] = productStock[PAD][i + 1];
						}
						productStock[PAD][--padIndex] = null;
						view.printMsg("삭제");
						break;
					}
					break;
				case 4:
					int Watch = view.deletewatch(productStock, watchIndex, WATCH);
					if (Watch != -1) {
						for (int i = Watch - 1; i < watchIndex - 1; i++) {
							productStock[WATCH][i] = productStock[WATCH][i + 1];
						}
						productStock[WATCH][--watchIndex] = null;
						view.printMsg("삭제");
						break;
					}
					break;
				case 0: // manage 돌아가기
					back("manage");
					break;
				default: // 메뉴 아닌 숫자 체크
					view.printFaultMsg();
					break;
				}
				break;
			case 0: // manage 나가기
				back("exitManage");
				break;
			default:
				view.printFaultMsg();
				break;
			}
		}
	}

	// 손님
	public void guest() {
		toWelcome = true;

		while (toWelcome) {
			switch (view.showWelCome()) { // Store 입장
			case 1: // Shopping

				// 장바구니 체크
				if (buyListCheck()) { // 장바구니 MAX
					back("welcome");
					view.printMsg("가득가득");
					break;
				}

				toShopping = true;

				while (toShopping) {
					switch (view.showShopping()) { // ShoppingList
					case 1: // AppleWatch
						view.printProductList(productStock[WATCH], watchIndex);

						if (view.buyProduct(productStock[WATCH], watchIndex, buyList, buyIndex)) {
							buyIndex++; // 구매목록 추가
							back("welcome");
						} else {
							back("welcome");
						}
						break;
					case 2: // Ipad
						view.printProductList(productStock[PAD], padIndex);

						if (view.buyProduct(productStock[PAD], padIndex, buyList, buyIndex)) {
							buyIndex++; // 구매목록 추가
							back("welcome");
						} else {
							back("welcome");
						}
						break;
					case 3: // IPhone
						view.printProductList(productStock[PHONE], phoneIndex);

						if (view.buyProduct(productStock[PHONE], phoneIndex, buyList, buyIndex)) {
							buyIndex++; // 구매목록 추가
							back("welcome");
						} else {
							back("welcome");
						}
						break;
					case 4: // MacBook
						view.printProductList(productStock[MACBOOK], macBookIndex);

						if (view.buyProduct(productStock[MACBOOK], macBookIndex, buyList, buyIndex)) {
							buyIndex++; // 구매목록 추가
							back("welcome");
						} else {
							back("welcome");
						}
						break;
					case 0: // welcome 돌아가기
						back("welcome");
						break;
					default:
						view.printFaultMsg();
						break;
					}
				}
				break;
			case 2: // 장바구니 출력
				if (buyIndex == 0) { // 빈 경우
					view.printMsg("장바구니가 비었습니다.");
				} else {
					view.printBuyList(buyList, buyIndex);
				}
				break;
			case 3: // 장바구니 삭제
				if (buyIndex == 0) { // 빈 경우
					view.printMsg("장바구니가 비었습니다.");
				} else {
					switch (view.showBuyListMenu()) { // showBuyListMenu
					case 1: // 전체 제거
						view.deleteAllBuyList(buyList, buyIndex);
						buyIndex = 0;
						break;
					case 2: // 선택 제거
						view.printBuyList(buyList, buyIndex);
						if (view.deleteSelBuyList(buyList, buyIndex)) { // 선택 제거 성공
							buyIndex--;
						}
						break;
					case 0: // welcome 돌아가기
						back("welcome");
						break;
					default:
						view.printFaultMsg();
						break;
					}
				}
				break;
			case 0: // 손님 나가기
				back("exitCustomer");
				break;
			default:
				view.printFaultMsg();
				break;
			}
		}

	}

	// 재고 추가
	public void inputStock() {
		// watch
		productStock[WATCH][watchIndex++] = new AppleWatch("AppleWatch 3", "White", "watch", 10, 100000, 1);
		productStock[WATCH][watchIndex++] = new AppleWatch("AppleWatch Nike", "Black", "watch", 10, 200000, 2);
		productStock[WATCH][watchIndex++] = new AppleWatch("AppleWatch SE", "Yellow", "watch", 10, 300000, 3);
		// pad
		productStock[PAD][padIndex++] = new IPad("iPad v12", "White", "pad", 10, 100000, 1);
		productStock[PAD][padIndex++] = new IPad("iPad Air", "Black", "pad", 10, 200000, 2);
		productStock[PAD][padIndex++] = new IPad("iPad Pro", "Gold", "pad", 10, 300000, 3);
		// phone
		productStock[PHONE][phoneIndex++] = new IPhone("iPhone 12", "White", "phone", 10, 50000, 1);
		productStock[PHONE][phoneIndex++] = new IPhone("iPhone 12 Mini", "Black", "phone", 10, 70000, 2);
		productStock[PHONE][phoneIndex++] = new IPhone("iPhone 12 Pro", "Green", "phone", 10, 100000, 3);
		productStock[PHONE][phoneIndex++] = new IPhone("iPhone SE", "Purple", "phone", 10, 200000, 4);
		// macBook
		productStock[MACBOOK][macBookIndex++] = new MacBook("iMac Pro 1", "White", "macBook", 10, 100000, 1);
		productStock[MACBOOK][macBookIndex++] = new MacBook("iMac Pro 2", "Black", "macBook", 10, 200000, 2);
		productStock[MACBOOK][macBookIndex++] = new MacBook("MacBook Air", "Green", "macBook", 10, 400000, 3);
		productStock[MACBOOK][macBookIndex++] = new MacBook("MacBook Pro", "Yellow", "macBook", 10, 800000, 4);
	}

	public void back(String where) {
		if (where.equals("welcome")) {
			toWelcome = true; // welCome 실행
			toShopping = false; // Shopping 종료
		} else if (where.equals("exitCustomer")) {
			toWelcome = false;
		} else if (where.equals("manage")) {
			toManage = true; // manage 화면 띄우기
		} else if (where.equals("exitManage")) {
			toManage = false;
		}
	}

	public void exitStore() {
		view.printMsg("퇴장하기");
	}

	public boolean buyListCheck() {
		if (buyIndex == buyList.length) { // 장바구니 가득 찬 경우
			view.printMsg("장바구니가 가득 찼습니다. 장바구니를 비워주세요");
			return true;
		}
		return false; // 장바구니 빈 경우
	}
}