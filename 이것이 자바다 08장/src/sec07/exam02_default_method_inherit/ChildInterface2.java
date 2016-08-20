package sec07.exam02_default_method_inherit;

public interface ChildInterface2 extends ParentInterface {
	@Override
	public default void method2() { /*실행문*/ } 		//재정의
	
	public void method3();		//이 인터페이스의 메소드
}
