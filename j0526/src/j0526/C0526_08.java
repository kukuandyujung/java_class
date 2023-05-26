package j0526;

import java.util.Scanner;

public class C0526_08 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int count = 0; //찾는 문자의 개수 
		int searchNum = -1; //찾는 문자의 위치
		String str = "안녕하세요. 반가워요. 좋은 하루 되세요. 눈누누나나나. 오늘은 불금 완죤 신나. "; 
		System.out.println("찾고자 하는 문자를 입력");
		String search = scan.next();
		
		while(true) {
			searchNum = str.indexOf(search, searchNum +1 ); //찾는 위치의 메소드 
			if(searchNum  !=-1) {
				System.out.println("찾는 위치 : " + searchNum );
				count++;
			}else {
				System.out.println("찾는 문자가 없습니다.");
				break;
			}
		}//while
		System.out.println("총 찾은 문자의 개수 : " + count);
		System.out.println("찾는 문자가 더 이상 없습니다.");
		
		
		
//		for(int i = 0 ; i < str.length();i++) {
//			searchNum = str.indexOf(search, i);
//			if(searchNum !=-1) {
//				count++;			
//		}else{
//		System.out.println(("찾는 문자가 없습니다.")); }		
//		}
//		System.out.println("찾는 위치 : " + searchNum + "같은 단어가 나오는 수" + count);
		
	}//

}
