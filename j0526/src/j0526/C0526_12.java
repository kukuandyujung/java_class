package j0526;

import java.util.Scanner;

public class C0526_12 {

	public static void main(String[] args) {
		String lotto1 = "1조12587";
		//String lotto2 = "1조12587";
		
		Scanner scan = new Scanner(System.in);
		// 0 -9 조까지 있다. 랜덤 숫자를 맞추기 
		
		//9조까지 
		System.out.println("조와 5자리의 숫자를 입력하세요  ");
		String  strNum = scan.next(); //1조라는 형태로 입력을 받는다 
		//String   result = strNum .substring(0,1);
		
		int myNum = Integer.parseInt(strNum .substring(0,1)); //형태를 변환 시켜준다. 
		System.out.println(myNum);
	    int random = (int)(Math.random() * 10);
	    System.out.println(random);
		if(random==myNum) {	
			System.out.println("당첨");
			
		}else {
			System.out.println("꽝");
		}
		
		

	}

}
