package sec07.exam02_promotion_member_access;

public class ChildExample {
	public static void main(String[] args) {
		Child child = new Child();
		
	// ��ġ int a = b, b�� double
		Parent parent = child;
		parent.method1();
		parent.method2();		//override�Ȱ� ��µ�
		//parent.method3(); 	//ȣ�� �Ұ���
	}
}
