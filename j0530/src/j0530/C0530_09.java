package j0530;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class C0530_09 {

	public static void main(String[] args) {
		// 객체선언, 빈껍떼기 만들고, 참조변수명.메소드명해서 받기

		// ColClass 사용하려면 객체선언
		ColClass c = new ColClass();
		Map<String, Object> map = new HashMap<>(); // 빈 껍데기 하나를 선언하기
		c.execute();
		map = c.execute(); // 위 빈 껍데기를 이용해서 이걸 쓰기 근데 무슨 말인지 하나도 모르겟

		// ColClass2 사용하려면 객체선언
		int nowPage = 0;
		ColClass2 c2 = new ColClass2();
		nowPage = c2.execute2(); // now가 넘어온다.

		// ColClass3 사용하려면 객체선언
		ColClass3 c3 = new ColClass3();
		ArrayList<Student> list = new ArrayList<>(); // 빈 껍데기를 선언
		list = c3.execute3(); // list가 넘어온다.

		// ColClass4 사용하려면 객체선언
		ColClass4 c4 = new ColClass4(); 
		Map<String, Object> map4 = new HashMap<>();// 빈 껍데기를 선언
		map4 = c4.execute4(); // list가 넘어온다.

//		ArrayList<Student> list = new ArrayList<>();
//		list.add(new Student(1, "김유정", 100,100,99));
//		list.add(new Student(2, "김꾸꾸", 99,98,99));
//		list.add(new Student(3, "김뽀송", 90,91,90));
//		list.add(new Student(4, "김유리", 90,91,90));
//		list.add(new Student(5, "김완중", 90,91,90));
//		list.add(new Student(6, "전은영", 90,91,90));
//		list.add(new Student(7, "최정숙", 90,91,90));
//		list.add(new Student(8, "김나은", 90,91,90));
//		list.add(new Student(9, "김익중", 90,91,90));
//		list.add(new Student(10, "전차선", 90,91,90));
//		
//		int nowPage =3;
//		int startRow =21;
//		int endRow =30;
//		
//		
//		Map<String, Object> map = new HashMap<>();
//		
//		//listm nowPage, startRow, endRow
//		map =subMethod();
//		System.out.println("현재 페이지:" + map.get("noWPage"));
//		
//		//메소드에서 1개만 리턴이 가능하다. 근데 내가 보낼 것이 4가지가 있다고 하면. 
//		//return은 딱 하나만 가질 수있다. 

	}// main

//	static Map<String, Object> subMethod() {
//	   Map<String, Object> map = new HashMap<>();
//		ArrayList<Student> list = new ArrayList<>();
//		list.add(new Student(1, "김유정", 100,100,99));
//		list.add(new Student(2, "김꾸꾸", 99,98,99));
//		list.add(new Student(3, "김뽀송", 90,91,90));
//		list.add(new Student(4, "김유리", 90,91,90));
//		list.add(new Student(5, "김완중", 90,91,90));
//		list.add(new Student(6, "전은영", 90,91,90));
//		list.add(new Student(7, "최정숙", 90,91,90));
//		list.add(new Student(8, "김나은", 90,91,90));
//		list.add(new Student(9, "김익중", 90,91,90));
//		list.add(new Student(10, "전차선", 90,91,90));
//		
//		int nowPage =3;
//		int startRow =21;
//		int endRow =30;		
//		
//		map.put("list" ,list);
//		map.put("nowPage" ,nowPage);
//		map.put("startRow" ,startRow);
//		map.put("endRow" ,endRow);
//		
//		return map; 
//		int result =0;
//		String name = "김유정";
//		return result, name;
//	}

}// class
