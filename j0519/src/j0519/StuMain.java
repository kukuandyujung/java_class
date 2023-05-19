package j0519;

import java.util.Scanner;

public class StuMain {

	//main 메소드 //record title과 main 메소드는 같은 반에 있지만 서로 다른 사람 근데 이 둘이 가지고 있는 책이 같다 하더라도, 한 곳에서 쓴 낙서가 다른 곳에 똑같이 작성되지 않는다. 
	public static void main(String[] args) {
		//
		Scanner scan = new Scanner(System.in); //객체 선언 
		Student[] s = new Student[2]; //객체에 대한 배열을 선언 //이것만 하면 객체 선언이 안 된다. 
		//따라서 밑에서 객체에 대한 선언을 해준다. 

		
		//변수 선언하기 
		int choice = 0; // 번호를 선택하는 변수 
		int rank = 0; // 성적 등수 변수  
		int count =0; // 수를 세어주는 변수 
		int chk = 0; //학생이 있는 지 확인하는 변수 
		String SearchName = ""; //검색할 이름 변수 
		String name="";
		int kor=0 , eng =0, math=0;
	
		//반복문에는 while과 for가 있다.
		//조건이 맞으면실행한다. 100% true인 경우 무한 반복이 실행 
		loop:while(true) {
			
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
			
			//입력된 번호를 선택하는 조건문
			switch(choice) {
			case 1:
				//10명의 학생 성적을 입력하기
				for(int i=count;i<s.length;i++) {
					//count로 하는 이유 이전페이지로 이동하는 경우 때문에 
					s[i] = new Student(); //객체선언 - 공간할당을 해준다. 
					System.out.println((i+1)+"번째 학생의 이름을 입력하세요(0를 누르면 이전 페이지로 이동합니다.)");
					name =scan.next(); //이름 입력 또는 이전 페이지 이동 입력 
					//이전 페이지 이동 입력이 되었는지 확인하기 
					if(name.equals("0")) {
						System.out.println("[ 0번을 누르셨습니다. 이전 페이지로 이동합니다. ]");
						System.out.println();
						break; //for while switch를 빠져나올 수 있다.
						//메소드를 빠져나올 수 있는 건 return
					}//if
					
					
					System.out.println("국어 점수를 입력하세요");
					kor = scan.nextInt();
					System.out.println("영어 점수를 입력하세요");
					eng = scan.nextInt();
					System.out.println("수학 점수를 입력하세요");
					math = scan.nextInt();
					
//					System.out.println("국어 점수를 입력하세요");
//					s[i].kor = scan.nextInt();
//					System.out.println("영어 점수를 입력하세요");
//					s[i].eng = scan.nextInt();
//					System.out.println("수학 점수를 입력하세요");
//					s[i].math = scan.nextInt();
//					
					//데이터 값과 평균 
					s[i] = new Student(name, kor, eng, math);
//					s[i].sum(); //따로 total을 만들어주지 않아도 sum에 total이 들어간다. 
//					s[i].average(); //평균 처리 
					//다음에는 객체 선언만 해도 합계와 평균이 해결되는 걸 만들 것이다. 
					
					
					count++; //입력이 완료되면 입력된 학생 수 1 증가하기
				}//for
				break; //switch를 빠져나오는 반복문 
			case 2:
				//학생 성적 출력 메소드 호출하는 법 
				System.out.println("[학생성적]");
				String[] title = Student.title; //선언 된 것을 다시 변수로 받기 : 변수에다가 복사했다고 생각하면 된다. 
				//위에 변수 선언을 새로 안 하고 싶다면 그냥 클래스 변수 사용 방법인 : 클래스명.변수명을 사용하면 된다. 
				
				//상단 title을 출력해주는 인덱스 for문이다.
				//System.out.println("recordTitle Student[] s: " + s);  //이 레코드 타티을에 s에 있는 건 위에 s와는 다르다. 
		 		for(int i = 0 ; i < title.length ; i++) {
					System.out.print(Student.title[i]+ "\t");
				}
				System.out.println();
				System.out.println("------------------------------------------------------");
				//입력된 성적을 출력하는 for문이다.
				for(int i = 0 ; i < count ; i++ ) {
					System.out.print(s[i].name + "\t"); //s[i]여기서 s는 객체에 대한 배열이다.
					System.out.print(s[i].kor + "\t");
					System.out.print(s[i].eng + "\t");
					System.out.print(s[i].math + "\t");
					System.out.print(s[i].total + "\t");
					System.out.printf("%.2f\t",s[i].avg);
					System.out.print(s[i].rank + "\n");
					
					
				}
				System.out.println();
			
				break;
			case 3:
				chk = 0; //초기화를 꼭 해주어야 한다.
				System.out.println("[ 학생 성적 수정 ]");
				System.out.println("수정할 학생의 이름을 입력하세요.(0번을 선택하면 이전 페이지로 이동합니다.)");
				SearchName = scan.next();
				
				//0번 이전 페이지 이동인지 비교 
				if(SearchName.equals("0")){
					System.out.println("이전 페이지로 이동합니다.");
					System.out.println();
					break; //switch
				}
				//수정할 학생의 이름이 입력된 학생에 있는 지 비교하기 
				for(int i = 0; i <count ; i++) {
					if(s[i].name.equals(SearchName)) {
						System.out.printf("[ %s 해당 이름의 학생이 존재합니다. ] \n", SearchName);
						System.out.println("1.국어 점수");
						System.out.println("2.영어 점수");
						System.out.println("3.수학 점수");
						System.out.println("---------------------------");
						System.out.println("수정할 과목을 선택하세요");
						choice = scan.nextInt();
						
						switch(choice) {
						case 1:
							System.out.printf("[ 이전 국어 점수 : %d ]\n", s[i].kor);
							System.out.println("수정할 점수를입력하세요");
							s[i].kor = scan.nextInt();
							s[i].sum();
							s[i].average();
							System.out.println("[ 국어 점수 수정 완료 ]");
							System.out.println();
							break;
							
						case 2:
							System.out.printf("[ 이전 영어 점수 : %d ]\n", s[i].eng);
							System.out.println("수정할 점수를입력하세요");
							s[i].eng = scan.nextInt();
							s[i].sum();
							s[i].average();
							System.out.println("[ 영어 점수 수정 완료 ]");
							System.out.println();
							break;
							
						case 3:
							System.out.printf("[ 이전 수학 점수 : %d ]\n", s[i].math);
							System.out.println("수정할 점수를입력하세요");
							s[i].math = scan.nextInt();
							s[i].sum();
							s[i].average();
							System.out.println("[ 수학 점수 수정 완료 ]");
							System.out.println();
							break;
						
					}//switch
						chk = 1; //학생이 존재 하는 경우에는 1로 변경하기
					if(chk == 0) {
						System.out.printf("[ %s 해당 이름의 학생이 존재하지 않습니다. ] \n", SearchName);
						System.out.println();
					}//if
					   
					}//if
				}//for
				System.out.println();
				break;
			case 4://등수 처리 
				System.out.println("[ 등수 처리 ]");
				//이중 for문으로 작성하기
				for(int i = 0 ; i < count ; i++ ) { //등록된 학생 수 만큼 비교하기 
					int rankCount = 1; //등수 1부터 시작하기 
					for(int j = 0 ; j < count ; j++ ) {
						if(s[i].total < s[j].total) { //다른 학생 성적이 더 높으면 
							rankCount++;;
						}
					}//in for
					s[i].rank = rankCount; //변수를 등수 변수에 저장 
				}//out for
				System.out.println("등수 처리 완료");
				System.out.println();
				break;
				
			case 5://
				System.out.println("[ 학생 성적을 검색 하시오 ]");
				System.out.println("수정할 학생의 이름을 입력하세요.(0번을 선택하면 이전 페이지로 이동합니다.)");
				SearchName = scan.next();
				
				//0번 이전 페이지 이동인지 비교 
				if(SearchName.equals("0")){
					System.out.println("이전 페이지로 이동합니다.");
					System.out.println();
					break; //switch
				}
				chk = 0;
				for(int i = 0 ; i < count ; i ++) {
					if(s[i].name.contains(SearchName)) {
						chk =1;
					}
				}//for
				if(chk == 0) {
					System.out.printf("[ %s 해당 이름의 학생이 존재하지 않습니다. ] \n", SearchName);
					System.out.println();
					}
				break;
			case 0:
				System.out.println("[ 프로그램이 종료되었습니다. ]");
				System.out.println();
				break loop;
		
					}//switch
		
			
		}//while

	}//main

	//성적 출력 메소드
	//recordTitle(int count , Student[] s) {
		
	
}//class
