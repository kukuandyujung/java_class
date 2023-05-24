package j0524;

import java.util.Scanner;

public class Shopping {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("[  쇼핑몰 프로그램  ]");
		System.out.println("1. Stv");
		System.out.println("2. Computer");
		System.out.println("3. Audio");
		System.out.println("-------------------");
		System.out.println("구매하고 싶은 번호를 입력하세요 ");

		// class사용하기 위해 객체 선언
		Buyer b = new Buyer();
		// Stv s =new Stv();
		b.buy(new Stv());
		b.buy(new Stv());

		// 컴퓨터
		// Computer c = new Computer();
		b.buy(new Computer());
		b.buy(new Audio());
		System.out.println("현재 포인트" + b.bonusPoint);
		System.out.println("현재 잔액" + b.money);
		System.out.println("구매 내역"+ b.count);

	}

}
