package sec07.exam03_polymorphism;

public class HankookTire extends Tire {
	//�ʵ�
	
	//������
	public HankookTire(String location, int maxRotation) {
		super(location, maxRotation);
	}
	
	// �޼ҵ�
	@Override
	public boolean roll() {
		++accumulatedRotation;		
		if(accumulatedRotation<maxRotation) {			
			System.out.println(location + " HankookTire ����: " + 		//Tire -> HankookTire��
				(maxRotation-accumulatedRotation) + "ȸ");				//����Ʈ ���븸 �ٲ�
			return true;
		} else {
			System.out.println("*** " + location + "HankookTire ��ũ ***");
			return false;
		}
		//�׳� ����Ʈ �Լ��� ���� �ΰ� �� �κи� override�ϰԲ� �ϸ� �����
	}
}
