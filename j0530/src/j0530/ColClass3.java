package j0530;

import java.util.ArrayList;

public class ColClass3 {

	// execute3() 만들어서
//		//list를 main메소드에 전달하시오
//	ArrayList<Student> list = new ArrayList<>();
//	list.add(new Student(1, "김유정", 100, 100, 99));
//	list.add(new Student(2, "김꾸꾸", 99, 98, 99));
//	list.add(new Student(3, "김뽀송", 90, 91, 90));
//	list.add(new Student(4, "김유리", 90, 91, 90));
//	list.add(new Student(5, "김완중", 90, 91, 90));
//	list.add(new Student(6, "전은영", 90, 91, 90));
//	list.add(new Student(7, "최정숙", 90, 91, 90));
//	list.add(new Student(8, "김나은", 90, 91, 90));
//	list.add(new Student(9, "김익중", 90, 91, 90));
//	list.add(new Student(10, "전차선", 90, 91, 90));

	// 메소드 구현은
	// 1. 리턴차입 메소드명(매개 변수) {return 리턴 타입과 일치해야 한다.}
	ArrayList<Student> execute3() {
		ArrayList list = new ArrayList<>();
		list.add(new Student(1, "김유정", 100, 100, 99));
		list.add(new Student(2, "김꾸꾸", 99, 98, 99));
		list.add(new Student(3, "김뽀송", 90, 91, 90));
		list.add(new Student(4, "김유리", 90, 91, 90));
		list.add(new Student(5, "김완중", 90, 91, 90));
		list.add(new Student(6, "전은영", 90, 91, 90));
		list.add(new Student(7, "최정숙", 90, 91, 90));
		list.add(new Student(8, "김나은", 90, 91, 90));
		list.add(new Student(9, "김익중", 90, 91, 90));
		list.add(new Student(10, "전차선", 90, 91, 90));
		return list;
	}
}
