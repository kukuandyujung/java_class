package j0509;

import java.util.Scanner;

public class j0509_09 {

	public static void main(String[] args) {
	
		//1개의 글자를 입력받아 숫자로 변환하시오. 
		//"12345"라는 문자를 숫자로 변환 
		char ch = ' ';
		System.out.println("문자열을 입력하시오.");
		Scanner scan = new Scanner(System.in);
		char input = scan.next().charAt(3); //charAt() 문자열에서 1개의 문자를 가져온다.
		//int result = input - 0; 이렇게 입력한 경우에는 아스키코드 숫자로 인식된다. 1을 입력하면 49가 나옴 
	     //char 타입의 숫자는 '0'문자 0을 빼야 숫자값으로 변환된다.  
		int result = input - '0'; //자동으로 숫자로 변경된다. 1이 결과로 나온다.  
		String content = (result%2 ==0)?"짝수임":"홀수임"; 
		System.out.println("추출한 숫자: "+ result);
		System.out.println(content);
		
		
}
}
