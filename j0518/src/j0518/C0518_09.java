package j0518;

import java.util.Scanner;

public class C0518_09 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 변수 선언
		int MyMoney = 1000;
		int choice = 0;

		// 자판기 프로그램
		// 1. 밀크 커피 -300 2. 헤이즐넛커피 -500 3.블랙 커피-350 4.코코아-300 5. 우유 -400 6. 잔액 충전
		loop: while (true) {
			System.out.println("[ 김꾸꾸의 자판기 ]");
			System.out.println("1. 밀크 커피 -300");
			System.out.println("2. 헤이즐넛 커피 -500");
			System.out.println("3. 블랙 커피 -350");
			System.out.println("4. 코코아-300");
			System.out.println("5. 우유-400");
			System.out.println("6. 잔액 충전");
			System.out.println("----------------------------");
			System.out.printf("현재 잔액: %,d \n", MyMoney);
			System.out.println("원하는 번호를 입력하세요");
			choice = scan.nextInt();

			switch (choice) {
			case 1:// 밀크 커피 300
				MyMoney = order(MyMoney, 300, "밀크 커피");
				break;

			case 2:// 헤이즐넛 커피 500
				MyMoney = order(MyMoney, 500, "헤이즐넛 커피");
//				if (MyMoney >= 500) {
//					System.out.println("헤이즐넛 커피가 자동으로 나옵니다.");
//					MyMoney = MyMoney - 500; // MyMoney -= 300;
//				} else {
//					System.out.println("잔액이 부족합니다. 6번을 눌러 잔액을 충전하세요.");
//				}
				break;

			case 3:// 블랙 커피 350
				MyMoney = order(MyMoney, 350, "블랙 커피");
				break;

			case 4:// 코코아 300
				MyMoney = order(MyMoney, 300, "코코아");
				break;

			case 5:// 우유 400
				MyMoney = order(MyMoney, 400, "우유");
				break;

			case 6:// 잔액 충전
				System.out.println("잔액을 충전합니다. 충전 금액을 입력하세요");
				int temp = scan.nextInt();
				if (temp > 0) {
					System.out.println("결제 수단: 1. 카드 결제 2. 상품권 결제");
					choice = scan.nextInt();
					if (choice == 1) {
						MyMoney += temp; // MyMoney = MyMoney + temp;
						System.out.println("[ 카드 결제가 완료되었습니다. ]");
						System.out.printf("충전 금액: %,d \n", temp);
						System.out.printf("현재 잔액: %,d \n ", MyMoney);
						System.out.println();
					} else if (choice == 2) {
						MyMoney += temp; // MyMoney = MyMoney + temp;
						System.out.println("금액권을 선택하세요 1. 5000원권 2. 10000원권");
						int giftCard = scan.nextInt();
						if (giftCard == 1) {
							System.out.println("[ 5000원이 충전되었습니다.]");
							System.out.printf("충전 금액: %,d \n", temp);
							System.out.printf("현재 잔액: %,d \n ", MyMoney);
							System.out.println();
						} else if (giftCard == 2) {
							System.out.println("[ 10000원이 충전되었습니다.]");
							System.out.printf("충전 금액: %,d \n", temp);
							System.out.printf("현재 잔액: %,d \n ", MyMoney);
							System.out.println();
						}
					} else {
						System.out.println("[ 시스템에 오류가 있습니다. 다시 실행해 주세요 ]");

					}
				}
				break;

			case 0:
				System.out.println("[ 프로그램 종료 ]");
				System.out.println();
				break loop;
			}

		}
	}// main

	// 음료 제조 메소드
	static int order(int MyMoney, int price, String title) {
		if (MyMoney >= price) {
			System.out.println(title + "가 자동으로 나옵니다.");
			MyMoney = MyMoney - price; // MyMoney -= 300;
		} else {
			System.out.println("잔액이 부족합니다. 6번을 눌러 잔액을 충전하세요.");
		}
		return MyMoney;
	}

}// class
