package sec15.exam01_annotation;

public class Service {
	@PrintAnnotation
	public void methos1() {
		System.out.println("���೻��");
	}
	
	@PrintAnnotation("*")
	public void method2() {
		System.out.println("���� ����2");
	}
	
	@PrintAnnotation(value="#", number=20)
	public void method3() {
		System.out.println("���� ����3");
	}
}
