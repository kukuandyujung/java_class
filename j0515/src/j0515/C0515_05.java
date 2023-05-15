package j0515;

public class C0515_05 {

	public static void main(String[] args) {
		// 2차원 배열 
		// [5][4] 1-20까지 
		int[][] box = new int[5][4];
		int[] num = new int[20];
		int temp = 0;
		int random =0;
		for(int i = 0 ; i < 20 ; i++) {
			if (i <16 ) {
				num[i] = 0;
			}else {
				num[i]= 1;
			}
		}
		
		
		//1차원 배열 
		for(int i = 0 ; i < 100 ; i++) {
			random = (int)(Math.random()*20);
			temp = num[0];
			num[0]= num[random];
			num[random] =temp;
		}
		
		//1차원 배열의 값을 2차원 배열에 넣기 
		for(int i = 0 ; i < 5 ; i++) {
			for(int j=0 ;j < 4; j ++) {
				box[i][j] = (4*i)+j; //0-19
				//box[i][j] = num[4*i+j]; //위 결과와 같은 결과가 나온다
//				if (i != 4 ) {
//					box[i][j]= 0;
//				}else {
//					box[i][j]= 1;
//				}
			}//for
		}//for 
		

		
		//상단 번호 위 타이틀 0,1,2 출력 
		System.out.print("   |\t");
		for(int i = 0 ; i < 4; i++) {
			System.out.print(i+"\t");
		}
		System.out.println();
		System.out.println("--------------------------------------------");
		
		//번호 출력 
		for(int i = 0 ;i <5; i ++) {
			System.out.print(i+ "  |\t");
			for(int  j=0 ;j<4; j++) {
				System.out.print(box[i][j] + "  \t");
			}
			System.out.println();
		}
	System.out.println("-------------------------------------------");

	}//main

}//class
