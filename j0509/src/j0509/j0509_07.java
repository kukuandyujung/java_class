package j0509;

import java.util.Scanner;

public class j0509_07 {

	public static void main(String[] args) {
	
		
		//대문자 입력시 소문자로 출력하시오 
		// 변수선언 입력 출력 
//		char ch= ' ';
//		Scanner scan = new Scanner(System.in);
//	    System.out.println("대문자를 입력하시오");
//	    ch = scan.next().charAt(0);   //charAt(0) = 문자열에 첫번째 문자를 가져온다. 
//	    char ch2 = (char)(ch + 32);
//	    System.out.println("입력된 대문자 :" + ch);
//	    System.out.println("입력된 소문자 :"+ch2);
		
	    
	    //소문자 입력시 대문자로 출력 
	    char ch3= ' ';
		Scanner scan1 = new Scanner(System.in); //스캐너는 위에서 선언했으면 안 해도 된다. 
	    System.out.println("소문자를 입력하시오");
	    ch3 = scan1.next().charAt(0);   //charAt(0) = 문자열에 첫번째 문자를 가져온다. 
	    char ch4 = (char)(ch3 - 32);
	    System.out.println("입력된 대문자 :" + ch4);
	    System.out.println("입력된 소문자 :"+ch3);
		
	    
	    
	    
//		char ch = 'A';
//		int num = ch +1;
//		System.out.println((char)num);
		
		
		
//		// 이항연산자 
//		int num = 10;
//		double num2 =10;
//		//num = int(num + num2);
//		//num = num + (int)num2;
//		double num3 = num1+num2;
//		System.out.println();
		
		//숫자를 입력받아 짝수인지 홀수인지 출력하시오 .
		//변수선언
		//int i = 0;
		//입력
		//Scanner scan = new Scanner(System.in);
		//System.out.printf("숫자를 입력하시오." );
		//i = scan.nextInt();
		//String a= (i%2 ==0)?"짝수입니다.":"홀수입니다.";
		//System.out.println(a);
		
		
		
		
}
}
