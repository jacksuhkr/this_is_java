package sec05.exam05_instanceof;

import sec05.exam04_casting.*;

public class DriverExample_ {		//å�� ������ ���� ����
	public static void main(String[] args) {
		Driver driver = new Driver();
		
		Bus bus = new Bus();
		Taxi_ taxi = new Taxi_();
		
		driver.drive(bus);
		driver.drive(taxi);		//��� ������ ��ȯ�� �� �ż� run�� ��µ�
	}
}
