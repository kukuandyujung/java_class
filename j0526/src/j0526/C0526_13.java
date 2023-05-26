package j0526;

import java.util.Scanner;

public class C0526_13 {

	public static void main(String[] args) {
		String lotto1 = "1조12587";
		//String lotto2 = "1조12587";
		
		Scanner scan = new Scanner(System.in);
		// 0 -9 조까지 있다. 랜덤 숫자를 맞추기 
		
		//9조까지 
		int random = (int)(Math.random() * 10); //0-9
		int random2 = (int)(Math.random() * 100000); //0-99999
		String StrRandom = String.format("%05d", random2); //0을 5자리에 채워라
		System.out.println(random);
		System.out.println(random2);
		System.out.println("조 앞의 숫자와 5자리의 숫자를 입력하세요  예) 1조12587");
		String  strNum = scan.next(); //1조라는 형태로 입력을 받는다 
		//String   result = strNum .substring(0,1);
		
		//뒤 자리 
		int myNum1 = Integer.parseInt(strNum .substring(0,1)); //형태를 변환 시켜준다. 
		System.out.println("내가 쓴 앞: " +myNum1); 
		System.out.println("앞" + random);
		System.out.println("------------------");
		
		int myNum2 = Integer.parseInt(strNum .substring(2));
		System.out.println("내가 쓴 뒤: " + myNum2);
		System.out.println("답 뒤: " + random2);
		
		System.out.println("---------조단위---------");
		if(random==myNum1) {	
			System.out.println("------------------");
			System.out.println("앞자리 당첨");
			
		}else {
			System.out.println("----------------");
			System.out.println("앞 꽝");
		}
		System.out.println("---------5자리 비교---------");
		if(random2==myNum2) {
			System.out.println("------------------");
			System.out.println("뒤 당첨");
		}else {
			System.out.println("------------------");
			System.out.println("뒤 꽝");
		}
		

	}

}