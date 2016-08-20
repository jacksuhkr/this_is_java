package sec05.exam03_anonymous_implements2;

public class Window {
	Button button1 = new Button();
	Button button2 = new Button();
	
	//�ʵ� �ʱⰪ���� ����
	Button.OnClickListener listener = new Button.OnClickListener() {
		@Override
		public void onClick() {
			System.out.println("��ȭ�� �̴ϴ�.");
		}
	};
	
	//window�� ������, button1�� button2�� listener�� onClick() �޼ҵ尡 ���ǵ� ��ü ����
	Window() {
		button1.setOnClickListener( listener );
		button2.setOnClickListener(new Button.OnClickListener() {
			@Override
			public void onClick() {
				System.out.println("�޽����� �����ϴ�.");
			}
		});
	}
}
