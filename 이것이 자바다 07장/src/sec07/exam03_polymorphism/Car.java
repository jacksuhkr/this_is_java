package sec07.exam03_polymorphism;

public class Car {
	//�ʵ�
	Tire frontLeftTire = new Tire("�տ���", 6);		//�ڵ����� 4���� Ÿ�̾ ������
	Tire frontRightTire = new Tire("�տ�����", 2);
	Tire backLeftTire = new Tire("�ڿ���", 3);
	Tire backRightTire = new Tire("�ڿ�����", 4);
	
	//������
	
	//�޼ҵ�
	int run() {
		System.out.println("[�ڵ����� �޸��ϴ�.]");
		if(frontLeftTire.roll()==false) { stop(); return 1; };	//��� Ÿ�̾ 1ȸ ȸ����Ű�� ����
		if(frontRightTire.roll()==false) { stop(); return 2; };	//roll �޼ҵ带 ȣ���Ѵ�.
		if(backLeftTire.roll()==false) { stop(); return 3; };  	//false�� �����ϴ� roll()�� ���� ���
		if(backRightTire.roll()==false) { stop(); return 4; };	//stop �޼ҵ带 ȣ���ϰ� �ش� Ÿ�̾��ȣ ����.
		return 0; 
	}
	
	void stop() {
		System.out.println("[�ڵ����� ����ϴ�.]");
	}
}
