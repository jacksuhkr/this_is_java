package sec10.exam03_singleton;
public class Singleton {
	//���� �ʵ�
	private static Singleton singleton = new Singleton();

	//������
	private Singleton() {}
	
	//���� �޼ҵ�
	static Singleton getInstance() {
		return singleton;
	}
}
