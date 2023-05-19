package j0519;

import java.util.Scanner;

public class C0519_02 {

	public static void main(String[] args) {
		// 학생 성적 입력하기
		// 스캐너
		Scanner scan = new Scanner(System.in);
		// 변수 설정
		int count = 0;
		int choice = 0;
		int chk = 0; 
		String SearchName = "";

		Student[] s = new Student[2];

		// while문안에 switch 들어가고 그 안에 case 를 넣어야 함
		// case 1: 성적 입력 for(int i =count ; i <name.length ; i++)
		// 무한 루프
		while (true) {
			System.out.println("=======성적 입력 프로그램=========");
			System.out.println("1. 성적 입력");
			System.out.println("2. 성적 출력");
			System.out.println("3. 성적 수정");
			System.out.println("4. 성적 ");
			System.out.println("5. 성적 검색");
			System.out.println("0. 프로그램 종료하기");
			System.out.println("=================================");
			System.out.println("원하는 번호를 입력하세요");
			choice = scan.nextInt();

			switch (choice) {
			case 1:
				for (int i = count; i < s.length; i++) {
					s[i] = new Student();
					System.out.println((i + 1) + "번째 학생의 이름을 입력하세요 (0번을 입력하면 프로그램이 종료됩니다.)");
					s[i].name = scan.next();
					if (s[i].name.equals("0")) {
						System.out.println("0번을 입력했습니다. 프로그램을 종료합니다.");
						System.out.println();
						break;
					}
					System.out.println("국어 점수를 입력하세요");
					s[i].kor = scan.nextInt();
					System.out.println("영어 점수를 입력하세요");
					s[i].eng = scan.nextInt();
					System.out.println("수학 점수를 입력하세요");
					s[i].math = scan.nextInt();

					s[i].sum(); // 따로 total을 만들어주지 않아도 sum에 total이 들어간다.
					s[i].average(); // 평균 처리

					count++;
				}
				break;
			// 성적 출력
			case 2:
				System.out.println("[학생성적]");
				String[] title = Student.title; // 선언 된 것을 다시 변수로 받기 : 변수에다가 복사했다고 생각하면 된다.
				// 위에 변수 선언을 새로 안 하고 싶다면 그냥 클래스 변수 사용 방법인 : 클래스명.변수명을 사용하면 된다.

				// 상단 title을 출력해주는 인덱스 for문이다.
				for (int i = 0; i < title.length; i++) {
					System.out.print(Student.title[i] + "\t");
				}
				System.out.println();
				System.out.println("------------------------------------------------------");
				// 입력된 성적을 출력하는 for문이다.
				for (int i = 0; i < count; i++) {
					System.out.print(s[i].name + "\t");
					System.out.print(s[i].kor + "\t");
					System.out.print(s[i].eng + "\t");
					System.out.print(s[i].math + "\t");
					System.out.print(s[i].total + "\t");
					System.out.printf("%.2f\t", s[i].avg);
					System.out.print(s[i].rank + "\n");

				}
				System.out.println();
				break;

			// 성적 수정하기

			case 3:
				chk = 0;
				System.out.println("[ 학생 성적 수정하기 ]");
				System.out.println("수정하고 싶은 학생의 이름을 입력하세요(0번을 선택하면 이전 페이지로 이동합니다.)");
				SearchName = scan.next();

				// 0번을 선택했을 경우
				if (SearchName.equals("0")) {
					System.out.println("이전 페이지로 이동합니다.");
					break;
				}
				for (int i = 0; i < count; i++) {
					// 입력된 학생 수만큼 반복하기
					if (s[i].name.equals(SearchName)) {
						System.out.printf("[ %s 해당 이름의 학생이 존재합니다. ] \n", SearchName);
						System.out.println("1. 국어 성적");
						System.out.println("2. 영어 성적");
						System.out.println("3. 수학 성적");
						System.out.println("수정할 과목을 선택하세요");
						choice = scan.nextInt();
						
						switch (choice) {
						case 1:// 국어
							System.out.println("국어 성적을 수정하겠습니다.");
							System.out.printf("%s 의 현재 국어 성적 : %d \n", s[i].name, s[i].kor);
							System.out.println("수정할 점수를 입력하세요");
							s[i].kor = scan.nextInt();
							s[i].sum();
							s[i].average();
							System.out.println("[ 국어 점수 수정 완료 ]");
							System.out.println();
							break;

						case 2:// 영어
							System.out.println("영어 성적을 수정하겠습니다.");
							System.out.printf("%s 의 현재 국어 성적 : %d \n", s[i].name, s[i].eng);
							System.out.println("수정할 점수를 입력하세요");
							s[i].eng = scan.nextInt();
							s[i].sum();
							s[i].average();
							System.out.println("[ 영어 점수 수정 완료 ]");
							System.out.println();
							break;

						case 3:// 수학
							System.out.println("수학 성적을 수정하겠습니다.");
							System.out.printf("%s 의 현재 국어 성적 : %d \n", s[i].name, s[i].math);
							System.out.println("수정할 점수를 입력하세요");
							s[i].kor = scan.nextInt();
							s[i].sum();
							s[i].average();
							System.out.println("[ 수학 점수 수정 완료 ]");
							System.out.println();
							break;

						}// switch
						chk = 1;
						if (chk == 0) {
							System.out.printf("[ %s 해당 이름의 학생이 존재하지 않습니다. ] \n", SearchName);
							System.out.println();
						} // if	
					}//if
				}//for
				break;
			case 4:
				break;
			case 0:
				System.out.println("[=========프로그램을 종료합니다=============]");
				System.out.println();
				break;
			}// switch
		} // while

	}// main

}// class
