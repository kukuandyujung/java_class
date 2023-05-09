package j0509;

import java.util.Scanner;

public class j0509_06 {

	public static void main(String[] args) {
		int num = 5;
		//int r = ++num;   //num =num+1;과 같다. //num에 1을 더해서 그 결과값을 r에 대입
		int r = num++;  //r에 5를 먼저 대입한 후 num에 1을 더하는 식.  
		System.out.println(r);
		
		
		
		//삼항식
		String answer = (num>1)?"1보다 큽니다.":"1보다 작습니다.";
		System.out.println(answer);
		
		
		//int input = 0;
		//1개의 정수형을 입력받아 10보다 큰 수인지 출력하시오 
		//Scanner scan = new Scanner(System.in);
		//System.out.printf("숫자를 입력하시오." );
		//input = scan.nextInt();
		//String a= (input>10)?"10보다 큽니다.":"10보다 작습니다.";
		//System.out.println(a);		
		
		int i = 0;
		//1개의 정수형을 입력받아 10보다 큰 수인지 출력하시오 
		Scanner scan1 = new Scanner(System.in);
		System.out.printf("숫자를 입력하시오." );
		i = scan1.nextInt();
		String b= (i>10)?(i ==10)?"10보다 큽니다.":"10보다 작습니다.":"10과 같습니다.";
		System.out.println(b);	
		
		
		//정수를 입력받아 음수면 양수, 양수면 음수로 변경하시오. 
		
		System.out.println("음수는 양수로, 양수는 음수로 변경합니다. 숫자를 입력하세요.");	
		i = scan1.nextInt();
		int r2 = (i>0)?-i:-i;
		System.out.println("결과값 : " +r2);
	}
}
