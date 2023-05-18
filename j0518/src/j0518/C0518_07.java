package j0518;

import java.util.Scanner;

public class C0518_07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 랜덤으로 1- 100까지 랜덤숫자를 생성해서 맞추는 프로그램을 구현
		int random = (int) (Math.random() * 100) + 1;
		int count = 0;
		int[] input = new int[10];
		
		//배열을 사용 
		while(true) {
			if(count>9) { 
				System.out.println("10번 도전했습니다. 프로그램을 종료합니다.");
				break;
			}
			//도전 번호 입력 
			System.out.println((count+1)+ "번째 숫자를 입력하세요.");
			input[count]= scan.nextInt();
			if(input[count]==random) {
				System.out.println("정답");
				break;
			}else {
				System.out.println("오답. 다시 도전");				
			}
			count++;
		}//while

		//입력한 숫자 출력//배열 출력 
		System.out.println("정답 : " + random);
		System.out.print("입력한 숫자:");
		for(int i =0;i<count;i++) {
			if (i==0) {
				System.out.print(input[i]);
			}else {
				System.out.print("," +input[i]);	
	}

}

			
}//main
}//class