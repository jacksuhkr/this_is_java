package sec06.exam01_inherit_interface;

public class Example {
	public static void main(String[] args) {
		ImplementationC imp1 = new ImplementationC();
		
		InterfaceA ia = imp1;
		ia.methodA();				//InterfaceA는 methodA만 호출가능
		System.out.println();
		
		InterfaceB ib = imp1;
		ib.methodB();				//InterfaceB는 methodA만 호출가능
		System.out.println();
		
		InterfaceC ic = imp1;
		ic.methodA();				//InterfaceC는 methodA,B,C 모두 호출가능
		ic.methodB();
		ic.methodC();
	}
}
