package j0526;

public class C0526_04 {

	public static void main(String[] args) {
		Person p1 = new Person(9810191111111L); 
		Person p2 = new Person(9810192111111L); 
		Person p3 = new Person(9810191111111L); 
		
		Person p4= new Person (p1); //공간분리, 깊은 복사 
		Person p5 = p3; //주소복사, 얕은 복사
		System.out.println(p4.id);

		System.out.println(p1); 
		System.out.println(p3);
		if(p1.equals(p3)) {
			System.out.println("같다");
			
		}else {
			System.out.println("다름");
		}
		
	}

}

//String에서 중요한 것 
//ToString 
//equals