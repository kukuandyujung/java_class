package j0516;

public class Student {


	String name = "";
	int kor=0;
	int eng=0;
	int math=0;
	int total=0;
	double avg=0;
	int rank=0;
	
	void sum() {
		total = kor+eng+math;
	}
	void avg() {
		avg = total / 3.0;
	}
//	String name = "";
//	String name2 = "";
//	String[] arrName = new String[5];
//	int kor=0, kor2=0;
//	int[] arrKor = new int[5];
//	name ="유정킴";
//	kor=100;
//	name2 ="꾸꾸킴";
//	kor2=10;
//	
//Student s1 = new Student(); //유정킴  //s1 이것을 객체라고 한다.
//Student s2 = new Student(); //꾸꾸킴
////클래스(붕어빵 기계)는 하나 객체(붕어빵)는 여러 개 

}
