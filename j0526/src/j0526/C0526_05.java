package j0526;

public class C0526_05 {

	public static void main(String[] args) {
		String str1 = "디시인사이드 '우울증 갤러리'에서 만난 미성년자를 상대로 성범죄를 저지르고 폭행한 의혹을 받는 이른바 '신대방팸' 4명을 경찰이 소환 조사했습니다.\r\n"
				
				+ "이들은 대부분 혐의를 부인한 것으로 전해졌습니다.\r\n"
				
				+ "정래원 기자의 단독보도입니다.\r\n"
				
				+ "[기자]\r\n"
				
				+ "경찰은 폭행과 협박 혐의로 입건된 신대방팸 4명을 불러 조사를 마쳤습니다.\r\n"
				
				+ "이들은 가출 청소년을 집에 들여 폭행과 협박을 한 혐의를 받습니다.\r\n"
				
				+ "이들 중 한명에게는 미성년자 의제강간 혐의도 추가로 적용됐습니다.\r\n"
				
				+ "하지만 대부분 혐의를 부인하며 우울증 갤러리의 다른 이용자들에게 책임을 돌리고 있습니다.\r\n"
				
				+ "<신대방팸 멤버 A씨> \"실제로 마약을 하는 사람들이나, 실제로 미성년자들과 집에서 같이 생활하고 있는 사람들도 있고, 그런 사람들이 실제로 있다고 알고 있어요, 저는. 들은 바가 있어서. 지금 한 번에 저희가 엮여서 이렇게 우르르 됐는데, 저희는 직접적으로 그런 혐의를 받은 게 없어서…\"\r\n";
				
String str2 = "디시인사이드 '우울증 갤러리'에서 만난 미성년자를 상대로 성범죄를 저지르고 폭행한 의혹을 받는 이른바 '신대방팸' 4명을 경찰이 소환 조사했습니다.\r\n"

				+ "이들은 대부분 혐의를 부인한 것으로 전해졌습니다.\r\n"
				
				+ "정래원 기자의 단독보도입니다.\r\n"
				
				+ "[기자]\r\n"
				
				+ "경찰은 폭행과 협박 혐의로 입건된 신대방팸 4명을 불러 조사를 마쳤습니다.\r\n"
				
				+ "이들은 가출 청소년을 집에 들여 폭행과 협박을 한 혐의를 받습니다.\r\n"
				
				+ "이들 중 한명에게는 미성년자 의제강간 혐의도 추가로 적용됐습니다.\r\n"
				
				+ "하지만 대부분 혐의를 부인하며 우울증 갤러리의 다른 이용자들에게 책임을 돌리고 있습니다.\r\n"
				
				+ "<신대방팸 멤버 A씨> \"실제로 마약을 하는 사람들이나, 실제로 미성년자들과 집에서 같이 생활하고 있는 사람들도 있고, 그런 사람들이 실제로 있다고 알고 있어요, 저는. 들은 바가 있어서. 지금 한 번에 저희가 엮여서 이렇게 우르르 됐는데, 저희는 직접적으로 그런 혐의를 받은 게 없어서,…\"\r\n";
				
if(str1.equals(str2)) {
	System.out.println("같");
}else {
	System.out.println("다");
}

System.out.println("hashcode str1 : " + str1.hashCode());
System.out.println("hashcode str2 : " + str2.hashCode());
	}

}