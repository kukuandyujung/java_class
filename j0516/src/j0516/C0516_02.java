package j0516;

import java.util.Scanner;

public class C0516_02 {

	public static void main(String[] args) {
		//성적을 입력하는 프로그램 
		//1번을 입력하면 성적 입력 받기 
		//2번을 입력하면 성적 출력 받기 
		//3번을 입력하면 성적 수정하기 
		//0번을 입력하면 프로그램 종료하기 
		
		//스캔 
		Scanner scan = new Scanner(System.in);
		
		//입력을 위한 변수 설정하기 
		int count=0; //학생 수를 세주는 변수 
		int choice =0; //번호 입력을 위한 변수 
		 
		
		//배열 설정 
		//이름 
		String[] name = new String[2];
		String[] title = {"이름", "국어", "영어", "수학", "합계", "평균"};
		int[][] score = new int[2][4]; //2명의 성적을 받겠다.
		double[] avg = new double[2]; //2명의 평균을 구하기  
		
		//while반복문을 통해 무한 반복 만들기 
		
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
				for(int i = count ; i <name.length;i++) {
					//이름 
					System.out.println((count+1)+"번째 학생의 이름을 입력하세요.(0. 이전 페이지 이동)>>");
					name[i]=scan.next();
					
					//이전 페이지 이동 
					if(name[i].equals("0")) {
						System.out.println("이전 페이지로 이동합니다.");
						System.out.println();
						break;
					}
					//score[i][0]국, score[i][1]수, score[i][2]영
					for(int j=0 ; j < 3 ; j ++) {
						System.out.println(title[j+1]+"점수를 입력하세요 ");
						score[i][j] = scan.nextInt();
					}
					//합계 
					score[i][3] = score[i][0] + score[i][1]+ score[i][3];
					//평균
					avg[i] = score[i][3] / 3.0;
					System.out.println((count + 1)+ "번째 학생 성적이 등록 되었습니다.");
					System.out.println();
					
					//학생 수 1증가
					count++;
				}
		    	break;
		    case 2://성적 출력하기 
		    	System.out.println("[ 학생 성적 ]");
				for(int i = 0 ; i<title.length; i++ ) {
					System.out.print(title[i]+ "\t");
					
				}
				System.out.println("");
				System.out.println("---------------------------------------------");
		    	for(int i = 0 ;i < count; i++) {
					System.out.print(name[i]+ "\t");
					for(int j = 0 ;j<score[i].length;j++) {
						System.out.print(score[i][j]+ "\t");
					}
					System.out.printf("%.2f\n", avg[i]);
					System.out.println();
				}
				
		    }
		}//while

	}//main

}//class
