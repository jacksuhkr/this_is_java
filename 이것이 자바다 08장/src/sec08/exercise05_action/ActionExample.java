package sec08.exercise05_action;

public class ActionExample {
	public static void main(String[] args) {
		//작성 위치
		Action action = new Action() {
			public void work() {
				System.out.print("복사를 합니다.");
			}
		};
				
		action.work();
	}
}
