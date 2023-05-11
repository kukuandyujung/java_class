package j0510;

import java.util.Scanner;

public class C0510_03 {

	public static void main(String[] args) {
		
		
		
		
		//1) 변수를 선언 
		String input = ""; //String의 경우 기본형 타입이 아니라 객체이다. 기본형 타입만 ==로 가능하다.
		Scanner scan = new Scanner(System.in);
		
		//2) 입력 
		System.out.println("성별을 나타내는 알파벳을 입력하세요");
		input = scan.next(); //문자열을 입력받음 
		
		//3) 비교 및 출력  
		if(input.equals("m") || input.equals("M")) {
			System.out.println("남자입니다.");
		}
		else if(input.equals("f") || input.equals("F")) {
			System.out.println("여자입니다.");
		}
		else {
			System.out.println("잘못입력하셨습니다. M||m , F||f를 입력하시오.");
		}
		
		
		
		
//		//m||M또는 f||F문자를 받아 m이면 남자 f면 여자로 출력 
//		char c= ' ';
//		Scanner scan = new Scanner (System.in);
//		System.out.println("성별을 알파벳으로 입력하세요 ");
//		c= scan.next().charAt(0);
//		if (c=='m'||c== 'M') {
//			System.out.println("남자입니다.");
//		}
//		else if(c=='f'|| c=='F'){
//			System.out.println("여자입니다.");
//		}
//		
		
//		//입력한 숫자가 1, 6, 9만 입력받아 
//		// if, else if, else 
//		int n = 0;
//		Scanner scan=new Scanner(System.in);
//		
//		System.out.println("숫자를 1,6,9 중에 입력하세요 ");
//		n= scan.nextInt();
//		
//		if(n ==1) {
//		  System.out.println("1");
//			
//		}
//		else if(n== 6) {
//		  System.out.println("6");
//		}
//		else{
//		  System.out.println("9");
//		}
		
		
		
//		//점수를 입력하세요 60점 이상이면 합격 아니면 불합격 
//		int n = 0;
//		Scanner scan =new Scanner (System.in);
//				
//		System.out.println("점수를 입력하세요");
//		n = scan.nextInt();
//		if(n>= 60) {
//			System.out.println("합격");
//		}
//		else {
//			System.out.println("불합격");
//		}
//		
//		

		
		
	}//main

}//class
