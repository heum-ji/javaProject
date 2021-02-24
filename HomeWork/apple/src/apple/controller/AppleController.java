package apple.controller;

import apple.view.AppleView;
import apple.vo.AppleWatch;
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
	int watchIndex; // watch index
	AppleView view;

	public AppleController() {
		super();
		productStock = new Product[4][10]; // 종류 : 4 + stock 10 까지
		buyList = new Product[10];

		buyIndex = 0;
		watchIndex = 0;

		// 재고 추가
		inputWatch();

		view = new AppleView();
	}

	public void main() {

		while (true) {
			switch (view.showAppleStore()) { // 메인메뉴
			case 1:
				// 직원
				break;
			case 2: // 손님
				boolean test = true;

				while (test) {
					switch (view.showWelCome()) { // Store 입장
					case 1: // Shopping
						boolean test2 = true;

						while (test2) {
							switch (view.showShopping()) { // ShoppingList
							case 1: // AppleWatch
								view.printWatchList(productStock[WATCH], watchIndex);
								if (view.buyProduct(productStock[WATCH], buyList, buyIndex)) {
									buyIndex++; // 구매목록 추가
									view.printMsg("구매완료");
									test = true; // welCome 실행
									test2 = false; // Shopping 종료
								} else {
									view.printMsg("안사~");
								}
								break;
							case 2:
								// view.printPadList(products[WATCH], watchIndex);
								break;
							case 3:
								// view.printPhoneList(products[WATCH], watchIndex);
								break;
							case 4:
								// view.printMacBookList(products[WATCH], watchIndex);
								break;
							case 0:
								test = true; // welCome 실행
								test2 = false; // Shopping 종료
								break;
							default:
								view.printFaultMsg();
								break;
							}
						}
						break;
					case 2: // BuyList
						view.printBuyList(buyList, buyIndex);
						break;
					case 0:
						test = false;
						break;
					default:
						view.printFaultMsg();
						break;
					}
				}
				break;
			case 0:
				view.printMsg("퇴장하기");
				return;
			default:
				view.printFaultMsg();
				break;
			}
		}
	}

	public void inputWatch() {
		productStock[WATCH][watchIndex++] = new AppleWatch("애플워치3", "White", "watch", 1, 300000, 1);
		productStock[WATCH][watchIndex++] = new AppleWatch("애플워치4", "Black", "watch", 5, 400000, 2);
		productStock[WATCH][watchIndex++] = new AppleWatch("애플워치5", "Green", "watch", 10, 500000, 3);
		productStock[WATCH][watchIndex++] = new AppleWatch("애플워치se", "Yellow", "watch", 20, 600000, 4);
	}
}
