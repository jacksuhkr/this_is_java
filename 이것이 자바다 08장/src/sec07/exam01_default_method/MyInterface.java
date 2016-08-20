package sec07.exam01_default_method;

public interface MyInterface {
	public void method1();
	
	// 디폴트 메소드를 추가한다
	public default void method2() {
		System.out.println("MyInterface-method2 실행");
	}
}
