package sec10.exam02_static_method;
public class Car {
	int speed;
	
	void run() {
		System.out.println(speed + "���� �޸��ϴ�");
	}
	
	public static void main(String[] args) {
		Car myCar = new Car();		//���� Ŭ�����ȿ� �־, ����ƽ �޼ҵ忡�� �ν��Ͻ� ����� ����Ϸ���
		myCar.speed = 60;						//�̷��� ��ü������ �ؼ� ����ؾ���
		myCar.run();
	}
}
