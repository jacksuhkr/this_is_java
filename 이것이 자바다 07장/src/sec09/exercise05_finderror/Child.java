package sec09.exercise05_finderror;

public class Child extends Parent {
	private int studentNo;
	
	public Child(String name, int studentNo) {
//		this.name = name;
		super(name);
		this.studentNo = studentNo;
	}
	// �θ��� �����ڰ� �⺻�����ڰ� �ƴϹǷ� super�� �ݵ�� ������!
}
