package sec06.exercise04_car;

public class NestedClassExample {
	public static void main(String[] args) {
		Car myCar = new Car();
		
//		Car.Tire tire = new Car.Tire();		//public class가 아니니 이렇게 정의하면 안되지 바보야
		Car.Tire tire = myCar.new Tire();
		Car.Engine engine = new Car.Engine();
	}
}
