package sec09.exercise06_expect_result;

public class Child extends Parent {
	private String name;
	
	public Child() {
		this("ȫ�浿");		//this=Child�� ��, ��, Child("ȫ�浿");
		System.out.println("Child() call");
	}
	
	public Child(String name) {
		this.name = name;
		System.out.println("Child(String name) call");
	}
}
