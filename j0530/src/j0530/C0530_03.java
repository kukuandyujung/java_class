package j0530;

import java.util.Scanner;

public class C0530_03 {

	public static void main(String[] args) {
		// 소문자를 대문자로 출력하시오 a= 97 , A = 65, 0=48   
		Scanner scan = new Scanner(System.in);
		
		String str = "ABCDEF";
		System.out.println(str.toLowerCase());
		
		String str2 ="abcdef";
		System.out.println(str2.toUpperCase());
		
		
		
//		System.out.println("영문 소문자를 입력하세요");
//		char input = scan.next().charAt(0);
//		System.out.println("입력한 문자는 : " + input);
//		char output = (char) (input-32); //input은 문자 , 32는 숫자이기 때문에 더 높은 int가 인정된다. 
//		System.out.println("대문자 : " + output);
		
		
		//
//		System.out.println("알파벳을 입력하세요");
//		char input = scan.next().charAt(0);
//		//char output = (char) (input-32);
//		if((input >='a') && (input <= 'z')) {
//			System.out.println("대문자 : " + (char)(input -32));
//		}else if(input >='A' && input <='Z'){
//			System.out.println("소문자 : " + (char)(input +32));
//		}
		
		System.out.println("알파벳을 입력하세요");
		String input = scan.next();
		String output = "";
		char temp = ' ';
		//char output = (char) (input-32);
		for(int i = 0 ; i < input.length() ; i++) {
			temp = input.charAt(i);
			if(( temp>='a') && (temp <= 'z')) {
				output =output + (char)(temp -32);
				
			}else if(temp >='A' && temp <='Z'){
				output =output + (char)(temp +32);
			}
		
			}//for
	
		System.out.println("입력 문자 " + input);
		System.out.println("출력 문자 " + output);

		
		
		}
		
	
		
		
	}


