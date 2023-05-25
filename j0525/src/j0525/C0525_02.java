package j0525;

import java.util.ArrayList;

public class C0525_02 {

	public static void main(String[] args) {
		ArrayList<Card> list = new ArrayList<>();
		
		// 퀴즈 1 
		
//		list.add(new Card(Card.kinds[0], 1));
//		list.add(new Card(Card.kinds[0], 2));
//		list.add(new Card(Card.kinds[0], 3));
		
//		for(int i = 0 ;i<13 ; i++) {
//			list.add(new Card(Card.kinds[0], i+1));
//		}
		
		//퀴즈1
//		for(int i = 1 ;i<14 ; i++) {
//			list.add(new Card(Card.kinds[0], i));
//		}
		
//		//퀴즈2
//		for(int i = 0 ;i<4 ; i++) {
//			list.add(new Card(Card.kinds[i], 1));
//		}
		
		//퀴즈 3 
		//1,2,3,4,5,6,7...52 0*13+1 0*13+2 0*13+3 0*13+4 0*13+12, 1*13+1 1*13+2...1*13+12 
		//1,2,3,4,5,6,7,..13, 1,2,3,4,5...13 
		for(int i = 0 ;i<52 ; i++) {
			list.add(new Card(Card.kinds[i/13], (i%13+1)));
		}
		
		//출력 
		for(int i = 0 ; i < list.size() ; i++) { //c.lengt와 같이 개수를 나타내줌  - > list.size()
 			System.out.println(list.get(i).kind + "," + Card.numbers[list.get(i).number]);			
		}

	}

}
