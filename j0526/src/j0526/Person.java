package j0526;

public class Person {
	long id; //주민번호 111111111111 13자리
	Person(){	}
	Person(long id){ //생성자를 만들면 항상 위에 기본 생성자를 만들기 
		this.id = id;
	}
	
	Person(Person p){
		this.id = p.id;
	}
	
	
	public boolean equals(Object obj) { //p1에 있는 객체에서 equals를 메소드로 호출하고 p3를 매개변수로 하고 비교해서 return해서 호출해라 
		Person p = (Person) obj;
		boolean chk = false;
		if(id==(p.id)) { // 주소값은 다르지만 같다라고 출력하기 위해 
			chk = true;
		}
		return chk;
	}
	
	
//	public String toString() {
//		String str = "주민번호 : " + id;
//		return str;
//	}

}
