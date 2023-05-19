package j0519;

import java.util.Scanner;

public class C0519_test {

	public static void main(String[] args) { // static에는 인스턴스 변수가 들어올 수 없다.
		//스캔 선언 
		Scanner scan = new Scanner(System.in);
		
		//변수 선언 
		int choice = 0; // 번호를 선택하는 변수 
		int[] rank = new int[2]; // 성적 등수 변수  
		int count =0; // 수를 세어주는 변수 
		int chk = 0; //체크하믐 변수 
		
		//배열 선언 
		String[] title = {"이름","국어","영어","수학","합계","평균"};
		String[] name = new String[2]; //이름 선언하기 
		int[][] score = new int[2][4]; //국어 영어 수학 합계까지 
		double[] avg = new double[2]; //평균 입력하기 
		
		loop:while(true){
		//화면출력
		System.out.println("[ 성적처리프로그램 ]");
		System.out.println("1.성적입력");
		System.out.println("2.성적출력");
		System.out.println("3.성적수정");
		System.out.println("4.등수처리");
		System.out.println("5.학생성적검색");
		System.out.println("0.프로그램 종료");
		System.out.println("----------------------");
		System.out.println("원하는 번호를 입력하세요.");
		choice = scan.nextInt();
		
		switch(choice){
		//1. 성적 입력 
		case 1:
		
		for(int i=count;i<name.length;i++) {
			//이름 입력하기 
			System.out.println((i+1)+"번째 학생의 이름을 입력하세요(a를 누르면 이전 페이지로 이동합니다.)");
			name[i] = scan.next();
			if(name[i] == "a") {
				System.out.println("이전 페이지로 이동합니다.");
				System.out.println();
				break;
			}
				for(int j =0 ; j <3 ; j++) {
					System.out.println(title[j+1] + "과목을 입력해주세요");
					score[i][j] = scan.nextInt();
					
					//계산 
					//점수
					score[i][3] = score[i][0] +  score[i][1] +  score[i][2];
					avg[i] = score[i][3] / 3.0;
					System.out.println();
					//이전 페이지로 안 가고 학생 수를 입력했으면 count를 추가하기 
					count++;
					break;
			}//안에 있는 for문 
				
				
		}//for 
		
		// 2. 성적출력
		case 2:
			System.out.println("[  성적을 출력합니다.  ]");
			for(int i = 0 ; i < title.length; i++) {
				System.out.println(title[i] + "\t");
				System.out.println("");
				System.out.println("----------------------------------");}
			
				for (int i = 0; i < count; i++) { //수를 세는 변수 
					System.out.print(name[i] + "\t");
					for (int j = 0; j < score[i].length; j++) {
						System.out.print(score[i][j] + "\t");
					}//안에 있는 for 
					System.out.printf("%.2f\t", avg[i]); // 평균
					System.out.printf("%d\n", rank[i]); // 등수
					System.out.println();
				}break;
		
			// 3. 성적수정
		case 3:
			
		case 0:
			System.out.println("[프로그램을 종료합니다.]");
			System.out.println();
			break loop;
			
			}//switch
			
		
		
			
		
		
		// 4. 등수처리
		// 5. 학생성적검색
		// 0. 프로그램종료
		
		}//while
	}// main
	
	
}// class
