package sec07.exam06_casting;

public class ChildExample {
	public static void main(String[] args) {
		Parent parent = new Child();	//���� Ÿ�Ժ�ȯ, ��ġ double Ÿ���� int Ÿ�Կ� ����ֵ�, child Ÿ���� parent Ÿ������ �������
		parent.field1 = "data1";
		parent.method1();
		parent.method2();
		
		/*
		 parent.field2 = "data2";		//(�Ұ���)
		 parent.method3();				//(�Ұ���)
		 */
		
		Child child = (Child) parent;	//parent�� ������ Child�� �ٲ㼭 child�� �������
		child.field2 = "data2";			//(����)
		child.method3();				//(����)
	}
}
