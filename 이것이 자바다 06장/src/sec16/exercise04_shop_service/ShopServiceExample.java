package sec16.exercise04_shop_service;

public class ShopServiceExample {
	public static void main(String[] args) {
		ShopService obj1 = ShopService.getInst();
		ShopService obj2 = ShopService.getInst();
		
		if(obj1 == obj2) {
			System.out.println("같은 ShopService 객체 입니다");
		} else {
			System.out.println("다른 ShopService 객체 입니다");
		}
	}
}
