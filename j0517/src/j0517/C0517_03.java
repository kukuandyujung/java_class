package j0517;

import java.util.Scanner;

public class C0517_03 {

	public static void main(String[] args) {
		// 3개의 숫자를 입력 받아서 
		//객체선언
		C0517_03  c= new C0517_03();
		Scanner scan = new Scanner(System.in);
		//변수 만들기 
		int[] num = new int[3];
		for(int i = 0 ;i<num.length;i++ ) {
			System.out.println((i+1)+"번째 번호를 입력하세요");
			num[i]= scan.nextInt();
		}

		//메소드 호출
		int result = c.add(num[0],num[1],num[2]); 
		System.out.println("3가지 수 더하기"+ result);
	}

	
	// add메소드 만들기
	int add(int num1, int num2, int num3) {
			int result = num1 + num2+ num3;
			return result;
			}
	
	int max(int a, int b) {
		int max; 
		if(a>b) {
			max = a;
		}else {
			max = b;
		}
		return max;
	}
	
}
