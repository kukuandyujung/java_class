package j0519;

public class C0519_07 {

	public static void main(String[] args) {
		Data1 d1 = new Data1();
		d1.value = 10;
		System.out.println(d1.value);
		
		
		//Data2 d2 = new Data2(); //이렇게 쓸 수 없다.
		Data2 dd = new Data2(); 
		Data2 d2 = new Data2(10); 

	}

}
