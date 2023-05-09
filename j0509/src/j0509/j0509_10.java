package j0509;

import java.util.Scanner;

public class j0509_10 {

	public static void main(String[] args) {
	
//		//564.1234586 소수점3자리 절사 2자리까지 존재
//		double a = 564.1234586;
//		double result = (int)(a*100)/100.0;
//		System.out.println(result);
//		
		//실수를 입력 받아 소수점 4자리까지 
		//변수선언, 입력, 출력 
		//1. 변수선언 
		double i= 0;
		//2. 입력 
		Scanner scan = new Scanner(System.in);
		System.out.println("실수를 입력하시오");
		i = scan.nextDouble();
		double result1 = (int)(i*10000)/10000.0;
		//3. 출력 
		System.out.println(result1);
		
		
//		double pi = 3.141592;
//		//double result = (int)(pi*1000)/1000; // int와 int를 계산해서 int 결과가 나온다. 3.0 
//		double result = (int)(pi*1000)/1000.0; // 1000.0 으로 해준다면 double 형태가 된다. 3.141 
//		System.out.println(result);
}
}
