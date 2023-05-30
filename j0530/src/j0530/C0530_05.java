package j0530;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C0530_05 {

	public static void main(String[] args) {
		// list 사용 이유 : 객체를 묶어주기 위해서 (객체들의 집합), 데이터 이동 및 읽기와 저장 용도로 사용한다.
		//List  list = new ArrayList(); //List는 ArrayList의 조상? 이라고 볼 수 있다.  
		ArrayList  list = new ArrayList();
		list.add("abc");  //0
		list.add("abc");  //1
		list.add("bbb");  //2
		list.add("aaa");  //3
		list.add("ccc");
		list.add(3); //Integer
		
		for(int i = 0 ; i < list.size(); i++) {
			System.out.println("list : " +list.get(i));
			
		}
		
		
//		ArrayList<Student> list2 = new ArrayList(); //지네릭스 : 특정 클래스만 입력 하도록
//		list2.add(new Student(1, "홍길동", 100, 100,99));
//		list2.add(new Student(2, "유관순", 90, 90,99));
//		list2.add(new Student(3, "이순신", 80, 80,87));
//		//list2.add(2);
//		//list2.add("abc");
//		
//		for(int i = 0 ; i < list2.size(); i++) {
//			System.out.println("----------------------------------["+ i + " 번 학생  ]"+"--------------------------------");
//			System.out.println();
//			Student s = list2.get(i);
//			System.out.printf("학번: %d 이름 : %s 국어: %d 영어: %d 수학: %d 합계: %d 평균: %.2f \n", s.getStuNo(), s.getName(), s.getKor(), s.getEng(), s.getMath(), s.getTotal(), s.getAvg());
//			System.out.println();
//			System.out.println("이름 : " +student.getName());
//			System.out.println("국어 : " +student.getKor());
//			System.out.println("영어 : " +student.getEng());
//			System.out.println("수학 : " +student.getMath());
//			System.out.println("총 : " +student.getTotal());
			//System.out.println(Arrays.toString(list2.get(i)));
			//
	//l	}
		
		
		
		

	}

}
