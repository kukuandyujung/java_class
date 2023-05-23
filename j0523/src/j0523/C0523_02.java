package j0523;

public class C0523_02 {

	public static void main(String[] args) {
		//Card[] c = new Card[52];
		
		//Space, Heart, Diamond , Clover
		Deck d = new Deck();
		//카드 섞기 
		d.shuffle();

//		//카드 뽑기 메소드 d.pick(번호)
//		System.out.printf("%s , %d \n", d.pick().kind, d.pick(51).number);
	
		
		//출력하기 
		for(int i = 0 ; i < 52; i++) {
			//System.out.printf("%s %s \n" , d.c[i].kind , Card.numbers1[d.c[i].number] );
			System.out.printf("%s \n" , d.c[i] ); //윗 줄 코드가 이렇게 간결해졌다. 
	//	Deck d = new Deck();

	}//for

		
		
}//main
	
	
}//class
