package j0512;

import java.util.Scanner;

public class C0512_07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] title = {"국어", "영어", "수학"}; 
		
		int[][] score = new int[5][3]; // 국어 영어 수학 5명의 성적
		for (int i = 0; i < score.length; i++) {
			System.out.println((i+1)+ "번째 학생: ");
			for (int j = 0; j < score[i].length; j++) {
				System.out.println(title[j]+"점수를 입력");
				score[i][j] = scan.nextInt();
			}
		}
		// 출력
		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score[i].length; j++) {
				System.out.print(score[i][j] + "\t");
			}
			System.out.println();
		}

	}// main

}// class
