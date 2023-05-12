package j0512;

import java.util.Scanner;

public class C0512_06 {

	public static void main(String[] args) {
		// 
		Scanner scan = new Scanner(System.in);
		//1차원 배열 
		int [] num = new int [3]; //한 개의 배열, 한 줄이 나오겠지   
		// 3명의 학생의 국,영,수,합계를 만들기 
		
		for(int i = 0;i<num.length;i++) {
			System.out.println("점수를 입력하시오");
			num[i]=scan.nextInt();
		}
//		for(int i = 0;i<num.length;i++) {
	//		System.out.println(num[i]);
		//}
		
		//2차원 배열 
		int[][] score =new int[3][4];
		//입력
		for(int i =0;i<score.length;i++) {
			for(int j =0;j<score[i].length;j++) {
				System.out.println("2차원 점수를 입력");
				score[i][j] =scan.nextInt();
			}
		}
		//출력
		for(int i =0;i<score.length;i++) {
			for(int j =0;j<score[i].length;j++) {
				System.out.print(score[i][j]+"\t");
			}
			System.out.println();
		}

	}//main

}//class
