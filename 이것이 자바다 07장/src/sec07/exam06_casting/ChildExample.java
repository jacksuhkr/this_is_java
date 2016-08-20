package sec07.exam06_casting;

public class ChildExample {
	public static void main(String[] args) {
		Parent parent = new Child();	//강제 타입변환, 마치 double 타입을 int 타입에 집어넣듯, child 타입을 parent 타입으로 집어넣음
		parent.field1 = "data1";
		parent.method1();
		parent.method2();
		
		/*
		 parent.field2 = "data2";		//(불가능)
		 parent.method3();				//(불가능)
		 */
		
		Child child = (Child) parent;	//parent를 강제로 Child로 바꿔서 child에 집어넣음
		child.field2 = "data2";			//(가능)
		child.method3();				//(가능)
	}
}
