package shopMall;

public class Tv extends Product {
	
	int inch =70;
	String color = "black";
	
	Tv(){//생성자
		productName = "QLED";
		price = 150;
		bonusPoint =15;
		sale =10;
		item = "tv";
	
//	public String toString() {
//		return "구매목록 : " + productName;
//	}
	
	}
}
