package j0525;

public class C0525_04 {

	public static void main(String[] args) {
		
		Tank t1 = new Tank();
		Marine m1 = new Marine();
		Tank t2 = new Tank();
		Marine m2 = new Marine();
		Scv s1 = new Scv();
		vulture v1 =new vulture();
		
		t1.hitPoint -= 10; //총 데미지 
		t1.hitPoint -= 10; 
		System.out.println("현재 체력:" + t1.hitPoint);
		s1.repair(t1); 
		System.out.println("수리 완료 후 체력" +t1.hitPoint);
		
		v1.hitPoint -= 10;
		v1.hitPoint -= 10;
		System.out.println("현재 체력:" + v1.hitPoint);
		s1.repair(v1); 
		//System.out.println("수리 완료 후 체력" +t1.hitPoint);
		
		
		
		

	}

}
