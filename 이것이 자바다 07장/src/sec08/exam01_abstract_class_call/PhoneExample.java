package sec08.exam01_abstract_class_call;

public class PhoneExample {
	public static void main(String[] args) {
		//Phone phone = new Phone(); 		//추상 클라스라서 불가능
		
		SmartPhone smartPhone = new SmartPhone("홍길동");
		
		smartPhone.turnOn();
		smartPhone.turnOff();
		smartPhone.internetSearch();
	}
}
