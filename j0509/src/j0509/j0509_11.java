package j0509;

public class j0509_11 {

	public static void main(String[] args) {
		// double p = 3.7894; 소수점 2자리에서 반올림 
		double p = 3.7894;
		double re = Math.round(p*10)/10.0;
		System.out.println(re);
		
		
//		//소수점 4자리에서 반올림 출력
//		//1. 변수선언 2. 출력 
//		double pi =3.141592;
//		double result = Math.round(pi*1000)/1000.0;
//		
//		System.out.println(result);
	}
}
