package j0510;

import java.util.Scanner;

public class C0510_06 {

	public static void main(String[] args) {
		
		//변수선언 num1 num2 op / Scanner 입력 3번 / 비교 (switch) / 결과값 출력하기 
		
	
		
		//1) 변수선언 
		int num1 = 0, num2 = 0, result = 0;
		char op =' ';
		
		//2) 스캐너 입력, 입력한 값을 계산할 수 있도록. 
		System.out.println("문제 : 숫자를 입력해서 연산을 합시다.");
		Scanner scan =new Scanner (System.in);
		System.out.println("첫번째 숫자를 입력해주세요");
		num1 = scan.nextInt(); //nextInt 메서드를 통해 타입 별로 입력을 받는다. 
		System.out.println("두번째 숫자를 입력해주세요");
		num2 = scan.nextInt(); 
		System.out.print("문자를 입력해주세요");
		op = scan.next().charAt(0);
		switch (op) { 
		case '+':
			result = num1 + num2;
			break;
		case '-':
			result = num1 - num2;
			break;
		case '*':
			result = num1 * num2;
			break;
		case '/':
			result = num1 / num2;
			break;}
		System.out.println("결과값 "+ result);
		
		
		
		
//		//1) 변수선언 
//		int num1 = 0, num2 = 0;
//		char op =' ';
//		
//		//2) 스캐너 입력, 입력한 값을 계산할 수 있도록. 
//		System.out.println("문제 : 숫자를 입력해서 연산을 합시다.");
//		Scanner scan =new Scanner (System.in);
//		System.out.println("첫번째 숫자를 입력해주세요");
//		num1 = scan.nextInt(); //nextInt 메서드를 통해 타입 별로 입력을 받는다. 
//		System.out.println("두번째 숫자를 입력해주세요");
//		num2 = scan.nextInt(); 
//		System.out.print("문자를 입력해주세요");
//		op = scan.next().charAt(0);
//		switch (op) { 
//		case '+':
//			System.out.println("num1 + num2= " +(num1 + num2));
//			break;
//		case '-':
//			System.out.println("num1 - num2= "+(num1 - num2));
//			break;
//		case '*':
//			System.out.println("num1 * num2= "+(num1 * num2));
//			break;
//		case '/':
//			System.out.println("num1 / num2= "+(num1 / num2));
//			break;
//		}// 

	
	}
}
