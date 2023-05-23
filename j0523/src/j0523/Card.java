package j0523;

public class Card {
	
	static String[] shape = {"Space", "Heart", "Diamond", "Clover"};
	static String[] numbers = {"1" , "2", "3", "4", "5", "6", "7", "8", "9"	,"10", "J","Q","K"};
	static String[] numbers1 = {"0", "1" , "2", "3", "4", "5", "6", "7", "8", "9"	,"10", "J","Q","K"};
	
	
	String kind; //무늬 - 4가지 Space Heart Diamond Clover	
	int  number; //숫자 - 1,2,3,4,5,6,7,8,9,10, 11- J,12-Q,13-K
	
	Card(){
		this("Space", 1); //다른 생성자 호출하는 this //this를 사용하는 다른 경우 : 참조변수 
	}
	Card(String kind){
		this.kind = kind;
	}
	Card(String kind, int number){
		this.kind = kind;
		this.number = number;
	}

	
	@Override
	public String toString() { //toString()꺼이다.
		String str =  kind + "," + number ; 
		return str;
	}

}
