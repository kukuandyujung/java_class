package j0510;

import java.util.Scanner;

public class C0510_04 {

	public static void main(String[] args) {
		
		//m, f를 입력받아 m이면 남자 f면 여자 
		char input = ' ';
		Scanner scan = new Scanner(System.in);
		System.out.println("성별을 나타내는 알파벳을 입력");
		input = scan.next().charAt(0);
		switch(input) {
		case 'm':
		case 'M':
			System.out.println("남자");
			break;
		case 'f' : case 'F' :	
		    System.out.println("여자");
		    break;
		default:
			System.out.println("다시");
		}
		
		
		
		
//		int input = 0;
//		Scanner scan = new Scanner(System.in);
//		System.out.println("숫자를 입력");
//		input = scan.nextInt();
//		
//		//switch()
//		switch(input) {
//		
//		case 1:
//			System.out.println("1");
//			break;
//		case 6:
//			System.out.println("6");
//			break;
//		case 9:
//			System.out.println("9");
//			break;
//		default:
//			System.out.println("원하는 숫자가 아님");
//			break;
//		}//switch()
//		
		
//		// if, else if, else 
//		int n = 0;
//		Scanner scan=new Scanner(System.in);
//		
//		System.out.println("숫자를 1,6,9 중에 입력하세요 ");
//		n= scan.nextInt();
//		
//		if(n ==1) {
//		  System.out.println("1");
//			
//		}
//		else if(n== 6) {
//		  System.out.println("6");
//		}
//		else{
//		  System.out.println("9");
//		}
		
	}

}
