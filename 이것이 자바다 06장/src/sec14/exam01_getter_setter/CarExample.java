package sec14.exam01_getter_setter;

public class CarExample {
	public static void main(String[] args) {
		Car myCar = new Car();
		
		//�߸��� �ӵ� ����
		myCar.setSpeed(-50);	//-50���� �����Ϸ��� �����ϰ� �ӷ��� 0�̵�
		
		System.out.println("���� �ӵ�: " + myCar.getSpeed());
		
		//�ùٸ� �ӵ� ����
		myCar.setSpeed(60);
		
		//���� 
		if(!myCar.isStop()) {	//stop�� default���� false���� ���ư���� �ϴµ� �� if���� �����ǹ�����???
			myCar.setStop(true);	//stop�� true�� �ٲٰ� ���ǵ带 0���� �ٲ�
		}
		
		System.out.println("���� �ӵ�: " + myCar.getSpeed());
	}
}
