package j0512;

import java.util.Scanner;

public class C0512_03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 로또 프로그램
		// 1. 배열생성
		int random =0; //랜덤 번호 
		int temp =0; //임시저장 변수 
		int count =0; //로또 담첨 번호의 개수 
		int[] myNum = new int [6]; //입력 번호 
		int[] lottoNum =new int [6]; //당첨 번호 
		int[] lotto = new int[45]; //로또 번호 

		// 2. 로또 번호 생성
		for (int i = 0; i < lotto.length; i++) {
			//lotto[i] = (int) (Math.random() * 45) + 1;
			 lotto[i] = i+1 ; //1,2,3,4,5,,,,,,,45
		}

		//2-2 
		for (int i = 0;i<6;i++) {
			System.out.println("인생 역전을 위한 기회!");
			System.out.println((i+1) + "번째 로또번호를 입력하세요.");
			myNum[i] = scan.nextInt();
		}
		// 3. 번호 섞기
		for (int i = 0; i < 1000; i++) { // 1000번 섞기
			random = (int) (Math.random() * 45); // 0부터44까지의 랜덤 번호
			temp = lotto[0];
			lotto[0] = lotto[random];
			lotto[random] = temp;
		}

		// 로또번호 확인
		for(int i=0;i<6;i++) { //로또에 있는 배열에 따라 돌리는 for문 
			for(int j=0;j<6;j++) { //myNum배열 for문
				if(lotto[i]==myNum[j]) {
					//count 1 증가 
					lottoNum[count]= lotto[i]; //당첨 번호 넣기 
					count++; //당첨 개수 증가 
					continue;
				}
			}
			
		}
		//6. 로또 번호 출력
		System.out.print("로또 번호 자동생성 : ");
		for (int i = 0; i < 6; i++) {
			System.out.print(lotto[i]+ " ");
		}//로또 출력 끝 
		System.out.println();
		
		//7. 입력번호 출력
		System.out.print("입력번호 : ");
		for (int i = 0; i < 6; i++) {
			System.out.print(myNum[i] + " ");
		}//입력출력 끝
		System.out.println();

		//8. 당첨번호 출력
		System.out.print("당첨번호 : ");
		for (int i = 0; i < count; i++) {
			System.out.print(lottoNum[i] + " ");
		}//당첨출력 끝 
		System.out.println();
		
		//9. 당첨 개수 출력 
		System.out.println("당첨 개수: " + count);
		if(count == 6) {
			System.out.println("축하합니다! 1등입니다!");
		}
		else if(count == 5) {
			System.out.println("괜찮아여~ 2등입니다!");
		}	
		else if(count == 4) {
			System.out.println("아쉽지만~ 3등입니다!");
		}	
		else{
			System.out.println("꽝ㅋㅋㅋ!");
		}
		
	}//main

}//class