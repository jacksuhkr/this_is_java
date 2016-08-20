package sec03.exam04_outter_class_call;

public class OutterExample {
	public static void main(String[] args) {
		Outter outter = new Outter();					//중첩클래스 바로 호출 불가, 정적클래스가 아니니
		Outter.Nested nested = outter.new Nested();
		nested.print(); 			//중첩클래스 안의 print 메소드를 호출
	}	
}
