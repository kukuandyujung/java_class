package j0526;

import java.util.Scanner;

public class C0526_07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("찾고자 하는 문자를 입력하세요");
		String search = scan.next();
		String str1 = "김유정 김유김 김유나 김유더 김유 김율 홍유 지나 ";
		String str2 = "https://semiconductor.samsung.com/kr/dram/ddr.jsp";
		String str3 = "https://semiconductor.samsung.com/kr/foundry/process-technology.jsp";
		
		if(str2.endsWith(search)) {
			System.out.println("jsp로 끝남");
		} else {
			System.out.println("jsp로 끝나지 않음");
		}
				
		// contains() - 문자열 내에 문자가 있는 지 확인

//		if (str1.contains(search)) {
//			
//			System.out.println(search + " 존재");
//		}else {
//			System.out.println(search + " 없");
//		
//		}//if 

	}// main

}// class
