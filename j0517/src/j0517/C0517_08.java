package j0517;

import java.util.Arrays;
import java.util.Scanner;

public class C0517_08 {

	public static void main(String[] args) {
		// 3개의 숫자를 입력받아 작은 수부터 순차적으로 출력
		// calculate() 메소드를 만들어서 사용하시오
		// 10 5 25

		// scan
		Scanner scan = new Scanner(System.in);

		int min = 0;
		int num1 = 0, num2 = 0, num3 = 0;

		// 변수 만들기
		int[] num = new int[3];
		for (int i = 0; i < num.length; i++) {
			System.out.println((i + 1) + "번째 번호를 입력하세요");
			num[i] = scan.nextInt();
		}
		
//		//배열 정렬  이런 방법도 있다. 
		int[] arr = new int[3];
//		Arrays.sort(arr);  //제일 간단한 방법 
		calculate(arr);

		// calculate 메소드를 호출하여 결과 출력하기
		//calculate(num);
		
		
	}//main

	// calculate 메소드
	static void calculate(int[] arr) {
		int max = Math.max(Math.max(arr[0], arr[1]), arr[2]);
		int min = Math.min(Math.min(arr[0], arr[1]), arr[2]);
		int mid =(arr[0] + arr[1] + arr[2]) - max - min;
	
//	public static void calculate(int[] num) {
//		int min = Math.min(Math.min(num[0], num[1]), num[2]);
//		int max = Math.max(Math.max(num[0], num[1]), num[2]);
//		int mid = num[0] + num[1] + num[2] - min - max;
//		System.out.println("작은 수부터 순차적으로 출력: " + min + " " + mid + " " + max);
	}//calculate 

}// class
