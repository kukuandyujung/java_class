package j0516;

import java.util.Scanner;

public class C0516_scorepr {

	public static void main(String[] args) {
		//================성적 입력과 출력을 하는 프로그램 만들기====================
		//1번을 입력하면 성적 입력
		//2번을 입력하면 성적 출력
		//3번을 입력하면 성적 수정
		//4번을 입력하면 등수 처리
		//5번을 입력하면 학생 성적 검색
		//0번을 입력하면 프로그램 종료
		//이름, 국어, 영어, 수학, 합계, 평균 - 10명
		
		//1) 스캐너
		Scanner scan = new Scanner(System.in);
		
		//2) 반복문을 위한 변수 입력
		int input = 0; //스위치에서 사용할 변수. 원하는 번호를 입력받는 변수이다.
		int count = 0; //1번을 누르고 입력된 학생 수를 세는 것.
		String modifyName = ""; //수정할 학생의 이름
		
		//3) 성적 변수 입력
		String[] title = {"이름", "국어", "영어", "수학", "합계", "평균"};
		String[] name = new String[2];
		int[][] score = new int [2][4];//국어, 수학, 영어 합계를 묶어줌
//		int[] kor = new int[5];
//		int[] eng = new int[5];
//		int[] math = new int[5];
//		int[] total = new int[5];
		double[] avg = new double[5];
		
		//4) while문을 통해 성적 프로그램 만들기, 무한 루프를 활용하기
		while(true){
			System.out.println("[성적 처리 프로그램]");
			System.out.println("1번을 입력하면 성적 입력");
			System.out.println("2번을 입력하면 성적 출력");
			System.out.println("3번을 입력하면 성적 수정");
			System.out.println("4번을 입력하면 등수 처리");
			System.out.println("5번을 입력하면 학생 성적 검색");
			System.out.println("0번을 입력하면 프로그램 종료");
			System.out.println("-------------------------");
			System.out.println("원하는 번호를 입력하세요"); //입력을 받고
			input = scan.nextInt(); //input에 nextInt메서드로 받기  
			if (input==0) {
				System.out.println("[ 프로그램을 종료합니다. ]");
			    break;
			}//프로그램 종료 if문
			
			//5) while문 안에서 입력 받은 숫자에 대해 switch로 프로그램 돌리기
			switch(input){
			case 1: //input에서 1 입력받은 경우 성적 입력 프로그램이 나오도록
				for(int i = count; i<name.length; i++) { // i =count인 이유는 0을 입력하는 경우 때문에, i<name.length는 for문이 학생 수만큼 돌도록.
					System.out.println((count+1) + "번째 학생 이름을 입력하세요(a 입력하면 프로그램이 종료됩니다.)");
					name[i] = scan.next(); // i번 만큼 이름 입력 받기.
					
					if (name[i].equals("a")) { //String은 ==으로 받을 수 없다, equals로 받아야 한다.
					System.out.println("이전 페이지로 이동합니다.");
					System.out.println(); //한 줄 띄우기
					break;//for 벗어나기
					}//이전 페이지로 이동 if
					
					//국어 영어 수학 합계를 socre라는 방에 넣기
					for(int j = 0 ; j < 3; j++) {
						System.out.println(title[j+1] + "점수를 입력하세요.");//이름이 0번 방이니깐
						score[i][j] = scan.nextInt();
						score[i][3] = score[i][3]+score[i][j]; //total만들기
					}//합계 만드는 for문 
//					System.out.println(name[i] + " 학생의 국어 점수를 입력하세요.");
//					kor[i] = scan.nextInt();
//					System.out.println(name[i] + " 학생의 영어 점수를 입력하세요.");
//					eng[i] = scan.nextInt();
//					System.out.println(name[i] + " 학생의 수학 점수를 입력하세요.");
//					math[i] = scan.nextInt();
					
					
					//자동 계산
					
					//total[i] = kor[i] + eng[i] + math[i];
					avg[i] = score[i][3]/3.0;
					count++; //0번을 누른 경우가 있기 때문에 count만큼 반복하기
				}//입력을 위한 for문 끝  
				
				break; // switch에서 벗어나서 다시 while시작에 가도록 하기
				
			case 2: //input에서 2 입력받은 경우 성적 출력 프로그램이 나오도록
				
				System.out.println("이름 \t 국어 \t 영어 \t 수학 \t 합계 \t 평균");	
				System.out.println("-----------------------------------------------");
				for(int i = 0;i<count;i++){				
				//System.out.printf("%s \t %d \t %d \t %d \t %d \t %.2f \n", name[i], kor[i], eng[i], math[i], total[i], avg[i]);
				
				}//for
				break; // switch에서 벗어나 다시 while시작에 가도록 하기
				
			}//switch
		}//while
		
	}// main
}// class
