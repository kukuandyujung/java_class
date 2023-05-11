package j0511;

public class C0511_07 {

	public static void main(String[] args) {
		
		
		
		//10개의 배열을  만들고 랜덤숫자 1-10까지 숫자를 출력 
		int[] num = new int [10]; //저장할 수 있는 공간을 만든 것이다. 
		
		for(int i =0;i<10;i++) {
			int random = (int)(Math.random()*10)+1;
			num[i] = random;
			System.out.println(num[i]);
		}
		
		
		
		
//		//배열 100개를 만들고 1-100까지 숫자를 입력 
	//	int[] num = new int [100];
		//for(int i =0;i<100;i++) {
			//num[i] = i + 1;
			//System.out.println(num[i]);
		//}
		
		
		
		
//		// int 배열하기
//				int[] num = new int[5];
//				num[0]= 1;
//				num[1]= 2;
//				num[2]= 3;
//				num[3]= 4;
//				num[4]= 5;
//				
//				for(int i=0 ; i<num.length ; i++) {
//					System.out.println(num[i]);
		
//		// int 배열하기
//		int[] num = new int[5];
//		num[0]= 1;
//		num[1]= 2;
//		num[2]= 3;
//		num[3]= 4;
//		num[4]= 5;
//		
//		for(int i=0 ; i<5 ; i++) {
//			System.out.println(num[i]);}
		}

	}


