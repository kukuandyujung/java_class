package j0531;

import java.util.List;

public class C0531_08 {

	public static void main(String[] args) {
		//객선
		DataClass d = new DataClass();
		int num1 = 10;
		int num2 = 5;
		d.numAdd(num1, num2);
		//DataClass에서 sum 오는 것이 아니라 15가 오는 것이기 때문에 새로운 변수 선언이 필요하다. 
		int sum = d.numAdd(num1, num2);
		System.out.println(sum*2);
		
		int kor = 100;
		int eng = 100;
		int math =99;
		
		
		Student s = d.stuAdd(kor, eng, math); //호출해주기 
		System.out.println("합계" + s.getTotal());
		
		//d.stuList();
		
		List<Student>  list = d.stuList();	
		for(int i = 0 ; i < list.size(); i++) {
			System.out.printf("%d %s \n", list.get(i).getStuNo(), list.get(i).getName());	
			
		}
		
		
	}

}
