package apple.view;

import java.util.Scanner;

import apple.vo.AppleWatch;
import apple.vo.IPad;
import apple.vo.IPhone;
import apple.vo.Product;

public class AppleView {
	Scanner sc;

	public AppleView() {
		super();
		sc = new Scanner(System.in);
	}

	/**
	 * Customer
	 */
	public int showAppleStoreMenu() {
		System.out.println(" ===== Apple Store ===== ");
		System.out.println("|\t 1. 직원    \t|");
		System.out.println("|\t 2. 손님    \t|");
		System.out.println("|\t 0. 퇴장    \t|");
		System.out.println(" ======================= ");
		System.out.print("선택 >> ");

		return (sc.nextInt());
	}

	public int showWelComeMenu() {
		System.out.println(" ============ WelCome ========== ");
		System.out.println("|\t 1. 쇼핑하기       \t\t|");
		System.out.println("|\t 2. 장바구니       \t\t|");
		System.out.println("|\t 3. 장바구니 비우기\t\t|");
		System.out.println("|\t 0. 뒤로가기       \t\t|");
		System.out.println(" =============================== ");
		System.out.print("선택 >> ");

		return (sc.nextInt());
	}

	public int showShoppingMenu() {
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

	public int showBuyListMenu() {
		System.out.println(" ======== 장바구니 ======== ");
		System.out.println("|\t1. 전체 제거\t|");
		System.out.println("|\t2. 선택 제거\t|");
		System.out.println("|\t0. 뒤로가기\t|");
		System.out.println(" ======================= ");
		System.out.print("선택 >> ");

		return (sc.nextInt());
	}

	public void printBuyList(Product[] buyList, int buyIndex) {
		int productPriceSum = 0; // 총 구매액

		System.out.println(" ==================== 장바구니 =================== ");
		System.out.println("|제품명\t\t\t가격\t\t수량\t|");
		for (int i = 0; i < buyIndex; i++) {
			System.out.println("|" + buyList[i].getName() + "\t\t" + buyList[i].getPrice() + "\t\t"
					+ buyList[i].getBuyCnt() + "\t|");
			productPriceSum += (buyList[i].getPrice() * buyList[i].getBuyCnt()); // 총금액 연산
		}
		System.out.println(" =============================================== ");
		System.out.println("\t\t총 구매액 : " + productPriceSum + "\n");
	}

	public void printProductList(Product[] product, int productIndex) {
		String code = product[0].getCode(); // 상품 종류 확인

		// 상단 출력
		if (code.equals("watch")) {
			System.out.println(" ========================= AppleWatch ========================== ");
			System.out.println("|No\t제품명\t\t\t색깔\t\t재고\t가격\t|");
		} else if (code.equals("pad")) {
			System.out.println(" ============================ IPad ============================= ");
			System.out.println("|No\t제품명\t\t\t색깔\t\t재고\t가격\t|");
		} else if (code.equals("phone")) {
			System.out.println(" ============================ IPhone =========================== ");
			System.out.println("|No\t제품명 \t\t\t색깔\t\t재고\t가격\t|\t");
		} else if (code.equals("macBook")) {
			System.out.println(" ============================ MacBook ========================== ");
			System.out.println("|No\t제품명 \t\t\t색깔\t\t재고\t가격\t|\t");
		}

		// productList 출력
		for (int i = 0; i < productIndex; i++) {
			System.out.println("|" + product[i].getProductNum() + "\t" + product[i].getName() + "\t\t"
					+ product[i].getColor() + "\t\t" + product[i].getStock() + "\t" + product[i].getPrice() + "\t|");
		}

		// 하단 출력
		if (code.equals("watch")) {
			System.out.println(" =============================================================== ");
		} else if (code.equals("pad")) {
			System.out.println(" =============================================================== ");
		} else if (code.equals("phone")) {
			System.out.println(" =============================================================== ");
		} else if (code.equals("macBook")) {
			System.out.println(" =============================================================== ");
		}
	}

	public boolean buyProduct(Product[] product, int productIndex, Product[] buyList, int buyIndex) {
		boolean productOk = true; // 상품 확인용
		boolean stockOk = true; // 재고 확인용
		int buyProductNum = 0; // 상품번호
		int buyNum = 0; // 구매량
		String buyProductName = "";

		// 상품 및 번호 확인
		while (productOk) {
			System.out.print("구매할 제품 번호 입력 : ");
			buyProductNum = sc.nextInt();
			// 상품 번호 확인
			if (buyProductNum < 1 || productIndex < buyProductNum) { // 0 or 없는 번호 체크
				printFaultMsg();
				continue;
			}
			buyProductNum--; // 배열 index 처리

			// 상품 확인
			if (product[buyProductNum].getStock() == 0) { // 재고 없는 상태
				printMsg("재고가 없어요");
				System.out.println();
			} else {
				productOk = false;
			}
		}

		// 재고 확인
		while (stockOk) {
			System.out.print("구매 개수 입력 : ");
			buyNum = sc.nextInt();
			if (buyNum > product[buyProductNum].getStock()) { // 재고보다 많이 구매
				printMsg("재고가 부족해요");
				System.out.println();
			} else {
				stockOk = false;
			}
		}

		// 제품 확인
		System.out.println("[ " + product[buyProductNum].getName() + " ] 제품을 " + buyNum + "개 선택하셨습니다.");
		// 구매 확인
		System.out.print("구매 하시겠습니까[y/n] ");
		if (sc.next().equals("y")) {
			buyProductName = product[buyProductNum].getName();

			// 재고 감소
			int currentProductStock = product[buyProductNum].getStock(); // 재고 불러오기
			currentProductStock -= buyNum; // 구매 처리
			product[buyProductNum].setStock(currentProductStock); // 재고 처리

			// 구매목록 추가
			int buyListNum = searchBuyList(buyList, buyIndex, buyProductName);

			if (buyListNum != -1) { // 이미 산 경우
				buyList[buyListNum].setBuyCnt(buyList[buyListNum].getBuyCnt() + buyNum); // 구매목록 수량 처리
				printMsg("구매완료");
			} else { // 처음 구매
				buyList[buyIndex] = product[buyProductNum]; // 구매목록에 선택한 상품 추가
				buyList[buyIndex].setBuyCnt(buyNum); // 구매목록 수량 처리
				printMsg("구매완료");
				return true;
			}
		} else {
			printMsg("안사~");
			return false;
		}
		return false;
	}

	public void deleteAllBuyList(Product[] buyList, int buyIndex) {
		for (int i = 0; i < buyIndex; i++) {
			buyList[i] = null;
		}
		System.out.println("모두 제거 완료");
		System.out.println();
	}

	public boolean deleteSelBuyList(Product[] buyList, int buyIndex) {
		System.out.print("삭제할 상품 이름 : ");
		sc.nextLine();
		String deleteProductName = sc.nextLine();

		// 구매목록 체크
		int deleteBuyListNum = searchBuyList(buyList, buyIndex, deleteProductName);

		if (deleteBuyListNum != -1) { // 장바구니에 있는 경우
			// 해당 상품 제거
			for (int i = deleteBuyListNum; i < buyIndex - 1; i++) {
				buyList[i] = buyList[i + 1];
			}
			buyList[--buyIndex] = null;

			System.out.println("선택 상품 제거 완료");
			System.out.println();
			return true;
		} else { // 장바구니에 없음
			System.out.println("해당 상품은 없습니다.");
			System.out.println();
			return false;
		}
	}

	public void printMsg(String msg) {
		System.out.println(msg);
	}

	public void printFaultMsg() {
		System.out.println("잘못 입력하셨습니다. 다시 선택해주세요.");
		System.out.println();
	}

	public int searchBuyList(Product[] buyList, int buyIndex, String buyName) {

		for (int i = 0; i < buyIndex; i++) {
			if (buyList[i].getName().equals(buyName)) {
				return i;
			}
		}
		return -1;
	}

	/**
	 * Staff
	 */
	public int showManageMenu() {
		System.out.println(" =======관리 프로그램======= ");
		System.out.println("|\t1.새 제품 등록\t|");
		System.out.println("|\t2.현재 재고 현황\t|");
		System.out.println("|\t3.재고 변경\t|");
		System.out.println("|\t4.제품 삭제\t|");
		System.out.println("|\t0.뒤로 가기\t|");
		System.out.println(" ======================= ");
		System.out.print("선택 >> ");

		return (sc.nextInt());
	}

	public int showRegistMenu() {
		System.out.println(" ===== Apple Store ===== ");
		System.out.println("|\t1.아이폰 등록\t|");
		System.out.println("|\t2.맥북 등록\t|");
		System.out.println("|\t3.아이패드 등록\t|");
		System.out.println("|\t4.애플워치 등록\t|");
		System.out.println("|\t0.뒤로가기\t|");
		System.out.println(" ======================= ");
		System.out.print("선택 >> ");

		return (sc.nextInt());
	}

	public int showModifyMenu() {
		System.out.println(" ==어떤 제품의 재고를 변경하시겠습니까?== ");
		System.out.println("|\t    1.아이폰                \t|");
		System.out.println("|\t    2.맥북               \t|");
		System.out.println("|\t    3.아이패드          \t|");
		System.out.println("|\t    4.애플워치          \t|");
		System.out.println("|\t    0.뒤로가기          \t|");
		System.out.println(" =============================== ");
		System.out.print("선택 >> ");

		return (sc.nextInt());
	}

	public int deleteMenu() {
		System.out.println(" =어떤 제품을 삭제하시겠습니까?= ");
		System.out.println("|\t 1.아이폰  \t|");
		System.out.println("|\t 2.맥 북   \t|");
		System.out.println("|\t 3.아이패드  \t|");
		System.out.println("|\t 4.애플워치  \t|");
		System.out.println("|\t 0.뒤로가기  \t|");
		System.out.println(" ======================= ");
		System.out.print("선택 >> ");

		return (sc.nextInt());
	}

	public void printAll(Product[][] p, int index, int iphone) {

		System.out.println("===========아이폰==============");
		System.out.println("No\t제품명\t컬러\t재고\t가격");
		int count = 1;
		for (int i = 0; i < index; i++) {
			System.out.println(count++ + "\t" + p[iphone][i].getName() + "\t" + p[iphone][i].getColor() + "\t"
					+ p[iphone][i].getStock() + "\t" + p[iphone][i].getPrice());
		}
		System.out.println();
	}

	public void printAll2(Product[][] p, int index2, int macbook) {
		System.out.println("============맥북===============");
		System.out.println("No\t제품명\t컬러\t재고\t가격");
		int count = 1;
		for (int i = 0; i < index2; i++) {
			System.out.println(count++ + "\t" + p[macbook][i].getName() + "\t" + p[macbook][i].getColor() + "\t"
					+ p[macbook][i].getStock() + "\t" + p[macbook][i].getPrice());
		}
		System.out.println();
	}

	public void printAll3(Product[][] p, int index3, int ipad) {
		System.out.println("===========아이패드=============");
		System.out.println("No\t제품명\t컬러\t재고\t가격");
		int count = 1;
		for (int i = 0; i < index3; i++) {
			System.out.println(count++ + "\t" + p[ipad][i].getName() + "\t" + p[ipad][i].getColor() + "\t"
					+ p[ipad][i].getStock() + "\t" + p[ipad][i].getPrice());
		}
		System.out.println();
	}

	public void printAll4(Product[][] p, int index4, int watch) {
		System.out.println("===========애플워치=============");
		System.out.println("No\t제품명\t컬러\t재고\t가격");
		int count = 1;
		for (int i = 0; i < index4; i++) {
			System.out.println(count++ + "\t" + p[watch][i].getName() + "\t" + p[watch][i].getColor() + "\t"
					+ p[watch][i].getStock() + "\t" + p[watch][i].getPrice());
		}
		System.out.println();
	}

	public void modifyIphone(Product[][] p, int index, int iphone) {
		System.out.println("===========아이폰==============");
		int count = 1;
		System.out.println("No\t제품명\t컬러\t재고\t가격");
		for (int i = 0; i < index; i++) {
			System.out.println(count++ + "\t" + p[iphone][i].getName() + "\t" + p[iphone][i].getColor() + "\t"
					+ p[iphone][i].getStock() + "\t" + p[iphone][i].getPrice());
		}
		System.out.print("변경할 제품의 'No'를 입력하세요 : ");
		int sel = sc.nextInt();
		System.out.println("[" + p[iphone][sel - 1].getName() + "]" + "의 제품을 선택하셨습니다.");
		System.out.println("현재 재고는 " + p[iphone][sel - 1].getStock() + "개입니다.");
		System.out.print("변경 하시려는 재고량을 입력해주세요 : ");
		int num = sc.nextInt();
		p[iphone][sel - 1].setStock(num);
		System.out.println("변경 완료");
	}

	public void modifyMacbook(Product[][] p, int index, int macbook) {
		System.out.println("============맥북===============");
		int count = 1;
		System.out.println("No\t제품명\t컬러\t재고\t가격");
		for (int i = 0; i < index; i++) {
			System.out.println(count++ + "\t" + p[macbook][i].getName() + "\t" + p[macbook][i].getColor() + "\t"
					+ p[macbook][i].getStock() + "\t" + p[macbook][i].getPrice());
		}
		System.out.print("변경할 제품의 'No'를 입력하세요 : ");
		int sel = sc.nextInt();
		System.out.println("[" + p[macbook][sel - 1].getName() + "]" + "의 제품을 선택하셨습니다.");
		System.out.println("현재 재고는 " + p[macbook][sel - 1].getStock() + "개입니다.");
		System.out.print("변경 하시려는 재고량을 입력해주세요 : ");
		int num = sc.nextInt();
		p[macbook][sel - 1].setStock(num);
		System.out.println("변경 완료");
	}

	public void modifyIpad(Product[][] p, int index, int ipad) {
		System.out.println("===========아이패드==============");
		int count = 1;
		System.out.println("No\t제품명\t컬러\t재고\t가격");
		for (int i = 0; i < index; i++) {
			System.out.println(count++ + "\t" + p[ipad][i].getName() + "\t" + p[ipad][i].getColor() + "\t"
					+ p[ipad][i].getStock() + "\t" + p[ipad][i].getPrice());
		}
		System.out.print("변경할 제품의 'No'를 입력하세요 : ");
		int sel = sc.nextInt();
		System.out.println("[" + p[ipad][sel - 1].getName() + "]" + "의 제품을 선택하셨습니다.");
		System.out.println("현재 재고는 " + p[ipad][sel - 1].getStock() + "개입니다.");
		System.out.print("변경 하시려는 재고량을 입력해주세요 : ");
		int num = sc.nextInt();
		p[ipad][sel - 1].setStock(num);
		System.out.println("변경 완료");
	}

	public void modifyWatch(Product[][] p, int index, int watch) {
		System.out.println("===========애플워치==============");
		int count = 1;
		System.out.println("No\t제품명\t컬러\t재고\t가격");
		for (int i = 0; i < index; i++) {
			System.out.println(count++ + "\t" + p[watch][i].getName() + "\t" + p[watch][i].getColor() + "\t"
					+ p[watch][i].getStock() + "\t" + p[watch][i].getPrice());
		}
		System.out.print("변경할 제품의 'No'를 입력하세요 : ");
		int sel = sc.nextInt();
		System.out.println("[" + p[watch][sel - 1].getName() + "]" + "의 제품을 선택하셨습니다.");
		System.out.println("현재 재고는 " + p[watch][sel - 1].getStock() + "개입니다.");
		System.out.print("변경 하시려는 재고량을 입력해주세요 : ");
		int num = sc.nextInt();
		p[watch][sel - 1].setStock(num);
		System.out.println("변경 완료");
	}

	public int deleteIphone(Product[][] p, int index, int iphone) {
		System.out.println("====아이폰====");
		int count = 1;
		System.out.println("No\t제품명\t컬러\t재고\t가격");
		for (int i = 0; i < index; i++) {
			System.out.println(count++ + "\t" + p[iphone][i].getName() + "\t" + p[iphone][i].getColor() + "\t"
					+ p[iphone][i].getStock() + "\t" + p[iphone][i].getPrice());
		}
		System.out.print("삭제할 제품의 'No'를 입력하세요 : ");
		int sel = sc.nextInt();
		System.out.println("[" + p[iphone][sel - 1].getName() + "]" + "의 제품을 선택하셨습니다.");
		System.out.print("해당 제품을 삭제 하시겠습니까?[y/n] : ");
		char ch = sc.next().toLowerCase().charAt(0);
		if (ch == 'y') {
			return sel;
		} else {
			System.out.println("삭제 작업이 취소되었습니다.");
		}
		return -1;
	}

	public int deletemacbook(Product[][] p, int index, int macbook) {
		System.out.println("====맥북====");
		int count = 1;
		System.out.println("No\t제품명\t컬러\t재고\t가격");
		for (int i = 0; i < index; i++) {
			System.out.println(count++ + "\t" + p[macbook][i].getName() + "\t" + p[macbook][i].getColor() + "\t"
					+ p[macbook][i].getStock() + "\t" + p[macbook][i].getPrice());
		}
		System.out.print("삭제할 제품의 'No'를 입력하세요 : ");
		int sel = sc.nextInt();
		System.out.println("[" + p[macbook][sel - 1].getName() + "]" + "의 제품을 선택하셨습니다.");
		System.out.print("해당 제품을 삭제 하시겠습니까?[y/n] : ");
		char ch = sc.next().toLowerCase().charAt(0);
		if (ch == 'y') {
			return sel;
		} else {
			System.out.println("삭제 작업이 취소되었습니다.");
		}
		return -1;
	}

	public int deleteIpad(Product[][] p, int index, int ipad) {
		System.out.println("====아이패드====");
		int count = 1;
		System.out.println("No\t제품명\t컬러\t재고\t가격");
		for (int i = 0; i < index; i++) {
			System.out.println(count++ + "\t" + p[ipad][i].getName() + "\t" + p[ipad][i].getColor() + "\t"
					+ p[ipad][i].getStock() + "\t" + p[ipad][i].getPrice());
		}
		System.out.print("삭제할 제품의 'No'를 입력하세요 : ");
		int sel = sc.nextInt();
		System.out.println("[" + p[ipad][sel - 1].getName() + "]" + "의 제품을 선택하셨습니다.");
		System.out.print("해당 제품을 삭제 하시겠습니까?[y/n] : ");
		char ch = sc.next().toLowerCase().charAt(0);
		if (ch == 'y') {
			return sel;
		} else {
			System.out.println("삭제 작업이 취소되었습니다.");
		}
		return -1;
	}

	public int deletewatch(Product[][] p, int index, int watch) {
		System.out.println("====애플워치====");
		int count = 1;
		System.out.println("No\t제품명\t컬러\t재고\t가격");
		for (int i = 0; i < index; i++) {
			System.out.println(count++ + "\t" + p[watch][i].getName() + "\t" + p[watch][i].getColor() + "\t"
					+ p[watch][i].getStock() + "\t" + p[watch][i].getPrice());
		}
		System.out.print("삭제할 제품의 'No'를 입력하세요 : ");
		int sel = sc.nextInt();
		System.out.println("[" + p[watch][sel - 1].getName() + "]" + "의 제품을 선택하셨습니다.");
		System.out.print("해당 제품을 삭제 하시겠습니까?[y/n] : ");
		char ch = sc.next().toLowerCase().charAt(0);
		if (ch == 'y') {
			return sel;
		} else {
			System.out.println("삭제 작업이 취소되었습니다.");
		}
		return -1;
	}

	public Product Iphone() {
		System.out.print("상품명을 입력하세요 : ");
		String name = sc.next();
		System.out.print("컬러색을 입력하세요 : ");
		String color = sc.next();
		System.out.print("수량을 입력하세요 : ");
		int stock = sc.nextInt();
		System.out.print("가격을 입력하세요 : ");
		int price = sc.nextInt();

		Product p = null;
		p = new IPhone(name, color, stock, price);
		return p;
	}

	public Product MacBook() {
		System.out.print("상품명을 입력하세요 : ");
		String name = sc.next();
		System.out.print("컬러색을 입력하세요 : ");
		String color = sc.next();
		System.out.print("수량을 입력하세요 : ");
		int stock = sc.nextInt();
		System.out.print("가격을 입력하세요 : ");
		int price = sc.nextInt();

		Product p = null;
		p = new apple.vo.MacBook(name, color, stock, price);
		return p;
	}

	public Product Ipad() {
		System.out.print("상품명을 입력하세요 : ");
		String name = sc.next();
		System.out.print("컬러색을 입력하세요 : ");
		String color = sc.next();
		System.out.print("수량을 입력하세요 : ");
		int stock = sc.nextInt();
		System.out.print("가격을 입력하세요 : ");
		int price = sc.nextInt();

		Product p = null;
		p = new IPad(name, color, stock, price);
		return p;
	}

	public Product AppleWatch() {
		System.out.print("상품명을 입력하세요 : ");
		String name = sc.next();
		System.out.print("컬러색을 입력하세요 : ");
		String color = sc.next();
		System.out.print("수량을 입력하세요 : ");
		int stock = sc.nextInt();
		System.out.print("가격을 입력하세요 : ");
		int price = sc.nextInt();

		Product p = null;
		p = new AppleWatch(name, color, stock, price);
		return p;
	}
}