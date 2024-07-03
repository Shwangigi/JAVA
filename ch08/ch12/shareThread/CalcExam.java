package ch12.shareThread;

public class CalcExam {

	public static void main(String[] args) {
		// 만든 스레드를 동작
		
		Calculator calculator = new Calculator();
		
		User1 user1 = new User1();
		user1.setCalulator(calculator);
		user1.start(); // 스레드 시작
		
//		Calculator calculator2 = new Calculator();
		
		User2 user2 = new User2();
		user2.setCalulator(calculator); // 객체가 공유됨
		user2.start();
	}
}
