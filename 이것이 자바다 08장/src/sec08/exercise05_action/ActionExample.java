package sec08.exercise05_action;

public class ActionExample {
	public static void main(String[] args) {
		//�ۼ� ��ġ
		Action action = new Action() {
			public void work() {
				System.out.print("���縦 �մϴ�.");
			}
		};
				
		action.work();
	}
}
