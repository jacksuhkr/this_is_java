package sec05.exam01_final_method;

public class SpoertCar extends Car {
	@Override
	public void speedUp() { speed += 10; }
	
	/* �������̵� �� �� ����
	@Override
	public void stop() {
		System.out.println("������ī�� ����");
		speed = 0;
	} */
}
