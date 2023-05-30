package j0530;

import java.util.Scanner;

public class C0530_02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] files = { "fifamobile", "asgard", "GODZILLADF", "csonline"};
		
		
		String domain ="https://forum.nexon.com";
		String url1 = "https://forum.nexon.com/asgard";

		String input = url1.substring(domain.length()+1);
		System.out.println("파일명: " + input);
		
		System.out.println("원하는 페이지를 호출");
		input = scan.next();
	
//		for(int i = 0 ; i < 4 ; i++) {
//			if(files[i].equals(input)) {
//				System.out.println( i + "배열에 있습니다.");
//			}//if
//			
//		}//for
	
//		if(input.equalsIgnoreCase(files[0])) {
//			System.out.println("fifamobile 페이지로 호출합니다.");
//		}else if(input.equalsIgnoreCase(files[1])) {
//			System.out.println("asgard 페이지로 호출합니다.");}
//		
//		else if(input.equalsIgnoreCase(files[2])) {
//				System.out.println("GODZILLADF 페이지로 호출합니다.");}
//		else if(input.equalsIgnoreCase(files[3])) {
//			System.out.println("csonline 페이지로 호출합니다.");
//		
//		}
			
			
		for(int i = 0 ; i < 4 ; i++) {
			if(input.equalsIgnoreCase(files[i])) {
				System.out.println(files[i]+" 페이지로 호출합니다.");
			}
		}
		
			
			
//		switch (input) {
//		case "fifamobile":
//		System.out.println("fifamobile 페이지로 열어줍니다.");
//		break;
//		
//		
//		case "asgard":
//			System.out.println("asgard 페이지로 열어줍니다.");
//			break;
//			
//		case "GodzillaDF":
//			System.out.println("GodzillaDF 페이지로 열어줍니다.");
//			break;
//		case "csonline":
//			System.out.println("csonline 페이지로 열어줍니다.");
//			break;
//		}//switch
	
	}//main

}//class

