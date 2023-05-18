package j0518;

import java.util.Scanner;

public class C0518_01 {

	public static void main(String[] args) {
		// 5! = 5*4*3*2*1 ;
		// 10! = 10*9*8*7*6*5*4*3*2*1 
		// for문 사용
		// 숫자를 입력 받아 해당되는 팩토리얼 구현
		Scanner scan = new Scanner(System.in);
		int num =1;
		int input = 0;
		System.out.println("원하는 숫자를 입력하세요");
		input = scan.nextInt();
		for(int i = input ;i>0;i-- ) {
			num = num * i;
			System.out.println("num: " + num);
		}
		System.out.println("result: " +num);

	}

}
