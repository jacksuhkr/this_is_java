package sec16.exercise04_shop_service;

public class ShopServiceExample {
	public static void main(String[] args) {
		ShopService obj1 = ShopService.getInst();
		ShopService obj2 = ShopService.getInst();
		
		if(obj1 == obj2) {
			System.out.println("���� ShopService ��ü �Դϴ�");
		} else {
			System.out.println("�ٸ� ShopService ��ü �Դϴ�");
		}
	}
}
