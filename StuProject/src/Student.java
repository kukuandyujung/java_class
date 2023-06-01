
public class Student {
	
	private int stuNO;
	private String name; 
	private int kor;
	private int eng;
	private int math;
	private int total;
	private double avg;
	private int rank;
	private String createDate;
	private String updateDate;
	
	
	Student(){}
	Student(int stuNo, String name, int kor, int eng, int math, String CreateDate){
		this.stuNO = stuNo; //this 앞 학번은 인스턴스 변수, 뒤에 있는 학번은 지역변수이다. 
		this.name = name;
		this.kor =kor;
		this.eng = eng;
		this.math = math;
		this.total = total;
		this.avg = avg;
		this.createDate =createDate;
	}
	}


