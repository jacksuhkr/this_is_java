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
			//field1 = 10;		//정적 멤버 클래스에서 인스턴스 필드는 선언 불가
			//method1();		//정적 멤버 클래스에서 인스턴스 메소드는 선언 불가
			
			field2 = 10;
			method2();
		}
	}
}
