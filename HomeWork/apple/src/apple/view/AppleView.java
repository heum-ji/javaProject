package apple.view;

import java.util.Scanner;

import apple.vo.Product;

public class AppleView {
	Scanner sc;

	public AppleView() {
		super();
		sc = new Scanner(System.in);
	}

	public int showAppleStore() {
		System.out.println(" ===== Apple Store ===== ");
		System.out.println("|\t 1. 직원    \t|");
		System.out.println("|\t 2. 손님    \t|");
		System.out.println("|\t 0. 퇴장    \t|");
		System.out.println(" ======================= ");
		System.out.print("선택 >> ");

		return (sc.nextInt());
	}

	public int showWelCome() {
		System.out.println(" ======== WelCome ====== ");
		System.out.println("|\t 1. 쇼핑하기 \t|");
		System.out.println("|\t 2. 구매목록 \t|");
		System.out.println("|\t 0. 뒤로가기 \t|");
		System.out.println(" ======================= ");
		System.out.print("선택 >> ");

		return (sc.nextInt());
	}

	public int showShopping() {
		System.out.println(" =========== Shopping ========== ");
		System.out.println("|\t 1. AppleWatch \t\t|");
		System.out.println("|\t 2. IPad \t\t|");
		System.out.println("|\t 3. IPhone \t\t|");
		System.out.println("|\t 4. MacBook \t\t|");
		System.out.println("|\t 0. 뒤로가기 \t\t|");
		System.out.println(" =============================== ");
		System.out.print("선택 >> ");

		return (sc.nextInt());
	}

	public void printBuyList(Product[] buyList, int buyIndex) {
		int productPriceSum = 0; // 총 구매액

		System.out.println(" =============== BuyList =============== ");
		System.out.println("| 제품명 \t\t 가격 \t\t 수량\t|");
		for (int i = 0; i < buyIndex; i++) {
			System.out.println(
					"|" + buyList[i].getName() + "\t\t" + buyList[i].getPrice() + "\t\t" + buyList[i].getBuyCnt());
			productPriceSum += (buyList[i].getPrice() * buyList[i].getBuyCnt()); // 총금액 연산
		}
		System.out.println(" ======================================= ");
		System.out.println("\t\t총 구매액 : " + productPriceSum);
	}

	public void printWatchList(Product[] watch, int watchIndex) {
		System.out.println(" ===================== AppleWatch ====================== ");
		System.out.println("|No \t 제품명 \t\t 색깔 \t\t 재고 \t 가격\t|");
		for (int i = 0; i < watchIndex; i++) {
			System.out.println("|" + watch[i].getProductNum() + "\t" + watch[i].getName() + " \t" + watch[i].getColor()
					+ " \t\t" + watch[i].getStock() + "\t" + watch[i].getPrice() + "\t|");
		}
		System.out.println(" ======================================================= ");
	}

	public boolean buyProduct(Product[] product, Product[] buyList, int buyIndex) {
		System.out.print("구매할 제품 번호 입력 : ");
		int buyProductNum = sc.nextInt();
		buyProductNum--; // 배열 index 처리

		System.out.print("구매 개수 입력 : ");
		int buyNum = sc.nextInt();
		// 제품 확인
		System.out.println("[ " + product[buyProductNum].getName() + " ] 제품을 " + buyNum + "개 선택하셨습니다.");
		// 구매 확인
		System.out.print("구매 하시겠습니까[y/n] ");
		if (sc.next().equals("y")) {
			int currentProductStock = product[buyProductNum].getStock(); // 재고 불러오기
			currentProductStock -= buyNum; // 구매 처리
			product[buyProductNum].setStock(currentProductStock); // 재고 처리
			// 구매목록 추가
			if (product[buyProductNum].getCode().equals("watch")) { // AppleWatch
				buyList[buyIndex] = product[buyProductNum]; // 구매목록에 선택한 상품 추가
				buyList[buyIndex].setBuyCnt(buyNum); // 구매목록 수량 처리
			}
			return true;
		} else {
			return false;
		}
	}

	public void printMsg(String msg) {
		System.out.println(msg);
	}

	public void printFaultMsg() {
		System.out.println("잘못 입력하셨습니다. 다시 선택해주세요.");
	}

}
