package j0531;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class StuProcess {
	Scanner scan = new Scanner(System.in);
	int stuNo;
	String name;
	int kor, eng, math;

	//파일 저장하기 
	void stuSave(List<Student> list) {
	String data = "";
	for(int i = 0 ; i <list.size(); i++) {
		data += String.format("","%d, %s, %d, %d, %d\r\n", 
				list.get(i).getStuNo() ,list.get(i).getName().trim(),
				list.get(i).getKor(), list.get(i).getEng(), list.get(i).getMath()
				); //자기 자신에게 계속 더해주기 
		
	}
	
	//String.format: ","%d, %s, %d, %d, %d\r\n", 이 형태로 스트링을 만들어줘 라는 뜻 
	
//	"" + list.get(0).getStuNo();
	
	//String data = "1,홍길동,100,100,99\r\n2,유관순,99,99,98\r\n3,이순신,88,88,87\r\n";
	FileWriter fw =null;
	try {
		fw = new FileWriter("c:/savedata/student.txt");
		fw.write(data);
		
	} catch (Exception e) {
		e.printStackTrace();
	}finally {
		try {
			fw.close();
		} catch (Exception e2) {
			e2.printStackTrace();
		}
	}
	}//stuSave
	
	
	
	
	
	// 파일 읽어오기
	List<Student> stuRead() {

		List<Student> list = new ArrayList<>();
		// 읽어오기
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader("c:/savedata/student.txt"));
			String data = "";
			while (true) {
				data = br.readLine();
				if (data == null)
					break;
				String[] dataArr = data.split(","); // 이렇게 하면 data가 따로 따로 나눠진다.
				// String data = br.readLine(); //data = "1, 홍길동, 100, 100, 99"; 이렇게 한 묶음으로
				// 인정된다.
				//System.out.println(data);
				//System.out.println(Integer.parseInt(dataArr[0])); // 객체인 것을 객체 아닌 것에 넣으려고 하니깐 이렇게 길어진다.
				stuNo = Integer.parseInt(dataArr[0]);
				name = dataArr[1];
				kor = Integer.parseInt(dataArr[2]);
				eng = Integer.parseInt(dataArr[3]);
				math = Integer.parseInt(dataArr[4]);

				list.add(new Student(stuNo, name, kor, eng, math)); // Student 객체에 넣기

//						//Integer로 바꾸고 int로 파싱? 해라 아무튼 정수형으로 형 변환 
//						System.out.println(dataArr[1]);
//						System.out.println(Integer.parseInt(dataArr[2]));
//						System.out.println(Integer.parseInt(dataArr[3]));
//						System.out.println(Integer.parseInt(dataArr[4]));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {

			} catch (Exception e2) {
				e2.printStackTrace();

			}
		} // bf

		// 읽어오기

		return list;

	}

	// return 타입 메소드명
	List<Student> stuOutput(List<Student> list) {
		String[] title = { "학번", "이름", "국어", "영어", "수학", "합계", "평균", "등수" };
		// 출력
		System.out.println("[ 학생 성적 출력화면 ]");
		System.out.printf("%s\t %s\t %s\t %s\t %s\t %s\t %s\t %s \n", title[0], title[1], title[2], title[3], title[4],
				title[5], title[6], title[7]);
		System.out.println("---------------------------------------------------------------------------");
		for (int i = 0; i < list.size(); i++) {
			Student s = list.get(i);
			System.out.printf("%d\t %s\t %d\t %d\t %d\t %d\t %.2f\t %d\t \n", s.getStuNo(), s.getName(), s.getKor(),
					s.getEng(), s.getMath(), s.getTotal(), s.getAvg(), s.getRank());
		} // for
		System.out.println();
		return list;
	}// stuOutput

	// 메소드는 처음에 return타입과 메소드명이 필요하다.
	Map<String, Object> stuInput(List<Student> list, int stuCount) { //

		while (true) { // 무한 반복이기 때문에 항상 while에는 break가 필요.

			System.out.println("[ 학생 성적 입력 ]");

//			System.out.println("학번을 입력하세염 (0. 이전 페이지로 이동)");
//			stuNo = scan.nextInt();
//			if (stuNo == 0) {
//				System.out.println("이전 페이지로 이동합니다.");
//				System.out.println();
//				break;
//			}

			System.out.println(stuCount + "번째 이름을 입력하시오 (0. 이전 페이지로 이동 )");
			name = scan.next();
			if (name.equals("0")) {
				System.out.println("이전 페이지로 이동합니다.");
				System.out.println();
				break;
			}

			System.out.println("국어 점수를 입력하시오");
			kor = scan.nextInt();
			System.out.println("영어 점수를 입력하시오");
			eng = scan.nextInt();
			System.out.println("수학 점수를 입력하시오");
			math = scan.nextInt();
			list.add(new Student(stuCount, name, kor, eng, math));

			stuCount++;
		} // while
		System.out.println();

		// 보내야 할 것 : list, stucount 보내야 한다. 하지만 하나밖에 못 보냄 그래서 Map 활용
		Map<String, Object> map = new HashMap<>();
		map.put("list", list); // list = list 이걸 보냄
		map.put("stuCount", stuCount); // stycount =4 이걸 보냄

		// list.add(new Student(3, "이순신", 90, 90, 90)); //이렇게 하면 번호를 3번으로 계속 추가된다.

		// System.out.println(list.get(0).getName());

		return map; //
		// void면 그냥 맨 몸으로 갔는데
		// List<Student> 이 이후에는 리스트도 같이 호출해서 가자 라는 의미이다.
	}// List 중괄호만 있으면 기본형성

//1. 다른 클래스에서 다른 클래스를 사용하려면 우선 객체선언 필요
//2. 	

}
