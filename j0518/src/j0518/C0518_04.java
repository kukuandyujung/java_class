package j0518;

import java.util.Scanner;

public class C0518_04 {

	public static void main(String[] args) {
		// 문자를 입력받아 해당 소문자로 변환하기
		Scanner scan = new Scanner (System.in);
		
		//A -65 , a-97 
		System.out.println("대문자를 입력하면 소문자로 변확하세여");
		char ch = scan.next().charAt(0);
		
		//대문자인지 소문자인지를 비교 
		if(ch<=96) {
			ch =(char)(ch+ 32);
		}else {
			ch =(char)(ch- 32);
		}
		System.out.println(ch);

	}

}
