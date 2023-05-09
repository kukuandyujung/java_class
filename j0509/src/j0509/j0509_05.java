package j0509;

public class j0509_05 {

	public static void main(String[] args) {
	
		int num1 =3;
		int num2 =4;
		int num3 =5;
		//int  r =(num2*num3)+num1;
		//System.out.println(r);
		
		int r = ++num3; //5+1 =6
		System.out.println(r);
		
		int r2 = num2++; //4
		System.out.println(r2);
		// 값을 먼저 넣고 1을 증가시킴 r2에게 4를 준 다음 num2는 1을 증가 함 그래서 num2는 5가 된다.
		
		
		++num3;
		int r3 = num3; //6+1 =7
		System.out.println(r3);
		
		num2++;
		int r4 = num2++; // 5+1 =6
		System.out.println(r4);
		
		
}
}
