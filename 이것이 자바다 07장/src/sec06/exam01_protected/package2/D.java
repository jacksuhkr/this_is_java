package sec06.exam01_protected.package2;
import sec06.exam01_protected.package1.A;

public class D extends A {
	public D() {
		super();				// (o) 자식 클래스라서
		this.field = "value";	// (o) 필드랑
		this.method();			// (o) 메소드 호출이 가능
	}
}
