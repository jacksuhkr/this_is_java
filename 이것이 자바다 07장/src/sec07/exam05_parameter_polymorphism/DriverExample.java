package sec07.exam05_parameter_polymorphism;

public class DriverExample {
	public static void main(String[] args) {
		Driver driver = new Driver();
		
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		driver.drive(bus);		//원래 drive메소드의 매개변수는 vehicle임.
		driver.drive(taxi);		//자동으로 drive메소드의 매개변수를 bus타입으로 바꿔줌
	}
}
