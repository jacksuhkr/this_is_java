package sec06.exam01_inherit_interface;

public class Example {
	public static void main(String[] args) {
		ImplementationC imp1 = new ImplementationC();
		
		InterfaceA ia = imp1;
		ia.methodA();				//InterfaceA�� methodA�� ȣ�Ⱑ��
		System.out.println();
		
		InterfaceB ib = imp1;
		ib.methodB();				//InterfaceB�� methodA�� ȣ�Ⱑ��
		System.out.println();
		
		InterfaceC ic = imp1;
		ic.methodA();				//InterfaceC�� methodA,B,C ��� ȣ�Ⱑ��
		ic.methodB();
		ic.methodC();
	}
}
