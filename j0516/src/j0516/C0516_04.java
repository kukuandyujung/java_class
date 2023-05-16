package j0516;

public class C0516_04 {

	public static void main(String[] args) {
		Student s1 = new Student(); // 이 밑 친구를 한 번에 해줌   
		s1.name = "김꾸꾸";
		s1.kor = 100;
		s1.eng = 100;
		s1.math = 99;
		s1.sum();
		s1.avg();
		
		//System.out.println(s1.avg);
		
		Student s2 = new Student(); // 이 밑 친구를 한 번에 해줌   
		s2.name = "꾸꾸";
		s2.kor = 10;
		s2.eng = 10;
		s2.math = 9;
		s2.sum();
		s2.avg();
		
//		String name = "";
//		int kor=0;
//		int eng=0;
//		int math=0;
//		int total=0;
//		double avg=0;
//		int rank=0;
//		
//		
//		//Scanner scan =new Scanner(System.in);
//		name="김꾸꾸";
//		kor = 100;
//		eng =100;
//		math= 99;
//		total= kor +eng +math ;
//		avg= total / 3.0;

	}

}
