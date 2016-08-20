package sec09.exercise06_expect_result;

public class Child extends Parent {
	private String name;
	
	public Child() {
		this("홍길동");		//this=Child로 들어감, 즉, Child("홍길동");
		System.out.println("Child() call");
	}
	
	public Child(String name) {
		this.name = name;
		System.out.println("Child(String name) call");
	}
}
