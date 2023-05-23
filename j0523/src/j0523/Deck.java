package j0523;

public class Deck {
	
	//52개의 카드 생성하기 
	Card[] c = new Card[52]; //총 4종류  * 13 =52
	
	//기본생성자 만들기 : 클래스와 이름이 같고, void가 없어야한다. 
	Deck() { 
		//kind =null;, number =0; //space 1 space 2 space 3 ... clover 13번까지 들어가야 한다.  
		//카드 4종류는 13장이 필요
		for(int i = 0 ; i < 52; i++) {
			c[i] = new Card(); //객체 선언 
			c[i].kind = c[i].shape[i/13]; //0 13번 다음 1 13번 
			c[i].number = (i%13)+1; //1,2,3,4,5,6,7,8,9,10,11,12,13...1,2,3..
		
		}//for
	}//Deck
	
	
	//카드 뽑기 c[0] : Space 1 , c[1], c[2], c[3],
	Card pick(int index) {
		return c[index];
		//for(int i = 0 ; ; i++
	}
	
	//카드 섞기 
	void shuffle() { 
		
		for(int i = 0 ; i < 1000 ; i++) {
			int random = (int)(Math.random()*51);
			Card temp = null; //Card temp인 이유는 c 안에는 kind와 number이 들어있기 때문이다. 
			temp = c[0]; 
			c[0] = c[random];
			c[random] = temp;
		}//for
		
	}//shuffle
//        int k =0;
//		for(int i = 0 ; i <4 ; i ++) {
//				for(int j = 0 ; j < 13 ; j++) { 
//					c[k] = new Card(Card.shape[i], j+1); //객체선언해주기
//					k++;
//				
//			}//for
//		}//for
		
			//for(int i = 0 ; i <52 ; i ++)
		
	}//Deck
	


