package thread;

public class ThreadEx extends Thread{
	String message;
	int user;
	public static void main(String[] args) {
		String[] message = {"message 1", "message 2", "message 3"};
		for(int i = 0; i<message.length; i++) {
		ThreadEx ex = new ThreadEx(message[i], i);
		ex.start();
		}
	}
	
	public ThreadEx(String message, int user) {
		this.message = message;
		this.user = user;
	}
	
	@Override
	public void run() {
		System.out.println("메세지 창 열림");
		for(int i = 0; i<3; i++) {
			System.out.println("사용자 "+ i + "의 "+message+" 전송");
		}
		System.out.println("메세지창 닫힘");
	}
	
}
