package j0531;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class C0531_02 {

	public static void main(String[] args) {
		// 여기서 만든 데이터를 StuProcess여기에
		// StuProcess의 ArrayList를 여기에 보내기

		Scanner scan = new Scanner(System.in);
		// 1. 객체선언
		StuProcess sp = new StuProcess();	// 잡기 위해
		List<Student> list = new ArrayList<>();
		
		int choice = 0;
		int stuCount = list.size()+1; // 학번 때문에 넣는다.? 쓰기 귀찮으니깐 그냥 세주려고!

//		list.add(new Student(1, "홍길동", 100, 100, 99));
//		// Student에 this에서 합계와 평균이 동시에 있기 때문에 자동으로 계산된다.
//		list.add(new Student(2, "김유정", 100, 100, 100));

		while (true) {
			System.out.println("[ 학생 성적 처리 프로그램 ]");
			System.out.println("1. 학생 입력");
			System.out.println("2. 학생 출력");
			System.out.println("8. 파일에서 데이터 가져오기");
			System.out.println("9. 파일에 저장하기");
			System.out.println("-----------------------------");
			System.out.println("원하는 번호를 입력하세요");
			choice = scan.nextInt();

			switch (choice) {
			case 1:
				// 메소드 호출 후 데이터 전달 받음.
				stuCount = list.size()+1;
				Map<String, Object>map = sp.stuInput(list, stuCount); // 타입을 원래는 안 받아도 되지만(list = 이렇게 하지 않아도 된다는 뜻 ) 개념
																	
				// void stuInput(List<Student> list) 스투인풋에서 선언해서 위가 오류 안 남
				list = (List<Student>)map.get("list");
				stuCount = (int)map.get("stuCount");
				break;

//				// 출력
//				for (int i = 0; i < list.size(); i++) {
//					System.out.printf("%d %s \n", list.get(i).getStuNo(), list.get(i).getName(), list.get(i).getKor());
//				} // for

			case 2:
				
				//메소드 호출(매개변수 전달) - list 
				list= sp.stuOutput(list);
				break;
				
			case 8: //파일에서 가져오기 
				list = sp.stuRead();
				System.out.println("[ 파일 읽어오기가 완료되었습니다. ]");
				System.out.println();
				break;
				
			case 9: 
				sp.stuSave(list);
				System.out.println("[ 학생 성적이 저장되었습니다. ]");
				System.out.println();
				break;
			}// switch
		} // while

	}// main

}// class
