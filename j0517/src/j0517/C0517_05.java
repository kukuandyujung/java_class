package j0517;

import java.util.Scanner;

public class C0517_05 {

	public static void main(String[] args) {
		// 3개의 수를 입력받아, 평균 60점이 넘으면 합격 아니면 불합격  출력하세요 
		// average() //return int
	
		//스캔
		Scanner scan = new Scanner(System.in);
		
		//객체 선언 : 참조변수명.변수명 , 다른 메소드 호출 방법 : 참조변수명.메소드명()
		C0517_05  c= new C0517_05();
		
		int average =0;
		int num1=0,num2=0,num3=0; 
		
				
		
		//변수 만들기 
		int[] num = new int[3];
		
		//입력하기 
		for(int i = 0 ;i<num.length;i++ ) {
			System.out.println((i+1)+"번째 번호를 입력하세요");
			num[i]= scan.nextInt();
		}//for 
		
		
		
		//평균 for문 안에 두는 것이 아니라 밖에 두어야 속도가 더 빠르다. 
		double result = c.average(num[0] , num[1], num[2] ); 
		System.out.println("3가지 수의 평균 "+result);

	}//main

	
	
	//평균
	double average(double a, double b,double c) {
		double result = (a+b+c) / 3;
		return result;
	}
}//class
