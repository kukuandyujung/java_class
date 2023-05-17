package j0517;

import java.util.Scanner;

public class C0517_02 {

	public static void main(String[] args) {
		C0517_02 c= new C0517_02();
		int num1 =10;
		int num2 =5;
		
		
		Scanner scan = new Scanner(System.in);
		//객체선언 
		//클래스 명 참조변수 명  = new 클래스명();
		//두 수를 입력받아 더하기 결과값을 출력하시오 
//		System.out.println("num1  숫자를 입력하시오");
//		num1 = scan.nextInt();
//		System.out.println("num2 숫자를 입력하시오");
//		num2 = scan.nextInt();
		
		int[] num =new int[2];
		for(int i = 0 ; i <num.length; i++ ) {
			System.out.println((i+1)+"번째 숫자 입력");
			num[i]= scan.nextInt();
	}
		int result1 = c.add(num[0] , num[1] ); //메소드 내에 있는 변수 = 지역변수 
		int result2 = c.sub(num[0] , num[1] ); 
		int result3 = c.multi(num[0] , num[1] ); 
		double result4 = c.div(num[0] , num[1] ); 
		System.out.println("두 수의 더하기 :"+ result1);
		System.out.println("두 수의 빼기 :"+ result2);
		System.out.println("두 수의 곱하기 :"+ result3);
		System.out.println("두 수의 나누기 :"+ result4);
		
	}
		
		
		
		
		

	// 더하기 메소드
	int add(int num1, int num2) {
		int result1 = num1 + num2;
		return result1;
	}

	// 빼기 메소드
	int sub(int num1, int num2) {
		int result2 = num1-num2 ;
		return  result2;}
		
    //곱하기  메소드 
	int multi(int num1, int num2) {
		int result3 = num1 * num2;
		return result3;}
		
		//나누기  메소드 
	double div(int num1, int num2) {
		int result4 = num1 / num2;
		return result4;}


}