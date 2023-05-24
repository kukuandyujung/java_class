package j0524;

public class C0524_01 {

	public static void main(String[] args) {
		
		//Singleton ss =new Singleton(); //privte으로 제어한 경우에는 이렇게 찾을 수 없다. 
		//따라서 getinstance로 찾아봐야 한다.
		
		Singleton ss = Singleton.getInstance();
		
		
		System.out.println(Singleton.getNum()); 
		

	}

}
