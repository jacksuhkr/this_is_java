package sec03.exam03_access_local_class;

public class Outter {
	//�ڹ� 7 ����
	public void method1(final int arg) {
		final int localVariable = 1;
		//arg = 100; 			//(x)
		//localVariale = 100;	//(x)
		class Innter {
			public void method() {
				int result = arg + localVariable;
			}
		}
	}
	
	//�ڹ� 8 ����
	public void method2(int arg) {
		int localVariable = 1;
		//arg = 100;				//(x) ���� �� �ٲ�
		//localVariable = 100;		//(x) ���� �� �ٲ�
		
		//���� Ŭ���� ����
		class Innter{
			public void method() {
				int result = arg + localVariable;
			}
		}
		//final�� ������� �ʾƵ�, �˾Ƽ� ��� ������ finaló��
	}
}
