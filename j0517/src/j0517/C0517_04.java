package j0517;

import java.util.Scanner;

public class C0517_04 {

	public static void main(String[] args) {
		// 3개의 숫자를 입력 받아 가장 큰 수를 출력하시오 
		// numMax 메소드를 만들어 사용하시오
		Scanner scan = new Scanner(System.in);
		//객체 선언 : 참조변수명.변수명 , 다른 메소드 호출 방법 : 참조변수명.메소드명()
		C0517_04  c= new C0517_04();
		
		int min =0;
		int num1=0,num2=0,num3=0; 
		
		//변수 만들기 
		int[] num = new int[3];
		for(int i = 0 ;i<num.length;i++ ) {
			System.out.println((i+1)+"번째 번호를 입력하세요");
			num[i]= scan.nextInt();
		}
		
		
//		//메소드 호출
//		int result = c.numMin(num[0],num[1],num[2]); 
//		System.out.println("3가지 중 가장 작은 수는"+ result);
		
		
		while(true) {
			System.out.println("1번쨰 수를 입력");
			num1 = scan.nextInt();
			System.out.println("2번쨰 수를 입력");
			num2 = scan.nextInt();
			System.out.println("3번쨰 수를 입력");
			num3 = scan.nextInt();
			
			//다른 메소드 호출방법 
			//참조변수명.메소드명()
			int result = c.max(1,num1, num2, num3);  //매개변수는 4개 
			int result2 = c.max(2,num1, num2, num3);
			System.out.println("3개의 수의 최대값: " + result);
			System.out.println("3개의 수의 최th값: " + result2);
			
		}
		
//		//삼항식 만들기 
//		max = (num1>num2)?((num2>num3)?((num2>num3)?num2:num3):((num2>num3)?num2:num3);
//		min = (num1>num2)?((num2>num3)?((num2>num3)?num3:num2):((num2>num3)?num3:num2);
//		//Math.Max()
//		max  = Math.Max(Math.Max(num1, num2), num3);
//		
		//Math.Min()
		//min = Math.Min(Math.Min(num1, num2), num3);
		
		
//		//변수 만들기 
//		int[] num = new int[3];
//		for(int i = 0 ;i<num.length;i++ ) {
//			System.out.println((i+1)+"번째 번호를 입력하세요");
//			num[i]= scan.nextInt();
//		}
//		
//		//메소드 호출
//		int result = c.numMax(num[0],num[1],num[2]); 
//		System.out.println("3가지 중 가장 큰 수는"+ result);
	}

	//numMax 메소드 만들기 
	
//	//큰 수
//	int numMax(int a, int b, int c) {
//		int max;
//		if (a > b) {
//			if (a > c) {
//				max = a;
//			} else {
//				max = c;
//			}
//
//		} else if (b > c) {
//			max = b;
//		} else {
//			max = c;
//		}
//		return max;
//	}
	
	//작은 수 
		int numMin(int a, int b, int c) {
			int min;
			if (a > b) {
				if (b > c) {
					min = c;
				} else {
					min = b;
				}
			} else if (a > c) {
				min = c;
			} else {
				min = a;
			}
			return min;

		}
		
		
		//메소드 리턴차입과 return 변수는 타입이 같아야 한다.
		//최대
	
		int max(int check, int a, int b,int c) {
			int result = 0;
			if(check==1) {				
				//최대값 구하기 
				result = Math.max(Math.max(a, b), c);
			}else {
				result = Math.min(Math.min(a, b), c);
			}
			return result;
		}
		
		
	
}//class
