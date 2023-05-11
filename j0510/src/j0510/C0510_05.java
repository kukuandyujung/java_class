package j0510;

import java.util.Scanner;

public class C0510_05 {

	public static void main(String[] args) {
	
		
		
		
		
		
		//90점 이상이면 A, 그렇지 않으면 B 
		//97점 이상 A+, 93점 이하 A-, 87점 이상 B+ 83점 이하 B- 
		int n = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("점수를 입력하세요");
		n= scan.nextInt();
		if (n >=90) { //909192..
			System.out.print("A");
			if(n>=97) {
				System.out.print("+");		
			}
			else if(n<=93) {
				System.out.print("-");
			}
		}
		else if(n>=80){ //80818283..89
			System.out.print("B");
			if(n>=87) {
				System.out.print("+");
			}
			else if (n<=83) {
				System.out.print("-");
			}
		}
		else if(n>=70 ){
			System.out.print("C");
			if(n>=77) {
				System.out.print("+");
			}
			else if(n<=73) {
				System.out.print("-");
			}
		}
		else if(n>=60 ){
			System.out.print("D");
			if(n>=67) {
				System.out.print("+");
			}
			else if(n<=63) {
				System.out.print("-");
			}
		}
		else {
			System.out.println("F");
			
		}
		
//		String input ="";
//		char ch = ' ';
//		Scanner scan = new Scanner(System.in);
//		System.out.println("문자열 입력");
//		//input = scan.next(); // 문자열 
//		ch =input.charAt(0); //문자열의 첫번째 문자 
//		if(ch=='c') {     //기본형 boolean char byte shirt int long float double
//			System.out.println("c 입니다.");
//		}
//		else {
//			System.out.println("c 아님");
//		}//
//		
//		String str = "";
//		Scanner scan = new Scanner(System.in);
//		System.out.println("문자열 입력");
//		str = scan.next();
//		if(str.equalsIgnoreCase("c")) {     //기본형 boolean char byte shirt int long float double
//			System.out.println("c 입니다.");
//		}
//		else {
//			System.out.println("c 아님");
//		}//
//		
		
//		String str = "";
//		Scanner scan = new Scanner(System.in);
//		System.out.println("문자열 입력");
//		str = scan.next();
//		if(str.equals("c")) {     //기본형 boolean char byte shirt int long float double
//			System.out.println("c 입니다.");
//		}
//		else {
//			System.out.println("c 아님");
//		}//

	}

}
