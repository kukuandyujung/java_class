package j0526;

import java.util.Arrays;

public class C0526_10 {

	public static void main(String[] args) {
		String data1 = "1001,혼길동,100,100,99";
		String[] result = data1.split(",");
		System.out.println(result[0]);
		System.out.println(result[1]);
		System.out.println(result[2]);
		System.out.println(result[3]);
		System.out.println(result[4]);
		//data1에 있는 String 문자열을 int로 변환  
		int stuNo = Integer.parseInt(result[0]); //int로 치환하는 것 
		String name = result[1];
		int kor = Integer.parseInt(result[2]);
		int eng = Integer.parseInt(result[3]);
		int math = Integer.parseInt(result[4]);
		//Double.parseDouble(result[2]); //100을 double로 바꿔줌 객체이기 때문에 D 이렇게 대문자로 사용한다. 
		Student s = new Student(stuNo, name, kor , eng, math);
		//total과 avg 구하기 
		System.out.println(s.getTotal());
		System.out.println(s.getAvg());
		
		String[] chk_info = new String[3];
		chk_info[0] = "HTML";
		chk_info[1] = "CSS";
		chk_info[2] = "webDesign"; 

		String info3= "";
		for(int i = 0 ; i <chk_info.length ; i++) {
			if(i==0) {
				info3 =info3 +chk_info[i];
			}else {
				info3 = info3 +"," + chk_info[i];
				
			}
		}
		System.out.println(info3);
		//String info1=  ""+ chk_info[0] + "," + chk_info[1] + "," +  chk_info[2];
		//String info2=   "HTML, CSS, webDesign"; 
	}//main
}//class