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
			System.out.println(this.field);			//중첩클래스 것이 호출됨
			this.method();
			System.out.println(Outter.this.field);	//바깥클래스 것이 호출됨
			Outter.this.method();
		}
	}
}
