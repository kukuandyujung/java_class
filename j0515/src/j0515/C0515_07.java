package j0515;

import java.util.Scanner;

public class C0515_07 {

	public static void main(String[] args) {
		
		//scan 
		Scanner scan = new Scanner(System.in);
		
		// 5,5배열을 만들기 	
		//2차원 
		String[][] box = new String[5][5];   
		int random = 0;
		int temp = 0;
//		//1차원 배열에 숫자 넣기 
//		int[] num = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20, 21,22, 23,24,25};
		
		//1-25번 순차적으로 번호 넣기 
	    int[] num = new int [25] ;
		for(int i = 0 ; i <25; i++) {
			num[i] = i+1; //3의 배수의 경우  3을 곱해수면 된다. 3i //
		}
		
		//배열 섞기
		for(int i = 0 ; i < 100 ; i++) {
			random = (int)(Math.random()*25);
			temp = num[0];
			num[0] = num[random];
			num[random] = temp;
		}
		
		//2차원 배열에 숫자 넣기 
		for(int i = 0 ; i<box.length; i++) {
			for(int j = 0 ; j<box[i].length; j++) {
				box[i][j] = "" + num[5*i+j]; //String 타입으로 넣으려면 "" + int; 
				//num[0,1,2,3,4,5];
				//box[0][0] =num[0];
				
			}//for2차원
		}//for2차원  
while(true) {
	
	System.out.print(" "+"|\t");
	for(int i = 0 ; i <5 ; i ++) {
		System.out.print(i+"\t");
	}
	System.out.println();
	System.out.println("--------------------------------------------------");
	
	//화면 출력 
	for(int i = 0 ; i<box.length; i++) {
		System.out.print(i+"|\t");
		for(int j = 0 ; j<box[i].length; j++) {
			box[i][j] = "" + num[5*i+j]; //String 타입으로 넣으려면 "" + int; 
			System.out.print(box[i][j]+ "\t");
		}
		System.out.println();
	}
	
	//1~25까지 번호를 입력 
	System.out.println("1-25까지 번호를 입력하세요 >> ");
	int input = scan.nextInt();
	//해당 값을 찾기 
	for(int i = 0 ; i < 5 ; i ++) {
		for(int j = 0 ; j < 5 ; j ++) {
			if(box[i][j].equals(input+"")) {
			    box[i][j] = "x";
			    continue;
			}
			
		}
	}
	
	
	
	//좌표입력 
//	System.out.println("X좌표를 입력하세요 >>(0-4까지)");
//	int no1 = scan.nextInt();
//	System.out.println("Y좌표를 입력하세요 >>(0-4까지)");
//	int no2 = scan.nextInt();
//	
//	box[no1][no2] = "X";
	
//	System.out.println("좌표를 입력하세요 >>");
//	String input = scan.next(); //12
//	int no1 = '4' - '0'; //char - '0' = int
//	int no2 = '1' - '0'; //1
	
	
	
	}//While
		//상단 번호 출력 
		
		
		
	}//main

}//class
