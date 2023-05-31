package j0531;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class DataClass {

	int numAdd(int num1, int num2) { //num1이 아니라 그 안에 있는 10이라는 값만 던져주기 때문에  새로운 지역변수 num1에 전달된다. 
		System.out.println("더하기");
		int sum = num1 + num2;
		
		return sum; //친구에게 돌려줌 
		
	}
	//항상 타입을 맞춰주어야 한다. 
	Student stuAdd(int kor, int eng, int math) {
		System.out.println("학생 성적 추가");
		int stuNo =1;
		String name = "홍길동";
		Student s = new Student(stuNo, name, kor, eng, math);
		
		return s;
	}
	List<Student> stuList() {
		List<Student> list = new ArrayList<>();
		//ArrayList<Student> list = new ArrayList<>();
		
		
		System.out.println("list");
		
		list.add(new Student(1, "홍길동", 100,100,100));
		list.add(new Student(2, "김유정", 10,80,100));
		
		return list;
	}
	
	
	
	
	
	
}
