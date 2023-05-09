package j0509;

import java.util.Scanner;

public class j0509_04 {

	public static void main(String[] args) {
		// 아이디(문자), 패스워드(정수형), 이름(문자)을 입력하세요 
		//1. 변수선언
		String id = "";
		int password = 0;
		String name = "";
		
		
		//2. Scanner 입력클래스
		Scanner scan = new Scanner(System.in);  //Scanner하고 컨드롤 스페이스 
		System.out.printf("아이디를 입력하시오." );
		id = scan.next(); 
		System.out.printf("패스워드를 입력하시오." );
		password = scan.nextInt(); 
		System.out.printf("이름을 입력하시오." );
		name = scan.next(); 
	    //next() - 문자만 입력 받음 (엔터키 영향을 받지 않는다. + 스페이스바를 받지 않아서 띄어쓰기 뒤로 출력 불가)  
		//nextLine() - 엔터 영향을 받는다. (띄어쓰기든 모든 그 자체를 그대로 프린트 해준다. + 하지만 엔터키를 뱉는 것에 영향을 받음) 
		//nextLine() 을 오류없이 쓰고싶은 경우 
		//System.out.printf("패스워드를 입력하시오." );
		//password = scan.nextInt(); 
		//scan.nextLine()  //*****이렇게 고정해준다 *****
		//System.out.printf("이름을 입력하시오." );
		//name = scan.nextLine();
		
		//3. 출력
		System.out.println("아이디 \t\t 패스워드 \t 이름");
		System.out.printf("%s \t %d \t %s\t \n", id, password, name);
		
		
		
	
		
}
}
