package j0509;

public class j0509_08 {

	public static void main(String[] args) {
	
//		byte a =10;
//		byte b =20;
//		int c =a+b;
		
		int a =10000;
		int b =20000;
		//long c =long(a*b); // 이미 이 안에서 결과값을 int로 저장한다.
		long c =(long)(a)*b;  // 이렇게 하나라도 롱으로 변환해 주어야 한다.
		System.out.println(c);
}
}
