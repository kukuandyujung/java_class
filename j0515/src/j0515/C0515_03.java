package j0515;

import java.util.Scanner;

public class C0515_03 {

	public static void main(String[] args) {
		// 10개 중 2개의 보물을 찾기 프로그램을 구성하시오.
		// 꽝 - 0, 1억보물 - 1 , 10억은- 2

		// scan
		Scanner scan = new Scanner(System.in);

		// 0.배열 생성
		// box배열 10개
		int[] box = { 1, 0, 2, 0, 0, 0, 2, 0, 1, 1 }; // 번호를 맞추기 위한 배열 
		// arr배열 10개
		String[] arr = { "?", "?", "?", "?", "?", "?", "?", "?", "?", "?" }; // 출력을 위한 배열

		// 1. 변수 생성.(섞기에 필요한 temp, random)
		int temp = 0;
		int random = 0;
		int input = 0; // scan 입력으로 input

//		// 7보다 작으면 박스에는 0을, 그렇지 않으면 박스에 1을 넣기
//		for (int i = 0; i < 10; i++) {
//			if (i < 7) {
//				box[i] = 0;
//			} else {
//				box[i] = 1;
//			}
//		}

		// 번호 섞기 (랜덤을 활용해서 10번 랜덤으로 섞기)
		for (int i = 0; i < 100; i++) {
			random = (int) (Math.random() * 10);
			temp = box[0];
			box[0] = box[random];
			box[random] = temp;
		}

		// while -무한반복
		while (true) {

			// 화면에 출력하기
			System.out.println("[보물찾기 프로그램!!!!]");

			// 번호 출력
			for (int i = 0; i < 10; i++) {
				System.out.print(i + "\t");
			}
			System.out.println();
			// 밑줄
			System.out.println("-------------------------------------------------------------------------------");

			// 정답 화면 출력
			for (int i = 0; i < 10; i++) {
				System.out.print(arr[i] + "\t");
			}
			System.out.println();

			// 번호 출력
			System.out.println();
			System.out.println("번호를 입력하세요"); // 입력하는 번호에 따라 input에 받도록 하기
			input = scan.nextInt(); // 번호를 받음

			// box 안에 입력된 번호가 보물인지 아닌지 비교하기
			if (box[input] == 0) {
				arr[input] = "꽝이래여 ~,~";

			} else if (box[input] == 1) {
				arr[input] = "1억 보물 당첨~!";
			} else {
				arr[input] = "10억 보물 당첨~!";
			}

		} // while
	}// main

}// class
