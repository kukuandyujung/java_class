package j0518;

import java.util.Scanner;

public class C0518_05 {

	public static void main(String[] args) {
		// 숫자를 입력받아 양수인지 음수인지 확인하세요. 0 은 양수로 인정 
		
		
		Scanner scan = new Scanner(System.in);
//		System.out.println("숫자를 입력");
//		int n = scan.nextInt();
//		
//		if(n>0) {
//			System.out.println("양수입니다.");
//			
//		}else if(n == 0) {
//			System.out.println("0입니다.");
//		}
//		else {System.out.println("음수입니다.");
//		
//	}
		
		
		//국어 영어 수학 입려받아 평균 60넘으면 합격 그렇지 않으면 불합격 
		
		System.out.println("국어점수를 입력하세요");
		int kor = scan.nextInt();
		System.out.println("영어점수를 입력하세요");
		int  eng = scan.nextInt();
		System.out.println("수학점수를 입력하세요");
		int math = scan.nextInt();
		int total = kor +eng + math;
		double avg = total / 3.0;
		if(avg>60) {
			System.out.println("합격입니다.");
		}else {
			System.out.println("불합입니다.");
		}

}
}