import java.util.Scanner;

public class Stumain {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		Student[] s = new Student[10];
		int choice = 0; // 선택한 번호
		int count = 0; // 입력된 학생수
		int chk = 0;// 존재 유무 체크
		String seaName = "";

		// C0516_01 c= new C0516_01();
		// 1. 성적입력
		// 2. 성적출력
		// 3. 성적수정
		// 4. 등수처리
		// 5. 학생성적검색
		// 0. 프로그램종료

		while (true) {
			choice = stuScreen();

			

			switch (choice) {
			case 1: //성적 입력 
				//성적 입력 메소드 호출 - 클래스명.메소드명() 이지만 같은 클래스라서 메소드명()만 적기
				count = stuInput(count, s); //입력된 학생 수 //10명이 있는 참조 변수가 간다. 

				break;
			case 2://성적 출력
				//한줄
				break;
			case 3://성적 수정 
				//한줄
				break;
			case 4://등수 처리 
				//한줄
				break;
			case 5://학생 검색  
				//한줄
				break;
			case 0://종료
				//한줄
				break;
				
			}// switch
		} // while

	}// main
	
	
	static void stuScreen() {
		//void라서 return해줄친구가 없다. 
		System.out.println("[ 성적처리프로그램 ]");
		System.out.println("1.성적입력");
		System.out.println("2.성적출력");
		System.out.println("3.성적수정");
		System.out.println("4.등수처리");
		System.out.println("5.학생성적검색");
		System.out.println("0.프로그램 종료");
		System.out.println("----------------------");
		System.out.println("원하는 번호를 입력하세요.");
		int choice = scan.nextInt();
		return choice;
	}//
	//1. 성적 입력 메소드
	static int stuInput(int count, Student[] s) { //위 count, s와 전혀 다른 아이. 
		for (int i = count; i < s.length; i++) {
			//객체선언 
			s[i] = new Student();
			System.out.println((i + 1) + "번째 학생 이름을 입력하세요(0. 이전 페이지로 이동)");
			s[i].name = scan.next();
			if (s[i].name.equals("0")) {
				System.out.println("이전 페이지로 이동");
				System.out.println();
				break;
			}
			System.out.println("국어점수를 입력하세요");
			s[i].kor = scan.nextInt();
			System.out.println("영어점수를 입력하세요");
			s[i].eng = scan.nextInt();
			System.out.println("수학점수를 입력하세요");
			s[i].math = scan.nextInt();
			s[i].sum(); // 합계
			s[i].average(); // 평균

			System.out.println((count + 1) + "번쨰 학생 성적이 등록 완료되었습니다.");
			System.out.println();
			count++;

	}//성적 입력 메소드
		return count;
}
}//class