package ch12.threadtest;

public class Tesk implements Runnable{// implents Runnable 멀티 스레드용
	// 방법 1 : 멀티 스레드 구축은 Runnable 인터페이스를 사용하여 구현체로 만드는 방법 

	@Override // Runnable 인터페이스에서 가공한 추상메서드를 재정의
	public void run() {
		// 스레드를 만든 코드를 개발자가 작성
		System.out.println("implements Runnable 인터페이스의 run() 추상메서드 실행됨");
		
	} 
}
