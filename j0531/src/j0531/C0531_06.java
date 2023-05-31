package j0531;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class C0531_06 {

	public static void main(String[] args) {
		
		
		//파일 읽어오기 시작 
		//BufferesReader - student.txt 로 읽어와서  
		//출력 
		
		//1) 한 줄씩 읽어오는 BufferedReader를 사용하기 
		//2) while 루프를 이용하여 파일의 끝에 도달할 때까지 반복하도록 하기 
		//3) BufferedReader로 읽은 데이터는 data변수에 저장이 된다. 
		//4) data 변수가 null값인 경우 파일의 끝에 도달했기에 break를 사용하여 루프 종료 
		//5) data 변수가 null이 아닌 경우, 해당 줄의 내용을 출력합니다.
		//6) 파일의 끝에 도달할 때까지 위의 과정을 반복합니다.
		//7) 파일 읽기나 예외 처리 과정에서 오류가 발생하면, 해당 오류를 출력합니다.
     	//8) finally 블록에서 BufferedReader를 닫습니다.
		//9) 프로그램 실행 시 "c:/savedata/student.txt" 파일에 저장된 내용이 한 줄씩 출력됩니다.
		

		
		int stuNo = 0;
		String name = "";
		int kor=0, eng=0, math=0; 
		List<Student> list = new ArrayList<>();
		
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader("c:/savedata/student.txt"));
			String data ="";
			while(true) {
				data = br.readLine();  
				if(data == null) break;
				String[] dataArr = data.split(","); //이렇게 하면 data가 따로 따로 나눠진다. 				
				//String data = br.readLine(); //data = "1, 홍길동, 100, 100, 99"; 이렇게 한 묶음으로 인정된다. 
				System.out.println(data);
				System.out.println(Integer.parseInt(dataArr[0])); //객체인 것을 객체 아닌 것에 넣으려고 하니깐 이렇게 길어진다. 
				stuNo =Integer.parseInt(dataArr[0]);
				name = dataArr[1];
				kor = Integer.parseInt(dataArr[2]);
				eng = Integer.parseInt(dataArr[3]);
				math = Integer.parseInt(dataArr[4]);
				
				list.add(new Student(stuNo, name, kor, eng, math)); //Student 객체에 넣기 
				
				
				
//				//Integer로 바꾸고 int로 파싱? 해라 아무튼 정수형으로 형 변환 
//				System.out.println(dataArr[1]);
//				System.out.println(Integer.parseInt(dataArr[2]));
//				System.out.println(Integer.parseInt(dataArr[3]));
//				System.out.println(Integer.parseInt(dataArr[4]));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				
			} catch (Exception e2) {
				e2.printStackTrace();

			}
		}//bf
		
		//파일 읽어고기 end
		System.out.println();

	}//main

}//class
