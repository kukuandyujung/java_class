package j0531;

import java.util.ArrayList;
import java.util.List;

public class C0531_01 {

	public static void main(String[] args) {
		// 부모의 참조변수로 자손의 객체를 다루는 것 
		
		List list = new ArrayList<>();
		list.add("aaa"); //0 이 안에 들어있는 객체는 object객체이다. 
		list.add("bbb"); //1
		list.add("ccc"); //2
		list.add("aaa"); //3
		
		
		System.out.println(list.get(1));
		
		for(int i =0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}

		System.out.println("------------------------------------------");
		List list2 = new ArrayList<>();
		//Student s1 = new Student(1, "홍길동", 100, 100, 99);
		//list2.add(s1);
		list2.add(new Student(1, "홍길동", 100, 100, 99));
		list2.add(new Student(2, "유관순", 99, 99, 98));
		Student s = (Student) list2.get(1);
		System.out.println(s.getName());
		System.out.println(((Student)list2.get(1)).getName());
		
		
		
		//기본적인 형식이 이거 . 
		System.out.println("-----------------------------------------");
		List<Student> list3 = new ArrayList<>(); //지네릭스 : 어차피 할 수 있는 타입이 이거밖에 없숴 그냥 이거 써
		list3.add(new Student(1, "홍길동", 100,100,100));
		list3.add(new Student(2, "유관순", 99,99,100));
		//list3.add(1); //지네릭스 때문에 오류가 난다. 
		//이렇게 지네릭스는 애초에 문제가 일어날 것 같은 것을 방지해준다. 
		
		
		Student ss = list3.get(0);
		System.out.println(ss.getName());
		System.out.println(list3.get(0).getName());
		
	}

}
