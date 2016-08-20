package sec13.exam03_field_method_access.package1;	//패키지가 동일

public class B {
	public B() {
		A a = new A();
		a.field1 = 1;
		a.field2 = 1;
//		a.field3 = 1;	//(x) private 필드 접근 불가
		
		a.method1();
		a.method2();
//		a.method3();	//(x) private 메소드 접근 불가
	}
}
