package sec07.exam01_promotion;	//자동타입변환

class A {}

class B extends A {}
class C extends A {}

class D extends B {}
class E extends C {}

public class PromotionExample {
	public static void main(String[] args) {
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();
		
		// 마치, int a = b, 여기서 b는 double
		A a1 = b;
		A a2 = c;
		A a3 = d;
		A a4 = e;
		
		B b1 = d;
		C c1 = e;
		
		//B b2 = e;		상속관계에 있지 않으므로 컴파일 에러
		//C c2 = d;
		
	}
}
