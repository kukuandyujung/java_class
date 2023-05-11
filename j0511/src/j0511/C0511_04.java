package j0511;

import java.util.Scanner;

public class C0511_04 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int input = 0, num1 =0 , num2 =0  ,sum =0;
		
		    loop:while(true) { // 무한반복 
			System.out.println("1. 더하기");
			System.out.println("2. 곱하기");
			System.out.println("0. 종료");
			System.out.println("--------");
			System.out.println("원하는 번호를 입력하세요");
			input =scan.nextInt();
			if(input == 0) {
				System.out.println("프로그램을 종료");
				break;
			}
		
		
		
		//조건문
		switch(input) {
		case 1:
			while(true) {
				System.out.println("첫번째 숫자 입력(0. 이전페이지 , 1. 종료)");
				num1= scan.nextInt();
				if(num1 ==0)break; //break를넣으면 첫번째 반복문을 벗어나서 프로그램을 종료한다. 
				if(num1 ==1)break loop;
				System.out.println("두번째 숫자 입력");
				num2= scan.nextInt();
				System.out.printf("결과값 : %d + %d = %d \n", num1, num2, num1 + num2);
				//break;
			}
			
		}
		    }
		
//		      loop:for(int i=2;i<=9;i++) {
//		    	  //if(i ==6) break;     
//		    	  for(int j=1;j<=9;j++) {
//		            if(j==6) break loop;      
//		            System.out.printf(" %d * %d = %d \n", i,j,i*j);
//		         }
//		         System.out.println();
//		      }
//		      
//		      
		      
		      
		      
		      

//		      구구단 5단을 빼고 출력 하시오.
//		      for(int i=5;i<=9;i++) {
//		         System.out.printf("[  %d단  ]\t");
//		      }
//		         System.out.println();
//		         for(int j=1;j<=9;j++) {
//		            int i;
//		            System.out.printf(" %d * %d = %d \t", i,j,i*j);
//		         }
//		         System.out.println();
//		      }
		      
		//   for(int i=2;i<=9;i++) {
//		      if(i%2!=0) continue; // 같은 의미 if(i%2==1) 짝수만 나옴
//		      for(int j=1;j<=9;j++) {
//		         if(j%2==0) continue;      
//		         System.out.printf(" %d * %d = %d \n", i,j,i*j);
//		      }
//		      System.out.println();
		//   }
		//   
		      
		      
		      
		      //      for(int i=0;i<=10;i++) {
//		         if(i==5) { //if(i%2==1) 와 같은 결과 나옴.
//		            continue;//
//		            //break;//0-4까지만 나옴.
//		         }
//		         System.out.println(i);
//		         
//		      }//for
		
	}

}
