package j0518;

import java.util.Scanner;

public class C0518_03 {
public static void main(String[] args) {
   
//   //입력할때만!! scanner 사용하기
//   Scanner scan = new Scanner(System.in);
//   // 숫자
//   int num = scan.nextInt();
//   //nextline()
//   String str = scan.next();
//   double d = scan.nextDouble();
   
   //숫자 2개를 입력받아 1,10 -> 1부터 10까지의 합(55)을 구하시오
   Scanner scan = new Scanner(System.in);
   
   System.out.println("첫번째 숫자를 입력하세요.");
   int num = scan.nextInt();
   System.out.println("두번째 숫자를 입력하세요.");
   int num2 = scan.nextInt();
   
   //if 
   int temp =0; 
   if(num>num2) {
	   temp = num;
	   num = num2;
	   num2=temp;
   }
   
   
   int sum = 0;
   for (int i = num; i <=num2 ; i++) {
      sum = sum+i;
      }
      System.out.println("합 : "+sum);
   
}//main

}//class