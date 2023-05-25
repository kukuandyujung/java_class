package j0525;

import java.util.ArrayList;

public class C0525_01 {
	
	public static void main(String[] args) {
		Card[] c =new Card[2];
		
		Card c1 = new Card(Card.kinds[0],1); // this(kinds[0],1); 이게 들어온다
		Card c2 = new Card(Card.kinds[1],2);
		Card c3 = new Card(Card.kinds[2],3);
		Card c4 = new Card(Card.kinds[3],4);
		
		c[0] = c1;
		c[1] = c2;
		
		ArrayList<Card> list = new ArrayList();
		//ArrayList에 추가하는 방법 
		list.add(c1); //0//object o = new Card(Card.kinds[1], 1)와 같다//c1같은 객체를 집어 넣으면 된다. 
		list.add(c2); //1//add = 메소드 c2 = 매개변수 
		list.add(c3); //2// 
		list.add(c4); //3
		
		//ArrayList 읽는 법 
		//Card card = (Card)list.get(0); //c1을 읽어준다 
		//System.out.println(c1);
		for(int i = 0 ; i < list.size() ; i++) { //c.lengt와 같이 개수를 나타내줌  - > list.size()
 			System.out.println(list.get(i).kind + "," + list.get(0).number);			
		}
		System.out.println("개수 : " + list.size());
		//System.out.println(card.number);
		
		//list.remove(2);
		
		//퀴즈 : 하트를 없애기 
		for(int i = 0 ; i < list.size() ; i++) { //4개 가운데 하트 찾기 
 			if( list.get(i).kind.equals("HEART")) {
 				list.remove(i);			
 			}
		}
		
		//4번인 걸 삭제 
		for(int i = 0 ; i < list.size() ; i++) { //
 			if( list.get(i).number == 4) {
 				list.remove(i);			
 			}
		}
		
		System.out.println("-------------------------------");
		for(int i = 0 ; i < list.size() ; i++) { //c.lengt와 같이 개수를 나타내줌  - > list.size()
 			System.out.println(list.get(i).kind + "," + list.get(i).number);			
		}
		System.out.println("개수 : " + list.size());
		System.out.println("프로그램 종료");

	}

}
