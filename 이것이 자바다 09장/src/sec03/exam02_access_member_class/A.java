package sec03.exam02_access_member_class;

public class A {
	int field1;
	void method1() {}
	
	static int field2;
	static void method2() {}
	
	class B {
		void method() {
			field1 = 10;
			method1();
			
			field2 = 10;
			method2();
		}
	}
	
	static class C {
		void method() {
			//field1 = 10;		//���� ��� Ŭ�������� �ν��Ͻ� �ʵ�� ���� �Ұ�
			//method1();		//���� ��� Ŭ�������� �ν��Ͻ� �޼ҵ�� ���� �Ұ�
			
			field2 = 10;
			method2();
		}
	}
}
