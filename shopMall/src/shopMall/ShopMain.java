package shopMall;

public class ShopMain {

	public static void main(String[] args) {
		System.out.println("**************************");
		System.out.println("[ KUKU's 쇼핑몰 ]");
		System.out.println("**************************");
		System.out.println("1. QLED TV 70인치");
		System.out.println("2. 갤럭시 북");
		System.out.println("3. 홈 미니 블루투스 스피커");
		System.out.println("4. 그랑데 세탁기");
		System.out.println("---------------------------");
		System.out.println("구매하고 싶은 제품의 번호를 입력히시오.");

		// id pw 확인해야 한다.
		Buyer b = new Buyer("kuku", "김꾸꾸", "뽀송이"); // id = hong, 이름: 홍길동
		// Tv t = new Tv();
		b.buy(new Tv());
		b.buy(new Tv());
		b.buy(new Tv());
		b.buy(new Tv());
		b.buy(new Tv());
		b.buy(new Tv());
		b.buy(new Tv());
		b.buy(new Tv());
		b.buy(new Tv());
		b.buy(new Tv());
		b.buy(new Tv());
		b.buy(new Tv());
		b.buy(new Tv());
		b.buy(new Tv());
		b.buy(new Tv());
		// Computer c = new Computer();
		b.buy(new Computer());

		b.buy(new Speaker());
		b.buy(new Washer());

		// 배열하면 for문을 바로 생각하기 

		// Class washer 120 ,12, 10
		System.out.println("--------------------------");
		System.out.println("잔액: " + b.money);
		System.out.println("nickname: " + b.nickname);
		System.out.println("name: " + b.name);
		System.out.println("구매 개수: " + b.list.size());
		b.buylist();
		
	}

}
