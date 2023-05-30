package j0530;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;

public class C0530_06 {

	public static void main(String[] args) {
		ArrayList list =  new ArrayList(); 
		//ArrayList() 여기 숫자를 넣으면 공간이 채워지는 데 넘어가면 오류나는 것이 아니라 두 배로 증가한다. 즉, 배열을 추가적으로 만든다. 
		list.add(1); //0
		list.add(2); //1
		list.add(3); //2
		list.add(4); //3
		list.add(5); //4
		list.add(6); //5
		list.add(7); //6
		System.out.println("지우기 전: " + list.size());
		
		//Iterator 사용 - 예전 버전은 Enumeration 이다. 
		
		Iterator it= list.iterator(); //컬렉션을 읽어오는 객체 
		while(it.hasNext()) { //it.hasNext() 일단 들고 왔는데 그 안에 데이터가 들어있는 지 확인하는 과정. 꼭 해야한다. 
			System.out.println(it.next()); //1개의 데이터를 가져온다. //야 데이터 있어? 가지고 와. 이걸 반복 
		}
		
		//Iterator의 경우는 선언을 2번 해야 2번 출력이 가능하다. for문처럼 계속 복붙해서 한다고 출력이 더 나오지 않는다. 
		
		
		
		//for문 사용
//		list.remove(3); //이렇게 지우면 전체 순서가 바뀐다.
//		list.remove(3); 
//		list.remove(3); 
//		list.remove(3); 
//		System.out.println("지우기 전: " + list.size());
//		for(int i = list.size()-1 ; i >= 0; i--) {
//			list.remove(i);
//			
//		}//for
//		System.out.println("지우기 후: "+ list.size());
//		
//		for(int i = 0 ; i < list.size() ; i++) {
//			System.out.println(list.get(i));
//			
//		}//for
		

	}//main

}//class
