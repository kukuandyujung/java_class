package j0518;

public class C0518_10 {

	int iv;
	static int cv;
	
	 void i_Method() {
		 System.out.println(iv);
		 System.out.println(cv);
	 }
	 
	static void c_Method() {
//		C0518_10 c2 = new C0518_10();
//		System.out.println(c2.iv); //근데 이럴거면 여기서 사용할 필요가 없다. 
		System.out.println(cv);
	}
	 
	public static void main(String[] args) {
		 C0518_10.cv =50;  //cv =50;사실 같은 클래스 내에서는 C0518_10생략 가능하다. 
		 System.out.println(cv);
		 
		 C0518_10 c = new C0518_10();
		 c.iv  = 100; //객체 선언을 해야한다.
		 System.out.println(c.iv);
		 
		 


	}

}
