package sec07.exam01_default_method;

public interface MyInterface {
	public void method1();
	
	// ����Ʈ �޼ҵ带 �߰��Ѵ�
	public default void method2() {
		System.out.println("MyInterface-method2 ����");
	}
}
