package j0517;

public class C0517_01 {

	public static void main(String[] args) {
		
		//객체선언 
		Card c1 =new Card();
		
		//사용방법: 참조 변수명.변수명
		c1.kind = "Heart";
		c1.number = 7;
		c1.width= 500;
		c1.number = 25;
		
		Card c2 =new Card();
		c2.kind = "Spade";
		c2.number = 4;
		
		Card c3 =new Card();
		c3.kind = "Diamond";
		c3.number = 7;
		c3.width= 20;
		c3.number = 25;
		
		System.out.println("c1 카드 종류 : " + c1.kind);
		System.out.println("c1 카드 종류 : " + c1.number);
		System.out.println("c1 가로 길이 : " + Card.width);
		System.out.println("c1 세로 길이 : " + Card.height);
		System.out.println("=============================");
		System.out.println("c2 카드 종류 : " + c2.kind);
		System.out.println("c2 카드 종류 : " + c2.number);
		System.out.println("c2 가로 길이 : " + Card.width);
		System.out.println("c2 세로 길이 : " + Card.height);
		System.out.println("=============================");
		System.out.println("c3 카드 종류 : " + c3.kind);
		System.out.println("c3 카드 종류 : " + c3.number);
		System.out.println("c3 가로 길이 : " + Card.width);
		System.out.println("c3 세로 길이 : " + Card.height);

	}

}
