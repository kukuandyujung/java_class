package j0512;

import java.util.Scanner;

public class C0512_08 {

		// 국어 영어 수학을 입력하면  합계는 자동으로 
		
		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			String[] title = {"국어", "영어", "수학","합계"}; 
			
			int[][] score = new int[5][4]; // 국어 영어 수학 합계 5명의 성적
			for (int i = 0; i < score.length; i++) {
				System.out.println((i+1)+ "번째 학생: ");
				for (int j = 0; j < score[i].length-1; j++) { //score[i].length-1 = j<3
					System.out.println(title[j]+"점수를 입력");
					score[i][j] = scan.nextInt();
					}
				//j값은 존재하지 않음 
				score[i][3] =score[i][0]+score[i][1]+score[i][2]; 
				//방을 추가하는 것이다. i번째 친구에게 방 추가 
			}
			// 출력
			//System.out.println("국어\t영어\t수학\");
			for(int i = 0; i < title.length; i++) {
				System.out.printf("%s\t", title[i]);
			}
			System.out.println();
			System.out.println("---------------------------");
			for (int i = 0; i < score.length; i++) {
				for (int j = 0; j < score[i].length; j++) {
					System.out.print(score[i][j]+"\t");
				}
				System.out.println();
				}
			}
}
