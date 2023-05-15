package j0515;

import java.util.Scanner;

public class C0515_pra {

	public static void main(String[] args) {
		//scan
		Scanner scan = new Scanner(System.in);
		
		//0. 변수 이름 
		int temp = 0;
		int random = 0;
		int count = 0;
		
		
		//1. 배열 생성
		int[] myNum = new int[6];
		int[] lottocre = new int[45];
		int[] lottoNum = new int[6];
		
		//2. 로또 만들기 1~45
		for(int i = 0; i < lottocre.length ; i++) {
			lottocre[i] = i +1;
		}
		
		//3. 1000번 돌리기 
		for(int i = 0 ; i < 1000 ; i++) {
			random = (int)(Math.random()*45);
			temp  = lottocre[0];
			lottocre[0] = lottocre[random];
			lottocre[random] = temp;
		}
		
		//4. 6가지의 로또 입력하기 
		for(int i = 0 ; i < 6 ; i++) {
			System.out.println((i+1) + "번쨰 번호를 입력하세요");
			myNum[i] = scan.nextInt();
		}
		
		//5. 램덤과 내가 입력한 수가 같은 지 확인하기 
		for(int i= 0; i < 6; i++) {
			for(int j=0 ; j<6 ; j++) {
				if(lottocre[i]== myNum[j]) {
					lottoNum[count] = lottocre[i];
					count++;
				}
			}
		}
		//--------------출력---------------
		//6. 당첨 결과 수 6가지 출력 lottocre
		System.out.println("랜덤 결과 숫자는 : "  );
		for(int i = 0 ; i <6 ; i ++) {
			System.out.println(lottocre[i]+ " ");
		}
		System.out.println();
		
		
		//7. 내가 입력한 숫자 6가지 출력 myNum
		System.out.println("랜덤 결과 숫자는 : "  );
		for(int i = 0 ; i <6 ; i ++) {
			System.out.println(myNum[i]+ " ");
		}
		System.out.println();
		
		
		//8. 당첨된 숫자 개수 확인하기 lottoNum 
		System.out.println("랜덤 결과 숫자는 : "  );
		for(int i = 0 ; i <count ; i ++) {
			System.out.println(lottoNum[i]+ " ");
		}
		System.out.println();
		
		//9. 개수 확인하기 
		System.out.println("당첨된 숫자의 개수는: ");
		if(count == 6) {
			System.out.println("1등입니다~~");
		}else if(count == 5) {
			System.out.println("2등입니다~~");
			
		}else if (count == 4) {
			System.out.println("3등입니다~~");
		}else {
			System.out.println("꽝 ㅜㅜ ");
		}

	}

}
