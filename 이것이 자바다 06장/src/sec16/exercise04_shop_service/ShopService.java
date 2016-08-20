package sec16.exercise04_shop_service;

public class ShopService {
	//작성 위치
	//정적 필드
	private static ShopService jaewook = new ShopService();
	
	//생성자 - 외부에서 호출불가
	private ShopService() {}
	
	//정적 메소드
	static ShopService getInst() {
		return jaewook;
	}
}
