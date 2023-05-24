package shopMall;

import java.util.ArrayList;

public class Buyer {

	Buyer() {
	}

	Buyer(String id, String name, String nickname) {
		this.id = id;
		this.name = name;
		this.nickname = nickname;
	}
	//배열
	//Product[] cart = new Product[100]; //내가 산 구매 목록을 저장하기 위해 
    //cart[0] = p ;
	//이제 배열 대신 collection 
	ArrayList<Product> list = new ArrayList();
	//ArrayList<Product> 이렇게  적으면 Product와 관련된 거만 들어간다. 지네릭스라고 읽는다
	//cart[i] = p , list.add(p): 객체추가 Object o = new Product(); 와 같은 말 
	//cart[0] , list.get(0) 이 둘은 같은 말 둘 다 데이터 읽어오기이다.  
	//cart.length , list.size : 총 개수 
	String id;
	String pw;
	String name;
	String nickname;

	int money = 10000;
	int bonusPoint = 0;
	//int count = 0; //구매한 개수 

	void buylist() {
		System.out.print("구매목록 : ");
		for(int i = 0 ; i <list.size(); i++) {
			Product p = list.get(i); //object 
			if(i ==0) {
				System.out.print(p.productName);
			}else
			System.out.print("," + p.productName);
		}//for
		System.out.println();
	}//void
	
	
	void buy(Product p) {
		
		if( money <p.price) {
			System.out.println("보유 금액이 부족해서 상품을 구매할 수 없습니다.");
			return;
		}
		money = money - p.price; // 티비의 가격을 빼고 다시 money에 넣음.
		bonusPoint = bonusPoint + p.bonusPoint; // 현재 보너스에 추가해서 다시 보너스에 넣음
		System.out.println("구매한 " + p.item+ "의 제품은 "+p.productName);
		list.add(p);
		//cart[count] = p;
		//count++;
	}// product
	
	
//	//Product p = new Tv();
//	void buy(Tv t) {
//		money = money - t.price; // 티비의 가격을 빼고 다시 money에 넣음.
//
//		bonusPoint = bonusPoint + t.bonusPoint; // 현재 보너스에 추가해서 다시 보너스에 넣음
//
//		System.out.println("구매한 tv 기종 :" +t.productName);
//	}// tv
//
//	//Product p = new Computer();
//	void buy(Computer c) {
//		money = money - c.price; // 티비의 가격을 빼고 다시 money에 넣음.
//
//		bonusPoint = bonusPoint + c.bonusPoint; // 현재 보너스에 추가해서 다시 보너스에 넣음
//        System.out.println("구매한 컴퓨터 기종 :" +c.productName);
//	}// computer
//
//	void buy(Speaker s) {
//		money = money - s.price; // 티비의 가격을 빼고 다시 money에 넣음.
//
//		bonusPoint = bonusPoint + s.bonusPoint; // 현재 보너스에 추가해서 다시 보너스에 넣음
//        System.out.println("구매한 스피커 기종 :" + s.productName);
//	}// speaker
//	
//	void buy(Washer w) {
//		money = money - w.price; // 티비의 가격을 빼고 다시 money에 넣음.
//
//		bonusPoint = bonusPoint + w.bonusPoint; // 현재 보너스에 추가해서 다시 보너스에 넣음
//        System.out.println("구매한 세탁기 기종 :" + w.productName);
//	}//Washer

}//
