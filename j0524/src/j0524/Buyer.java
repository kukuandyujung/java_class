package j0524;

public class Buyer {

	int money = 1000; // 현재 내가 있는 돈
	int bonusPoint = 0; // 포인트

	Product[] cart = new Product[10]; //10개이상이 넘어가면 에러가 난다.

	// Stv s = new Stv();
	// Product p = new Stv();
	// Product p = new Computer();
	// Product p = new Audio();

	int count = 0; //구매한 물건의 개수 
	void buy(Product p) {
		money = money - p.price; // 150
		bonusPoint = bonusPoint + p.bonusPoint;
		cart[count] =p;
		count++; 
	}

	// 이 밑 계산이 위의 Product로 정리할 수 있다.
//	void buy(Stv s ) {
//		money = money - s.price; //150
//		bonusPoint = bonusPoint + s.bonusPoint; 
//	}
//	
//	void buy(Computer c ) {
//		money = money - c.price; //200
//		bonusPoint = bonusPoint + c.bonusPoint; 
//	}
//	void buy(Audio a ) {
//		money = money - a.price; //200
//		bonusPoint = bonusPoint + a.bonusPoint; 
//	}
}//
