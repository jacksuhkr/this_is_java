package sec02.exam01_nested_class;

public class A {
	A() { System.out.println("A ��ü�� ������"); }
	
	/*�ν��Ͻ� ��� Ŭ����*/
	class B {
		B() { System.out.println("B ��ü�� ������"); }
		int field1;
		//static int field2;		//���� �ʵ� ���� �Ұ�
		void method1() {}
		//static void method2();	//���� �޼ҵ� ���� �Ұ�
	}
	
	/*���� ��� Ŭ����*/
	static class C {
		C() { System.out.println("C ��ü�� ������"); }
		int field1;
		static int field2;		//���� �ʵ� ���� ����
		void method1() {}
		static void method2() {}	//���� �޼ҵ� ���� ����
	}
	
	void method() {
		/*���� Ŭ����*/
		class D {
			D() { System.out.println("D ��ü�� ������"); }
			int field1;
			//static int field2;		//���� �ʵ� ���� �Ұ�
			void method1() {}
			//static void method2()		//���� �޼ҵ� ���� �Ұ�
		}
		D d = new D();
		d.field1 = 3;
		d.method1();
	}
	
}
