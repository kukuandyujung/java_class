package j0515;

import java.util.Scanner;

public class C0515_08 {

	public static void main(String[] args) {
		// 5,5배열을 만들어서 해당 번호를 X표시하는 프로그램을 구현하시오. 
		
		//scan 
		Scanner scan = new Scanner(System.in);
		
		//5,5 배열을 만들기 
		//2차원을 위한 배열과 변수 설정 
		String[][] box = new String[5][5];
		int random = 0;
		int temp = 0;
		
		
		//1차원 배열을 만들기 
		//1번자리에서 25번자리까지 순차적으로 번호 넣기 
		int[] num =new int [25];
		for(int i = 0 ; i<num.length ; i ++) {
			num[i] = i+1;
		}
		
		
		//1차원 배열을 섞기 
		for(int i =0 ; i <100 ;i++ ) {
			random = (int)(Math.random()*25);
			temp = num[0];
			num[0]=num[random];
			num[random]= temp;
		}
		
		//중복 for문으로 2차원 배열에 숫자를 넣기 
		for(int i = 0 ;i <box.length ; i ++ ) {
			for(int j=0 ;j <box[i].length; j++) {
				box[i][j] = "" +num[5*i+j];			
			}//for
		}//for
		
		
	
	while(true) {
		//상단에 숫자 인덱스? 적어주기 
		System.out.print(" "+ "|\t");
		for(int i = 0 ; i <5 ; i++) {
			System.out.print(i+"\t");
		}
		System.out.println();
		System.out.println("-----------------------------------------");
		
		
		//화면 출력 
		for(int i = 0 ; i <box.length;i++) {
			System.out.print(i + "|\t");
			for(int j = 0 ; j<box[i].length;j++) {
				//box[i][j] = "" + num[5*i+j];
				System.out.print(box[i][j]+ "\t");
			}
			System.out.println();
		}
		
		//1~25까지 번호를 입력 
		System.out.println("1-25까지 번호를 입력하세요 >> ");
		int input = scan.nextInt();
		
		
		//해당 값에 대해 X표시를 해주기 
		loop:for(int i = 0 ; i < 5; i++) {
			for(int j = 0 ; j < 5 ; j ++) {
				if(box[i][j].equals(input+"")){
					box[i][j] = "x";
					break loop;
				}
			}
		}//출력 for
	}//while 
 
	}//main

}//class
