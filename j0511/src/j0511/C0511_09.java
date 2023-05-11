package j0511;

import java.util.Scanner;

public class C0511_09 {

	public static void main(String[] args) {
		//성적 처리 프로그램 
		//1. 이름 2. 국어점수 3. 영어점수 4. 수학점수 이걸 넣으면 합계 평균 자동으로 나오도록 
		Scanner scan = new Scanner(System.in);
		
		String[] name = new String [5];
		int[] kor = new int [5];
		int[] eng = new int [5];
		int[] math = new int [5];
		int[] total = new int [5];
		double[] avg =new double [5];
		
		for(int i=0 ; i<name.length ; i++) {
		 System.out.println("이름을 입력하세요");
		 name[i] = scan.next();
		 System.out.println("국어점수 입력하세요");
		 kor[i] = scan.nextInt();
		 System.out.println("영어점수 입력하세요");
		 eng[i] = scan.nextInt();
		 System.out.println("수학점수 입력하세요");
		 math[i] = scan.nextInt();
		
		 //자동계산 
		 total[i] = kor[i] +eng[i]+ math[i];
		 avg[i] =total[i] /3.0;
		
		
				

		}
		
		//출력
		System.out.println("이름 \t국어\t 영어\t 수학 \t함계 \t평균");
		System.out.println("-----------------------------------");
		for(int i=0;i<name.length;i++) {
			
			System.out.printf("%s \t%d \t%d \t%d \t%d \t%.2f \n", name[i], kor[i] ,eng[i], math[i], total[i], avg[i]);
		}
				}
		
		
		

		
	}


