package j0509;

import java.util.Scanner;

public class j0509_11 {

	public static void main(String[] args) {
	
		
		//소수점 4자리에서 올림을 하세요 
		double in = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		in = scan.nextDouble();
		double result = Math.ceil(in*1000)/1000.0;
		System.out.println(result);
		
		
		// 소수점 5자리를 입력받아 3자리에서 반올림 
//		double in = 0;
//		Scanner scan= new Scanner(System.in);
//		System.out.println("숫자를 입력하세요");
//		in = scan.nextDouble(); 
//		//반올림 round(), 올림 ceil(), 버림 floor()
//		double result = Math.round(in*100)/100.0;
//		System.out.println(result);
		
		// double p = 3.7894; 소수점 2자리에서 반올림 
//		double p = 3.7894;
//		double re = Math.round(p*10)/10.0;
//		System.out.println(re);
		
		
//		//소수점 4자리에서 반올림 출력
//		//1. 변수선언 2. 출력 
//		double pi =3.141592;
//		double result = Math.round(pi*1000)/1000.0;
//		
//		System.out.println(result);
	}
}
