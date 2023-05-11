package j0510;

import java.util.Scanner;

public class C0510_02 {

	public static void main(String[] args) {

		
		//점수를 입력하세요 60점 이상이면 합격 아니면 불합격 
		int n = 0;
		Scanner scan =new Scanner (System.in);
		
		System.out.println("점수를 입력하세요");
		n = scan.nextInt();
		if(n>= 60) {
			System.out.println("합격");
		}
		else {
		  System.out.println("불합격");
		}
		
		
//		// 입력한 정수가 2의 배수이면 2의 배수 아니면 2의 배수 아님. 
//		
//		//1. 변수선언 
//		int num = 0;
//		
//		//2. scan 후 변수 입력 받음 
//		Scanner scan = new Scanner (System.in);
//		System.out.println("정수인 숫자를 입력하시오");
//		
//		//3. 비교와 출력
//		num = scan.nextInt();
//		if(num % 2 == 0) {
//			System.out.println("2의 배수입니다.");
//		}
//		else{
//			System.out.println("2의 배수가 아닙니다.");
//		}
	
		
		//1) if 문만 
//
//		int num = 0;
//		if(num == 0) {
//			System.out.println("0입니다.");
//		}
//		
		
		//2) if, else 
//		int num = 8;
//		//(num>1)?"크다":"작다"; //삼항식 
//		if(num == 8) {
//			System.out.println("8임");
//		}
//		else {
//			System.out.println("8아님");
//		}
//		
		
		
		
		
		//3) if , else if , else  
//		int num = 0;
//		if(num >0) {
//			System.out.println("양수");
//		}
//		else if(num ==0) {
//			System.out.println("0입니다.");
//		}
//		else {
//			System.out.println("음수");
//		}
		
		
		

	}

}
