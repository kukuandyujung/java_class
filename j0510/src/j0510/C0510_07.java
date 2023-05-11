package j0510;

import java.util.Scanner;

public class C0510_07 {

	public static void main(String[] args) {
		
		
		//숫자를 입력받아 같은 값일경우 당첨 그렇지 않을 경우 꽝 출력하기 (교수님)
		int r = 0;
	    int random =(int)(Math.random()*10)+1;
		
	    Scanner scan =new Scanner (System.in);
	    
 
		System.out.println("숫자를 입력하세요");
		r = scan.nextInt();
		if (r==random) {
			System.out.println("당첨");
		}
		else {
			System.out.println("꽝");
		}
		
		
		System.out.println("랜덤숫자: "+random);
		System.out.println("입력숫자: "+r);
		
//		//숫자를 입력받아 같은 값일경우 당첨 그렇지 않을 경우 꽝 출력하기 (내가 한 거)
//		int random = 0, result =0;
//		Scanner scan =new Scanner (System.in);
//		
//		System.out.println("숫자를 입력하세요");
//		random = scan.nextInt();
//		result = (int)(Math.random()*10)+1;
//		if (result==random) {
//			System.out.println("당첨");
//		}
//		else {
//			System.out.println("꽝");
//		}
//		
		//int random =(int)(Math.random()*3)+1; 
		
//		//1부터 10까지 램덤 숫자 
//		int random =0; //지금 경우에는 변수에 넣지 않아도 된다. 
//		random = (int)(Math.random()*10)+1;
//		System.out.println(random);
//		
		
//		// 랜덤 숫자 만들기 
//		int random = 0;
//		//random = (int)(Math.random()*10); //0에서 9까지의 숫자
//		//random = (int)(Math.random()*3)+1;  //1부터 3까지의 숫자가 출력 
//		random = (int)(Math.random()*5)+1;  //1부터 5까지의 숫자가 출력   
//		System.out.println(random);
	}

}
