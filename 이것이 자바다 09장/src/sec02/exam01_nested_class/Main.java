package sec02.exam01_nested_class;

public class Main {
	public static void main(String[] args) {
		A a = new A();
		
		//인스턴스 멤버 클래스 객체 생성
		A.B b = a.new B();
		b.field1 = 3;
		b.method1();
		
		//정적 멤버 클래스 객체 생성
		A.C c = new A.C();  		//정적 멤버라서 a.이 필요 없음
		c.field1 = 3;
		c.method1();
		A.C.field2 = 3; 			//얘는 static field이므로 c.가 필요없음
		A.C.method2();
		
		//로컬클래스 객체 생성을 위한 메소드 호출
		a.method();
	}
}
