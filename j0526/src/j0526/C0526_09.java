package j0526;

import java.util.Arrays;
import java.util.Scanner;

public class C0526_09 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = "    aaa aaa aaa    ";
		String str2 ="bbb,bbb,bbb,bbb";
		System.out.println("현재 str :  " + str);
		System.out.println("------------------------");
		String result = str.trim(); //앞과 뒤 공백을 제거해주는 형태이다. 
		System.out.println("공백 제거 str :" + result);
		String result2 = str2.replace("bbb", "abc"); //내가 어떠한 문자를 어떠한 것으로 대체하겠다는 걸 도와줌 
		String result3 = str2.replace(",", " ");
		System.out.println("문자 변경 str2 : " + result2);
		System.out.println("사이 공백 str3 : " + result3);
		
		//str을 앞뒤 공백 사이공백 제거하기 
		String result4 = str.replace(" ", "");
		System.out.println("공백 제거 st4 :" + result4 );
		
		String[] result5 = str2.split(",");
		
		System.out.println(Arrays.toString(result5 ));
		System.out.println(result5 [0]);
		
	}

}
