package j0519;

import java.util.Scanner;

public class C0519_04 {

	public static void main(String[] args) {
		// 번호, 국어, 영어, 수학 점수를 입력 받아 caculate() 합계, 평균int을 구해서 return
        Scanner scan = new Scanner(System.in);
		String[] title = { "번호", "국어", "영어", "수학", "합계", "평균" };  
		int[] arr = new int[6];
		for(int i = 0 ; i < 4 ; i++) {
			System.out.println(title[i] + "를 입력하세요 >>");
			arr[i] = scan.nextInt();
		}
		//여기서 계산은 caculate() 메소드 호출로 할 것이다, 합계와 평균을 계산함.  
		caculate(arr); //2가지 중 참조형 변수이다.
		
		System.out.printf("번호 : %d \n", arr[0]);
		System.out.printf("국어 : %d, 영어 : %d, 수학: %d \n", arr[1],arr[2],arr[3] );
		System.out.printf("합계 : %d \n", arr[4]);
		System.out.printf("평균 : %d \n", arr[5]);
	}//main

	static void caculate(int[] arr) { 
		//국어 arr[1] 영어 arr[2] 수학arr[3]
 		arr[4] =  arr[1] +  arr[2]+  arr[3];
 		arr[5] = arr[4]/3; 
	}
	
}//
