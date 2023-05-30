package j0530;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ColClass4 {

	//list, nowPage =1 , 
	Map<String, Object> execute4() {
		Map<String, Object> map4 = new HashMap<>();
		
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
		
		int nowPage =1;
		int startRow = 1;
		int endRow =10;
		
		map4.put("list", list);
		map4.put("nowPage", nowPage);
		map4.put("startRow", startRow);
		map4.put("endRow", endRow);
		
		return map4;
	
	
}
}
