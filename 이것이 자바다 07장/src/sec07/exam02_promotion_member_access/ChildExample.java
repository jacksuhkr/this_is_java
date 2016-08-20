package sec07.exam02_promotion_member_access;

public class ChildExample {
	public static void main(String[] args) {
		Child child = new Child();
		
	// 마치 int a = b, b는 double
		Parent parent = child;
		parent.method1();
		parent.method2();		//override된게 출력됨
		//parent.method3(); 	//호출 불가능
	}
}
