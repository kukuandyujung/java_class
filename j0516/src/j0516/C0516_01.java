package j0516;

import java.util.Scanner;
//메서드 수정 
public class C0516_01 {

	//클래스 변수로 만들기 = 클래스명.변수명: 근데 같은 클래스 내에서는 클래스명 생략이 가능하다 
	//static 을 앞에 붙이고 클래스 변수로 만들기
	//static을 한다면 전체가 변하기 떄문에 평소에는 잘 쓰지 않는다. 
	static String[] title = { "이름", "국어", "수학", "영어", "합계", "평균", "등수" };
	
	public static void main(String[] args) {
        //객체선언을 한다면 
		// C0516_01 c= new C0516_01();
		// 1. 성적입력
		// 2. 성적출력
		// 3. 성적수정
		// 4. 등수처리
		// 5. 학생성적검색
		// 0. 프로그램종료

		// 이름, socre = (국어,영어,수학,합계), 평균 - 10명
		// a.변수선언
		Scanner scan = new Scanner(System.in);
		String[] name = new String[2]; // []명의 사람울 뽑을 예정
		int[][] score = new int[2][4]; // 성적을 한번에 묶을 예정
		double[] avg = new double[2];
		int choice = 0; // 선택한 번호
		int count = 0; // 입력된 학생수
		int[] rank = new int[2]; // 등수
		int chk = 0;// 존재 유무 체크
		String seaName = "";

		// 무한 반복을 위한 while 만들기
		loop: while (true) {
			
			C0516_01.screen();
			choice = scan.nextInt(); // choice에 nextInt 메소드 받기
			
			// b.화면출력
//			System.out.println("[ 성적처리프로그램 ]");
//			System.out.println("1.성적입력");
//			System.out.println("2.성적출력");
//			System.out.println("3.성적수정");
//			System.out.println("4.등수처리");
//			System.out.println("5.학생성적검색");
//			System.out.println("0.프로그램 종료");
//			System.out.println("----------------------");
//			System.out.println("원하는 번호를 입력하세요.");

			switch (choice) {

			case 1:
				for (int i = count; i < name.length; i++) {
					// 이름
					System.out.println((count + 1) + "번째 학생의 이름을 입력하세요.(a. 이전 페이지 이동)>>");
					name[i] = scan.next();

					// 이전 페이지 이동
					if (name[i].equals("a")) {
						System.out.println("이전 페이지로 이동합니다.");
						System.out.println();
						break;
					}
					// score[i][0]국, score[i][1]수, score[i][2]영
					for (int j = 0; j < 3; j++) {
						System.out.println(title[j + 1] + "점수를 입력하세요 ");
						score[i][j] = scan.nextInt();
					}
					// 합계
					score[i][3] = score[i][0] + score[i][1] + score[i][3];
					// 평균
					avg[i] = score[i][3] / 3.0;
					System.out.println((count + 1) + "번째 학생 성적이 등록 되었습니다.");
					System.out.println();

					// 학생 수 1증가
					count++;

				}
				break;
			case 2:// 성적 출력
				System.out.println("[ 학생 성적 ]");
				
				titleScreen();
				
				
				for (int i = 0; i < count; i++) {
					System.out.print(name[i] + "\t");
					for (int j = 0; j < score[i].length; j++) {
						System.out.print(score[i][j] + "\t");
					}
					System.out.printf("%.2f\t", avg[i]); // 평균
					System.out.printf("%d\n", rank[i]); // 등수
					System.out.println();
				}
				break;
			case 3:// 성적 수정
				System.out.println("수정할 학생의 이름을 입력하세요");
				seaName = scan.next();

				for (int i = 0; i < count; i++) {
					if (name[i].equals(seaName)) {
						// 수정할 과목 선택
						System.out.println("[ 수정할 학생을 찾았습니다. ]");
						System.out.println("수정할 과목을 입력하세요");
						System.out.println("1. 국어");
						System.out.println("2. 영어");
						System.out.println("3. 수학");
						System.out.println("---------------------------------");
						System.out.println("수정할 과목 번호를 선택");
						choice = scan.nextInt();

						// 수정할 과목 이전 점수 표시
						// 국어 점수는 score[i][0], 영어 점수는 score[i][1], 수학 점수는 score[i][2]
						System.out.printf("[현재 %s  점수 : %d \n]", title[choice], score[i][choice - 1]);
						System.out.println("----------------------");
						System.out.println("수정할 점수를 입력>>");
						score[i][choice - 1] = scan.nextInt();
						// 합계, 평균 수정
						score[i][3] = score[i][0] + score[i][1] + score[i][2];
						avg[i] = score[i][3] / 3.0;

						System.out.println("점수가 수정되었습니다.");
						System.out.println();
						chk = 1;
					} // if
				} // for
				if (chk == 0) {
					System.out.println("입력한 학생이 없습니다. 다시 입력하시오");
					System.out.println();
				}
				break;
			case 4: // 등수 처리 //score[i][3] : 합계
				for (int i = 0; i < count; i++) {
					int rankcount = 1;
					for (int j = 0; j < count; j++) {
						// 모든 학생 성적 합계를 비교
						if (score[i][3] < score[j][3]) {
							// 자기 점수보다 높으면 등수 1증가
							rankcount++;
						} // if
					} // for j
						// 등수 부분에 등수 입력
					rank[i] = rankcount;
				} // for i
				System.out.println("[등수 처리가 완료되었습니다.]");
				System.out.println();
				break;
				
				
			case 5:// 학생 검색
				System.out.println("[학생 검색]");
				System.out.println("검색할 학생의 이름을 입력");
				seaName = scan.next();
				chk = 0;
				
				titleScreen();
				
				//클래스 메서드를 사용함 
				
				
				
				for (int i = 0; i < count; i++) {
					// 홍 - > 홍길동 홍길자 이순신 길동구 등에서 홍이 하나라도 있으면 그 이름만
					if (name[i].contains(seaName)) {
						// 이름을 찾을 수 있도록
						System.out.print(name[i] + "\t");
						for (int j = 0; j < score[i].length; j++) {
							System.out.print(score[i][j] + "\t");
						}
						System.out.printf("%.2f\t", avg[i]); // 평균
						System.out.printf("%d\n", rank[i]); // 등수
						chk = 1;
					} // if
				} // for
					// 검색할 이름이 있는 경우
				if (chk == 0) {
					System.out.println("[찾고자 하는 학생이 없습니다.]");
				}
				break;
			case 0:
				System.out.println("[프로그램을 종료합니다.]");
				System.out.println();
				break loop;

			}

		} // while

	}// main
	
	//클래스 메서드 

	static void screen() {
		System.out.println("[ 성적처리프로그램 ]");
		System.out.println("1.성적입력");
		System.out.println("2.성적출력");
		System.out.println("3.성적수정");
		System.out.println("4.등수처리");
		System.out.println("5.학생성적검색");
		System.out.println("0.프로그램 종료");
		System.out.println("----------------------");
		System.out.println("원하는 번호를 입력하세요.");
		//클래스 이름 . 메소드 
	}
	static void titleScreen() {
		for (int i = 0; i < title.length; i++) {
			System.out.print(title[i] + "\t");

		}
		System.out.println("");
		System.out.println("-----------------------------------------------------");
	}
}// class

