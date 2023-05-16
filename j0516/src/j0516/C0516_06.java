package j0516;

import java.util.Scanner;

public class C0516_06 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] title = { "이름", "국어", "수학", "영어", "합계", "평균", "등수" };
		int choice = 0; // 선택한 번호
		int count = 0; // 입력된 학생수
		int chk = 0;// 존재 유무 체크
		String seaName = "";

		
		
		
		Student[] s = new Student[10];  //Student 참조 변수가 10까지가 생성
	
		
		while(true){
			//화면을 출력하기 
			System.out.println("[ 성적 처리 프로그램 ]");
			System.out.println("1. 성적 입력");
			System.out.println("2. 성적 출력");
			System.out.println("3. 성적 수정");
			System.out.println("0. 프로그램 종료하기");
		    System.out.println("---------------------");
		    System.out.println("원하는 번호를 입력하세요");
		    choice = scan.nextInt();
		    
		    switch(choice) {
			case 1:
				for(int i = count ; i <s.length;i++) {
					s[i] = new Student(); //객체를 선언 
					//이름 
					System.out.println((count+1)+"번째 학생의 이름을 입력하세요.(0. 이전 페이지 이동)>>");
					s[i].name =scan.next();
					
					//이전 페이지 이동 
					if(s[i].name.equals("0")) {
						System.out.println("이전 페이지로 이동합니다.");
						System.out.println();
						break;
					}
					
					//국어 영어 수학
					System.out.println("국어 점수를 입력하세요");
					s[i].kor =scan.nextInt();
					System.out.println("영어 점수를 입력하세요");
					s[i].eng =scan.nextInt();
					System.out.println("수학 점수를 입력하세요");
					s[i].math =scan.nextInt();
					

					//합계
					s[i].sum();
					
					//평균
					s[i].avg();
					System.out.println((count + 1)+ "번째 학생 성적이 등록 되었습니다.");
					System.out.println();
					
					//학생 수 1증가
					count++;
				}
		    	break;
		  
				}
				
		    }
		}

	}


