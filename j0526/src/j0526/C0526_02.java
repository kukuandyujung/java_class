package j0526;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class C0526_02 {
	public static void main(String[] args) {
//		File dir = new File("c:/bbb/"); 
//		dir.mkdir(); //폴더를 생성하는 메소드 
//		System.out.println("폴더를 생성");
//		
//		
//		File f = new File("c:/bbb/test.txt");
//			try {
//				f.createNewFile();
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//
//		System.out.println("파일이 생성되었습니다.");
		FileWriter fw = null;
		String str = "";

		try {
			
			fw = new FileWriter("c:/bbb/test.txt");
			for(int i = 0 ; i < 10 ; i++) {
				str = str + "글자를 저장. \r\n";
			    fw.write(str); //글자를 저장하는 메소드
			    fw.flush();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				fw.close();
				}catch (IOException e) {
					e.printStackTrace();
				}
		}
		
		System.out.println("글자가 저장되었습니다.");
//		
		
		
	}// main

}// class
