package j0519;

public class C0519_03 {

	public static void main(String[] args) {
		int a =10 , b= 5;
		int total = 0;
		System.out.println("[ 두 수의 합 ]");
		//int total = a + b;
		total = C0519_03.total(a, b);
		
		System.out.printf("%d + %d = %d \n", a,b, total);
		// int a = 50; 타입이 같든 다르든 중복해서 사용 불가 하지만 밑에 메소드가 다른 경우에는 다른 변수를 사용해도 괜찮다. 

	}

    //2개의 매개변수를 전달 받아 합계를 return해서 출력하시오 
	static int total(int a, int b) { //int 리턴타입, total 메소드명 
		//static void total 이렇가면 에러가 난다. 
		//static : 클래스 메소드, int: 리턴타입, total() : 메소드명, int a int b : 매개변수 
 		int total = a + b; 
		return total;
	}
	
}
