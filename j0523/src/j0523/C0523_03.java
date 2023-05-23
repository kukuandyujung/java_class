package j0523;

import java.util.Date;
import java.util.Scanner;

public class C0523_03 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Date today = new Date();
		final int NUMBER;
		Card c =new Card("Spcae", 1);
		
		Card c2 = null; // 이 경우에는 Card만 담을 수 있다. 
		Deck d1 = new Deck(); 
		//c2 = d1 은 안 된다 왜냐면 두 타입이 다르기 때문 
		
		//c2= c 이건 가능하다 왜냐 타입이 서로 갖기 때문
		
		//그러나 조상과 자손의 관계에는 
		Object o = null;
		o = d1; //조상과 자손이라는 관계가 맺어져서 타입이 달라도 가능하다. 
		
		
		System.out.println(c); //클래스 변수 2개 기본 변수 2개 
		
		int num = 5;
		num =10;
		final int number =1;
		//NUMBER  =5; //상수는 웬만하면  대문자로 왜냐면 일반변수랑 헷갈리기 때문이다. 

}//main
	
	static void add( ) {
		
	}
	static void add(int x ) { //이렇게 매개 변수만 다른 걸 넣어도 오버로딩이 된다. 
	}
	
	}//class
