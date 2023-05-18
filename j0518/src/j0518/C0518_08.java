package j0518;

import java.util.Scanner;

public class C0518_08 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 로또 맞추기 
		//변수 설정하기 
		int random = 0;
		int count = 0;
		int temp =0;
		//1 배열 선언
		int[] myNum = new int[6]; //내가 입력한 숫자 
		int[] lottocre = new int[45]; // 당첨 돌려서 나온 6가지 
		int[] lottoNum = new int[6]; //내가 맞춘 숫자 
		
		
		//2. 1~45까지 숫자를입력
		for(int i =0; i<lottocre.length;i++) {
		 	lottocre[i] = i+1;
		}
		
		//3. 45번까지의 숫자를 1000번 섞기 
		for(int i = 0 ; i < 1000 ; i++) {
			random = (int)(Math.random()*45);
			temp = lottocre[0];
			lottocre[0] = lottocre[random];
			lottocre[random] =temp;
		} 
		//4. 6가지의 숫자를 내가 입력하기 
		for(int i = 0 ;i<6; i++) {
			System.out.println((i+1)+ "번째 숫자를 입력하세요");
			myNum[i] = scan.nextInt();		 
		}
		
		//5. 내가 적은 숫자와 당첨 숫자가 같은 지 확인하기 
		for(int i = 0 ; i < 6 ; i++) {
			for(int j = 0 ;j < 6 ; j++) {
				if(lottocre[i]==myNum[j]) {
					lottoNum[count] = lottocre[i];
					count++;
				}	
			}
		}
		// ------------출력---------------
		//6. 램덤 숫자 출력하기 
		System.out.print("당첨 숫자 :" );
		for(int i =0 ;i < 6; i++) {
			System.out.println(lottocre[i]+ " ");
		}
		System.out.println();
		//7. 내가 적은 숫자 출력 myNum
		System.out.println("내가 적은 숫자 :" );
        for(int i =0 ;i < 6; i++) {
        	System.out.println(myNum[i]+ " ");
		}
        System.out.println();
		//8. 맞춘 숫자의 개수를 쓰기  
        System.out.print("맞춘 당첨 번호");
        for(int i = 0 ;i<count;i++) {
        	System.out.println(lottoNum[i] + " ");
        	
        }
        System.out.println();
		//9. 당첨된 숫자 나타내기 
        System.out.println("당첨된 개수 :" + count);
	}

}
