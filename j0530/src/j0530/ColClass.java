package j0530;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ColClass {

	Map<String, Object> execute() {
		Map<String, Object> map = new HashMap<>();
		
		ArrayList<Student> list = new ArrayList<>();
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
		
		int nowPage =3;
		int startRow = 21;
		int endRow =30;
		
		map.put("list", list);
		map.put("nowPage", nowPage);
		map.put("startRow", startRow);
		map.put("endRow", endRow);
		
		return map;
	}

}
