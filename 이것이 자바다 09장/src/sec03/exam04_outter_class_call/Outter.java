package sec03.exam04_outter_class_call;

public class Outter {
	String field = "Outter-field";
	void method() {
		System.out.println("Outter-method");
	}
	
	class Nested {
		String field = "Nested-field";
		void method() {
			System.out.println("Nested-method");
		}
		void print() {
			System.out.println(this.field);			//��øŬ���� ���� ȣ���
			this.method();
			System.out.println(Outter.this.field);	//�ٱ�Ŭ���� ���� ȣ���
			Outter.this.method();
		}
	}
}
