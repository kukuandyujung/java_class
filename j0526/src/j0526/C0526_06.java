package j0526;

public class C0526_06 {

	public static void main(String[] args) {
		int sum =0;
		String str = "";
		for(int i = 0 ; i < 10 ; i ++) {
			sum = sum + i; //이것만 돌리면 sum이라는 공간 하나에서만 계속 돌려준다. 
			str = str + i; //str공간이 새롭게 계속 생긴다. 0x1 , 0x2, ....0x10이렇게 공간이 계속 생긴다.
			//즉 안 좋음 
		}

	}

}
