package sec09.exercise05_finderror;

public class Child extends Parent {
	private int studentNo;
	
	public Child(String name, int studentNo) {
//		this.name = name;
		super(name);
		this.studentNo = studentNo;
	}
	// 부모의 생성자가 기본생성자가 아니므로 super가 반드시 들어가야함!
}
