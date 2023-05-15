package j0515;

public class C0515_04 {

	public static void main(String[] args) {
		// 2차원 배열 
		// [4][3] 배열을 만들기 
		int[][] box = new int[4][3]; //세로가 4 가로가 3 
		for(int i = 0 ; i <4 ; i++) {
			for(int j =0 ; j <3 ; j++){
				// 3i + (j+1)
				box[i][j] = (3*i)+(j+1); 
			}
		}

		
		//위 타이틀 0 1 2이 출력 
		System.out.print(" |\t");
		for(int i = 0 ; i <3 ; i++) {
			System.out.print(i+ "\t");
		}
		System.out.println();
		System.out.println("------------------------------");
		
		
		//번호 출력 
		for(int i = 0 ; i <4 ; i++) {
			System.out.print(i+ "|\t");
			for(int j =0 ; j <3 ; j++) {
				System.out.print(box[i][j] + "\t");
				
			}
		System.out.println();
		}
		System.out.println("------------------------------");
	}

}
