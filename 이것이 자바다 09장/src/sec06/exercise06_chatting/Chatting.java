package sec06.exercise06_chatting;

public class Chatting {
	void startChat(String chatId) {
		String nickName = null;
//		nickName = chatId;			//아래 메소드에서 로컬변수로 썼으므로 final로 선언돼야함
		Chat chat = new Chat() {
			@Override
			public void start() {
				while(true) {
					String inputData = "안녕하세요";
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
