package j0519;

public class C0519_06 {

	public static void main(String[] args) {
	
		String  no = "1"; 
		String title ="홈페이지를 오픈.";
		String date = "2023-05-19";
		String name = "김유정";
		
		//객체선언 
		Board b =new Board(); //생성자를 호출 
		String[] saveBoard = b.save(no, title, date, name);
		
		for(int i = 0 ; i < saveBoard.length ; i++){
			System.out.println(saveBoard[i]+ " ");
		}
		System.out.println();

	}//main 

}//class
