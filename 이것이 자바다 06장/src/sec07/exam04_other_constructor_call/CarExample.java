package sec07.exam04_other_constructor_call;
public class CarExample {
	public static void main(String[] args) {
		Car car1 = new Car();
		System.out.println("car1.company : " + car1.company);
		System.out.println();
		
		Car car2 = new Car("�ڰ���");
		System.out.println("car2.company : " + car2.company);
		System.out.println("car2.model : " + car2.model);
		System.out.println();
		
		Car Car = new Car("�ڰ���", "����");
		System.out.println("Car.company : " + Car.company);
		System.out.println("Car.model : " + Car.model);
		System.out.println("Car.color : " + Car.color);
		System.out.println();
		
		Car car4 = new Car("�ý�", "����", 200);
		System.out.println("car4.company : " + car4.company);
		System.out.println("car4.model : " + car4.model);
		System.out.println("car4.color : " + car4.color);
		System.out.println("car4.maxSpeed : " + car4.maxSpeed);
	}
}
