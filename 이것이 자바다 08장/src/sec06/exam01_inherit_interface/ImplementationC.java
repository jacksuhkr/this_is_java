package sec06.exam01_inherit_interface;

public class ImplementationC implements InterfaceC {		//C 뿐만아니라 A,B method도 있어야함
	public void methodA() {
		System.out.println("ImplementationC-methodA() 실행");
	}
	public void methodB() {
		System.out.println("ImplementationC-methodB() 실행");
	}
	public void methodC() {
		System.out.println("ImplementationC-methodC() 실행");
	}
}
