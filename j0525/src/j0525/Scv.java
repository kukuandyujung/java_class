package j0525;
//기계를 수리하는 능력 
public class Scv extends GroundUnit implements Repairable{

	Scv() {
		super(60);
		hitPoint = MAX_HP;

	}

	void repair(GroundUnit g) {		
	//Repairable g == new Tank(); //다형성 
	//임의로 
		//Tank t = (Tank)g;
		while(g.hitPoint != g.MAX_HP) {
			g.hitPoint++; 
			//맥스만큼 히트가 없으면 맥스만큼 채워라! 라는 뜻 
			
		}
		System.out.println("수리가 완료되었습니다.");
	}
}
