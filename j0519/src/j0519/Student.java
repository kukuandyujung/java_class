package j0519;

public class Student {

	//기본 생성자 
	Student() {}
	Student(String n, int k, int e,int m){
		name = n;
		kor = k;
		eng = e;
		math = m;
		total = k+ e+ m;
		avg = total / 3.0;
	}
	
	static String[] title = {"이름", "국어","영어","수학","합계", "평균", "등수"};
	String name;
	int kor;
	int eng;
	int math;
	int total;
	double avg;
	int rank;
	
	void sum() { 
		// kor =100; 여기는 static이 아니기 때문에 인스턴스 변수 들어올 수 있다. 
		total = kor + eng + math;
	}
	void average() {
		avg = total /3.0;
	}
}
