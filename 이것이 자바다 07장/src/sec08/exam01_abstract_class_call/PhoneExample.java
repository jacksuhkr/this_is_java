package sec08.exam01_abstract_class_call;

public class PhoneExample {
	public static void main(String[] args) {
		//Phone phone = new Phone(); 		//�߻� Ŭ�󽺶� �Ұ���
		
		SmartPhone smartPhone = new SmartPhone("ȫ�浿");
		
		smartPhone.turnOn();
		smartPhone.turnOff();
		smartPhone.internetSearch();
	}
}
