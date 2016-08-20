package sec10.exam03_singleton;
public class SingletonExample {
	public static void main(String[] args) {
		/*
		 Singleton obj1 = new Singleton();	//������ ����, ���ο� ��ü�� ������ ����, �ܺο��� ȣ�� �Ұ�
		 Singleton obj2 = new Singleton();	//������ ����
		 */
		
		Singleton obj1 = Singleton.getInstance();	//�ܺο��� ȣ���� �� �ִ� ������ ���
		Singleton obj2 = Singleton.getInstance();	//������ ���� ��ü�� �����ϰ� �ȴ�
		
		if(obj1 == obj2) {
			System.out.println("���� Singleton ��ü �Դϴ�.");
		} else {
			System.out.println("�ٸ� Singleton ��ü �Դϴ�.");
		}
	}
}
