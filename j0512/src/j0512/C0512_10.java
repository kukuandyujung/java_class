package j0512;

import java.util.Arrays;
import java.util.Collections;

public class C0512_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer [] arr = {1,11,13,23,45,2,3,9,5};      //int는 기본형 타입인 반면, Integer 객체 타입이다.  
		//Arrays.sort(arr); //오름차순 정렬 
		//컬랙션을 정리할 때 정렬하는 식으로 ?
		//Arrays.sort(arr, Collections.reverseOrder()); //내림차순 정렬 알지 않아도 된다. 
		//단순 for문 
		for(int i : arr) { //단순 for문은 배열만 가능하다. 
			System.out.print(i+" ");
		}

	}

}
