package j0509;

import java.util.Scanner;

public class j0509_03 {

	public static void main(String[] args) {
		double kor =0;
		int eng =90;
		int math =100;
		String name = "김유정";
		//데이터 입력 
		Scanner scan1 = new Scanner(System.in); //Scanner(객체) - 이 스캔을 콘솔창에서 입력 받겠다는 뜻  
		//String str = new String ("aaa"); //스트링만 이렇게 new형식을 갖추지 않고 아래처럼 가능하다.  
		//String str2= "aaa";
		System.out.println("이름을 입력하시오." );
		name = scan1.next(); // 너무 좋아요 함께 합시다 이런거 불가 
		//name = scan1.nextLine(); // 너무 좋아요 함께 합시다 등 다 가능 
		System.out.println("국어 점수를 입력하시오." );
		kor = scan1.nextDouble(); //()가 있으면 메소드(함수)
		
		System.out.println("영어 점수를 입력하시오." );
		eng = scan1.nextInt(); //()가 있으면 메소드(함수)
		
		System.out.println("수학 점수를 입력하시오." );
		math = scan1.nextInt(); //()가 있으면 메소드(함수)
		double total =kor +eng+ math;
		double avg = total/3.0; 
			
	
	    System.out.println("이름 \t 국어 \t 영어 \t 수학 \t 합계 \t 평균 ");
	    System.out.println("---------------------------------------------------");
	    //System.out.printf("%.1f \t%d \t%d \n", kor ,eng ,math);
	    //System.out.println("---------------------------------------------------");
	    System.out.printf("%s\t %.1f\t %d\t %d\t %.2f\t %.2f \n", name, kor ,eng ,math, total, avg);
	    System.out.println("---------------------------------------------------");
}
}
