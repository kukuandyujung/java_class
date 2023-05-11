package j0510;

import java.util.Scanner;

public class C0510_08 {

	public static void main(String[] args) {
		
		//System.out.println(random);
		

		
		//랜점숫자 1-100까지의 숫자를 1개 출력
		
		int random =0;
		random = (int)(Math.random()*100)+1;
		//System.out.println(random);
		Scanner scan =new Scanner (System.in);
		
		//숫자 맞추기 프로그램 
		//10번
		int i =1;
		while(i<=10) {
			System.out.println(i + "번째 숫자 입력");
			int input =scan.nextInt();
			if(input == random) {
				System.out.println("정답");
				break;
			}
			else if(input>random){
				System.out.println("[ 오답 ]입력한 숫자보다 작은 수입니다");
			}
			else {
				System.out.println("[ 오답 ]입력한 숫자보다 큰 수입니다");
			}
			i++;
		}
	

		
		//
//		for(int i = 0 ;i<10 ;i++) {
//			System.out.println(i);
//		}
//		//초기화
//		int i = 0; 
//		while(i<10) {
//			System.out.println(i);
//			i++;
//		}
////		
		//		//i--의 의미는 i = i-1, i -= 1이다. 
//		//i++의 의미는 i = i+1, i += 1이다. 
//		for (int i = 100;i>0;i= i-5) { 
//			System.out.println(i);
//		}
//		
		
		
//		//중첩 for문 활용 00 \n 01 01 ... 99
//		for(int i =0 ; i<=9 ; i ++) {
//			System.out.println("첫 자리: " + i);
//			for(int j =0 ; j<=9 ; j ++) {
//			System.out.printf("%d%d \n", i,j);	
//			} 
//			System.out.println("---------");
//		}

//		
		
		
//		//0부터 9까지 출력 
//		for(int i =0 ; i<=9 ; i++) {
//			System.out.println(i);
//		}
//		

//		//구구단 
//		for(int i=1 ; i<=9 ;i++) {
//			System.out.printf("[   %d   단] \n", i);
//			for(int j=1;j<=9;j++) { //1부터 9까지 9번 돈다. i가 1이면 j는 9번 돈다. 이걸 반복 그래서 총 81번이 돈다. 
//			System.out.printf("%d * %d = %d \n", i,j,i*j);
//				
//			}
//			System.out.println("--------------");
//			//System.out.println(i+" * " +i+ " = " + (i*i) );
//		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		// 반복문 - for(범위가 정확할 때1~100까지 뭘 한다. 이럴 때 ), while(뭘 나누면 3이냐 이런 문제에서 유용 )
		
		// 숫자를 3번 반복해서 입력받아, 합을 출력하시오 
		// num변수선언 
		// Scanner scan
		//반복문 
		//반복문 안에 숫자 입력 받기 
		//sum변수에 더하기 해줌 
		//sum 을 출력 
		
		
		// 숫자를 3번 반복해서 입력받아, 합을 출력하시오
//		int num =0, sum =0;
//		Scanner scan =new Scanner (System.in);
//		for(int i=0;i<3;i++) { //3번까지만 받아라 
//			System.out.println("숫자를 입력하세요");
//			num = scan.nextInt();
//			sum = sum + num;
//		}
//		System.out.println("합은: " +sum);
		
//		
//		// 다른 방법 (이거 암기하기) 
//		Scanner scan =new Scanner (System.in);
//		int num =0, sum =0;
//		for(int i=0;i<3;i++) { //3번까지만 받아라 
//			System.out.println((i+1)+"번째 숫자를 입력하세요");
//			num = scan.nextInt();
//			sum = sum + num;
//		}
//		System.out.println("합은: " +sum);

		
//		int sum =0;
//	    int i = 1; 
//		for(i=1;i<=100;i++) { 
//			sum += i;
//			//System.out.println(i + " 이면 합은: " +sum);
//		}
//		
//	    System.out.println((i-1) + " 이면 합은: " +sum);
//	
	
	}

}
