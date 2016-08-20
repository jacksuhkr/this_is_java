package sec05.exam05_instanceof;

import sec05.exam04_casting.*;

public class DriverExample_ {		//책에 없지만 내가 만듦
	public static void main(String[] args) {
		Driver driver = new Driver();
		
		Bus bus = new Bus();
		Taxi_ taxi = new Taxi_();
		
		driver.drive(bus);
		driver.drive(taxi);		//얘는 버스로 변환이 안 돼서 run만 출력됨
	}
}
