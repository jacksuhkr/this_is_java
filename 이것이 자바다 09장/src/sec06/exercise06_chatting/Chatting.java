package sec06.exercise06_chatting;

public class Chatting {
	void startChat(String chatId) {
		String nickName = null;
//		nickName = chatId;			//�Ʒ� �޼ҵ忡�� ���ú����� �����Ƿ� final�� ����ž���
		Chat chat = new Chat() {
			@Override
			public void start() {
				while(true) {
					String inputData = "�ȳ��ϼ���";
					String message = "[" + nickName + "]" + inputData;
					sendMessage(message);
				}
			}
		};
		chat.start();
	}
	class Chat {
		void start() {}
		void sendMessage(String message) {}
	}
}
