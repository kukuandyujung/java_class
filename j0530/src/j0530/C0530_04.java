package j0530;

public class C0530_04 {

	public static void main(String[] args) {
		String str = "abc";
		str =str +"1" ;
		str =str +"1" ;
		System.out.println(str);
		
		int a = 0;
		a = a+1 ;
		
		StringBuffer sb = new StringBuffer("abc");
		// sb =sb +1; 이거는 불가능 
		sb.append(1); //abc1 
		sb.append(1); 
		System.out.println(sb);
		

	}

}
