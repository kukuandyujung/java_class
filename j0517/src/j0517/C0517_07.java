package j0517;

public class C0517_07 {

	public static void main(String[] args) {
		
		//static이 없기 때문에 객체선언이 필요하다.
		int[] num =new int[2];
		
		int a =10;
		int b =5;
		calculate(num, a, b);
		
		System.out.println("합계 : "+ num[0]);
		System.out.println("평균 : "+ num[1]);
//		// Tv 
//		//객체선언
//		Tv t1 =new  Tv ();
//		Tv t2 =new  Tv ();
//		
//		t1.channel=7;
//		System.out.println("Tv t1 channel"  + t1.channel);
//
//		t2.channel=8;
//		System.out.println("Tv t2 channel"  + t2.channel);
//		
//		t2 =t1;
//		System.out.println("t2 channel :" + t2.channel);
//		
//		t2.channel =0;
//		System.out.println(t1.channel);
	}

	static int[] calculate(int[] num, int a, int b) {
		// 두 수의 합과 평균을 구해서 넘겨주기
		num[0] = a + b;
		num[1] = (a + b) / 2;

		return num;

	}

}
