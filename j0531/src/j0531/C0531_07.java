package j0531;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class C0531_07 {

	public static void main(String[] args){
		List<Student> list = new ArrayList<>();
		list.add(new Student(1,"홍길동",100,100,99));
		list.add(new Student(2,"유관순",100,100,99));
		list.add(new Student(3,"이순신",100,100,99));
		
//		System.out.printf("%d, %s, %d, %d, %d", list.get(0).getStuNo() , list.get(0).getName(),
//				list.get(0).getKor(), list.get(0).getEng(), list.get(0).getMath()
//				);
		//파일 저장 
		String data = "";
		for(int i = 0 ; i <list.size(); i++) {
			data += String.format("%d, %s, %d, %d, %d\r\n", 
					list.get(i).getStuNo() ,list.get(i).getName().trim(),
					list.get(i).getKor(), list.get(i).getEng(), list.get(i).getMath()
					); //자기 자신에게 계속 더해주기 
			
		}
		
		//String.format: ","%d, %s, %d, %d, %d\r\n", 이 형태로 스트링을 만들어줘 라는 뜻 
		
	//	"" + list.get(0).getStuNo();
		
		System.out.println(data);
		
		//String data = "1,홍길동,100,100,99\r\n2,유관순,99,99,98\r\n3,이순신,88,88,87\r\n";
		FileWriter fw =null;
		try {
			fw = new FileWriter("c:/savedata/student.txt");
			fw.write(data);
			System.out.println("-------");
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				fw.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
		System.out.println("파일이 저장되었어여");
		
		
		
		
//		//student.txt 파일 읽어오기 
//		BufferedReader br = null;
//			br = new BufferedReader(new FileReader("c:/savedata/news.txt"));
//					String data = "";
//					while(true) {
//						br.readLine();
//						if(data== null) break;
//						System.out.println(data);
//		}
//				br.close();
//		
//			System.out.println("파일 읽어오기 완.");
		
		
		
	}//main

}//class
