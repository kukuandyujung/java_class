package j0512;

import java.util.Scanner;

public class C0512_04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//0. 변수 선언 
		int temp = 0; //임시 저장 변수
		int random = 0; //랜덤 변수 
		int count = 0; //당첨 개수 
		
		//1. 배열 생성  - 45개
		int[] lotto = new int [45]; //로또 번호
		int[] myNum =new int [6]; //입력 번호 
		int[] lottoNum = new int [6]; //당첨 번호 
		
		//2. 로또 번호 생성
		for(int i =0;i<lotto.length;i++) {
			lotto[i] = i+1;
					
		}
		//3. 로또 번호 섞기
		for(int i =0 ;i <1000; i++) {
			random = (int)(Math.random()*45);	
			temp = lotto[0];
			lotto[0]=lotto[random];
			lotto[random] = temp;
		}
		
		//4. 로또 번호 입력
		for(int i=0; i<6; i++) {
			System.out.println((i+1)+ "번째 번호를 입력하세요");
			myNum[i] =scan.nextInt();
		}
		
		//5. 로또 번호 당첨 개수 확인 //성적 등수를 처리할 때에도 이런 식으로 사용하면 된다. 
		for(int i=0;i<6;i++) {
			for(int j=0 ;j<6;j++) {
				if(lotto[i]==myNum[j]) {
					lottoNum[count] =lotto[i];
					count ++; //당첨 개수 증가 
				}
			}
		}//for
		
		
		//6. 로또 번호 개수 확인 
		System.out.println("6개 로또 번호 :");
		for(int i =0;i<6;i++) {
			System.out.println(lotto[i] + " ");
		}
		
		
		//7. 입력 번호 출력 
		System.out.println("6개 입력 번호 :");
		for(int i =0;i<6;i++) {
			System.out.println(myNum[i] + " ");
		}
		System.out.println();
		
		
		//8. 로또 번호 개수 확인 
		System.out.println("당첨 번호 :");
		for(int i =0;i< count;i++) {
			System.out.println(lottoNum[i] + " ");
		}
		System.out.println();
		
		//9. 당첨 개수 출력  
		System.out.println("당첨 개수 : " + count);
	}

}
