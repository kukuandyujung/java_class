//package j0515;
//
//import java.util.Scanner;
//
//public class C0515_01 {
//
//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		// 배열 - 45개 만들기
//		int random = 0;
//		int temp = 0;
//		int count = 0; // 맞춘 번호 세기 
//		int[] myNum = new int [6]; //내가 입력한 개수  
//		int[] array = new int[45]; //로또 번호 
//		int[] lottoNum = new int [6]; //로또 맞춘 개수 
//
//		for(int i =0 ; i <45 ; i++) {
//		   array[i] = i +1;
//
//		}//for
//		
//		for(int i = 0; i< 1000; i++) {
//			random = (int)(Math.random()*45);
//			temp = array[0];
//			array[0] = array[random];
//			array[random] = temp; 
//  			
//		}//for 
//		
//		for(int i = 0 ;i < myNum.length ; i++ ) {
//			System.out.println((i+1)+ "번째 번호를 입력하세요.");
//			myNum[i] = scan.nextInt();
//		}
//		
//		//맞춘 개수
//		
//		
//		//개수 
//		for(int i =0 ; i < 6 ; i++) {
//			for(int j = 0 ; j < 6 ; j ++) {
//				if (array[i] == myNum[j] ) {
//					lottoNum[count] = array[i];
//					count ++;
//					continue;
//	
//		
//		//로또 번호 출력 
////		System.out.println("6개 당첨 로또 번호 :");
////		//for(int i = 0 ; i < 6 ; i++) {
////			System.out.println(array[i] + "\t");
////		}
////		System.out.println();
////		
////		//내가 입력한 번호 
////		System.out.println("내가 입력한 6개 로또 번호 :");
////		//for(int i = 0 ; i < 6 ; i ++) {
////			System.out.println(myNum[i] +  "\t");
////		}
////		System.out.println();
////		
////		
////		//로또 번호 출력 
////		System.out.println("맞춘 로또의 개수  :");
////		//for(int i = 0 ; i < count ; i ++) {
////			System.out.print(lottoNum[i] + "\t");
////		}
////		System.out.println();
////		
////		System.out.println("맞춘 개수 : " + count);
//	
//		
//		
//	
//				
//		
//		
//	}//main
//
//}//class
//		}
