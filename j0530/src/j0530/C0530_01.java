package j0530;

import java.util.Scanner;

public class C0530_01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("복권을 입력하세요(예: 1조1234567)");
		//1조 1234567 이 두 개를 분리하기 
		String input = scan.next();
		
		String output1 = input.substring(0,2);
		String output2 = input.substring(2);
		int output3 = Integer.parseInt(output2); //정수타입으로 변경하기 
		
		System.out.println(output1);
		System.out.println("문자타입: " + output2);
		System.out.println("숫자타입: " + output3);
		
		
		for(int i = 1000000; i < 9999999; i++) {
			if(output3 == i) {
				System.out.println("같습니다.");
			}
//			else {
//				System.out.println("다릅니다.");
//			}
		}
		
		
		int random =(int)(Math.random()*1000000)+1000000; //1000000-9999999
		if(random == output3) {
			System.out.println("같습니다.");
		}
		
		
		
//		String str = new String("abc"); //객체 선언 : 내부적으로는 밑 세개가 들어있다. 
//		char ch = 'a';
//		char ch2 = 'b';
//		char ch3 = 'c';
//		
//		String str2= "abc";
//		//charAt(0)
//		
//		System.out.println(str.charAt(0));
//		String str3 = "abcdefg";
//		String str4 =str3.substring(3,5);
//		System.out.println(str4);
//		
//		String str5 ="안녕하세요.반갑습니다.";
//		System.out.println(str5.substring(2, 5));
		

	}

}
