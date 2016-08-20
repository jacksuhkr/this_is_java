package sec07.exam04_polymorphism_array;

public class Tire {
	//�ʵ�
	public int maxRotation;				//�ִ� ȸ����(Ÿ�̾� ����)
	public int accumulatedRotation;		//���� ȸ����
	public String location;				//Ÿ�̾��� ��ġ
	public String model;				//���� �߰���, �𵨸�
	
	//������
	public Tire(String location, int maxRotation, String model) {
		this.location = location;
		this.maxRotation = maxRotation;
		this.model = model;
	}
	
	//�޼ҵ�
	public boolean roll() {
		++accumulatedRotation;		//���� ȸ���� 1����
		if(accumulatedRotation<maxRotation) {			//���� ȸ�� (����<����)�� ��� ����
			System.out.println(location + " " + model + "Tire ����: " + 
				(maxRotation-accumulatedRotation) + "ȸ");
			return true;
		} else {
			System.out.println("*** " + location + model + "Tire ��ũ ***");
			return false;
		}
	}
	//���� Ÿ�̾�� ��ũ�� ���� �� ȸ���� ������ ��ũ���� �ϴ� �޸� �� ������ 1���� ���޸�
}
