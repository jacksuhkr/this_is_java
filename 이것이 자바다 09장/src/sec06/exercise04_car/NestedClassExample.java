package sec06.exercise04_car;

public class NestedClassExample {
	public static void main(String[] args) {
		Car myCar = new Car();
		
//		Car.Tire tire = new Car.Tire();		//public class�� �ƴϴ� �̷��� �����ϸ� �ȵ��� �ٺ���
		Car.Tire tire = myCar.new Tire();
		Car.Engine engine = new Car.Engine();
	}
}
