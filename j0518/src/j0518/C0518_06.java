package j0518;

import java.util.Scanner;

public class C0518_06 {

	public static void main(String[] args) {
		// 국어점수 영어점수 수학점수를 입력 받아 평균이 90점 이상이면 A , 80점은 B , 70점은 c
		Scanner scan = new Scanner(System.in);

		System.out.println("국어점수를 입력하세요");
		int kor = scan.nextInt();
		System.out.println("영어점수를 입력하세요");
		int eng = scan.nextInt();
		System.out.println("수학점수를 입력하세요");
		int math = scan.nextInt();
		int total = kor + eng + math;
		double avg = total / 3.0;

		if (avg >= 90) {
			if (avg >= 97) {
				System.out.println("A+");
			} else if (avg >= 93) {
				System.out.println("A");
			} else {
				System.out.println("A-");
			}
		}
		else if (avg >= 80) {
			if (avg >= 87) {
				System.out.println("B+");
			} else if (avg >= 83) {
				System.out.println("B");
			} else {
				System.out.println("B-");
		}		
		}
		else if (avg >= 70) {
			if (avg >= 77) {
				System.out.println("C+");
			} else if (avg >= 73) {
				System.out.println("C");
			} else {
				System.out.println("C-");
		}		
		}
		else if (avg >= 60) {
			if (avg >= 67) {
				System.out.println("D+");
			} else if (avg >= 63) {
				System.out.println("D");
			} else {
				System.out.println("D-");
		}		
		}
		else {
			System.out.println("F 재수강입니다.");
		}
	}//main

}//clasa
