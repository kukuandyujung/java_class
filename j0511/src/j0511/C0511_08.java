package j0511;

import java.util.Scanner;

public class C0511_08 {

	public static void main(String[] args) {
		// 램점 숫자 맞추기 
	
		
		
		Scanner scan = new Scanner(System.in);
		int input =0, random=0, count=0; //count도전 횟수
		int[] num = new int [10]; //입력한 숫자를 저장 
		
		random = (int)(Math.random()*100)+1;
		System.out.println("랜덤숫자 : " + random);
		
		while(true) {
			if(count>9) { //몇 번 도전했는지 확인해야 한다. 
				System.out.println("10번 도전했습니다. 프로그램을 종료합니다.");
				break;
			}
			//도전 번호 입력  
			System.out.println((count+1)+ "번째 숫자를 입력하세요.>>");
			num[count]= scan.nextInt();
			if(num[count]==random) {
				System.out.println("정답");
				break;
			}else {
				System.out.println("오답. 다시 도전");				
			}
			count++;
		}
		
		//입력한 숫자 출력 
		System.out.println("정답 : " + random);
		System.out.print("입력한 숫자:"); 
		for(int i =0;i<count;i++) {
			if (i==0) {
				System.out.print(num[i]);
			}else {
				System.out.print("," +num[i]);				
			}
		
		}
	
		
		
		
	}

}
