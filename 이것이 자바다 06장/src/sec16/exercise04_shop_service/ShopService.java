package sec16.exercise04_shop_service;

public class ShopService {
	//�ۼ� ��ġ
	//���� �ʵ�
	private static ShopService jaewook = new ShopService();
	
	//������ - �ܺο��� ȣ��Ұ�
	private ShopService() {}
	
	//���� �޼ҵ�
	static ShopService getInst() {
		return jaewook;
	}
}
