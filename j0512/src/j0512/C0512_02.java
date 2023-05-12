package j0512;

import java.util.Scanner;

public class C0512_02 {

	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		      Scanner scan =new Scanner(System.in);
		      
		      //성적처리 프로그램 - 5명
		      //1. 성적입력
		      //2. 성적출력
		      //3. 성적수정
		      //4. 등수처리
		      //5. 학생성적검색
		      //0. 프로그램 종료

		      
		//1. 이름 국영수점수 합계 평균(변수선언)
		      int input = 0, count = 0;

		      String[] name = new String[10];//배열은 new라는 명령어를 입력 받음
		      int[] kor = new int[10];
		      int[] eng = new int[10];
		      int[] math = new int[10];
		      int[] total = new int[10];
		      double[] avg = new double[10];


		//2.외부 틀 만들기(화면출력)
		      while (true) {
		      System.out.print(" [ 성적처리프로그램 ]\n원하는 숫자를 입력하세요\n");
		      System.out.println("---------------------------------");
		      System.out.println("1. 성적입력");
		      System.out.println("2. 성적출력");
		      System.out.println("3. 성적수정");
		      System.out.println("4. 등수처리");
		      System.out.println("5. 학생성적검색");
		      System.out.println("0. 프로그램 종료");
		      System.out.println("---------------------------------");
		      input = scan.nextInt();
		      if (input==0) {
		      System.out.println("프로그램을 종료합니다");}
		      //3.조건문
		      switch(input) {
		      case 1: //1.성적입력
		      
		      for (int i = 0; i < name.length; i++) {
		         //이름
		         System.out.println("이름을 입력하세요.(0을 입력시 프로그램 종료)");
		         name[i] = scan.next();
		         if (name[i].equals("0")){
		            System.out.println("프로그램을 종료합니다");
		            System.out.println();
		            break;
		         }
		         //성적입력
		         System.out.println("국어성적을 입력하세요");
		         kor[i] = scan.nextInt();
		         System.out.println("영어성적을 입력하세요");
		         eng[i] = scan.nextInt();
		         System.out.println("수학성적을 입력하세요");
		         math[i] = scan.nextInt();
		         //합계평균계산
		         total[i] = kor[i]+eng[i]+math[i];
		         avg[i] = total[i]/3.0;
		         count++;
		      }//for 
		         break;
		      case 2://2. 출력
		         System.out.println("--------------------------");
		         System.out.println("   이름\t 국어\t 영어\t 수학\t 합계\t 평균\t");
		         System.out.println("--------------------------");
		         for (int i = 0; i < name.length; i++) {
		            System.out.printf(" %s\t %d\t %d\t %d\t %d\t %.1f\t  \n", name[i],kor[i],eng[i],math[i],total[i],avg[i]);
		         }//case 2 for
		         break;
		         }//switch
		      break;//반복문 마치고 프로그램 재실행 원치 않을 경우 작성(미작성해도 오케이)
		      }//while
	
}

}
