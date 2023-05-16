package j0516;

public class C0516_03 {
//객체 
	public static void main(String[] args) {
		
		//변수 선언
		int a =0;
		//String 이것도 시작이 대문자 객체임 (초반에 배웠음) 
		
		
		//t와 t2는 다른 객체이다. 
		//붕어빵은 서로 다른 존재이다. 
		
		//객체 선언 
		Tv t =new Tv();
		t.color="white";
		System.out.println(t.color);
		
		//객체 선언 
		Tv t2 =new Tv();
		t2.color="red";
		System.out.println(t2.color);
	

	}

}
