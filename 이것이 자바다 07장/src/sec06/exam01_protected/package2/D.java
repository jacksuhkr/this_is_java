package sec06.exam01_protected.package2;
import sec06.exam01_protected.package1.A;

public class D extends A {
	public D() {
		super();				// (o) �ڽ� Ŭ������
		this.field = "value";	// (o) �ʵ��
		this.method();			// (o) �޼ҵ� ȣ���� ����
	}
}
