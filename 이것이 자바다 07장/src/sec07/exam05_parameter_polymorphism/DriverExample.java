package sec07.exam05_parameter_polymorphism;

public class DriverExample {
	public static void main(String[] args) {
		Driver driver = new Driver();
		
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		driver.drive(bus);		//���� drive�޼ҵ��� �Ű������� vehicle��.
		driver.drive(taxi);		//�ڵ����� drive�޼ҵ��� �Ű������� busŸ������ �ٲ���
	}
}
