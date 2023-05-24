package j0524;

public class C0524_02 {

	public static void main(String[] args) {

		// 객체선언
		CaptionTv c = new CaptionTv();
		c.channelUp();
		System.out.println(c.channel);
		c.caption();
		// 다형성
		Tv t = new CaptionTv();
		t.channelUp();
		System.out.println(t.channel);
		//t.caption(); //이건 되지 않는다. 공간은 존재하지만, t에는 메소드가 없어서 사용할 수 없다. 
		
		
		
		
		Tv t2 = new Tv();
		t2.channelUp();
		System.out.println(t2.channel); //1
		
//		CaptionTv c2 = null;
//		t2 = c; //이건 가능하다, 부모는 자손에 있는 것을 받을 수 있다.  
//		//하지만
//		//c = t2; //이건 불가능 
//		//하지만  
//		c = (CaptionTv)t2; //강제형변환을 해주면 가능하다.

	}

}
