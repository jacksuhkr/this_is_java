package sec03.exam04_outter_class_call;

public class OutterExample {
	public static void main(String[] args) {
		Outter outter = new Outter();					//��øŬ���� �ٷ� ȣ�� �Ұ�, ����Ŭ������ �ƴϴ�
		Outter.Nested nested = outter.new Nested();
		nested.print(); 			//��øŬ���� ���� print �޼ҵ带 ȣ��
	}	
}
