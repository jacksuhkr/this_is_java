package sec13.exam03_field_method_access.package1;

public class A {
	//필드
	public int field1;		//public
	int field2;				//default
	private int field3;		//private
	
	//생성자
	public A() {
		field1 = 1;	//(o)
		field2 = 1;	//(o)
		field3 = 1;	//(o)
		
		method1();	//(o)
		method2();	//(o)	클래스 내부일 경우 접근 제한자의 영향을 받지 않는다.
		method3();	//(o)
	}
	
	//메소드
	public void method1() {}		//public
	void method2() {}				//default
	private void method3() {}		//private
}
